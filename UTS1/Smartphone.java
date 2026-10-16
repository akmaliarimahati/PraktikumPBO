package UTS1;

public class Smartphone extends Device {
    private double ukuranLayar;

    public Smartphone(String merk, double harga, int garansiBulan, double ukuranLayar) {
        super(merk, harga, garansiBulan);
        this.ukuranLayar = ukuranLayar;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Ukuran Layar  : " + ukuranLayar + " inci");
    }
}
