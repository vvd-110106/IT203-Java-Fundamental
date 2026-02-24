package Session10.bai3;

import java.util.Scanner;

abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

interface Swimmable {
    void swim();
}

interface Flyable {
    void fly();
}

class Duck extends Animal implements Swimmable, Flyable {
    public Duck(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println(name + " đang bơi trên mặt nước");
    }

    @Override
    public void fly() {
        System.out.println(name + " đang bay trên bầu trời");
    }
}

class Fish extends Animal implements Swimmable {
    public Fish(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println(name + " đang bơi dưới lòng đại dương");
    }
}

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tên cho vịt: ");
        String duckName = sc.nextLine();
        Duck myDuck = new Duck(duckName);

        System.out.print("Nhập tên cho cá: ");
        String fishName = sc.nextLine();
        Fish myFish = new Fish(fishName);

        System.out.println("\nThông tin sinh vật");

        System.out.println("Loài Vịt");
        myDuck.swim();
        myDuck.fly();

        System.out.println("\nLoài Cá");
        myFish.swim();
    }
}
