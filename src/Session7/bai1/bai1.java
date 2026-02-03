package Session7.bai1;

class Student {
    String studentId;
    String fullName;
    static int totalStudent = 0;
    Student(String studentId, String fullName) {
        this.studentId = studentId;
        this.fullName = fullName;
        totalStudent++;
    }
    void displayInfo() {
        System.out.println("Mã sinh viên: " + studentId);
        System.out.println("Tên sinh viên: " + fullName);
        System.out.println("-------------------------");
    }
    static void displayTotalStudent() {
        System.out.println("Tổng số sinh viên đã tạo: " + totalStudent);
    }
}

public class bai1 {
    public static void main(String[] args) {
        Student sv1 = new Student("01", "Vũ Văn Đoàn");
        Student sv2 = new Student("02", "Phương Anh");
        Student sv3 = new Student("03", "Nguyêễn Quốc Cuường");

        sv1.displayInfo();
        sv2.displayInfo();
        sv3.displayInfo();
        Student.displayTotalStudent();
    }
}
