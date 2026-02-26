package src.Session13;

import java.util.*;

class Patient {
    String id;
    String fullName;
    int age;
    String diagnosis;

    public Patient(String id, String fullName, int age, String diagnosis) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.diagnosis = diagnosis;
    }

    @Override
    public String toString() {
        return "| ID : " + id + " | FullName : " + fullName + " | Age : " + age + " | Diagnosis : " + diagnosis + " |";
    }
}

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Patient> list = new ArrayList<>();

        while (true) {
            System.out.println("1. Tiếp nhận bệnh nhân");
            System.out.println("2. Cập nhật chẩn đoán");
            System.out.println("3. Xuất viện");
            System.out.println("4. Sắp xếp danh sách bệnh nhân");
            System.out.println("5. Hiển thị danh sách bệnh nhân");
            System.out.println("6. Thoát");
            System.out.print("Chọn chức năng: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Nhập ID bệnh nhân: ");
                    String id = sc.nextLine();
                    boolean exists = false;
                    for (Patient p : list) {
                        if (p.id.equals(id)) {
                            exists = true;
                            break;
                        }
                    }
                    if (exists) {
                        System.out.println("ID đã tồn tại!");
                    } else {
                        System.out.print("Nhập tên bệnh nhân: ");
                        String name = sc.nextLine();
                        System.out.print("Nhập tuổi: ");
                        int age = Integer.parseInt(sc.nextLine());
                        System.out.print("Nhập chẩn đoán: ");
                        String diag = sc.nextLine();
                        list.add(new Patient(id, name, age, diag));
                        System.out.println("Bệnh nhân đã được thêm thành công.");
                    }
                    break;

                case 2:
                    System.out.print("Nhập ID bệnh nhân để cập nhật chẩn đoán: ");
                    String idUpdate = sc.nextLine();
                    boolean foundUpdate = false;
                    for (Patient p : list) {
                        if (p.id.equals(idUpdate)) {
                            System.out.print("Nhập chẩn đoán mới: ");
                            p.diagnosis = sc.nextLine();
                            System.out.println("Chẩn đoán đã được cập nhật.");
                            foundUpdate = true;
                            break;
                        }
                    }
                    if (!foundUpdate) System.out.println("Không tìm thấy bệnh nhân.");
                    break;

                case 3:
                    System.out.print("Nhập ID bệnh nhân để xuất viện: ");
                    String idRemove = sc.nextLine();
                    Iterator<Patient> it = list.iterator();
                    boolean foundRemove = false;
                    while (it.hasNext()) {
                        if (it.next().id.equals(idRemove)) {
                            it.remove();
                            foundRemove = true;
                            break;
                        }
                    }
                    if (!foundRemove) System.out.println("Không tìm thấy bệnh nhân với ID đã cho.");
                    else System.out.println("Bệnh nhân đã xuất viện.");
                    break;

                case 4:
                    Collections.sort(list, new Comparator<Patient>() {
                        @Override
                        public int compare(Patient p1, Patient p2) {
                            if (p2.age != p1.age) return p2.age - p1.age;
                            return p1.fullName.compareTo(p2.fullName);
                        }
                    });
                    System.out.println("Danh sách bệnh nhân đã được sắp xếp.");
                    break;

                case 5:
                    System.out.println("====================Danh sách bệnh nhân====================");
                    for (Patient p : list) System.out.println(p);
                    break;

                case 6:
                    System.exit(0);
            }
        }
    }
}