package jobsheet1;

import java.util.Scanner;

public class RoyalGardenManagement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] stokBunga = new int[4][4];

        int[] hargaBunga = new int[4];

        String[] namaBunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};

        System.out.println("Masukkan harga tiap jenis bunga:");
        for (int i = 0; i < hargaBunga.length; i++) {
            System.out.print(namaBunga[i] + " = Rp ");
            hargaBunga[i] = input.nextInt();
        }

        //  Input stok bunga di tiap cabang
        System.out.println("\nMasukkan stok bunga di setiap cabang:");
        for (int i = 0; i < stokBunga.length; i++) {
            System.out.println("\nRoyalGarden " + (i + 1) + ":");
            for (int j = 0; j < stokBunga[i].length; j++) {
                System.out.print(namaBunga[j] + " = ");
                stokBunga[i][j] = input.nextInt();
            }
        }

        System.out.println("\nPendapatan seluruh cabang jika semua bunga terjual:");
        for (int i = 0; i < stokBunga.length; i++) {
            int totalPendapatan = 0;
            for (int j = 0; j < stokBunga[i].length; j++) {
                totalPendapatan += stokBunga[i][j] * hargaBunga[j];
            }
            System.out.println("RoyalGarden " + (i + 1) + " = Rp " + totalPendapatan);
        }

        int[] pengurangan = {-1, -2, 0, -5}; // pengurangan karena bunga mati

        System.out.println("\nStok bunga RoyalGarden 4 terbaru :");
        for (int i = 0; i < stokBunga[3].length; i++) {
            int stokSetelahPengurangan = stokBunga[3][i] + pengurangan[i];
            System.out.println(namaBunga[i] + " = " + stokSetelahPengurangan);
        }

        input.close();
    }
}

