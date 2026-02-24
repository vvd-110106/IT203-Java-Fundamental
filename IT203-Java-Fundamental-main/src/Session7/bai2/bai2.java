package Session7.bai2;

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }
}

public class bai2 {
    public static void main(String[] args) {
        // Biến nguyên thủy
        int a = 10;
        int b = a;
        b = 20;

        System.out.println("Biến nguyên thuy:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Biến tham chiếu
        Student sv1 = new Student("Vu Van Doan");
        Student sv2 = sv1;

        sv2.name = "Phuong Anh";

        System.out.println("\n Biến tham chiếu");
        System.out.println("sv1 name: " + sv1.name);
        System.out.println("sv2 name: " + sv2.name);
    }
}
