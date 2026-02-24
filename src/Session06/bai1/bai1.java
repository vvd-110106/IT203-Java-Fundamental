package Session06.bai1;

class Student {
    String studentId;
    String fullName;
    int birthYear;
    double averageScore;

    Student (String studentId, String fullName, int birthYear, double averageScore) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.birthYear = birthYear;
        this.averageScore = averageScore;
    }
    void displayInfo () {
        System.out.println("Mã sinh viên: " + studentId);
        System.out.println("Họ và tên: " + fullName);
        System.out.println("Năm sinh: " + birthYear);
        System.out.println("Điểm trung bình: " + averageScore);
        System.out.println("---------------------------");
    }
}

public class bai1 {
    public static void main (String[] args) {
        Student sv1= new Student("SV01", "Vũ Văn Đoàn", 2006, 8.0);
        Student sv2= new Student("SV02", "Phương Anh", 2006, 8.0);

        sv1.displayInfo();
        sv2.displayInfo();
    }
}
