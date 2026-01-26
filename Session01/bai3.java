package Session01;

public class bai3 {
    public static void main(String[] args) {
        String book1 = "Java Basic";
        String book2 = "Python Intro";
        System.out.println("Ban đầu ");
        System.out.println("book1: " + book1);
        System.out.println("book2: " + book2);
        String temp; // temp là biến tham chiếu, chưa trỏ tới đâu
        temp = book1; // temp lưu tham chiếu mà book1 đang giữ ("Java Basic")
        book1 = book2;  // book1 trỏ sang vùng nhớ mà book2 đang trỏ ("Python Intro")
        book2 = temp; // book2 trỏ sang vùng nhớ mà temp đang giữ (cũ của book1)
        System.out.println("\n Sau khi hoán đổi");
        System.out.println("book1 = " + book1);
        System.out.println("book2 = " + book2);
    }
}
