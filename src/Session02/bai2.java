package Session02;

import java.util.Scanner;

public class bai2 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã khu vực (A,B,C,D): ");
        char ma = scanner.next().charAt(0);

        switch (ma) {
            case 'A':
                System.out.println("Vị trí: Tầng 1 - Sách văn học");
                break;
            case 'B':
                System.out.println("Vị trí: Tầng 2 - Sách khoa học");
                break;
            case 'C':
                System.out.println("Vị trí: Tầng 3 - Sách ngoại ngữ");
                break;
            case 'D':
                System.out.println("Vị trí: Tầng 4 - Sách tin học");
                break;
            default:
                System.out.println("Lỗi: Mã khu vực không hợp lệ");
        }
    }
}
