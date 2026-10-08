package Jobsheet07;

public class Dosen extends Manusia {
    // Overriding
    @Override
    public void makan() {
        System.out.println("Dosen makan di kantin dosen");
    }

    public void lembur() {
        System.out.println("Dosen lembur menilai tugas mahasiswa");
    }
}
