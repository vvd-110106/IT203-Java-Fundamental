package src.Session16.MiniPrj.model;

public class Pet {
    private String id;
    private String name;
    private String species;
    private int age;
    private double price;

    public Pet() {
    }

    public Pet(String id, String name, String species, int age, double price) {
        this.id = id;
        this.name = name;
        this.species = species;
        this.age = age;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", species='" + species + '\'' +
                ", age=" + age +
                ", price=" + price +
                '}';
    }
}
