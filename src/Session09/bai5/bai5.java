package Session09.bai5;

class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    double calculateSalary() {
        return 0;
    }
}

class OfficeEmployee extends Employee {
    double monthlyFixedSalary;

    OfficeEmployee(String name, double monthlyFixedSalary) {
        super(name);
        this.monthlyFixedSalary = monthlyFixedSalary;
    }

    @Override
    double calculateSalary() {
        return monthlyFixedSalary;
    }
}

class ProductionEmployee extends Employee {
    int productCount;
    double pricePerProduct;

    ProductionEmployee(String name, int productCount, double pricePerProduct) {
        super(name);
        this.productCount = productCount;
        this.pricePerProduct = pricePerProduct;
    }

    @Override
    double calculateSalary() {
        return productCount * pricePerProduct;
    }
}

public class bai5 {
    public static void main(String[] args) {
        Employee[] employees = {
                new OfficeEmployee("Nguyễn Văn Ánh", 8000),
                new ProductionEmployee("Trần Thị Bình", 2500, 2),
                new OfficeEmployee("Lê Văn Cường", 1200)
        };

        double totalSalary = 0;

        for (Employee e : employees) {
            double salary = e.calculateSalary();
            System.out.println("Nhân viên: " + e.name + " - Lương: " + salary);
            totalSalary += salary;
        }

        System.out.println("Tổng lương hệ thống: " + totalSalary);
    }
}
