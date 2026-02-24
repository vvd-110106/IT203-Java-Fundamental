package Session04.bai1;

import java.util.Scanner;

public class bai1 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên sách: ");
        String title = scanner.nextLine();
        System.out.print("Nhập tên tác giả: ");
        String author = scanner.nextLine();

        title = title.trim().replaceAll("\\s+", " ").toUpperCase();
        author = author.trim().replaceAll("\\s+", " ").toUpperCase();

        System.out.println("[" + title + "] - Tác giả: " + author);
    }
}
