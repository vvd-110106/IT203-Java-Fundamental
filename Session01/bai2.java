package Session01;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số ngày chậm trễ (n): ");
        int n = scanner.nextInt();
        System.out.print("Nhập số lượng sách mượn (m): ");
        int m = scanner.nextInt();
        double total = n * m * 5000;
        if (n > 7 && m >= 3) {
            total = total * 1.2;
        }
        System.out.printf("Tổng tiền phạt: %.0f VNĐ\n", total);
        boolean isLocked = total > 50000;
        System.out.println("Yêu cầu khóa thẻ: " + isLocked);
    }
}
