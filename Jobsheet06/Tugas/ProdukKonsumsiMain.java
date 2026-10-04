package Jobsheet06.Tugas;

public class ProdukKonsumsiMain {
    public static void main(String[] args) {

        Makanan makanan1 = new Makanan("Nasi Padang",15000,5,"Makanan Berat");
        Minuman minuman1 = new Minuman("Milk Tea",5000,15,"Milk");

        System.out.println("===== Makanan =====");
        makanan1.tampilkanInfoMakanan();
        System.out.println();

        System.out.println("===== Minuman =====");
        minuman1.tampilkanInfoMinuman();


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
    }
}
