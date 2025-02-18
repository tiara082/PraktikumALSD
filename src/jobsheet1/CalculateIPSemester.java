package jobsheet1;

import java.util.Scanner;

public class CalculateIPSemester {
    static String[][] subjects = {
        {"Matematika Dasar", "", "", ""},
        {"Bahasa Inggris", "", "", ""},
        {"Dasar Pemrograman", "", "", ""},
        {"Praktikum Dasar Pemrograman", "", "", ""},
        {"Keselamatan dan Kesehatan Kerja", "", "", ""}
    };
    
    static int[] bobotSKS = {3, 2, 3, 2, 2}; // SKS MK

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("================================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("================================");

        for (int i = 0; i < subjects.length; i++) {
            System.out.print("Masukkan nilai Angka untuk MK " + subjects[i][0] + ": ");
            subjects[i][1] = input.nextLine();
            validateInput(subjects[i][1]);
            
            String[] gradeInfo = calculateGradeLetter(Integer.parseInt(subjects[i][1]));
            subjects[i][2] = gradeInfo[0]; // Nilai Huruf
            subjects[i][3] = gradeInfo[1]; // Bobot Nilai
        }

        displayResults();
        input.close();
    }

    static void validateInput(String nilai) {
        try {
            int value = Integer.parseInt(nilai);
            if (value < 0 || value > 100) {
                System.out.println("Nilai harus diantara 0 sampai 100");
                System.exit(0);
            }
        } catch (NumberFormatException e) {
            System.out.println("Input harus berupa angka");
            System.exit(0);
        }
    }

    static String[] calculateGradeLetter(int grade) {
        if (grade >= 80) {
            return new String[]{"A", "4.00"};
        } 
        else if (grade >= 73) {
            return new String[]{"B+", "3.50"};
        } 
        else if (grade >= 65) {
            return new String[]{"B", "3.00"};
        } 
        else if (grade >= 60) {
            return new String[]{"C+", "2.50"};
        } 
        else if (grade >= 50) {
            return new String[]{"C", "2.00"};
        } 
        else if (grade >= 39) {
            return new String[]{"D", "1.00"};
        } 
        else {
            return new String[]{"E", "0.00"};
        }
    }
    

    static void displayResults() {
        System.out.println("\nHasil Konversi Nilai");
        System.out.println("============================================================");
        System.out.printf("%-40s %-10s %-10s %-10s\n", "Mata Kuliah", "Nilai", "Huruf", "Bobot");
        System.out.println("============================================================");
        
        double totalBobot = 0;
        int totalSKS = 0;
        
        for (int i = 0; i < subjects.length; i++) {
            System.out.printf("%-40s %-10s %-10s %-10s\n", subjects[i][0], subjects[i][1], subjects[i][2], subjects[i][3]);
            totalBobot += Double.parseDouble(subjects[i][3]) * bobotSKS[i];
            totalSKS += bobotSKS[i];
        }
        
        double ipSemester = totalBobot / totalSKS;
        System.out.println("============================================================");
        System.out.printf("IP Semester: %.2f\n", ipSemester);
    }
}
