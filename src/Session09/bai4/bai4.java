package Session09.bai4;

class Animal {
    void sound() {
        System.out.println("Động vật phát ra tiếng kêu");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Gâu gâu");
    }

    void wagTail() {
        System.out.println("Chó đang vẫy đuôi vui vẻ");
    }
}

public class bai4 {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.sound();
        if (animal instanceof Dog) {
            Dog d = (Dog) animal;
            d.wagTail();
        }
    }
}
