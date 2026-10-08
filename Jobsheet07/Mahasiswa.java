package Jobsheet07;

public class Mahasiswa extends Manusia {
    // Overriding
    @Override
    public void makan() {
        System.out.println("Mahasiswa makan di kantin kampus");
    }

    public void tidur() {
        System.out.println("Mahasiswa tidur setelah begadang ngerjain tugas");
    }
}
