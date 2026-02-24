package Session03.bai6;

public class bai6 {
    public static int[] mergeBooks(int[] a, int[] b) {
        int[] temp = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                temp[k++] = a[i++];
            } else if (a[i] > b[j]) {
                temp[k++] = b[j++];
            } else {
                temp[k++] = a[i];
                i++;
                j++;
            }
        }
        while (i < a.length) {
            temp[k++] = a[i++];
        }
        while (j < b.length) {
            temp[k++] = b[j++];
        }
        int[] arrayMerge = new int[k];
        for (int x = 0; x < k; x++) {
            arrayMerge[x] = temp[x];
        }
        return arrayMerge;
    }
    public static void displayBooks(int[] arr) {
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int[] arrayFirst  = {1, 3, 5, 7, 9};
        int[] arraySecond = {2, 3, 5, 6, 8, 9, 10};
        System.out.print("Kho cũ: ");
        displayBooks(arrayFirst);
        System.out.print("Lô mới: ");
        displayBooks(arraySecond);
        int[] arrayMerge = mergeBooks(arrayFirst, arraySecond);
        System.out.print("Kho tổng (đã gộp & lọc trùng): ");
        displayBooks(arrayMerge);
    }
}
