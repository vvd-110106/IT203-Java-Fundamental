package Session04.bai2;

public class bai2 {
    public static void main (String[] args) {
        String description = "Sách giáo khoa Toán lớp 12, Kệ: A1-102, tình trạng mới";
        if (description.contains("Kệ:")) {
            int start = description.indexOf("Kệ:") + 4;
            int end = description.indexOf(",", start);

            String location = description.substring(start,end).trim();
            System.out.println("Vị trí tìm thấy: " + location);
            String newDescription = description.replace("Kệ:", "Vị trí lưu trữ:");
            System.out.println("Mô tả mới: "+ newDescription);
        } else {
            System.out.println("Không tìm thấy vị trí kệ sách");
        }

    }
}
