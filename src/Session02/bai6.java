package Session02;

import java.util.Scanner;

public class bai6 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int min = 0;
        int tong = 0;
        int dem = 0;

        for (int i = 1; i <= 7; i++) {
            System.out.print("Nhap luot muon ngay " + i + ": ");
            int luotMuon = scanner.nextInt();
            if (luotMuon == 0) {
                continue;
            }
            if (dem == 0) {
                max = luotMuon;
                min = luotMuon;
            }
            if (luotMuon > max) {
                max = luotMuon;
            }
            if (luotMuon < min) {
                min = luotMuon;
            }
            tong += luotMuon;
            dem++;
        }
        System.out.println("Kết quả thống kê:");
        System.out.println("Lượt mượn cao nhất: " + max);
        System.out.println("Lượt mượn thap nhất: " + min);
        System.out.println("Trung bình lượt mượn/ ngày " + (double) tong / dem);
    }
}
