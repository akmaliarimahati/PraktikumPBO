package Kuis1;

public class BengkelMajuMain {
    public static void main(String[] args) {

        // buat objek pelanggan
        Pelanggan pelanggan = new Pelanggan("Akmalia Rima","081234567890");

        // buat 2 objek mobil
        Kendaraan mobil1 = new Kendaraan("N 1234 AB","Toyota","Avanza","Mobil", pelanggan);
        Kendaraan mobil2 = new Kendaraan("N 5678 CD","Honda","Brio","Mobil", pelanggan);

        // buat 2 objek sepeda motor
        Kendaraan motor1 = new Kendaraan("N 1111 EF","Yamaha","NMAX","Sepeda Motor", pelanggan);
        Kendaraan motor2 = new Kendaraan("N 2222 GH","Honda","Vario","Sepeda Motor", pelanggan);

        // menambah kendaraan ke pelanggan
        pelanggan.tambahKendaraan(mobil1);
        pelanggan.tambahKendaraan(mobil2);
        pelanggan.tambahKendaraan(motor1);
        pelanggan.tambahKendaraan(motor2);

        // buat objek layanan
        Layanan layanan = new Layanan("Service Mesin",150000);

        // buat objek karyawan
        Karyawan karyawan = new Karyawan("K001","Budi","Mekanik");

        // menampilkan data pelanggan
        System.out.println("================================");
        System.out.println("       BENGKEL MAJU             ");
        System.out.println("================================");

        System.out.println("Nama Pelanggan : " + pelanggan.getNama());

        System.out.println("Nomor Telepon  : " + pelanggan.getNomorTelepon());

        // menampilkan kendaraan
        System.out.println("\nDATA KENDARAAN");

        int nomor = 1;
        for (Kendaraan kendaraan : pelanggan.getKendaraan()) {
            System.out.println("\nKendaraan " + nomor);
            System.out.println("Plat Nomor     : " + kendaraan.getPlatNomor());
            System.out.println("Merek          : " + kendaraan.getMerek());
            System.out.println("Model          : " + kendaraan.getModel());
            System.out.println("Tipe Kendaraan : " + kendaraan.getTipeKendaraan());

            nomor++;
        }

        // menampilkan informasi layanan
        System.out.println("\nDATA LAYANAN");
        System.out.println("Nama Layanan   : " + layanan.getServiceName());
        System.out.println("Harga Layanan  : Rp" + layanan.getServicePrice());

        System.out.println("\nKaryawan");
        System.out.println("Nama           : " + karyawan.getNamaKaryawan());
        System.out.println("Jabatan        : " + karyawan.getJabatan());

        // karyawan menangani layanan
        karyawan.kerjakanLayanan(layanan);

        // menghitung biaya
        System.out.println("\nPERKIRAAN BIAYA");
        for (Kendaraan kendaraan : pelanggan.getKendaraan()) {
            double totalBiaya = layanan.hitungBiaya(kendaraan);
            System.out.println(kendaraan.getPlatNomor() + " (" + kendaraan.getTipeKendaraan() + ")" + " = Rp" + totalBiaya);
        }
    }
    
}
