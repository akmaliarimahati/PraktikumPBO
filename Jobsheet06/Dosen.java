package Jobsheet06;

public class Dosen extends Pegawai {
    public String nidn;

    public Dosen(String nip, String nama, double gaji, String nidn) {
        super(nip, nama, gaji);
        this.nidn = nidn;
    }

    public Dosen() {
        System.out.println(gaji);
        System.out.println("Objek dari clas Dosen dibuat");
    }

    public String getInfo() {
        return "NIDN     : " + this.nidn + "\n";
    }

    public String getAllInfo() {
        String info = super.getInfo();
        info += "NIDN     : " + nidn;

        return info;
    }
}