package jobsheet3;
import java.util.Scanner;

public class ArrayOfObjects {
    public static void main(String[] args) {
        Rectangle[] rectangleArray = new Rectangle[3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            rectangleArray[i] = new Rectangle();
            System.out.println("Rectangle " + (i + 1));

            System.out.print("Input length: ");
            rectangleArray[i].length = sc.nextInt();

            System.out.print("Input width: ");
            rectangleArray[i].width = sc.nextInt();
        }

        System.out.println("\nDisplaying Rectangle:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Rectangle " + (i + 1));
            System.out.println("Width: " + rectangleArray[i].width + ", Length: " + rectangleArray[i].length);
        }

        sc.close(); 
    }
}
