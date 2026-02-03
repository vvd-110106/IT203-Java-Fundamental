package Session7.bai4;

class ClassRoom {
    static double classFund = 0;
    String studentName;
    ClassRoom(String studentName) {
        this.studentName = studentName;
    }
    void payFund(double amount) {
        classFund += amount;
        System.out.println(studentName + " đã đóng " + amount + " vào quỹ lớp.");
    }
    static void showClassFund() {
        System.out.println("Tổng quỹ lớp hiện tại: " + classFund);
    }
}

public class bai4 {
    public static void main(String[] args) {

        ClassRoom sv1 = new ClassRoom("Vũ Văn Đoàn");
        ClassRoom sv2 = new ClassRoom("Phương Anh");
        ClassRoom sv3 = new ClassRoom("Nguyễn Văn Bình");

        sv1.payFund(100000);
        sv2.payFund(150000);
        sv3.payFund(200000);

        System.out.println();
        ClassRoom.showClassFund();
    }
}
