package Jobsheet06.Tugas;

public class ProdukKonsumsi {
    // ini pake protectedbiar bisa dipake sama anak nya
    protected String namaProduk;
    protected double harga;
    protected int stok;

    // constructor tnpa parameter
    public ProdukKonsumsi() {

    }

    // constructor berparameter
    public ProdukKonsumsi(String namaProduk, double harga, int stok) {
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Produk     : " + namaProduk);
        System.out.println("Harga           : Rp" + harga);
        System.out.println("Jumlah Stok     : " + stok);
    }
}
