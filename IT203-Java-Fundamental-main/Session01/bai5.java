package Session01;

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã sách (4 chữ số): ");
        int bookCode = scanner.nextInt();
        int thousands = bookCode / 1000;
        int hundreds  = (bookCode / 100) % 10;
        int dozens    = (bookCode / 10) % 10;
        int units     = bookCode % 10;
        int expectedCheckDigit = (thousands + hundreds + dozens) % 10;
        boolean isValid = (expectedCheckDigit == units);
        System.out.printf("Chữ số kiểm tra kì vọng: %d\n", expectedCheckDigit);
        System.out.printf(
                "Kết quả kiểm tra mã sách: %s\n",
                isValid ? "HỢP LỆ" : "SAI MÃ"
        );
    }
}
