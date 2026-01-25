package Session01;
import java.util.Scanner;
public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap gia sach (USD - kieu double): ");
        double priceUSD = sc.nextDouble();
        System.out.print("Nhap ty gia USD -> VND (kieu float): ");
        float exchangeRate = sc.nextFloat();
        double totalVND = priceUSD * exchangeRate;
        long roundedVND = (long) totalVND;
        System.out.println("Gia chinh xac (so thuc): " + totalVND);
        System.out.println("Gia lam tron de thanh toan (long): " + roundedVND);
    }
}
