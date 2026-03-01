package src.Session14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class bai6 {
    static class Patient {
        String name;
        int age;
        String department;

        public Patient(String name, int age, String department) {
            this.name = name;
            this.age = age;
            this.department = department;
        }

        @Override
        public String toString() {
            return name + " (" + age + " tuổi)";
        }
    }

    public static void main(String[] args) {
        List<Patient> listBenhNhan = Arrays.asList(
                new Patient("Lan", 45, "Tim mạch"),
                new Patient("Hùng", 30, "Nội tiết"),
                new Patient("Mai", 50, "Tim mạch"),
                new Patient("An", 25, "Nhi"),
                new Patient("Bình", 60, "Nội tiết"),
                new Patient("Chi", 20, "Nội tiết")
        );

        Map<String, List<Patient>> mapKhoa = new HashMap<>();

        for (Patient p : listBenhNhan) {
            if (!mapKhoa.containsKey(p.department)) {
                mapKhoa.put(p.department, new ArrayList<>());
            }
            mapKhoa.get(p.department).add(p);
        }

        System.out.println("--- DANH SÁCH THEO KHOA ---");
        for (Map.Entry<String, List<Patient>> entry : mapKhoa.entrySet()) {
            System.out.println("Khoa " + entry.getKey() + ": " + entry.getValue());
        }

        String khoaDongNhat = "";
        int maxSiSo = 0;

        for (Map.Entry<String, List<Patient>> entry : mapKhoa.entrySet()) {
            int siSoHienTai = entry.getValue().size();
            if (siSoHienTai > maxSiSo) {
                maxSiSo = siSoHienTai;
                khoaDongNhat = entry.getKey();
            }
        }

        System.out.println("\n--- PHÂN TÍCH ---");
        System.out.println("Khoa " + khoaDongNhat + " đang đông nhất với " + maxSiSo + " bệnh nhân.");
    }
}
