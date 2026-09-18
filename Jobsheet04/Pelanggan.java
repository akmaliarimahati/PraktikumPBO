// package Jobsheet04;
import java.util.ArrayList;

public class Pelanggan {
    private String idPelanggan;
    private String nama;
    private String email;
    private String alamat;
    private ArrayList<Pesanan> pesanan;

    public Pelanggan(
            String idPelanggan,
            String nama,
            String email,
            String alamat) {

        this.idPelanggan = idPelanggan;
        this.nama = nama;
        this.email = email;
        this.alamat = alamat;
        this.pesanan = new ArrayList<>();
    }

    public String getIdPelanggan() {
        return idPelanggan;
    }

    public void setIdPelanggan(String idPelanggan) {
        this.idPelanggan = idPelanggan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void tambahPesanan(Pesanan pesanan) {
        this.pesanan.add(pesanan);
    }

    public void lihatPesanan() {
        for (Pesanan pesanan : pesanan) {
            System.out.println(pesanan.getInfo());
        }
    }

    public String getInfo() {
        String info = "";

        info += "ID Pelanggan : " + idPelanggan + "\n";
        info += "Nama         : " + nama + "\n";
        info += "Email        : " + email + "\n";
        info += "Alamat       : " + alamat + "\n";

        return info;
    }
}
