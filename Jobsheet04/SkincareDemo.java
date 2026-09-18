// package Jobsheet04;

public class SkincareDemo {
    public static void main(String[] args) {
        // Membuat objek produk skincare
        ProdukSkincare facialWash = new ProdukSkincare("P001", "Facial Wash", "Somethinc", "Facial Wash", 100, 75000,20);
        ProdukSkincare serum = new ProdukSkincare("P002", "Niacinamide Serum", "The Originote", "Serum", 20, 55000, 15);
        ProdukSkincare toner = new ProdukSkincare("P003", "Essence Toner", "Skintific", "Toner", 80, 85000, 10);
        // Membuat pelanggan
        Pelanggan pelanggan1 = new Pelanggan("C001", "Rima", "rima@email.com", "Jakarta");
        // Membuat pesanan
        Pesanan pesanan1 = new Pesanan("ORD001", "2026-09-18", pelanggan1);

        // Menambahkan pesanan ke pelanggan
        pelanggan1.tambahPesanan(pesanan1);

        // Menambahkan produk ke pesanan
        pesanan1.tambahDetail(facialWash, 2);
        pesanan1.tambahDetail(serum, 1);
        pesanan1.tambahDetail(toner, 1);

        // Menampilkan data pelanggan
        System.out.println("===== DATA PELANGGAN =====");
        System.out.println(pelanggan1.getInfo());

        // Menampilkan data pesanan
        System.out.println("===== DATA PESANAN =====");
        System.out.println(pesanan1.getInfo());

        // Mengubah status pesanan
        pesanan1.ubahStatus("Dikirim");

        System.out.println("===== STATUS PESANAN SETELAH DIUBAH =====");
        System.out.println(pesanan1.getInfo());

        // Menampilkan stok setelah pembelian
        System.out.println("===== STOK PRODUK SETELAH PEMBELIAN =====");
        System.out.println(facialWash.getNamaProduk() + " : " + facialWash.getStok());

        System.out.println(serum.getNamaProduk() + " : " + serum.getStok());

        System.out.println(toner.getNamaProduk() + " : " + toner.getStok());
    }
}
