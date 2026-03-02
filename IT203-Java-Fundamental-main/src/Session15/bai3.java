package src.Session15;

import java.util.Scanner;
import java.util.Stack;

class MedicationProcessChecker {
    private Stack<String> stack = new Stack<>();

    public boolean checkProcess(String[] actions) {
        stack.clear();
        for (String action : actions) {
            if (action.equalsIgnoreCase("PUSH")) {
                stack.push("Thuốc");
            } else if (action.equalsIgnoreCase("POP")) {
                if (stack.isEmpty()) {
                    System.out.println("Không thể hoàn tất (POP) vì chưa có thuốc nào được phát (Stack rỗng).");
                    return false;
                }
                stack.pop();
            }
        }

        if (!stack.isEmpty()) {
            System.out.println("Kết thúc ca trực nhưng vẫn còn thuốc chưa hoàn tất (Stack không rỗng).");
            return false;
        }

        return true;
    }

    public void reset() {
        stack.clear();
    }
}

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MedicationProcessChecker checker = new MedicationProcessChecker();

        while (true) {
            System.out.println("1. Kiểm tra quy trình phát thuốc");
            System.out.println("2. Thoát");
            System.out.print("Chọn chức năng: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Nhập chuỗi thao tác (ví dụ: PUSH,PUSH,POP,POP): ");
                    String input = sc.nextLine();
                    String[] actions = input.split(",");

                    if (checker.checkProcess(actions)) {
                        System.out.println("Quy trình hợp lệ.");
                    } else {
                        System.out.println("Quy trình KHÔNG hợp lệ.");
                    }
                    break;
                case 2:
                    System.out.println("Thoát chương trình.");
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }
}
