package jobsheet2;

public class CourseMain {
    public static void main(String[] args) {
        Course25 course1 = new Course25();
        course1.courseID = "K001";
        course1.name = "Pemrograman Berorientasi Objek";
        course1.credit = 3;
        course1.print();
        
        Course25 course2 = new Course25("K003","Pemrograman Mobile",3,4);
        course2.print();
    }
}
