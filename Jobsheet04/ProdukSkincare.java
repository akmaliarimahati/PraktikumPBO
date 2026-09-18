// package Jobsheet04;

public class ProdukSkincare {

    private String idProduk;
    private String namaProduk;
    private String merek;
    private String jenis;
    private int volume;
    private double harga;
    private int stok;

    public ProdukSkincare(String idProduk, String namaProduk, String merek, String jenis, int volume, double harga, int stok) {
        this.idProduk = idProduk;
        this.namaProduk = namaProduk;
        this.merek = merek;
        this.jenis = jenis;
        this.volume = volume;
        this.harga = harga;
        this.stok = stok;
    }

    public String getIdProduk() {
        return idProduk;
    }

    public void setIdProduk(String idProduk) {
        this.idProduk = idProduk;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public void tambahStok(int jumlah) {
        stok += jumlah;
    }

    public void kurangiStok(int jumlah) {
        if (jumlah <= stok) {
            stok -= jumlah;
        }
    }

    public boolean cekStok(int jumlah) {
        return stok >= jumlah;
    }

    public String getInfo() {
        return namaProduk + " - " + merek + " (" + jenis + ", " + volume + " ml)" + " - Rp" + harga;
    }
}
