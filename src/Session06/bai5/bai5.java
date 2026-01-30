package Session06.bai5;

class Book {
    String maSach;
    String tenSach;
    String tacGia;
    Book(String maSach, String tenSach, String tacGia) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
    }
    void displayInfo() {
        System.out.println("Ma sach: " + maSach);
        System.out.println("Ten sach: " + tenSach);
        System.out.println("Tac gia: " + tacGia);
        System.out.println("--------------------");
    }
}

public class bai5 {
    public static void main(String[] args) {
        Book b1 = new Book("B001", "JAVA", "Vũ Văn Đoàn");
        b1.displayInfo();
    }
}
