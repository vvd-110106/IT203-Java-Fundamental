package Session09.bai6;

class Shape {
    double area() {
        return 0;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    double area(double customRadius) {
        return Math.PI * customRadius * customRadius;
    }
}

class Rectangle extends Shape {
    double width, height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double area() {
        return width * height;
    }

    double area(double w, double h) {
        return w * h;
    }
}

public class bai6 {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(5),
                new Rectangle(4, 6),
                new Circle(10)
        };

        double totalArea = 0;

        for (Shape s : shapes) {
            totalArea += s.area();
        }

        System.out.println("Tổng diện tích: " + totalArea);

        Circle c = new Circle(1);
        System.out.println("Diện tích với bán kính: " + c.area(2.5));
    }
}
