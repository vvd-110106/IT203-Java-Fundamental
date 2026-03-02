package src.Session15;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

class EmergencyPatient {
    private String id;
    private String name;
    private int priority;

    public EmergencyPatient(String id, String name, int priority) {
        this.id = id;
        this.name = name;
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        String type = (priority == 1) ? "CẤP CỨU" : "THƯỜNG";
        return "[" + type + "] Mã BN: " + id + " | Tên: " + name;
    }
}

class EmergencyQueue {
    private Queue<EmergencyPatient> emergencyQ = new LinkedList<>();
    private Queue<EmergencyPatient> normalQ = new LinkedList<>();

    public void addPatient(EmergencyPatient p) {
        if (p.getPriority() == 1) {
            emergencyQ.add(p);
        } else {
            normalQ.add(p);
        }
    }

    public EmergencyPatient callNextPatient() {
        if (!emergencyQ.isEmpty()) {
            return emergencyQ.poll();
        }
        if (!normalQ.isEmpty()) {
            return normalQ.poll();
        }
        return null;
    }

    public void displayQueue() {
        if (emergencyQ.isEmpty() && normalQ.isEmpty()) {
            System.out.println("Hàng đợi đang trống.");
            return;
        }
        System.out.println("Danh sách chờ khám:");
        for (EmergencyPatient p : emergencyQ) {
            System.out.println(p);
        }
        for (EmergencyPatient p : normalQ) {
            System.out.println(p);
        }
    }
}

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmergencyQueue eq = new EmergencyQueue();

        while (true) {
            System.out.println("1. Tiếp nhận bệnh nhân");
            System.out.println("2. Gọi bệnh nhân khám tiếp theo");
            System.out.println("3. Hiển thị danh sách chờ");
            System.out.println("4. Thoát");
            System.out.print("Chọn chức năng: ");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Nhập mã bệnh nhân: ");
                    String id = sc.nextLine();
                    System.out.print("Nhập họ tên: ");
                    String name = sc.nextLine();
                    System.out.print("Mức độ (1: Cấp cứu, 2: Thường): ");
                    int priority = Integer.parseInt(sc.nextLine());
                    eq.addPatient(new EmergencyPatient(id, name, priority));
                    System.out.println("Đã thêm bệnh nhân.");
                    break;
                case 2:
                    EmergencyPatient next = eq.callNextPatient();
                    if (next != null) {
                        System.out.println("Mời bệnh nhân: " + next);
                    } else {
                        System.out.println("Không có bệnh nhân chờ.");
                    }
                    break;
                case 3:
                    eq.displayQueue();
                    break;
                case 4:
                    System.out.println("Kết thúc.");
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn sai!");
            }
        }
    }
}
