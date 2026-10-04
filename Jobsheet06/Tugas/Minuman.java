package Jobsheet06.Tugas;

public class Minuman extends ProdukKonsumsi{
    private String varianMinuman;

    // constructor tnpa parameter
    public Minuman() {

    }

    // constructor berparameter
    public Minuman(String namaProduk, double harga, int stok, String varianMinuman) {
        super(namaProduk, harga, stok);
        this.varianMinuman = varianMinuman;
    }

    // ini buat modifikasi
    public void setVarianMinuman(String varianMinuman) {
        this.varianMinuman = varianMinuman;
    }

    public void tampilkanInfoMinuman() {
        super.tampilkanInfo();
        System.out.println("Varian Minuman  : " + varianMinuman);
    }
}
