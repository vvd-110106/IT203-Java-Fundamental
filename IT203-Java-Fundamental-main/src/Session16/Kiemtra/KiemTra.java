package src.Session16.Kiemtra;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.Comparator;

interface IRepository<T> {
    boolean add(T item);
    boolean removeById(String id);
    T findById(String id);
    List<T> findAll();
}

abstract class Product {
    protected String id;
    protected String name;
    protected double price;

    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public abstract double calculateFinalPrice();

    public void displayInfo() {
        System.out.print("ID: " + id + " | Tên: " + name + " | Giá gốc: " + String.format("%.0f", price));
    }

    public String getId() { return id; }
    public double getPrice() { return price; }
}

class ElectronicProduct extends Product {
    private int warrantyMonths;

    public ElectronicProduct(String id, String name, double price, int warrantyMonths) {
        super(id, name, price);
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public double calculateFinalPrice() {
        return (warrantyMonths > 12) ? price + 1000000 : price;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.print(" | Bảo hành: " + warrantyMonths + " tháng");
    }
}

class FoodProduct extends Product {
    private int discountPercent;

    public FoodProduct(String id, String name, double price, int discountPercent) {
        super(id, name, price);
        this.discountPercent = discountPercent;
    }

    @Override
    public double calculateFinalPrice() {
        return price - (price * discountPercent / 100);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.print(" | Giảm giá: " + discountPercent + "%");
    }
}

class ProductRepository implements IRepository<Product> {
    private List<Product> list = new ArrayList<>();
    private Map<String, Product> map = new HashMap<>();

    @Override
    public boolean add(Product item) {
        if (item == null || map.containsKey(item.getId())) return false;
        list.add(item);
        map.put(item.getId(), item);
        return true;
    }

    @Override
    public boolean removeById(String id) {
        Product p = map.remove(id);
        if (p != null) {
            list.remove(p);
            return true;
        }
        return false;
    }

    @Override
    public Product findById(String id) {
        return map.get(id);
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(list);
    }

    public void sortByPrice() {
        list.sort(Comparator.comparingDouble(Product::getPrice));
    }

    public Map<String, Integer> getStatistics() {
        Map<String, Integer> stats = new HashMap<>();
        int e = 0, f = 0;
        for (Product p : list) {
            if (p instanceof ElectronicProduct) {
                e++;
            }
            else if (p instanceof FoodProduct) {
                f++;
            }
        }
        stats.put("Điện tử (Electronic)", e);
        stats.put("Thực phẩm (Food)", f);
        return stats;
    }
}
public class KiemTra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductRepository repo = new ProductRepository();

        repo.add(new ElectronicProduct("E01", "Laptop", 250000, 24));
        repo.add(new ElectronicProduct("E02", "Iphone 17", 500000, 20));
        repo.add(new FoodProduct("F01", "Mì cay", 35000, 10));
        repo.add(new FoodProduct("F02", "Trà sữa", 30000, 5));

        while (true) {
            System.out.println("\n Hệ Thống Quản Lý Sản Phẩm");
            System.out.println("1. Hiển thị danh sách");
            System.out.println("2. Tìm kiếm sản phẩm theo ID");
            System.out.println("3. Sắp xếp theo giá tăng dần");
            System.out.println("4. Thống kê theo loại");
            System.out.println("5. Thoát");
            System.out.print("Lựa chọn của bạn:");

            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    for (Product p : repo.findAll()) {
                        p.displayInfo();
                        System.out.println(" | Thành tiền: " + String.format("%.0f", p.calculateFinalPrice()));
                    }
                    break;
                case 2:
                    System.out.print("Nhập ID sản phẩm bạn cần kiếm trong hệ thống:");
                    Product found = repo.findById(sc.nextLine());
                    if (found != null) {
                        found.displayInfo();
                        System.out.println(" | Thành tiền: " + String.format("%.0f", found.calculateFinalPrice()));
                    } else {
                        System.out.println("Không tìm thấy");
                    }
                    break;
                case 3:
                    repo.sortByPrice();
                    System.out. print("Đã sắp xếp");
                    break;
                case 4:
                    repo.getStatistics().forEach((k, v) -> System.out.println(k + ": " + v));
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.print("Lựa chọn không hợp lệ");
            }
        }
    }
}