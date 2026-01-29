package Session05_ThucHanh;

import java.util.Scanner;

public class thuchanh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] mssvList = new String[100];
        int count = 0;
        int choice;
        String regexMSSV = "^B\\d{7}$";
        do{
            System.out.println("--------MENU QUẢN LÝ MÃ SINH VIÊN--------");
            System.out.println("1. Hiển thị danh sách mã sinh viên");
            System.out.println("2. Thêm mới mã sinh viên");
            System.out.println("3. Cập nhật mã sinh viên theo vị trí");
            System.out.println("4. Xóa mã sinh viên");
            System.out.println("5. Tìm kiếm mã sinh viên");
            System.out.println("6. Thoát");
            System.out.print(" Lựa chọn cửa bạn: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    if (count == 0) {
                        System.out.println("Danh sách mã số sinh viên rỗng!");
                    } else {
                        System.out.println("Danh sách mã số sinh viên!");
                        for (int i = 0; i < count; i++) {
                            System.out.println((i + 1) + ". " + mssvList[i]);
                        }
                    }
                    break;
                case 2:
                    if (count >= 100) {
                        System.out.println("Danh sách đã đầy, không thể thêm.");
                        break;
                    }

                    String newMSSV;
                    while (true) {
                        System.out.print("Nhập mã số sinh viên mới: ");
                        newMSSV = scanner.nextLine();

                        if (newMSSV.matches(regexMSSV)) {
                            mssvList[count] = newMSSV;
                            count++;
                            System.out.println("Thêm mới mã số sinh viên thành công");
                            break;
                        } else {
                            System.out.println("Sai định dạng! MSSV phải có dạng (VD:B2101234)");
                        }
                    }
                    break;
                case 3:
                    System.out.print("Nhập vị trí MSSV cần sửa: ");
                    int index = scanner.nextInt();
                    scanner.nextLine();

                    if (index < 1 || index > count) {
                        System.out.println("Vị trí sửa không hợp lệ");
                        break;
                    }

                    String updateMSSV;
                    while (true) {
                        System.out.print("Nhập MSSV mới: ");
                        updateMSSV = scanner.nextLine();

                        if (updateMSSV.matches(regexMSSV)) {
                            mssvList[index - 1] = updateMSSV;
                            System.out.println("Cập nhật thành công");
                            break;
                        } else {
                            System.out.println("Sai định dạng MSSV");
                        }
                    }
                    break;
                case 4:
                    System.out.print("Nhập mã số sinh viên cần xóa: ");
                    String deleteMSSV = scanner.nextLine();
                    int pos = -1;

                    for (int i = 0; i < count; i++) {
                        if (mssvList[i].toLowerCase().equals(deleteMSSV.toLowerCase())) {
                            pos = i;
                            break;
                        }
                    }
                    if (pos == -1) {
                        System.out.println("Không tìm thấy MSSV để xóa");
                    } else {
                        for (int i = pos; i < count - 1; i++) {
                            mssvList[i] = mssvList[i + 1];
                        }
                        count--;
                        System.out.println("Xóa thành công");
                    }
                    break;
                case 5:
                    System.out.print("Nhập MSSV cần tìm kiếm ");
                    String search = scanner.nextLine();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (mssvList[i].toLowerCase().contains(search.toLowerCase())) {
                            System.out.println(mssvList[i]);
                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("Không tìm thấy MSSV!");
                    }
                    break;
                case 6:
                    System.out.println("Bạn đã thoát chương trình");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }
        } while (choice != 6);
    }
}
