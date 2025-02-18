package jobsheet1;

import java.util.Scanner;

public class CubeCalculator {

    public static double hitungVolume(double sisi) {
        return Math.pow(sisi, 3);
    }

    public static double hitungLuasPermukaan(double sisi) {
        return 6 * Math.pow(sisi, 2);
    }

    public static double hitungKeliling(double sisi) {
        return 12 * sisi;
    }

    public static void tampilkanMenu() {
        System.out.println("Pilih perhitungan:");
        System.out.println("1. Volume Kubus");
        System.out.println("2. Luas Permukaan Kubus");
        System.out.println("3. Keliling Kubus");
        System.out.println("4. Keluar");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            tampilkanMenu();  
            System.out.print("Masukkan pilihan (1/2/3/4): ");
            int pilihan = scanner.nextInt();

            if (pilihan == 4) {  
                System.out.println("Terima kasih!");
                break;
            }

            System.out.print("Masukkan panjang sisi kubus: ");
            double sisi = scanner.nextDouble();

            switch (pilihan) {
                case 1:
                    double volume = hitungVolume(sisi);
                    System.out.println("Volume kubus adalah: " + volume + " unit kubik");
                    break;
                case 2:
                    double luasPermukaan = hitungLuasPermukaan(sisi);
                    System.out.println("Luas permukaan kubus adalah: " + luasPermukaan + " unit persegi");
                    break;
                case 3:
                    double keliling = hitungKeliling(sisi);
                    System.out.println("Keliling kubus adalah: " + keliling + " unit");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, coba lagi.");
            }
        }

        scanner.close();
    }
}

