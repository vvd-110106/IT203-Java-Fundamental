package src.Session14;

import java.util.LinkedHashSet;
import java.util.Set;

public class bai1 {
    public static void main(String[] args) {
        String[] input = {"Nguyễn Văn A – Yên Bái", "Trần Thị B – Thái Bình", "Nguyễn Văn A – Yên Bái", "Lê Văn C – Hưng Yên"};
        Set<String> danhSachKham = new LinkedHashSet<>();
        for (String ten : input) {
            danhSachKham.add(ten);
        }
        System.out.println("DANH SÁCH GỌI KHÁM:");
        int stt = 1;
        for (String benhNhan : danhSachKham) {
            System.out.println(stt + ". " + benhNhan);
            stt++;
        }
    }
}
