package UTS1;

public class LaptopGaming extends Laptop {
    private String jenisGpu;

    public LaptopGaming(String merk, double harga, int garansiBulan, int ramGB, String jenisGpu) {
        super(merk, harga, garansiBulan, ramGB);
        this.jenisGpu = jenisGpu;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("GPU           : " + jenisGpu);
    }
}