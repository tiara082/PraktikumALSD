package jobsheet1;

import java.util.Scanner;

public class PlateRecognition {
    public static void main(String[] args) {
        char[] code = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};

        char[][] city = {
            {'B', 'A', 'N', 'T', 'E', 'N'}, 
            {'J', 'A', 'K', 'A', 'R', 'T', 'A'}, 
            {'B', 'A', 'N', 'D', 'U', 'N', 'G'}, 
            {'C', 'I', 'R', 'E', 'B', 'O', 'N'}, 
            {'B', 'O', 'G', 'O', 'R'},
            {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N'}, 
            {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G'}, 
            {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A'}, 
            {'M', 'A', 'L', 'A', 'N', 'G'}, 
            {'T', 'E', 'G', 'A', 'L'} 
        };

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan kode plat nomor (huruf kapital): ");
        char plateCode = input.next().toUpperCase().charAt(0); 

        boolean found = false;
        for (int i = 0; i < code.length; i++) {
            if (code[i] == plateCode) {
                // Menampilkan nama kota yang ditemukan
                System.out.print("Nama kota: ");
                for (char c : city[i]) {
                    System.out.print(c);  
                }
                System.out.println();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Kode plat tidak ditemukan.");
        }

        input.close();
    }
}
