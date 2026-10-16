package UTS1;

public class Device {
    private String merk;
    private double harga;
    private int garansiBulan;

    public Device(String merk, double harga, int garansiBulan) {
        this.merk = merk;
        this.harga = harga;
        this.garansiBulan = garansiBulan;
    }

    public void displayInfo() {
        System.out.println("Merk          : " + merk);
        System.out.println("Harga         : Rp" + harga);
        System.out.println("Garansi       : " + garansiBulan + " bulan");
    }
}
