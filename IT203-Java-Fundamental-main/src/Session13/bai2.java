package src.Session13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class bai2 {
    public static void main(String[] args) {
        List<String> danhSachGoc = new ArrayList<>();
        danhSachGoc.add("Paracetamol");
        danhSachGoc.add("Ibuprofen");
        danhSachGoc.add("Panadol");
        danhSachGoc.add("Paracetamol");
        danhSachGoc.add("Aspirin");
        danhSachGoc.add("Ibuprofen");

        System.out.println("Input: " + danhSachGoc);

        List<String> danhSachMoi = new ArrayList<>();
        for (String tenThuoc : danhSachGoc) {
            if (!danhSachMoi.contains(tenThuoc)) {
                danhSachMoi.add(tenThuoc);
            }
        }
        Collections.sort(danhSachMoi);
        System.out.println("Output: " + danhSachMoi);
    }
}
