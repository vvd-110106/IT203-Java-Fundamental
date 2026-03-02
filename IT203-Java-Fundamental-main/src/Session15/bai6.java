package src.Session15;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Date;

public class bai6 {
    static class Patient {
        String id, name, gender;
        int age;

        public Patient(String id, String name, int age, String gender) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "ID: " + id + " | Tên: " + name + " | Tuổi: " + age + " | Phái: " + gender;
        }
    }

    static class PatientWaitingQueue {
        Queue<Patient> waitingQueue = new LinkedList<>();

        public void addPatient(Patient p) {
            waitingQueue.add(p);
        }

        public Patient nextPatient() {
            return waitingQueue.poll();
        }

        public void display() {
            if (waitingQueue.isEmpty()) {
                System.out.println("Hàng đợi trống.");
                return;
            }
            for (Patient p : waitingQueue) System.out.println(p);
        }
    }

    static class EditAction {
        String description, editedBy, editTime;

        public EditAction(String description, String editedBy) {
            this.description = description;
            this.editedBy = editedBy;
            this.editTime = new Date().toString();
        }

        @Override
        public String toString() {
            return "[" + editTime + "] " + editedBy + ": " + description;
        }
    }

    static class MedicalRecordHistory {
        Stack<EditAction> editStack = new Stack<>();

        public void addEdit(EditAction action) {
            editStack.push(action);
        }

        public EditAction undo() {
            return editStack.isEmpty() ? null : editStack.pop();
        }

        public void display() {
            if (editStack.isEmpty()) {
                System.out.println("Lịch sử trống.");
                return;
            }
            for (int i = editStack.size() - 1; i >= 0; i--) System.out.println(editStack.get(i));
        }
    }

    static class Ticket {
        int ticketNumber;
        String issuedTime;

        public Ticket(int ticketNumber) {
            this.ticketNumber = ticketNumber;
            this.issuedTime = new Date().toString();
        }

        @Override
        public String toString() {
            return "Số: " + ticketNumber + " (Phát lúc: " + issuedTime + ")";
        }
    }

    static class TicketSystem {
        Queue<Ticket> ticketQueue = new LinkedList<>();
        int currentNumber = 100;

        public void issueTicket() {
            Ticket t = new Ticket(++currentNumber);
            ticketQueue.add(t);
            System.out.println("Đã phát vé: " + t);
        }

        public Ticket callTicket() {
            return ticketQueue.poll();
        }
    }

    static class InputAction {
        String fieldName, oldValue, newValue, actionTime;

        public InputAction(String field, String oldV, String newV) {
            this.fieldName = field;
            this.oldValue = oldV;
            this.newValue = newV;
            this.actionTime = new Date().toString();
        }

        @Override
        public String toString() {
            return "Trường: " + fieldName + " | " + oldValue + " -> " + newValue;
        }
    }

    static class UndoManager {
        Stack<InputAction> undoStack = new Stack<>();
        int maxUndoSteps = 10;

        public void addAction(InputAction action) {
            if (undoStack.size() >= maxUndoSteps) {
                undoStack.remove(0);
            }
            undoStack.push(action);
        }

        public InputAction undo() {
            return undoStack.isEmpty() ? null : undoStack.pop();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PatientWaitingQueue pQueue = new PatientWaitingQueue();
        MedicalRecordHistory history = new MedicalRecordHistory();
        TicketSystem tickets = new TicketSystem();
        UndoManager undo = new UndoManager();

        while (true) {
            System.out.println("\nHỆ THỐNG BỆNH VIỆN THÔNG MINH");
            System.out.println("1. Tiếp nhận bệnh nhân (Queue)");
            System.out.println("2. Chỉnh sửa bệnh án (Stack)");
            System.out.println("3. Phát/Gọi số thứ tự (Queue)");
            System.out.println("4. Nhập liệu & Hoàn tác (Stack)");
            System.out.println("5. Thoát");
            System.out.print("Chọn chức năng: ");

            int c = Integer.parseInt(sc.nextLine());

            switch (c) {
                case 1:
                    System.out.print("Tên BN: ");
                    String name = sc.nextLine();
                    pQueue.addPatient(new Patient("BN" + (System.currentTimeMillis() % 1000), name, 20, "Nam"));
                    System.out.println("Danh sách chờ khám:");
                    pQueue.display();
                    break;
                case 2:
                    System.out.print("Nội dung sửa: ");
                    history.addEdit(new EditAction(sc.nextLine(), "Bác sĩ trực"));
                    System.out.println("Lịch sử chỉnh sửa:");
                    history.display();
                    break;
                case 3:
                    System.out.println("1. Phát số | 2. Gọi số");
                    int sub3 = Integer.parseInt(sc.nextLine());
                    if (sub3 == 1) tickets.issueTicket();
                    else {
                        Ticket t = tickets.callTicket();
                        System.out.println(t != null ? "Mời số: " + t.ticketNumber : "Hết số.");
                    }
                    break;
                case 4:
                    System.out.println("1. Nhập mới | 2. Hoàn tác");
                    int sub4 = Integer.parseInt(sc.nextLine());
                    if (sub4 == 1) {
                        System.out.print("Tên trường: "); String f = sc.nextLine();
                        System.out.print("Giá trị mới: "); String v = sc.nextLine();
                        undo.addAction(new InputAction(f, "Cũ", v));
                        System.out.println("Đã lưu thao tác.");
                    } else {
                        InputAction act = undo.undo();
                        System.out.println(act != null ? "Đã Undo: " + act : "Không còn bước Undo.");
                    }
                    break;
                case 5:
                    System.out.println("Kết thúc.");
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn sai!");
            }
        }
    }
}
