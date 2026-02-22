//package Session10.bai5;
//
//import java.util.Scanner;
//
//abstract class Employee {
//    protected String name;
//    protected double baseSalary;
//
//    public Employee(String name, double baseSalary) {
//        this.name = name;
//        this.baseSalary = baseSalary;
//    }
//
//    public abstract double calculateSalary();
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public double getBaseSalary() {
//        return baseSalary;
//    }
//
//    public void setBaseSalary(double baseSalary) {
//        this.baseSalary = baseSalary;
//    }
//}
//
//interface BonusCalculator {
//    double getBonus();
//}
//
//class OfficeStaff extends Employee {
//    public OfficeStaff(String name, double baseSalary) {
//        super(name, baseSalary);
//    }
//
//    @Override
//    public double calculateSalary() {
//        return baseSalary;
//    }
//
//    public void display() {
//        System.out.println("Nhân viên: " + name);
//        System.out.println("Vị trí: Nhân viên văn phòng");
//        System.out.println("Lương cơ bản: " + baseSalary);
//        System.out.println("Tổng lương cuối cùng: " + calculateSalary());
//    }
//}
//
//class Manager extends Employee implements BonusCalculator {
//    private double kpiBonus;
//
//    public Manager(String name, double baseSalary, double kpiBonus) {
//        super(name, baseSalary);
//        this.kpiBonus = kpiBonus;
//    }
//
//    @Override
//    public double getBonus() {
//        return kpiBonus;
//    }
//
//    @Override
//    public double calculateSalary() {
//        return baseSalary + getBonus();
//    }
//
//    public void display() {
//        System.out.println("Nhân viên: " + name);
//        System.out.println("Vị trí: Quản lý");
//        System.out.println("Lương cơ bản: " + baseSalary);
//        System.out.println("Tiền thưởng KPI: " + getBonus());
//        System.out.println("Tổng lương cuối cùng: " + calculateSalary());
//    }
//}
//
//public class bai5 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Nhập thông tin nhân viên văn phòng");
//        System.out.print("Tên: ");
//        String staffName = sc.nextLine();
//        System.out.print("Lương cơ bản: ");
//        double staffBase = sc.nextDouble();
//        sc.nextLine();
//        OfficeStaff staff = new OfficeStaff(staffName, staffBase);
//
//        System.out.println("\nNhập thông tin quản lý");
//        System.out.print("Tên: ");
//        String managerName = sc.nextLine();
//        System.out.print("Lương cơ bản: ");
//        double managerBase = sc.nextDouble();
//        System.out.print("Tiền thưởng KPI: ");
//        double managerBonus = sc.nextDouble();
//        Manager manager = new Manager(managerName, managerBase, managerBonus);
//
//        System.out.println("\nBảng lương chi tiết");
//
//        System.out.println("Nhân viên");
//        staff.display();
//
//        System.out.println("\nQuản lý");
//        manager.display();
//    }
//}
