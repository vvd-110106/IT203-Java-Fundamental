package Session02;

import java.util.Scanner;

public class bai5 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int diemUyTin = 100;
        int soNgayTre;

        System.out.println("Hệ Thống Danh Sách Độc Giả");
        System.out.println("(Nhập số ngaỳ trễ. Nhập 999 để kết thúc)");

        while (true) {
            System.out.print("Số ngày trễ của lần này: ");
            soNgayTre = scanner.nextInt();
            if (soNgayTre == 999) {
                break;
            }
            if (soNgayTre <= 0) {
                diemUyTin += 5;
            }
            else {
                int truDiem = soNgayTre * 2;
                diemUyTin -= truDiem;
                System.out.println("-> Trả trễ " + soNgayTre + " ngày: -" + truDiem + " diem.");
            }
        }
        System.out.println("Tổng điểm uy tín: " + diemUyTin);
        if (diemUyTin > 120) {
            System.out.println("Xếp loại: Độc giả thân thiết");
        } else if (diemUyTin >= 80) {
            System.out.println("Xếp loại: Độc giả tiêu chuẩn");
        } else {
            System.out.println("Xếp loại: Độc giả cần lưu ý");
        }
    }
}
