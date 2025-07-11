package jobsheet11;

import java.util.Scanner;

public class queueMain {
    static void men(){
        System.out.println("Available menu: ");
        System.out.println("Please choose the menu: ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Peek");
        System.out.println("4. Print");
        System.out.println("5. Clear");
        System.out.println("================================");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input maximum queue size: ");
        int n = sc.nextInt();

        queue q = new queue(n);
        int choice = -1;
        do{
            menu();
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Input data to enqueue: ");
                    int dt = sc.nextInt();
                    q.enqueue(dt);
                    break;
                case 2:
                    q.dequeue();
                    break;
                case 3:
                    q.peek();
                    break;
                case 4:
                    q.print();
                    break;
                case 5:
                    q.clear();
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
