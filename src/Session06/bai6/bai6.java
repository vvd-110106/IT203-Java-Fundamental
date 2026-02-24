package Session06.bai6;

class User {
    private int id;
    private String username;
    private String password;
    private String email;
    public User(int id, String username, String password, String email) {
        this.id = id;
        this.username = username;
        setPassword(password);
        setEmail(email);
    }
    public int getId() {
        return id;
    }
    public String getUsername() {
        return username;
    }
    public String getEmail() {
        return email;
    }
    public void setPassword(String password) {
        if (password != null && !password.isEmpty()) {
            this.password = password;
        } else {
            System.out.println("Pass không được trống");
        }
    }
    public void setEmail(String email) {
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        if (email != null && email.matches(regex)) {
            this.email = email;
        } else {
            System.out.println("Email không hợp lệ");
        }
    }
    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("----------------------");
    }
}


public class bai6 {
    public static void main(String[] args) {
        User u1 = new User(1, "Quyền", "quyendk", "quyen@gmail.com");
        u1.displayInfo();
        User u2 = new User(2, "Việt Anh", "vanh123", "vanh1gmail.com");
        u2.displayInfo();
    }
}
