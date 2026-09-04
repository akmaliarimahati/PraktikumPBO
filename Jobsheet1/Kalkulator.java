package Jobsheet1;

import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== KALKULATOR SEDERHANA ===");
        System.out.print("Masukkan angka pertama: ");
        double angka1 = sc.nextDouble();
        System.out.print("Masukkan operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        System.out.print("Masukkan angka kedua: ");
        double angka2 = sc.nextDouble();

        // Variabel untuk menyimpan hasil
        double hasil = 0;
        boolean valid = true;

        // Pemrosesan berdasarkan operator menggunakan fungsi tersendiri
        if (operator == '+') {
            hasil = tambah(angka1, angka2);
        } else if (operator == '-') {
            hasil = kurang(angka1, angka2);
        } else if (operator == '*') {
            hasil = kali(angka1, angka2);
        } else if (operator == '/') {
            if (angka2 != 0) {
                hasil = bagi(angka1, angka2);
            } else {
                System.out.println("Error: Pembagian dengan angka nol tidak diperbolehkan!");
                valid = false;
            }
        } else {
            System.out.println("Error: Operator tidak valid!");
            valid = false;
        }

        if (valid) {
            tampilkanHasil(angka1, operator, angka2, hasil);
        }

        sc.close();
    }

    // Function untuk Operasi Penjumlahan
    public static double tambah(double a, double b) {
        return a + b;
    }

    // Function untuk Operasi Pengurangan
    public static double kurang(double a, double b) {
        return a - b;
    }

    // Function untuk Operasi Perkalian
    public static double kali(double a, double b) {
        return a * b;
    }

    // Function untuk Operasi Pembagian
    public static double bagi(double a, double b) {
        return a / b;
    }

    public static void tampilkanHasil(double angka1, char operator, double angka2, double hasil) {
        System.out.println("-----------------------------------");
        System.out.println("Hasil: " + angka1 + " " + operator + " " + angka2 + " = " + hasil);
        System.out.println("-----------------------------------");
    }
}
