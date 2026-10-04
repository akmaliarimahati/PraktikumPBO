package Jobsheet06;

public class InheritenceDemo {
    public static void main(String[] args) {
        Dosen dosen1 = new Dosen();
        dosen1.nama = "Yanay Ayuningtyas";
        dosen1.nip = "34329837";
        dosen1.gaji = 3000000;
        dosen1.nidn = "1989432439";

        System.out.println(dosen1.getAllInfo());

        Dosen dosen2 = new Dosen("34329827","Budi",4000000,"1989432438");
        System.out.println(dosen2.getAllInfo());
    }
}
