package Jobsheet07.Tugas;

public class ProdukKonsumsi {
    // ini pake protectedbiar bisa dipake sama anak nya
    protected String namaProduk;
    protected double harga;
    protected int stok;

    // final: nilainya tidak bisa diubah lagi setelah diisi
    protected final String kategori = "Produk Konsumsi";

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

    // Overloading 1: hitung total harga tanpa diskon
    public double hitungTotalHarga(int jumlah) {
        return harga * jumlah;
    }

    // Overloading 2: hitung total harga dengan diskon (dalam persen)
    public double hitungTotalHarga(int jumlah, double diskon) {
        double total = harga * jumlah;
        return total - (total * diskon / 100);
    }

    // final method
    public final void tampilkanKategori() {
        System.out.println("Kategori        : " + kategori);
    }
}
