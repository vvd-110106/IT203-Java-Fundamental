package Session08.BaiKtra;

import java.util.Scanner;

class Student {
    private String id;
    private String name;
    private double score;

    public Student() {
    }

    public Student(String id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getRank() {
        if (score >= 8.0) {
            return "Gioi";
        } else if (score >= 6.5) {
            return "Kha";
        } else {
            return "Trung Binh";
        }
    }

    public String toString() {
        return "ID: " + id + " | Name: " + name + " | Score: " + score + " | Rank: " + getRank();
    }
}

public class ThucHanh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] students = new Student[100];
        int count = 0;
        int choice;

        do {
            System.out.println("===== QUẢN LÝ ĐIỂM SINH VIÊN =====");
            System.out.println("1. Nhập danh sách sinh viên");
            System.out.println("2. Hiển thị danh sách sinh viên");
            System.out.println("3. Tìm kiếm sinh viên theo học lực");
            System.out.println("4. Sắp xếp theo học lực giảm dần");
            System.out.println("5. Thoát");
            System.out.print("Chọn chức năng: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Nhập số lượng sinh viên: ");
                    int n = sc.nextInt();
                    sc.nextLine();

                    for (int i = 0; i < n; i++) {
                        System.out.println("Sinh viên thứ " + (count + 1));

                        String id;
                        while (true) {
                            System.out.print("Nhập mã SV: ");
                            id = sc.nextLine();
                            if (id.startsWith("SV") && id.length() == 5) {
                                break;
                            }
                            System.out.println("Mã sinh viên không hợp lệ");
                        }

                        System.out.print("Nhập họ tên: ");
                        String name = sc.nextLine();

                        System.out.print("Nhập điểm trung bình: ");
                        double score = sc.nextDouble();
                        sc.nextLine();

                        students[count] = new Student(id, name, score);
                        count++;
                    }
                    break;

                case 2:
                    for (int i = 0; i < count; i++) {
                        System.out.println(students[i].toString());
                    }
                    break;

                case 3:
                    System.out.print("Nhập học lực cần tìm (Gioi/Kha/Trung Binh): ");
                    String rank = sc.nextLine().toUpperCase();

                    for (int i = 0; i < count; i++) {
                        if (students[i].getRank().equalsIgnoreCase(rank)) {
                            System.out.println(students[i].toString());
                        }
                    }
                    break;

                case 4:
                    for (int i = 0; i < count - 1; i++) {
                        for (int j = i + 1; j < count; j++) {
                            if (students[i].getScore() < students[j].getScore()) {
                                Student temp = students[i];
                                students[i] = students[j];
                                students[j] = temp;
                            }
                        }
                    }
                    System.out.println("Đã sắp xếp theo học lực giảm dần");
                    break;

                case 5:
                    System.out.println("Thoát chương trình");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }

        } while (choice != 5);
    }
}

