package src.Session15;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Date;

public class bai5 {
    static class Patient {
        private String id;
        private String name;

        public Patient(String id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Mã BN: " + id + " | Tên: " + name;
        }
    }

    static class TreatmentStep {
        private String description;
        private String time;

        public TreatmentStep(String description, String time) {
            this.description = description;
            this.time = time;
        }

        @Override
        public String toString() {
            return "[" + time + "] " + description;
        }
    }

    static class EmergencyCase {
        private Patient patient;
        private Stack<TreatmentStep> steps = new Stack<>();

        public EmergencyCase(Patient patient) {
            this.patient = patient;
        }

        public Patient getPatient() {
            return patient;
        }

        public void addStep(TreatmentStep step) {
            steps.push(step);
        }

        public TreatmentStep undoStep() {
            if (!steps.isEmpty()) {
                return steps.pop();
            }
            return null;
        }

        public void displaySteps() {
            if (steps.isEmpty()) {
                System.out.println("Chưa có bước điều trị nào.");
                return;
            }
            for (int i = steps.size() - 1; i >= 0; i--) {
                System.out.println(steps.get(i));
            }
        }
    }

    static class EmergencyCaseQueue {
        private Queue<EmergencyCase> cases = new LinkedList<>();

        public void addCase(EmergencyCase c) {
            cases.add(c);
        }

        public EmergencyCase getNextCase() {
            return cases.poll();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmergencyCaseQueue queue = new EmergencyCaseQueue();
        EmergencyCase current = null;

        while (true) {
            System.out.println("\nMENU QUẢN LÝ CẤP CỨU");
            System.out.println("1. Tiếp nhận bệnh nhân mới");
            System.out.println("2. Xử lý bệnh nhân tiếp theo");
            System.out.println("3. Thêm bước điều trị");
            System.out.println("4. Hoàn tác bước điều trị");
            System.out.println("5. Xem lịch sử điều trị");
            System.out.println("6. Kết thúc điều trị");
            System.out.println("7. Thoát");
            System.out.print("Chọn chức năng: ");

            int c = Integer.parseInt(sc.nextLine());

            switch (c) {
                case 1:
                    System.out.print("Nhập mã BN: ");
                    String id = sc.nextLine();
                    System.out.print("Nhập tên BN: ");
                    String name = sc.nextLine();
                    queue.addCase(new EmergencyCase(new Patient(id, name)));
                    System.out.println("Đã thêm vào hàng đợi.");
                    break;

                case 2:
                    if (current != null) {
                        System.out.println("Đang có bệnh nhân chưa xử lý xong.");
                    } else {
                        current = queue.getNextCase();
                        if (current != null) {
                            System.out.println("Bắt đầu xử lý: " + current.getPatient());
                        } else {
                            System.out.println("Hàng đợi trống.");
                        }
                    }
                    break;

                case 3:
                    if (current != null) {
                        System.out.print("Mô tả điều trị: ");
                        String d = sc.nextLine();
                        current.addStep(new TreatmentStep(d, new Date().toString()));
                        System.out.println("Đã ghi nhận.");
                    } else {
                        System.out.println("Chưa chọn bệnh nhân.");
                    }
                    break;

                case 4:
                    if (current != null) {
                        TreatmentStep u = current.undoStep();
                        if (u != null) System.out.println("Đã hoàn tác: " + u);
                        else System.out.println("Không có bước để hoàn tác.");
                    } else {
                        System.out.println("Chưa chọn bệnh nhân.");
                    }
                    break;

                case 5:
                    if (current != null) {
                        System.out.println("Lịch sử điều trị của: " + current.getPatient());
                        current.displaySteps();
                    } else {
                        System.out.println("Chưa chọn bệnh nhân.");
                    }
                    break;

                case 6:
                    if (current != null) {
                        System.out.println("Bệnh nhân " + current.getPatient() + " xuất viện.");
                        current = null;
                    } else {
                        System.out.println("Không có bệnh nhân đang xử lý.");
                    }
                    break;

                case 7:
                    System.out.println("Thoát.");
                    System.exit(0);

                default:
                    System.out.println("Lựa chọn sai!");
            }
        }
    }
}
