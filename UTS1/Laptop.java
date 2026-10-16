package UTS1;

public class Laptop extends Device {
    private int ramGB;

    public Laptop(String merk, double harga, int garansiBulan, int ramGB) {
        super(merk, harga, garansiBulan);
        this.ramGB = ramGB;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("RAM           : " + ramGB + " GB");
    }
}
