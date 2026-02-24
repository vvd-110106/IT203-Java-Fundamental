package Session06.bai3;

class Product {
    private String maSP;
    private String tenSP;
    private double giaBan;
    Product(String maSP, String tenSP, double giaBan) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        setGiaBan(giaBan);
    }
    public String getMaSP() {
        return maSP;
    }
    public String getTenSP() {
        return tenSP;
    }
    public double getGiaBan() {
        return giaBan;
    }
    public void setGiaBan(double giaBan) {
        if (giaBan > 0) {
            this.giaBan = giaBan;
        } else {
            System.out.println("Gia ban khong hop le!");
        }
    }
    public void displayInfo() {
        System.out.println("Mã SP: " + maSP);
        System.out.println("Tên SP: " + tenSP);
        System.out.println("Giá bán: " + giaBan);
        System.out.println("--------------------");
    }
}

public class bai3 {
    public static void main(String[] args) {
        Product product = new Product("SP01", "Laptop", 15000000);
        product.displayInfo();
        product.setGiaBan(-5000);
        product.displayInfo();
    }
}
