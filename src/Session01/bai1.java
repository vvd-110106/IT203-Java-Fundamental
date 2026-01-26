package Session01;
import  java.util.Scanner;

public class bai1 {
    static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Nhập mã sách: ");
        String BookId = scanner.nextLine();
        System.out.print("Nhập tên sách: ");
        String BookName = scanner.nextLine();
        System.out.print("Nhập năm xuất bản: ");
        int publishYear = scanner.nextInt();
        System.out.print("Nhập giá bìa: ");
        double price = scanner.nextInt();
        System.out.print("Sách còn trong kho(true/fale): ");
        boolean isAvailable = scanner.nextBoolean();
        System.out.println("---Phiếu thông tin sách---");
        System.out.printf("Tên sách: %s\n", BookName);
        System.out.printf("Mã sách: %s | Tuổi %d năm \n", BookId, 2026-publishYear);
        System.out.printf("Giá bán: %.2f \n", price);
        System.out.printf("Sách còn trong kho: %s\n", isAvailable ? "Còn sách" : "Hết sách" );
    }
}