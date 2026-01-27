package Session03.bai4;

public class bai4 {
    public static void sortBooks(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void displayBooks(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int[] books = {105, 102, 109, 101, 103};
        System.out.print("Trước khi sắp xếp: ");
        displayBooks(books);
        sortBooks(books);
        System.out.print("Sau khi sắp xếp: ");
        displayBooks(books);
    }
}
