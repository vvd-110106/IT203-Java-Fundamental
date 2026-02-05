package Session09.bai3;

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("Tên: " + name);
        System.out.println("Lương cơ bản: " + salary);
    }
}

class Manager extends Employee {
    String department;

    Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    void showFullInfo() {
        super.display();
        System.out.println("Phòng ban: " + department);
    }
}

public class bai3 {
    public static void main(String[] args) {
        Manager m = new Manager("Đoàn", 85000, "Phòng Công Nghệ");
        m.showFullInfo();
    }
}
