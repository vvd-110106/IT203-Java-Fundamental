package src.Session11;

interface IMixable {
    void mix();
}

abstract class Drink {
    protected String id;
    protected String name;
    protected double price;

    public Drink(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    abstract double calculatePrice();

    void displayInfo() {
        System.out.println("Mã: " + id + " | Tên: " + name + " | Giá gốc: " + price);
    }
}

class Coffee extends Drink {
    private boolean hasMilk;

    public Coffee(String id, String name, double price, boolean hasMilk) {
        super(id, name, price);
        this.hasMilk = hasMilk;
    }

    @Override
    double calculatePrice() {
        return hasMilk ? price + 5000 : price;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println(hasMilk ? "Có sữa" : "Đen đá");
    }
}
class FruitJuice extends Drink implements IMixable {
    private int discountPercent;

    public FruitJuice(String id, String name, double price, int discountPercent) {
        super(id, name, price);
        this.discountPercent = discountPercent;
    }

    @Override
    double calculatePrice() {
        return price - (price * discountPercent / 100);
    }

    @Override
    public void mix() {
        System.out.println("Đang ép trái cây tươi...");
    }
}

public class baikiemtradaugio {
    public static void main(String[] args) {
        Drink[] drinks = new Drink[3];

        drinks[0] = new Coffee("C01", "Bạc sỉu", 30000, true);
        drinks[1] = new FruitJuice("J01", "Nước cam", 40000, 10);
        drinks[2] = null;

        for (Drink d : drinks) {
            if (d != null) {
                d.displayInfo();
                if (d instanceof IMixable) {
                    ((IMixable) d).mix();
                }
                System.out.println("Thành tiền: " + d.calculatePrice());
            }
        }
    }
}
