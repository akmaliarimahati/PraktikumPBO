package Jobsheet08;

public class PengirimanExpress extends Pengiriman {
    private double biayaTambahan;

    public PengirimanExpress(String idPengiriman, String alamatTujuan, double beratBarang, double biayaTambahan) {
        super(idPengiriman, alamatTujuan, beratBarang);
        this.biayaTambahan = biayaTambahan;
    }

    public double getBiayaTambahan() {
        return biayaTambahan;
    }

    @Override
    public double hitungOngkir() {
        return (beratBarang * 8000) + biayaTambahan;
    }

    @Override
    public void cetakResi() {
        super.cetakResi();
        System.out.println("Jenis         : Express");
        System.out.println("Biaya Tambahan: Rp" + biayaTambahan);
    }
}
