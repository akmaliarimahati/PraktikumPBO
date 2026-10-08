package Jobsheet07.Tugas;

public class ProdukKonsumsiMain {
    public static void main(String[] args) {

        Makanan makanan1 = new Makanan("Nasi Padang", 15000, 5, "Makanan Berat");
        Minuman minuman1 = new Minuman("Milk Tea", 5000, 15, "Milk");

        System.out.println("===== Makanan =====");
        makanan1.tampilkanInfoMakanan();
        makanan1.tampilkanKategori();
        System.out.println();

        System.out.println("===== Minuman =====");
        minuman1.tampilkanInfoMinuman();
        minuman1.tampilkanKategori();

        // modifikasi makan
        makanan1.namaProduk = "Nasi Goreng";
        makanan1.harga = 12000;
        makanan1.stok = 10;
        makanan1.setJenisMakanan("Makanan Enak");

        // modifikasi minum
        minuman1.namaProduk = "Es Teh";
        minuman1.harga = 4000;
        minuman1.stok = 20;
        minuman1.setVarianMinuman("Minuman Enak");

        System.out.println();
        System.out.println("===== Makanan Setelah Modifikasi =====");
        makanan1.tampilkanInfoMakanan();

        System.out.println();

        System.out.println("===== Minuman Setelah Modifikasi =====");
        minuman1.tampilkanInfoMinuman();

        // ===== Demo Overloading: hitungTotalHarga =====
        System.out.println();
        System.out.println("===== Overloading hitungTotalHarga =====");
        System.out.printf("Makanan 3 porsi (tanpa diskon)  : Rp%.0f\n", makanan1.hitungTotalHarga(3));
        System.out.printf("Makanan 3 porsi (diskon 10%%)    : Rp%.0f\n", makanan1.hitungTotalHarga(3, 10));
        System.out.printf("Minuman 5 gelas (tanpa diskon)  : Rp%.0f\n", minuman1.hitungTotalHarga(5));
        System.out.printf("Minuman 5 gelas (diskon 20%%)    : Rp%.0f\n", minuman1.hitungTotalHarga(5, 20));

        // ===== Demo hitungHarga di subclass =====
        System.out.println();
        System.out.println("===== hitungHarga (Makanan & Minuman) =====");
        System.out.printf("Makanan 3 porsi (+pajak 10%%)    : Rp%.0f\n", makanan1.hitungHarga(3));
        System.out.printf("Minuman 5 gelas (+biaya cup)    : Rp%.0f\n", minuman1.hitungHarga(5));
    }
}