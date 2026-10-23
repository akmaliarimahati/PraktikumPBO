package Jobsheet08;

public class PengirimanDemo {
    public static void main(String[] args) {
        // Pengiriman p = new Pengiriman("X", "Y", 1);

        PengirimanReguler reguler = new PengirimanReguler("PGR-001", "Jl. Merdeka No. 10, Malang", 3, 4);
        PengirimanExpress express = new PengirimanExpress("PGR-002", "Jl. Sudirman No. 5, Jakarta", 2, 15000);

        reguler.cetakResi();
        System.out.println();
        express.cetakResi();

        System.out.println();
        System.out.println("Ongkir reguler : Rp" + reguler.hitungOngkir());
        System.out.println("Ongkir express : Rp" + express.hitungOngkir());
    }
}
