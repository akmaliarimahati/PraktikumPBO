package UTS1;

public class MainDevice {
    public static void main(String[] args) {
        Device device = new Device("Generic", 500000, 6);
        Laptop laptop = new Laptop("Asus", 8000000, 12, 16);
        Smartphone hp = new Smartphone("Samsung", 5000000, 12, 6.5);
        LaptopGaming gaming = new LaptopGaming("Lenovo", 15000000, 24, 32, "RTX 4060");

        System.out.println("=== Device ===");
        device.displayInfo();

        System.out.println("\n=== Laptop ===");
        laptop.displayInfo();

        System.out.println("\n=== Smartphone ===");
        hp.displayInfo();

        System.out.println("\n=== Laptop Gaming ===");
        gaming.displayInfo();
    }
}
