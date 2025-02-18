package jobsheet1;

import java.util.Scanner;

public class calculateIP {
    static String Subject[][] = {
        {"Pancasila", "", ""},
        {"Konsep Teknologi Informasi", "", ""},
        {"Critical Thinking dan Problem Solving", "", ""},
        {"Matematika Dasar", "", ""},
        {"Rekayasa Perangkat Lunak", "", ""},
        {"Dasar Pemrograman", "", ""},
        {"Praktikum Dasar Pemrograman", "", ""},
        {"Keselamatan dan Kesehatan Kerja", "", ""}
    };

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("================================");

        for (int i = 0; i < Subject.length; i++) {
            System.out.print("Masukkan Nilai MK " + Subject[i][0] + " : ");
            Subject[i][1] = input.nextLine();
            validateInput(Subject[i][1]);
            Subject[i][2] = calculateGradeLetter(Integer.parseInt(Subject[i][1]));
        }

        calculateGrade();
        input.close();
    }

    static void validateInput(String string) {
        if (string.isEmpty()) {
            System.out.println("Nilai tidak boleh kosong");
            System.exit(0);
        } else if (Integer.parseInt(string) < 0 || Integer.parseInt(string) > 100) {
            System.out.println("Nilai harus diantara 0 sampai 100");
            System.exit(0);
        }
    }

    static String calculateGradeLetter(int grade) {
        if (grade >= 85) {
            return "A, 4";
        } else if (grade >= 70) {
            return "B, 3";
        } else if (grade >= 55) {
            return "C, 2";
        } else if (grade >= 40) {
            return "D, 1";
        } else {
            return "E, 0";
        }
    }

    static void calculateGrade() {
        int total = 0;
        for (int i = 0; i < Subject.length; i++) {
            String[] gradeInfo = Subject[i][2].split(", ");
            total += Integer.parseInt(gradeInfo[1]);
        }
        double ip = (double) total / Subject.length;
        System.out.println("IP Semester ini adalah : " + ip);
    }
}
