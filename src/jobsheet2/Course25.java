package jobsheet2;

public class Course25 {
    String courseID;
    String name;
    int credit;
    int hour;

    void print(){
        System.out.println("Course ID: " + courseID);
        System.out.println("Name: " + name);
        System.out.println("Credit: " + credit);
        System.out.println("Hour: " + hour);
    }

    void changeCredit(int newCredit){
        credit = newCredit; 
        System.out.println("Course credit is changed to " + newCredit);           
    }

    String addHour(int hour){
        return "Course hour is added by " + hour + " hours";
    }   

    String reduceHour(int hour){
        return "Course hour is reduced by " + hour + " hours";
    }
}

