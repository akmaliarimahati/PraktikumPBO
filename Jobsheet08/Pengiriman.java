package Jobsheet08;

public abstract class Pengiriman {
    private String idPengiriman;
    private String alamatTujuan;
    protected double beratBarang;

    public Pengiriman(String idPengiriman, String alamatTujuan, double beratBarang) {
        this.idPengiriman = idPengiriman;
        this.alamatTujuan = alamatTujuan;
        this.beratBarang = beratBarang;
    }

    public String getIdPengiriman() {
        return idPengiriman;
    }

    public String getAlamatTujuan() {
        return alamatTujuan;
    }

    public abstract double hitungOngkir();

    public void cetakResi() {
        System.out.println("===== RESI PENGIRIMAN =====");
        System.out.println("ID Pengiriman : " + idPengiriman);
        System.out.println("Alamat Tujuan : " + alamatTujuan);
        System.out.println("Berat Barang  : " + beratBarang + " kg");
        System.out.println("Ongkir        : Rp" + hitungOngkir());
    }
}
