package jobsheet2;

public class Course25 {
    String courseID;
    String name;
    int credit;
    int hour;

    public Course25() {
        this.courseID = "Unknown";
        this.name = "Unknown";
        this.credit = 0;
        this.hour = 0;
    }

    public Course25(String id, String name, int credit, int newHour) {
        this.courseID = id;
        this.name = name;
        this.credit = credit;
        this.hour = newHour;
    }

    void print() {
        System.out.println("Course ID: " + courseID);
        System.out.println("Name: " + name);
        System.out.println("Credit: " + credit);
        System.out.println("Hour: " + hour);
        System.out.println();
    }

    void changeCredit(int newCredit) {
        this.credit = newCredit;
        System.out.println("Course credit is changed to " + newCredit);
    }

    void addHour(int extraHour) {
        this.hour += extraHour;
        System.out.println("Course hour is increased by " + extraHour + " hours. Total: " + hour + " hours.");
    }

    void reduceHour(int reduceHour) {
        if (reduceHour >= hour) {
            System.out.println("Invalid hour reduction. Hours cannot be zero or negative.");
        } else {
            this.hour -= reduceHour;
            System.out.println("Course hour is reduced by " + reduceHour + " hours. Total: " + hour + " hours.");
        }
    }
}
