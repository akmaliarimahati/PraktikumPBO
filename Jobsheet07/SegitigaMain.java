package Jobsheet07;

public class SegitigaMain {
    public static void main(String[] args) {
        Segitiga s = new Segitiga();

        System.out.println("=== Total Sudut ===");
        System.out.println("Sudut ketiga (A = 60)          : " + s.totalSudut(60));
        System.out.println("Sudut ketiga (A = 60, B = 50)  : " + s.totalSudut(60, 50));

        System.out.println("\n=== Keliling ===");
        System.out.println("Keliling (3, 4, 5)             : " + s.keliling(3, 4, 5));
        System.out.println("Keliling siku-siku (3, 4)      : " + s.keliling(3, 4));
    }
}
