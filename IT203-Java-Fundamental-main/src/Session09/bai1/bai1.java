package Session09.bai1;

class Person {
    String name;
    int age;

    void displayInfo() {
        System.out.println("Họ tên: " + name);
        System.out.println("Tuổi: " + age);
    }
}

class Student extends Person {
    String studentId;
    double gpa;

    void displayFullInfo() {
        displayInfo();
        System.out.println("Mã sinh viên: " + studentId);
        System.out.println("Điểm trung bình: " + gpa);
    }
}

public class bai1 {
    public static void main(String[] args) {
        Student s = new Student();

        s.name = "Đoàn";
        s.age = 20;
        s.studentId = "SV012";
        s.gpa = 8.5;
        s.displayFullInfo();
    }
}
