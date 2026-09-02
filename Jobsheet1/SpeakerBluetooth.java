package Jobsheet1;

public class SpeakerBluetooth {

    public static void main(String[] args) {
        // Objek 1
        String merk1 = "JBL";
        int volume1 = 50;
        int baterai1 = 80;

        // Objek 2
        String merk2 = "Sony";
        int volume2 = 30;
        int baterai2 = 65;

        // Objek 3
        String merk3 = "Bose";
        int volume3 = 70;
        int baterai3 = 90;

        // Objek 4
        String merk4 = "Anker";
        int volume4 = 20;
        int baterai4 = 40;

        // Objek 5
        String merk5 = "Marshall";
        int volume5 = 85;
        int baterai5 = 100;

        // Objek 6
        String merk6 = "Harman Kardon";
        int volume6 = 60;
        int baterai6 = 55;

        // Objek 7
        String merk7 = "Robot";
        int volume7 = 10;
        int baterai7 = 30;

        // Objek 8
        String merk8 = "Aker";
        int volume8 = 45;
        int baterai8 = 75;

        // Objek 9
        String merk9 = "Onda";
        int volume9 = 25;
        int baterai9 = 50;

        // Objek 10
        String merk10 = "Tronsmart";
        int volume10 = 90;
        int baterai10 = 85;


        // Pemanggilan Function pada Objek
        volume1 = tambahVolume(volume1, 15);
        cetakInfoSpeaker(merk1, volume1, baterai1);

        volume2 = kurangiVolume(volume2, 10);
        cetakInfoSpeaker(merk2, volume2, baterai2);

        volume3 = tambahVolume(volume3, 10);
        cetakInfoSpeaker(merk3, volume3, baterai3);

        volume4 = kurangiVolume(volume4, 5);
        cetakInfoSpeaker(merk4, volume4, baterai4);

        volume5 = tambahVolume(volume5, 5);
        cetakInfoSpeaker(merk5, volume5, baterai5);

        volume6 = kurangiVolume(volume6, 20);
        cetakInfoSpeaker(merk6, volume6, baterai6);

        volume7 = tambahVolume(volume7, 25);
        cetakInfoSpeaker(merk7, volume7, baterai7);

        volume8 = kurangiVolume(volume8, 15);
        cetakInfoSpeaker(merk8, volume8, baterai8);

        volume9 = tambahVolume(volume9, 30);
        cetakInfoSpeaker(merk9, volume9, baterai9);

        volume10 = kurangiVolume(volume10, 40);
        cetakInfoSpeaker(merk10, volume10, baterai10);
    }

    // Function 1: Menambah Volume Speaker
    public static int tambahVolume(int volumeAwal, int increment) {
        int volumeBaru = volumeAwal + increment;
        if (volumeBaru > 100) {
            volumeBaru = 100;
        }
        return volumeBaru;
    }

    // Function 2: Mengurangi Volume Speaker
    public static int kurangiVolume(int volumeAwal, int decrement) {
        int volumeBaru = volumeAwal - decrement;
        if (volumeBaru < 0) {
            volumeBaru = 0;
        }
        return volumeBaru;
    }

    // Function tambahan untuk menampilkan status objek ke layar
    public static void cetakInfoSpeaker(String merk, int volume, int baterai) {
        System.out.println("Merk Speaker : " + merk);
        System.out.println("Volume       : " + volume + "%");
        System.out.println("Sisa Baterai : " + baterai + "%");
        System.out.println("-----------------------------------");
    }

}