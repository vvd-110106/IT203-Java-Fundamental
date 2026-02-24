package Session09.bai2;

class Animal {
    void sound() {
        System.out.println("Động vật đang tạo ra tiếng kêu...");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Gâu gâu");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Meo meo");
    }
}

public class bai2 {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        Animal genericAnimal = new Animal();

        myDog.sound();
        myCat.sound();
        genericAnimal.sound();
    }
}
