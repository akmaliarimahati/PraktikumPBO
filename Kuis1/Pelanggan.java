package Kuis1;
import java.util.ArrayList;

public class Pelanggan {
    private String nama;
    private String nomorTelepon;
    private ArrayList<Kendaraan> kendaraan;

    public Pelanggan(String nama, String nomorTelepon) {
        this.nama = nama;
        this.nomorTelepon = nomorTelepon;
        this.kendaraan = new ArrayList<>();
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    public void setNomorTelepon(String nomorTelepon) {
        this.nomorTelepon = nomorTelepon;
    }

    public ArrayList<Kendaraan> getKendaraan() {
        return kendaraan;
    }

    public void tambahKendaraan(Kendaraan kendaraan) {
        this.kendaraan.add(kendaraan);
    }
}