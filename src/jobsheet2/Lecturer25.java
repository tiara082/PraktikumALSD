package jobsheet2;

public class Lecturer25 {
    String lecturerID;
    String name;
    boolean status;
    int startYear;
    String expertiseField;

    public Lecturer25() {
        this.lecturerID = "Unknown";
        this.name = "Unknown";
        this.status = false;
        this.startYear = 0;
        this.expertiseField = "Unknown";
    }

    public Lecturer25(String lecturerID, String name, boolean status, int startYear, String expertiseField) {
        this.lecturerID = lecturerID;
        this.name = name;
        this.status = status;
        this.startYear = startYear;
        this.expertiseField = expertiseField;
    }

    void print() {
        System.out.println("Lecturer ID: " + lecturerID);
        System.out.println("Name: " + name);
        System.out.println("Status: " + (status ? "Active" : "Inactive"));
        System.out.println("Start Year: " + startYear);
        System.out.println("Expertise Field: " + expertiseField);
        System.out.println();
    }

    void setStatus(boolean newStatus) {
        this.status = newStatus;
        System.out.println("Lecturer status updated to " + (newStatus ? "Active" : "Inactive"));
    }

    int calculateTenure(int yearNow) {
        return yearNow - startYear;
    }

    void changeExpertiseField(String newField) {
        this.expertiseField = newField;
        System.out.println("Expertise field changed to " + newField);
    }
}
