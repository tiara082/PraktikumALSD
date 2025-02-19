package jobsheet2;

public class StudentMain {
    public static void main(String[] args) {
        Student25 student1 = new Student25();
        
        student1.studentID= "244107020097";
        student1.name = "Tiara";
        student1.className = "TI-1I";
        student1.updateGPA(3.8);
        student1.print();

        student1.changeClass("TI-2I");
        student1.updateGPA(3.9);
        student1.print();
    }    
}
