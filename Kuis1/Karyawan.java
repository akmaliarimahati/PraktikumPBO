package Kuis1;

public class Karyawan {
    private String idKaryawan;
    private String namaKaryawan;
    private String jabatan;

    public Karyawan(String idKaryawan, String namaKaryawan, String jabatan) {
        this.idKaryawan = idKaryawan;
        this.namaKaryawan = namaKaryawan;
        this.jabatan = jabatan;
    }

    public String getIdKaryawan() {
        return idKaryawan;
    }

    public void setIdKaryawan(String idKaryawan) {
        this.idKaryawan = idKaryawan;
    }

    public String getNamaKaryawan() {
        return namaKaryawan;
    }

    public void setNamaKaryawan(String namaKaryawan) {
        this.namaKaryawan = namaKaryawan;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public void kerjakanLayanan(Layanan layanan) {
        System.out.println(namaKaryawan + " menangani layanan " + layanan.getServiceName());
    }
}