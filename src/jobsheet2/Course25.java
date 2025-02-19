package jobsheet2;

public class Course25 {
    String courseID;
    String name;
    int credit;
    int hour;

    public Course25(){
    }
    public Course25(String id, String name, int credit, int hour){
        this.courseID =  id;
        this.name = name;
        this.credit = credit;
        this.hour = hour;
    }

    void print(){
        System.out.println("Course ID: " + courseID);
        System.out.println("Name: " + name);
        System.out.println("Credit: " + credit);
        System.out.println("Hour: " + hour);
        System.out.println("");
    }

    void changeCredit(int newCredit){
        credit = newCredit; 
        System.out.println("Course credit is changed to " + newCredit);           
    }

    String addHour(int hour){
        return "Course hour is added by " + hour + " hours";
    }   

    String reduceHour(int hour){
        if (hour < 1) {
            return "Invalid hour reduction";         
        }
        return "Course hour is reduced by " + hour + " hours";
    }
}

