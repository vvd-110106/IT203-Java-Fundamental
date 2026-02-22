package Session10.bai2;

import java.util.Scanner;

abstract class Vehicle {
    protected String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public abstract void move();

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}

class Car extends Vehicle {
    public Car(String brand) {
        super(brand);
    }

    @Override
    public void move() {
        System.out.println("Di chuyển bằng động cơ");
    }

    public void display() {
        System.out.print(brand + " - Cách di chuyển: ");
        move();
    }
}

class Bicycle extends Vehicle {
    public Bicycle(String brand) {
        super(brand);
    }

    @Override
    public void move() {
        System.out.println("Di chuyển bằng sức người");
    }

    public void display() {
        System.out.print(brand + " - Cách di chuyển: ");
        move();
    }
}

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tên hãng xe ô tô: ");
        String carBrand = sc.nextLine();
        Car myCar = new Car(carBrand);

        System.out.print("Nhập tên hãng xe đạp: ");
        String bikeBrand = sc.nextLine();
        Bicycle myBike = new Bicycle(bikeBrand);

        System.out.println("\nThông tin phương tiện");
        myCar.display();
        myBike.display();
    }
}
