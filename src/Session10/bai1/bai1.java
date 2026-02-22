package Session10.bai1;

import java.util.Scanner;

interface Shape {
    double getArea();
    double getPerimeter();
}

class Circle implements Shape {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập thông tin hình tròn");
        System.out.print("Nhập bán kính: ");
        double r = sc.nextDouble();
        Circle circle = new Circle(r);

        System.out.println("\n Nhập thông tin HCN");
        System.out.print("Nhập chiều dài: ");
        double w = sc.nextDouble();
        System.out.print("Nhập chiều rộng: ");
        double h = sc.nextDouble();
        Rectangle rect = new Rectangle(w, h);

        System.out.println("\nKết quả tính toàn");

        System.out.println("Hình Tròn");
        System.out.println("Diện tích: " + circle.getArea());
        System.out.println("Chu vi: " + circle.getPerimeter());

        System.out.println("\nHình Chữ Nhật");
        System.out.println("Diện tích: " + rect.getArea());
        System.out.println("Chu vi: " + rect.getPerimeter());
    }
}
