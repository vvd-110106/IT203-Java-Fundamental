package src.Session16.MiniPrj.main;

import petKingDom.model.Pet;
import petKingDom.model.Customer;
import petKingDom.manager.*;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static PetShopManager<Pet> petManager = new PetShopManager<Pet>();
    static CustomerManager<Customer> customerManager = new CustomerManager<Customer>();
    static SpaService<Pet> spaService = new SpaService<Pet>();
    static ActivityLog activityLog = new ActivityLog();

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n===== PET KINGDOM =====");
            System.out.println("1. Quản lý thú cưng");
            System.out.println("2. Quản lý khách hàng");
            System.out.println("3. Dịch vụ Spa");
            System.out.println("4. Nhật ký hoạt động");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {

                case 1:
                    quanLyThuCung();
                    break;

                case 2:
                    quanLyKhachHang();
                    break;

                case 3:
                    quanLySpa();
                    break;

                case 4:
                    quanLyNhatKy();
                    break;

                case 0:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }

    // quản lý thú cưng
    static void quanLyThuCung() {

        System.out.println("\n1. Thêm thú cưng");
        System.out.println("2. Hiển thị danh sách");
        System.out.println("3. Xóa thú cưng");
        System.out.println("4. Tìm kiếm thú cưng");
        System.out.print("Chọn: ");

        int choice = Integer.parseInt(scanner.nextLine());

        switch (choice) {

            case 1:
                System.out.print("Mã: ");
                String id = scanner.nextLine();

                System.out.print("Tên: ");
                String name = scanner.nextLine();

                System.out.print("Loài: ");
                String species = scanner.nextLine();

                System.out.print("Tuổi: ");
                int age = Integer.parseInt(scanner.nextLine());

                System.out.print("Giá: ");
                double price = Double.parseDouble(scanner.nextLine());

                Pet pet = new Pet(id, name, species, age, price);
                petManager.add(pet);
                activityLog.push("Thêm thú cưng " + id);
                System.out.println("Thêm thành công!");
                break;

            case 2:
                for (Pet p : petManager.getAll()) {
                    System.out.println(p);
                }
                break;

            case 3:
                System.out.print("Nhập mã cần xóa: ");
                String deleteId = scanner.nextLine();

                Pet found = null;

                for (Pet p : petManager.getAll()) {
                    if (p.getId().equals(deleteId)) {
                        found = p;
                        break;
                    }
                }

                if (found != null) {
                    petManager.remove(found);
                    activityLog.push("Xóa thú cưng " + deleteId);
                    System.out.println("Xóa thành công!");
                } else {
                    System.out.println("Không tìm thấy.");
                }
                break;

            case 4:
                System.out.print("Nhập mã cần tìm: ");
                String searchId = scanner.nextLine();

                for (Pet p : petManager.getAll()) {
                    if (p.getId().equals(searchId)) {
                        System.out.println(p);
                        return;
                    }
                }

                System.out.println("Không tìm thấy.");
                break;

            default:
                System.out.println("Lựa chọn không hợp lệ.");
        }
    }

    // quản lý khách hàng
    static void quanLyKhachHang() {

        System.out.println("\n1. Đăng ký khách hàng");
        System.out.println("2. Hiển thị danh sách");
        System.out.println("3. Tìm khách hàng");
        System.out.print("Chọn: ");

        int choice = Integer.parseInt(scanner.nextLine());

        switch (choice) {

            case 1:
                System.out.print("Mã: ");
                String id = scanner.nextLine();

                System.out.print("Tên: ");
                String name = scanner.nextLine();

                System.out.print("SĐT: ");
                String phone = scanner.nextLine();

                Customer c = new Customer(id, name, phone);
                customerManager.add(id, c);
                activityLog.push("Thêm khách hàng " + id);
                System.out.println("Đăng ký thành công!");
                break;

            case 2:
                for (Customer cus : customerManager.getAll()) {
                    System.out.println(cus);
                }
                break;

            case 3:
                System.out.print("Nhập mã: ");
                String searchId = scanner.nextLine();

                Customer customer = customerManager.get(searchId);

                if (customer != null) {
                    System.out.println(customer);
                } else {
                    System.out.println("Không tìm thấy.");
                }
                break;

            default:
                System.out.println("Lựa chọn không hợp lệ.");
        }
    }

    // quản lý spa
    static void quanLySpa() {

        System.out.println("\n1. Thêm vào thú cưng vào danh sách đợi");
        System.out.println("2. Thú cung được phục vụ tiếp theo");
        System.out.println("3. Xem thú cưng được phục vụ tiếp theo");
        System.out.print("Chọn: ");

        int choice = Integer.parseInt(scanner.nextLine());

        switch (choice) {

            case 1:
                System.out.print("Nhập mã thú cưng: ");
                String id = scanner.nextLine();

                for (Pet p : petManager.getAll()) {
                    if (p.getId().equals(id)) {
                        spaService.addToQueue(p);
                        activityLog.push("Thêm vào Spa " + id);
                        return;
                    }
                }

                System.out.println("Không tìm thấy.");
                break;

            case 2:
                Pet served = spaService.serveNext();
                if (served != null) {
                    activityLog.push("Phục vụ Spa");
                    System.out.println(served);
                } else {
                    System.out.println("Hàng đợi trống.");
                }
                break;

            case 3:
                Pet next = spaService.peek();
                if (next != null) {
                    System.out.println(next);
                } else {
                    System.out.println("Hàng đợi trống.");
                }
                break;

            default:
                System.out.println("Lựa chọn không hợp lệ.");
        }
    }

    // quản lý nhật ký
    static void quanLyNhatKy() {

        System.out.println("\n1. Hoàn tác");
        System.out.println("2. Xem gần nhất");
        System.out.print("Chọn: ");

        int choice = Integer.parseInt(scanner.nextLine());

        switch (choice) {

            case 1:
                activityLog.undo();
                break;

            case 2:
                activityLog.showRecent();
                break;

            default:
                System.out.println("Lựa chọn không hợp lệ.");
        }
    }
}
