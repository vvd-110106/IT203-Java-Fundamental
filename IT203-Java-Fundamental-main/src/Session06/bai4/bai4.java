package Session06.bai4;

class Employee {
    String maNV;
    String tenNV;
    double luong;
    Employee() {
        maNV = "Chưa có";
        tenNV = "Chưa có";
        luong = 0;
    }
    Employee(String maNV, String tenNV) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.luong = 0;
    }
    Employee(String maNV, String tenNV, double luong) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.luong = luong;
    }
    void displayInfo() {
        System.out.println("Mã NV: " + maNV);
        System.out.println("Tên NV: " + tenNV);
        System.out.println("Lương: " + luong);
        System.out.println("--------------------");
    }
}

public class bai4 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("NV01", "Quyền");
        Employee e3 = new Employee("NV02", "Đoàn", 12000000);
        e1.displayInfo();
        e2.displayInfo();
        e3.displayInfo();
    }
}
