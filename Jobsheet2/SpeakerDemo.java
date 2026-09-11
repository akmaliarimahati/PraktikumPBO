package Jobsheet2;

public class SpeakerDemo {
    public static void main(String[] args) {
        // instansiasi objek 1
        Speaker sp1 = new Speaker();
        sp1.merk = "JBL";
        sp1.model = "Flip 6";
        sp1.harga = 1800000;
        sp1.volume = 50;
        sp1.mode = "Bluetooth";

        System.out.println("=== Speaker 1 ===");
        System.out.println("Merk        : " + sp1.merk);
        System.out.println("Model       : " + sp1.model);
        System.out.println("Harga       : Rp " + sp1.harga);
        System.out.println("Volume Awal : " + sp1.volume);
        System.out.println("Mode        :" + sp1.mode);
        
        sp1.menyalakan();
        sp1.menghubungkan();
        sp1.menambahVolume(10);
        sp1.menggantiMode("AUX");
        
        System.out.println("-----------------------------------");
        
        // instansiasi objek 2
        Speaker sp2 = new Speaker();
        sp2.merk = "JBL";
        sp2.model = "Go 3";
        sp2.harga = 500000;
        sp2.volume = 30;
        sp2.mode = "Bluetooth";
        
        System.out.println("=== Speaker 2 ===");
        System.out.println("Merk        : " + sp2.merk);
        System.out.println("Model       : " + sp2.model);
        System.out.println("Harga       : Rp " + sp2.harga);
        System.out.println("Volume Awal : " + sp2.volume);
        System.out.println("Mode        :" + sp2.mode);
        
        // ini manggil method ya
        sp2.menyalakan();
        sp2.menghubungkan();
        sp2.mengurangiVolume(30);
        sp2.mematikan();
    }
}
