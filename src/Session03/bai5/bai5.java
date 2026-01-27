package Session03.bai5;
import java.util.Scanner;

public class bai5 {
    public static int deleteBook(int[] arr, int n, int bookId) {
        int pos = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == bookId) {
                pos = i;
                break;
            }
        }
        if (pos == -1) {
            System.out.println("Không tìm thấy mã sách " + bookId);
            return n;
        }
        for (int i = pos; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        System.out.println("Đã xóa mã sách " + bookId);
        return n - 1;
    }
    public static void displayBooks(int[] arr, int n) {
        System.out.print("Kho sách hiện tại (" + n + "cuốn): [ ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] books = {101, 102, 103, 104, 105};
        int n = 5;

        while (n > 0) {
            displayBooks(books, n);

            System.out.print("Nhập mã sách cần xóa (0 để thoát): ");
            int bookId = sc.nextInt();
            if (bookId == 0) {
                break;
            }
            n = deleteBook(books, n, bookId);
        }
    }
}
