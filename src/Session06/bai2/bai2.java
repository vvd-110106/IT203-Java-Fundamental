package Session06.bai2;

class Account {
    String username;
    String password;
    String email;
    Account(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }
    void changePassword(String newPassword) {
        this.password = newPassword;
    }
    void displayInfo() {
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("-------------------");
    }
}


public class bai2 {
    public static void main (String[] args) {
        Account account = new Account("Vũ Văn Đoàn", "12345678", "doan@gmail.com");
        account.displayInfo();
        account.changePassword("ab123456");
        account.displayInfo();
    }
}
