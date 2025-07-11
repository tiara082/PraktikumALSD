package jobsheet3;
import java.util.Scanner;

public class LecturerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of lecturers: ");
        int numLecturers = scanner.nextInt();
        scanner.nextLine(); 

        Lecturer[] lecturerArray = new Lecturer[numLecturers];

        for (int i = 0; i < numLecturers; i++) {
            System.out.println("Enter details for Lecturer " + (i + 1) + ":");
            System.out.print("ID: ");
            String id = scanner.nextLine();
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Gender (true for Male, false for Female): ");
            boolean gender = scanner.nextBoolean();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); 

            lecturerArray[i] = new Lecturer(id, name, gender, age);
        }

        // Display all lecturers
        System.out.println("\nAll Lecturers:");
        LecturerData.showAllLecturerData(lecturerArray);

        // Count lecturers by gender
        System.out.println("\nLecturer Gender Count:");
        LecturerData.countLecturerByGender(lecturerArray);

        // Calculate average age by gender
        System.out.println("\nAverage Age by Gender:");
        LecturerData.averageLecturerAgeByGender(lecturerArray);

        // Display oldest lecturer
        System.out.println("\nOldest Lecturer:");
        LecturerData.showOldestLecturerInfo(lecturerArray);

        // Display youngest lecturer
        System.out.println("\nYoungest Lecturer:");
        LecturerData.showYoungestLecturerInfo(lecturerArray);

        scanner.close();
    }
}
