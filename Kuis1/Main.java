package Kuis1;

public class Main {
    public static void main(String[] args) {
        // buat objek cutomer
        Customer customer = new Customer(1,"Akmalia Rima","Malang","081234567890");
        // buat objek product
        Product product = new Product(101,50000.0f,"Skincare");
        // buat objek stock
        Stock stock = new Stock(product, 100, 1);
        // menghubungkan stock dengn product
        product.addStock(stock);

        // membuat objek order
        Order order = new Order(1001, customer, product, 50000.0f);
        // menghubungkan order dengan customer
        customer.addOrder(order);

        // menampilkan data Customer
        System.out.println("===== CUSTOMER =====");
        System.out.println("Customer ID   : " + customer.getCustomerID());
        System.out.println("Nama          : " + customer.getCustomerName());
        System.out.println("Alamat        : " + customer.getAddress());
        System.out.println("No. Telepon   : " + customer.getPhone());

        // menampilkan data Order
        System.out.println("\n===== ORDER =====");
        System.out.println("Order ID      : " + order.getOrderID());
        System.out.println("Product ID    : " + order.getProduct().getProductID());
        System.out.println("Product Type  : " + order.getProduct().getProductType());
        System.out.println("Harga Product : Rp" + order.getProduct().getProductPrice());
        System.out.println("Jumlah        : Rp" + order.getAmount());
        System.out.println("Tanggal Order : " + order.getOrderDate());

        // menampilkan data Stock
        System.out.println("\n===== STOCK =====");
        System.out.println("Jumlah Stock  : " + stock.getQuantity());
        System.out.println("Nomor Toko    : " + stock.getShopNo());
    }
}
