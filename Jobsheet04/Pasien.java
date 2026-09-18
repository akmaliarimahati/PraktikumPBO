// package Jobsheet04;

import java.util.ArrayList;
import java.time.LocalDate;

public class Pasien {
    private String noRekamMedis;
    private String nama;
    private ArrayList<Konsultasi> riwayatkonsultasi;

    public Pasien(String noRekamMedis, String nama) {
        this.noRekamMedis = noRekamMedis;
        this.nama = nama;
        this.riwayatkonsultasi = new ArrayList<Konsultasi>();
    }

    public String getInfo() {
        String info = "";

        info += "No Rekam Medis    : " + this.noRekamMedis + "\n";
        info += "Nama              : " + this.nama + "\n";

        if (!riwayatkonsultasi.isEmpty()) {
            info += "Riwayat Konsultasi :\n";

            for (Konsultasi konsultasi : riwayatkonsultasi) {
                info += konsultasi.getInfo();
            }
        } else {
            info += "Belum ada riwayat konsultasi";
        }

        info += "\n";

        return info;
    }

    public void tambahKonsultasi(
            LocalDate tanggal,
            Pegawai dokter,
            Pegawai perawat) {

        Konsultasi konsultasi = new Konsultasi();

        konsultasi.setTanggal(tanggal);
        konsultasi.setDokter(dokter);
        konsultasi.setPerawat(perawat);

        riwayatkonsultasi.add(konsultasi);
    }
}
