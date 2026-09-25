package Kuis1;

public class Stock {
    private Product product;
    private int quantity;
    private int shopNo;

    public Stock(Product product, int quantity, int shopNo) {
        this.product = product;
        this.quantity = quantity;
        this.shopNo = shopNo;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getShopNo() {
        return shopNo;
    }

    public void setShopNo(int shopNo) {
        this.shopNo = shopNo;
    }

    public void addStock() {
        System.out.println("Stock berhasil ditambahkan.");
    }

    public void modifyStock(int productID) {
        System.out.println("Stock dengan Product ID " + productID + " berhasil diubah.");
    }

    public void selectStockItem(int productID) {
        System.out.println("Stock dengan Product ID " + productID + " dipilih.");
    }
}
