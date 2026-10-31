package Jobsheet09.InterfaceLatihan;

public class AlatElektronikMain {
    public static void main(String[] args) {
        Kipas kipas = new Kipas("Stand Fan", 350000, "Putih", "Maspion");
        TV tv = new TV("LED", 20, 3500000, "Hitam", "Samsung");
        Kulkas kulkas = new Kulkas(2, 4500000, "Silver", "Polytron");
        SmartFridge smartFridge = new SmartFridge(5, 3, 12000000, "Hitam", "Samsung");

        System.out.println("=== Kipas ===");
        System.out.println(kipas.getInfo());

        System.out.println("\n=== TV ===");
        System.out.println(tv.getInfo());

        System.out.println("\n=== Kulkas ===");
        System.out.println(kulkas.getInfo());

        System.out.println("\n=== SmartFridge ===");
        System.out.println(smartFridge.getInfo());

        System.out.println("\n=== Uji Audible ===");
        tv.naikkanVolume(10);
        System.out.println("Volume TV setelah dinaikkan 10     : " + tv.getVolume());
        tv.turunkanVolume(5);
        System.out.println("Volume TV setelah diturunkan 5     : " + tv.getVolume());

        smartFridge.naikkanVolume(3);
        System.out.println("Volume SmartFridge setelah naik 3  : " + smartFridge.getVolume());
    }
}
