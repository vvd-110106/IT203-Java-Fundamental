package Session04.bai6;

public class bai6 {
    public static void main(String[] args) {
        String review = "Cuốn sách này rất tệ, nội dung thật là ngu ngốc và không đáng đọc.";
        String[] blacklist = {"tệ", "ngu ngốc", "không đáng đọc"};
        System.out.println("Ban đầu: " + review);

        for (String word : blacklist) {
            String regex = "(?i)" + word;
            review = review.replaceAll(regex, "*".repeat(word.length()));
        }

        if (review.length() > 200) {
            int cutIndex = 200;
            while (cutIndex > 0 && review.charAt(cutIndex) != ' ') {
                cutIndex--;
            }
            StringBuilder shortReview = new StringBuilder();
            shortReview.append(review.substring(0, cutIndex));
            shortReview.append("...");
            review = shortReview.toString();
        }
        System.out.println("Review sau khi xử lý: " + review);
    }

}
