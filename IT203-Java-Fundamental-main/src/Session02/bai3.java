package Session02;

import java.util.Scanner;

public class bai3 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng sách trả muộn: ");
        int num = scanner.nextInt();

        int total = 0;
        int tienPhat = 5000;
        for (int i = 1; i<=num; i ++) {
            System.out.print("Nhập số ngày trễ của cuốn thứ " +i + ":");
            int soNgayTre = scanner.nextInt();
            total += soNgayTre * tienPhat;
        }
        System.out.print("===> Tổng số tiền phạt: " +total + "VNĐ");
    }
}
