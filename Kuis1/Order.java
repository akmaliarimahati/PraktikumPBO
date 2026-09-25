package Kuis1;
import java.time.LocalDateTime;

public class Order {
    private int orderID;
    private Customer customer;
    private Product product;
    private float amount;
    private LocalDateTime orderDate;

    public Order(int orderID, Customer customer, Product product, float amount) {
        this.orderID = orderID;
        this.customer = customer;
        this.product = product;
        this.amount = amount;
        this.orderDate = LocalDateTime.now();
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public void createOrder() {
        System.out.println("Order berhasil dibuat.");
    }

    public void editOrder(int orderID) {
        System.out.println("Order ID " + orderID + " berhasil diubah.");
    }
}