package jobsheet2;

public class LecturerMain25 {
    public static void main(String[] args) {
        // default constructor
        Lecturer25 lecturer1 = new Lecturer25();
        lecturer1.print();

        // parameterized constructor
        Lecturer25 lecturer2 = new Lecturer25("L002", "Sir Imam", true, 2010, "ALSD");
        lecturer2.print();

        lecturer2.setStatus(false);
        int tenure = lecturer2.calculateTenure(2025);
        System.out.println("Tenure: " + tenure + " years");

        lecturer2.changeExpertiseField("Machine Learning");
        lecturer2.print();
    }
}
