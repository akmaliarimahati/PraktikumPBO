// package Jobsheet04;

public class DetailPesanan {
    private ProdukSkincare produk;
    private int jumlah;
    private double subtotal;

    public DetailPesanan(ProdukSkincare produk, int jumlah) {
        this.produk = produk;
        this.jumlah = jumlah;
        this.subtotal = hitungSubtotal();
    }

    public ProdukSkincare getProduk() {
        return produk;
    }

    public void setProduk(ProdukSkincare produk) {
        this.produk = produk;
        this.subtotal = hitungSubtotal();
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
        this.subtotal = hitungSubtotal();
    }

    public double getSubtotal() {
        return subtotal;
    }

    public double hitungSubtotal() {
        return produk.getHarga() * jumlah;
    }

    public String getInfo() {
        return produk.getNamaProduk() + " x " + jumlah + " = Rp" + subtotal;
    }
}
