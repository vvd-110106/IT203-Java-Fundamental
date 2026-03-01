package src.Session14;

import java.util.TreeMap;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class bai4 {
    public static void main(String[] args) {
        List<String> danhSachCaBenh = Arrays.asList("Cúm A", "Sốt xuất huyết", "Cúm A", "Covid-19", "Cúm A", "Sốt xuất huyết");
        Map<String, Integer> baoCaoDichTe = new TreeMap<>();

        for (String tenBenh : danhSachCaBenh) {
            if (baoCaoDichTe.containsKey(tenBenh)) {
                baoCaoDichTe.put(tenBenh, baoCaoDichTe.get(tenBenh) + 1);
            } else {
                baoCaoDichTe.put(tenBenh, 1);
            }
        }
        System.out.println("--- BÁO CÁO THỐNG KÊ DỊCH TỄ (Đã sắp xếp) ---");
        for (Map.Entry<String, Integer> entry : baoCaoDichTe.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " ca");
        }
    }
}
