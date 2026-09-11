package Jobsheet2;

public class Speaker {
    public String merk;
    public String model;
    public double harga;
    public int volume;
    public String mode;

    public void menyalakan() {
        System.out.println("Speaker " + merk + " " + model + " dinyalakan.");
    }

    public void mematikan() {
        System.out.println("Speaker " + merk + " " + model + " dimatikan.");
    }

    public void menghubungkan() {
        System.out.println("Bluetooth terhubung ke " + merk + " " + model);
    }

    public void menambahVolume(int increment) {
        volume += increment;
        System.out.println("Volume bertambah menjadi: " + volume);
    }

    public void mengurangiVolume(int decrement) {
        volume -= decrement;
        System.out.println("Volume berkurang menjadi: " + volume);
    }

    public void menggantiMode(String modeBaru) {
        mode = modeBaru;
        System.out.println("Mode speaker diubah ke: " + mode);
    }
}
