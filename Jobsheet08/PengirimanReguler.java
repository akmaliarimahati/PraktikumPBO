package Jobsheet08;

public class PengirimanReguler extends Pengiriman {
    private int estimasiHari;

    public PengirimanReguler(String idPengiriman, String alamatTujuan, double beratBarang, int estimasiHari) {
        super(idPengiriman, alamatTujuan, beratBarang);
        this.estimasiHari = estimasiHari;
    }

    public int getEstimasiHari() {
        return estimasiHari;
    }

    @Override
    public double hitungOngkir() {
        return beratBarang * 5000;
    }

    @Override
    public void cetakResi() {
        super.cetakResi();
        System.out.println("Jenis         : Reguler");
        System.out.println("Estimasi      : " + estimasiHari + " hari");
    }
}
