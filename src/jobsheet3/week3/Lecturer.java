package jobsheet3.week3;
public class Lecturer {
    private String id;
    private String name;
    private boolean gender; 
    private int age;

    // Constructor
    public Lecturer(String id, String name, boolean gender, int age) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void displayLecturerInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Gender: " + (gender ? "Male" : "Female"));
        System.out.println("Age: " + age);
        System.out.println("---------------------------");
    }
}
