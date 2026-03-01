package src.Session14;

import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class bai3 {
    public static void main(String[] args) {
        Set<String> thanhPhanThuoc = new HashSet<>(Arrays.asList("Aspirin", "Caffeine", "Paracetamol"));
        Set<String> chatDiUng = new HashSet<>(Arrays.asList("Penicillin", "Aspirin", "Pollen"));

        Set<String> canhBaoDiUng = new HashSet<>(thanhPhanThuoc);
        canhBaoDiUng.retainAll(chatDiUng);

        Set<String> thanhPhanAnToan = new HashSet<>(thanhPhanThuoc);
        thanhPhanAnToan.removeAll(chatDiUng);
        System.out.println("Thuốc: " + thanhPhanThuoc);
        System.out.println("Dị ứng: " + chatDiUng);
        System.out.println("--- KẾT QUẢ ---");
        System.out.println("Cảnh báo dị ứng: " + canhBaoDiUng);
        System.out.println("Thành phần an toàn: " + thanhPhanAnToan);
        if (!canhBaoDiUng.isEmpty()) {
            System.out.println("KẾT LUẬN: Bệnh nhân KHÔNG ĐƯỢC dùng thuốc này!");
        } else {
            System.out.println("KẾT LUẬN: Thuốc an toàn cho bệnh nhân.");
        }
    }
}
