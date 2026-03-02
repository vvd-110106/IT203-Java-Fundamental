package src.Session15;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

class Patient {
    private String id;
    private String name;
    private int age;

    public Patient(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Ten: " + name + ", Tuoi: " + age;
    }
}

class PatientQueue {
    private Queue<Patient> q = new LinkedList<>();

    public void addPatient(Patient p) {
        q.add(p);
    }

    public Patient callNextPatient() {
        return q.poll();
    }

    public Patient peekNextPatient() {
        return q.peek();
    }

    public boolean isEmpty() {
        return q.isEmpty();
    }

    public void displayQueue() {
        if (q.isEmpty()) {
            System.out.println("Hang doi trong.");
            return;
        }
        for (Patient p : q) {
            System.out.println(p);
        }
    }
}

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PatientQueue pq = new PatientQueue();

        while (true) {
            System.out.println("1. Tiếp nhận bệnh nhân mới");
            System.out.println("2. Gọi bệnh nhân vào khám (FIFO)");
            System.out.println("3. Xem bệnh nhân kế tiếp");
            System.out.println("4. Hiển thị danh sách chờ");
            System.out.println("5. Thoát");
            System.out.print("Chọn chức năng: ");

            int c = Integer.parseInt(sc.nextLine());

            switch (c) {
                case 1:
                    System.out.print("Nhập mã bệnh nhân: ");
                    String id = sc.nextLine();
                    System.out.print("Nhập họ tên: ");
                    String n = sc.nextLine();
                    System.out.print("Nhập tuổi: ");
                    int a = Integer.parseInt(sc.nextLine());
                    pq.addPatient(new Patient(id, n, a));
                    System.out.println("Đã thêm bệnh nhân.");
                    break;
                case 2:
                    Patient p2 = pq.callNextPatient();
                    if (p2 != null) {
                        System.out.println("Đang khám cho: " + p2);
                    } else {
                        System.out.println("Không có bệnh nhân chờ.");
                    }
                    break;
                case 3:
                    Patient p3 = pq.peekNextPatient();
                    if (p3 != null) {
                        System.out.println("Người kế tiếp: " + p3);
                    } else {
                        System.out.println("Hàng đợi trống.");
                    }
                    break;
                case 4:
                    pq.displayQueue();
                    break;
                case 5:
                    System.out.println("Thoát chương trình.");
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn sai!");
            }
        }
    }
}
