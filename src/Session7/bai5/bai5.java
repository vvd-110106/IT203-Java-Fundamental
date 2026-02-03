package Session7.bai5;

class Config {
    static final double max_score = 10.0;
    static final double min_score = 0.0;
}

public class bai5 {
    public static void main(String[] args) {

        double score = 8.5;

        System.out.println("Điểm hiện tại: " + score);
        System.out.println("Điểm tối đa: " + Config.max_score);
        System.out.println("Điểm tối thiểu: " + Config.min_score);

        if (score >= Config.min_score && score <= Config.max_score) {
            System.out.println("Điểm hợp lệ.");
        } else {
            System.out.println("Điểm không hợp lệ.");
        }
    }
}
