package jobsheet3.week3;    
public class LecturerData {
    public static void showAllLecturerData(Lecturer[] lecturerArray) {
        for (Lecturer lecturer : lecturerArray) {
            lecturer.displayLecturerInfo();
        }
    }

    public static void countLecturerByGender(Lecturer[] lecturerArray) {
        int maleCount = 0, femaleCount = 0;
        for (Lecturer lecturer : lecturerArray) {
            if (lecturer.getGender()) {
                maleCount++;
            } else {
                femaleCount++;
            }
        }
        System.out.println("Number of Male Lecturers: " + maleCount);
        System.out.println("Number of Female Lecturers: " + femaleCount);
    }

    public static void averageLecturerAgeByGender(Lecturer[] lecturerArray) {
        int maleAgeSum = 0, femaleAgeSum = 0, maleCount = 0, femaleCount = 0;
        for (Lecturer lecturer : lecturerArray) {
            if (lecturer.getGender()) {
                maleAgeSum += lecturer.getAge();
                maleCount++;
            } else {
                femaleAgeSum += lecturer.getAge();
                femaleCount++;
            }
        }
        
        System.out.println("Average Age of Male Lecturers: " + (maleCount > 0 ? (double) maleAgeSum / maleCount : 0));
        System.out.println("Average Age of Female Lecturers: " + (femaleCount > 0 ? (double) femaleAgeSum / femaleCount : 0));
    }

    public static void showOldestLecturerInfo(Lecturer[] lecturerArray) {
        Lecturer oldest = lecturerArray[0];
        for (Lecturer lecturer : lecturerArray) {
            if (lecturer.getAge() > oldest.getAge()) {
                oldest = lecturer;
            }
        }
        System.out.println("Oldest Lecturer:");
        oldest.displayLecturerInfo();
    }

    public static void showYoungestLecturerInfo(Lecturer[] lecturerArray) {
        Lecturer youngest = lecturerArray[0];
        for (Lecturer lecturer : lecturerArray) {
            if (lecturer.getAge() < youngest.getAge()) {
                youngest = lecturer;
            }
        }
        System.out.println("Youngest Lecturer:");
        youngest.displayLecturerInfo();
    }
}
