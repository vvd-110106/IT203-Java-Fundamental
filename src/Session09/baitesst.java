package Session09;

import java.util.Scanner;

class Animal {
    private String animalName;
    private int numberOfLegs;
    private String furColor;
    private int averageLifeExpectancy;

    public Animal() {
    }

    public Animal(String animalName, int numberOfLegs, String furColor, int averageLifeExpectancy) {
        this.animalName = animalName;
        this.numberOfLegs = numberOfLegs;
        this.furColor = furColor;
        this.averageLifeExpectancy = averageLifeExpectancy;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public int getAverageLifeExpectancy() {
        return averageLifeExpectancy;
    }

    public void setAverageLifeExpectancy(int averageLifeExpectancy) {
        this.averageLifeExpectancy = averageLifeExpectancy;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên: ");
        animalName = sc.nextLine();
        System.out.print("Nhập số chân: ");
        numberOfLegs = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhập màu lông: ");
        furColor = sc.nextLine();
        System.out.print("Nhập tuổi thọ TB: ");
        averageLifeExpectancy = sc.nextInt();
        sc.nextLine();
    }

    public void display() {
        System.out.println("Tên: " + animalName);
        System.out.println("Số chân: " + numberOfLegs);
        System.out.println("Màu lông: " + furColor);
        System.out.println("Tuổi thọ TB: " + averageLifeExpectancy);
    }
}

class Bird extends Animal {
    private boolean isFly;
    private String birdSound;

    public Bird() {
    }

    public Bird(String animalName, int numberOfLegs, String furColor, int averageLifeExpectancy, boolean isFly, String birdSound) {
        super(animalName, numberOfLegs, furColor, averageLifeExpectancy);
        this.isFly = isFly;
        this.birdSound = birdSound;
    }

    public boolean isFly() {
        return isFly;
    }

    public void setFly(boolean fly) {
        isFly = fly;
    }

    public String getBirdSound() {
        return birdSound;
    }

    public void setBirdSound(String birdSound) {
        this.birdSound = birdSound;
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Có bay được không (true/false): ");
        isFly = sc.nextBoolean();
        sc.nextLine();
        System.out.print("Tiếng hót: ");
        birdSound = sc.nextLine();
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Có thể bay: " + isFly);
        System.out.println("Tiếng hót: " + birdSound);
    }
}

class MamalAnimal extends Animal {
    private String foodType;
    private boolean isLiveWithHuman;
    private String mamalSound;

    public MamalAnimal() {
    }

    public MamalAnimal(String animalName, int numberOfLegs, String furColor, int averageLifeExpectancy, String foodType, boolean isLiveWithHuman, String mamalSound) {
        super(animalName, numberOfLegs, furColor, averageLifeExpectancy);
        this.foodType = foodType;
        this.isLiveWithHuman = isLiveWithHuman;
        this.mamalSound = mamalSound;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public boolean isLiveWithHuman() {
        return isLiveWithHuman;
    }

    public void setLiveWithHuman(boolean liveWithHuman) {
        isLiveWithHuman = liveWithHuman;
    }

    public String getMamalSound() {
        return mamalSound;
    }

    public void setMamalSound(String mamalSound) {
        this.mamalSound = mamalSound;
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Kiểu thức ăn: ");
        foodType = sc.nextLine();
        System.out.print("Sống với người (true/false): ");
        isLiveWithHuman = sc.nextBoolean();
        sc.nextLine();
        System.out.print("Tiếng kêu: ");
        mamalSound = sc.nextLine();
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Kiểu thức ăn: " + foodType);
        System.out.println("Sống với người: " + isLiveWithHuman);
        System.out.println("Tiếng kêu: " + mamalSound);
    }
}

public class baitesst {
    public static void main(String[] args) {
        System.out.println("NHẬP THÔNG TIN CHIM");
        Bird b = new Bird();
        b.input();

        System.out.println("\nNHẬP THÔNG TIN THÚ");
        MamalAnimal m = new MamalAnimal();
        m.input();

        System.out.println("\nKẾT QUẢ HIỂN THỊ");
        System.out.println("[Thông tin Chim]");
        b.display();

        System.out.println("\n[Thông tin Thú]");
        m.display();
    }
}
