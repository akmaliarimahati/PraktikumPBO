package Jobsheet07;

public class ManusiaMain {
    public static void main(String[] args) {
        // Dynamic method dispatch: variabel bertipe Manusia (superclass)
        Manusia m;

        System.out.println("=== Objek Manusia ===");
        m = new Manusia();
        m.bernafas();
        m.makan();

        System.out.println("\n=== Objek Dosen ===");
        m = new Dosen();
        m.bernafas(); // method milik Manusia (tidak di-override)
        m.makan(); // method milik Dosen (di-override)

        System.out.println("\n=== Objek Mahasiswa ===");
        m = new Mahasiswa();
        m.bernafas(); // method milik Manusia (tidak di-override)
        m.makan(); // method milik Mahasiswa (di-override)

        // lembur() dan tidur() hanya bisa dipanggil lewat casting
        System.out.println("\n=== Method khusus subclass ===");
        Manusia d = new Dosen();
        if (d instanceof Dosen) {
            ((Dosen) d).lembur();
        }

        Manusia mhs = new Mahasiswa();
        if (mhs instanceof Mahasiswa) {
            ((Mahasiswa) mhs).tidur();
        }
    }
}
