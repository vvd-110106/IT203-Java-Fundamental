package Session7.bai3;

class ScoreUtils {
    public static boolean checkPass(double score) {
        if (score >= 5.0) {
            return true;
        }
        return false;
    }
    public static double calculateAverage(double[] scores) {
        double sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        return sum / scores.length;
    }
}

public class bai3 {
    public static void main(String[] args) {
        double[] scores = {6.5, 8.0, 4.5};

        System.out.println("Danh sách điểm: 6.5, 8.0, 4.5");
        System.out.println("\n>> Kết quả xử lý:");
        double average = ScoreUtils.calculateAverage(scores);
        System.out.printf("- Điểm trung bình cả lớp: %.2f\n", average);
        for (int i = 0; i < scores.length; i++) {
            if (ScoreUtils.checkPass(scores[i])) {
                System.out.println("- Điểm " + scores[i] + ": Đạt");
            } else {
                System.out.println("- Điểm " + scores[i] + ": Trượt");
            }
        }
    }
}
