package Session01;

import java.util.Scanner;
public class bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số thứ tự của sách trong hệ thống: ");
        int stt = scanner.nextInt();
        int shelf = (stt - 1) / 25 + 1;
        int position = (stt - 1) % 25 + 1;
        String area;
        if (shelf <= 10) {
            area = "Khu Cận(Gần Cửa)";
        } else {
            area = "Khu Viễn(Xa Cửa)";
        }
        System.out.println("\n--- Thông tin định vị ---");
        System.out.println("Sách số: " + stt);
        System.out.println("Địa chỉ: Ke " + shelf + " - Vi tri " + position);
        System.out.println("Phân khu: " + area);
    }
}
