package src.Session14;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Map<String, String> danhMucThuoc = new HashMap<>();
        danhMucThuoc.put("T01", "Paracetamol");
        danhMucThuoc.put("T02", "Ibuprofen");
        danhMucThuoc.put("T03", "Amoxicillin");
        danhMucThuoc.put("T04", "Vitamin C");
        danhMucThuoc.put("T05", "Berberin");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã thuốc cần tra cứu: ");
        String maNhap = sc.nextLine();
        if (danhMucThuoc.containsKey(maNhap)) {
            System.out.println("Tên thuốc: " + danhMucThuoc.get(maNhap));
        } else {
            System.out.println("Thuốc không có trong danh mục BHYT.");
        }
    }
}
