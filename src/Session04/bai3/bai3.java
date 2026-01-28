package Session04.bai3;

import java.time.LocalDate;

public class bai3 {
    public static void main(String[] args) {

        String[] transactions = {"BK001-20/01", "BK005-21/01", "BK099-22/01"};
        LocalDate today = LocalDate.now();

        long startSB = System.currentTimeMillis();

        StringBuilder report = new StringBuilder();
        report.append("--- BÁO CÁO MƯỢN SÁCH ---\n");
        report.append("Ngày tạo: ").append(today).append("\n");

        for (String t : transactions) {
            report.append("Giao dịch: ").append(t).append("\n");
        }

        long endSB = System.currentTimeMillis();
        long startStr = System.currentTimeMillis();

        String reportStr = "";
        reportStr += "--- BÁO CÁO MƯỢN SÁCH ---\n";
        reportStr += "Ngày tạo: " + today + "\n";

        for (String t : transactions) {
            reportStr += "Giao dịch: " + t + "\n";
        }

        long endStr = System.currentTimeMillis();
        System.out.println(report.toString());

        System.out.println("Số thời gian thực thi đối với StringBuilder: "+ (endSB - startSB));
        System.out.println("Số thời gian thực thi đối với String: "+ (endStr - startStr));
    }
}
