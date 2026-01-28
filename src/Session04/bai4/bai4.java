package Session04.bai4;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Nhập cardID: ");
//        String cardID = sc.nextLine();
        String cardID = "TV202312345";

        if (!cardID.matches("^[A-Z]{2}.*")) {
            System.out.println("Mã thẻ phải bắt đầu bằng 2 chữ cái viết hoa");
        } else if (!cardID.matches("^[A-Z]{2}\\d{4}.*")) {
            System.out.println("Năm vào học không hợp lệ");
        } else if (!cardID.matches("^[A-Z]{2}\\d{9}$")) {
            System.out.println("Mã thẻ phải có đúng 5 số cuối");
        } else {
            System.out.println("Mã thẻ hợp lệ!");
        }
    }
}
