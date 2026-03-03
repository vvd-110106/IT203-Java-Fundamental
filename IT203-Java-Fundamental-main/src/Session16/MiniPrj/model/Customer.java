package petKingDom.model;

public class Customer {
    private String customerId;
    private String name;
    private String phone;
    private int loyaltyPoints;

    public Customer(String customerId, String name, String phone) {
        this.customerId = customerId;
        this.name = name;
        this.phone = phone;
        this.loyaltyPoints = 0;
    }

    public String getCustomerId() {
        return customerId;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + customerId + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", points=" + loyaltyPoints +
                '}';
    }
}
