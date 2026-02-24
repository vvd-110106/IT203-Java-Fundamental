package Session02;

import java.util.Scanner;

public class bai4 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int id;
        do {
            System.out.print("Nhập mã ID sách mới (ID>0): ");
            id = scanner.nextInt();
            if (id <= 0) {
                System.out.println("Lỗi: Id phải là số dương. Hãy nhập lại");
            }

        } while (id<=0);
        System.out.println("Xác nhận: Lưu mã sách thành công");
    }
}
