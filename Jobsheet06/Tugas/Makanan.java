package Jobsheet06.Tugas;

public class Makanan extends ProdukKonsumsi{
    // extend menunjukkan anaknya
    private String jenisMakanan;

    // constructor tnpa parameter
    public Makanan() {

    }

    // constructor berparameter
    public Makanan(String namaProduk, double harga, int stok, String jenisMakanan) {
        super(namaProduk, harga, stok);
        // super itu manggil dari ortunya 
        this.jenisMakanan = jenisMakanan;
    }

    // buat modifikasi
    public void setJenisMakanan(String jenisMakanan) {
        this.jenisMakanan = jenisMakanan;
    }

    public void tampilkanInfoMakanan() {
        super.tampilkanInfo();
        System.out.println("Jenis Makanan   : " + jenisMakanan);
    }
}

