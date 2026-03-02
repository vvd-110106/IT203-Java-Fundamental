package src.Session15;

import java.util.Scanner;
import java.util.Stack;
import java.util.Date;

class EditAction {
    private String description;
    private String time;

    public EditAction(String description, String time) {
        this.description = description;
        this.time = time;
    }

    public String getDescription() { return description; }
    public String getTime() { return time; }

    @Override
    public String toString() {
        return "[" + time + "] " + description;
    }
}

class MedicalRecordHistory {
    private Stack<EditAction> history = new Stack<>();

    public void addEdit(EditAction action) {
        history.push(action);
    }

    public EditAction undoEdit() {
        if (!history.isEmpty()) {
            return history.pop();
        }
        return null;
    }

    public EditAction getLatestEdit() {
        if (!history.isEmpty()) {
            return history.peek();
        }
        return null;
    }

    public boolean isEmpty() {
        return history.isEmpty();
    }

    public void displayHistory() {
        if (history.isEmpty()) {
            System.out.println("Lịch sử trống.");
            return;
        }
        for (int i = history.size() - 1; i >= 0; i--) {
            System.out.println(history.get(i));
        }
    }
}

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MedicalRecordHistory manager = new MedicalRecordHistory();

        while (true) {
            System.out.println("1. Thêm chỉnh sửa");
            System.out.println("2. Hoàn tác (Undo)");
            System.out.println("3. Xem chỉnh sửa mới nhất");
            System.out.println("4. Hiển thị toàn bộ lịch sử");
            System.out.println("5. Thoát");
            System.out.print("Chọn: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Mô tả chỉnh sửa: ");
                    String desc = sc.nextLine();
                    String time = new java.util.Date().toString();
                    manager.addEdit(new EditAction(desc, time));
                    System.out.println("Đã thêm vào lịch sử.");
                    break;
                case 2:
                    EditAction undone = manager.undoEdit();
                    if (undone != null) {
                        System.out.println("Đã hoàn tác: " + undone.getDescription());
                    } else {
                        System.out.println("Không có gì để hoàn tác.");
                    }
                    break;
                case 3:
                    EditAction latest = manager.getLatestEdit();
                    if (latest != null) {
                        System.out.println("Chỉnh sửa gần nhất: " + latest);
                    } else {
                        System.out.println("Lịch sử trống.");
                    }
                    break;
                case 4:
                    System.out.println("Lịch sử chỉnh sửa");
                    manager.displayHistory();
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
}
