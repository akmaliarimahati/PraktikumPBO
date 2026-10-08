package Jobsheet07.Tugas;

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

    // Harga minuman = total harga + biaya cup Rp500 per item
    public double hitungHarga(int jumlah) {
        return super.hitungTotalHarga(jumlah) + (500 * jumlah);
    }
}