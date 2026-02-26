package src.Session13;

import java.util.*;

class Medicine {
    String drugId;
    String drugName;
    double unitPrice;
    int quantity;

    public Medicine(String drugId, String drugName, double unitPrice, int quantity) {
        this.drugId = drugId;
        this.drugName = drugName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }
}

public class bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Medicine> cart = new ArrayList<>();
        while (true) {
            System.out.println("1. Thêm thuốc vào đơn");
            System.out.println("2. Điều chỉnh số lượng");
            System.out.println("3. Xóa thuốc");
            System.out.println("4. In hóa đơn");
            System.out.println("5. Tìm thuốc giá rẻ");
            System.out.println("6. Thoát");
            System.out.print("Chọn lựa chọn: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.print("Nhập mã thuốc: ");
                    String id = sc.nextLine();
                    boolean exists = false;
                    for (Medicine m : cart) {
                        if (m.drugId.equals(id)) {
                            System.out.print("Nhập số lượng thêm: ");
                            m.quantity += Integer.parseInt(sc.nextLine());
                            exists = true;
                            break;
                        }
                    }
                    if (!exists) {
                        System.out.print("Nhập tên thuốc: ");
                        String name = sc.nextLine();
                        System.out.print("Nhập giá thuốc: ");
                        double price = Double.parseDouble(sc.nextLine());
                        System.out.print("Nhập số lượng: ");
                        int qty = Integer.parseInt(sc.nextLine());
                        cart.add(new Medicine(id, name, price, qty));
                    }
                    System.out.println("Thêm thuốc thành công !");
                    break;
                case 2:
                    while (true) {
                        System.out.print("Nhập mã thuốc: ");
                        String idCheck = sc.nextLine();
                        Medicine target = null;
                        for (Medicine m : cart) {
                            if (m.drugId.equals(idCheck)) {
                                target = m;
                                break;
                            }
                        }
                        if (target != null) {
                            System.out.print("Nhập số lượng mới: ");
                            int newQty = Integer.parseInt(sc.nextLine());
                            if (newQty <= 0) {
                                cart.remove(target);
                            } else {
                                target.quantity = newQty;
                            }
                            System.out.println("Cập nhật thuốc thành công !");
                            break;
                        } else {
                            System.out.println("Thuốc không tồn tại trong đơn.");
                        }
                    }
                    break;
                case 3:
                    System.out.print("Nhập mã thuốc cần xóa: ");
                    String idDel = sc.nextLine();
                    Iterator<Medicine> it = cart.iterator();
                    boolean found = false;
                    while (it.hasNext()) {
                        if (it.next().drugId.equals(idDel)) {
                            it.remove();
                            found = true;
                            break;
                        }
                    }
                    if (!found) System.out.println("Id thuốc không tồn tại !");
                    break;
                case 4:
                    System.out.printf("%-10s %-20s %-10s %-10s\n", "Mã Thuốc", "Tên Thuốc", "Đơn Giá", "Số Lượng");
                    double total = 0;
                    for (Medicine m : cart) {
                        System.out.printf("%-10s %-20s %-10.2f %-10d\n", m.drugId, m.drugName, m.unitPrice, m.quantity);
                        total += m.unitPrice * m.quantity;
                    }
                    System.out.println("Tổng tiền: " + total + " VNĐ");
                    cart.clear();
                    break;
                case 5:
                    System.out.printf("%-10s %-20s %-10s\n", "Mã Thuốc", "Tên Thuốc", "Đơn Giá");
                    for (Medicine m : cart) {
                        if (m.unitPrice < 50000) {
                            System.out.printf("%-10s %-20s %-10.2f\n", m.drugId, m.drugName, m.unitPrice);
                        }
                    }
                    break;
                case 6:
                    System.exit(0);
            }
        }
    }
}