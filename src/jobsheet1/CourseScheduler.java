package jobsheet1;

import java.util.Scanner;

public class CourseScheduler {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah kursus: ");
        int n = scanner.nextInt();
        scanner.nextLine();  

        String[] courseNames = new String[n];
        int[] creditHours = new int[n];
        int[] semesters = new int[n];
        String[] lectureDays = new String[n];

        inputCoursesData(n, courseNames, creditHours, semesters, lectureDays);

        while (true) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();  

            switch (choice) {
                case 1:
                    displayAllCourses(courseNames, creditHours, semesters, lectureDays);
                    break;
                case 2:
                    System.out.print("Masukkan hari (misal: Monday, Tuesday): ");
                    String day = scanner.nextLine();
                    displayCoursesByDay(courseNames, creditHours, semesters, lectureDays, day);
                    break;
                case 3:
                    System.out.print("Masukkan semester yang diinginkan: ");
                    int semester = scanner.nextInt();
                    displayCoursesBySemester(courseNames, creditHours, semesters, lectureDays, semester);
                    break;
                case 4:
                    System.out.print("Masukkan nama kursus yang dicari: ");
                    String courseName = scanner.nextLine();
                    searchCourse(courseNames, creditHours, semesters, lectureDays, courseName);
                    break;
                case 5:
                    System.out.println("Keluar dari program...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid, coba lagi.");
            }
            scanner.close();

        }
        
    }

    public static void displayMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Tampilkan semua kursus");
        System.out.println("2. Tampilkan kursus pada hari tertentu");
        System.out.println("3. Tampilkan kursus pada semester tertentu");
        System.out.println("4. Cari kursus berdasarkan nama");
        System.out.println("5. Keluar");
        System.out.print("Pilih pilihan Anda: ");
    }

    public static void inputCoursesData(int n, String[] courseNames, int[] creditHours, int[] semesters, String[] lectureDays) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            System.out.println("\nMasukkan data untuk kursus " + (i + 1) + ":");

            System.out.print("Nama Kursus: ");
            courseNames[i] = scanner.nextLine();

            System.out.print("Jumlah SKS (Credit Hours): ");
            creditHours[i] = scanner.nextInt();

            System.out.print("Semester: ");
            semesters[i] = scanner.nextInt();
            scanner.nextLine();  

            System.out.print("Hari Kuliah: ");
            lectureDays[i] = scanner.nextLine();
        }
    }

    public static void displayAllCourses(String[] courseNames, int[] creditHours, int[] semesters, String[] lectureDays) {
        System.out.println("\nSemua Kursus:");
        for (int i = 0; i < courseNames.length; i++) {
            System.out.println("Nama Kursus: " + courseNames[i]);
            System.out.println("Jumlah SKS: " + creditHours[i]);
            System.out.println("Semester: " + semesters[i]);
            System.out.println("Hari Kuliah: " + lectureDays[i]);
            System.out.println();
        }
    }

    public static void displayCoursesByDay(String[] courseNames, int[] creditHours, int[] semesters, String[] lectureDays, String day) {
        System.out.println("\nKursus pada hari " + day + ":");
        boolean found = false;

        for (int i = 0; i < courseNames.length; i++) {
            if (lectureDays[i].equalsIgnoreCase(day)) {
                System.out.println("Nama Kursus: " + courseNames[i]);
                System.out.println("Jumlah SKS: " + creditHours[i]);
                System.out.println("Semester: " + semesters[i]);
                System.out.println("Hari Kuliah: " + lectureDays[i]);
                System.out.println();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Tidak ada kursus yang dijadwalkan pada hari " + day);
        }
    }

    public static void displayCoursesBySemester(String[] courseNames, int[] creditHours, int[] semesters, String[] lectureDays, int semester) {
        System.out.println("\nKursus pada Semester " + semester + ":");
        boolean found = false;

        for (int i = 0; i < courseNames.length; i++) {
            if (semesters[i] == semester) {
                System.out.println("Nama Kursus: " + courseNames[i]);
                System.out.println("Jumlah SKS: " + creditHours[i]);
                System.out.println("Semester: " + semesters[i]);
                System.out.println("Hari Kuliah: " + lectureDays[i]);
                System.out.println();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Tidak ada kursus pada Semester " + semester);
        }
    }

    public static void searchCourse(String[] courseNames, int[] creditHours, int[] semesters, String[] lectureDays, String courseName) {
        boolean found = false;

        for (int i = 0; i < courseNames.length; i++) {
            if (courseNames[i].equalsIgnoreCase(courseName)) {
                System.out.println("\nKursus Ditemukan:");
                System.out.println("Nama Kursus: " + courseNames[i]);
                System.out.println("Jumlah SKS: " + creditHours[i]);
                System.out.println("Semester: " + semesters[i]);
                System.out.println("Hari Kuliah: " + lectureDays[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Kursus tidak ditemukan.");
        }

    }
}

