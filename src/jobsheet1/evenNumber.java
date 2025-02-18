package jobsheet1;

import java.util.Scanner;

public class evenNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan NIM: ");
        String nim = input.next();


        int n = Integer.parseInt(nim.substring(nim.length() - 2));

        if (n < 10) {
            n +=10;
        }

        System.out.println("===============");

        for (int i = 1; i <=n; i++) {
            if (i == 6 || i == 10) {
                continue;
            }  
            if (i % 2 == 1) {
                System.out.print(" * ");
                continue;
            }
            System.out.print(i + " ");

        }

        input.close();
    }

    
}
