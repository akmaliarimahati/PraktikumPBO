package Jobsheet2;

public class DemoPersegi {
    public static void main(String[] args) {
        PersegiPanjang pp1 = new PersegiPanjang();

        pp1.panjang = 10;
        pp1.lebar = 5;

        System.out.println("=== DATA PERSEGI PANJANG ===");
        pp1.displayInfo();

        System.out.println("Luas     : " + pp1.getLuas());
        System.out.println("Keliling : " + pp1.getKeliling());
    }
}
