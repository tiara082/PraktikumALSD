package jobsheet2;

public class CourseMain25 {
    public static void main(String[] args) {
        //  default constructor
        Course25 course1 = new Course25();
        course1.print();

        //  parameterized constructor
        Course25 course2 = new Course25("K003", "Pemrograman Dasar", 3, 4);
        course2.print();

        course2.changeCredit(4);
        course2.addHour(2);
        course2.reduceHour(3);
        course2.print();
    }
}
