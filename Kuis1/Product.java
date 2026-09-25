package Kuis1;
import java.util.ArrayList;

public class Product {
    private int productID;
    private float productPrice;
    private String productType;

    private ArrayList<Stock> stocks;

    public Product(int productID, float productPrice, String productType) {
        this.productID = productID;
        this.productPrice = productPrice;
        this.productType = productType;
        this.stocks = new ArrayList<>();
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public void addStock(Stock stock) {
        stocks.add(stock);
    }

    public ArrayList<Stock> getStocks() {
        return stocks;
    }

    public void addProduct() {
        System.out.println("Product berhasil ditambahkan.");
    }

    public void modifyProduct() {
        System.out.println("Product berhasil diubah.");
    }

    public void selectProduct(int productID) {
        System.out.println("Product ID: " + productID);
    }
}
