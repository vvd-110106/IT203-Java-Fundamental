package Session02;

import java.util.Scanner;

public class bai1 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tuổi của bạn: ");
        int tuoi = scanner.nextInt();
        System.out.print("Nhập vào số saách đang mượn: ");
        int soSach = scanner.nextInt();

        if (tuoi >= 18 && soSach < 3) {
            System.out.println("Kết quả: Bạn đủ dkien mượn sách quý hiếm");
        } else {
            System.out.println("Kết quả: Không đủ điều kiện");
        }
        if (tuoi < 18 ) {
            System.out.println("-Lý do: Bạn phải từ 18 tuổi trở nên");
        } else if (soSach >= 3) {
            System.out.println("-Lý do: Bạn đã mượn tối đa 3 cuốn sách");
        }
    }
}
