package Session10.bai6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " - " + price;
    }
}

public class bai6 {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 15000000));
        products.add(new Product("Phone", 8000000));
        products.add(new Product("Tablet", 12000000));

        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return Double.compare(p1.getPrice(), p2.getPrice());
            }
        });
        System.out.println("Sắp xếp theo giá:");
        for (Product p : products) {
            System.out.println(p);
        }

        Collections.sort(products, (p1, p2) -> p1.getName().compareTo(p2.getName()));

        System.out.println("\nSắp xếp theo tên:");
        for (Product p : products) {
            System.out.println(p);
        }
    }
}
