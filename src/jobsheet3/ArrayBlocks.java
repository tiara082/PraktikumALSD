package jobsheet3;

import jobsheet3.Blocks;

public class ArrayBlocks {
    public static void main(String[] args) {
        Blocks[] blArray = new Blocks[3];

        blArray[0] = new Blocks(100, 30, 12);
        blArray[1] = new Blocks(120, 40, 15);
        blArray[2] = new Blocks(200, 50, 25);

        for (int i = 0; i < 3; i++) {
            System.out.println("Volume blocks - " + (i + 1) + " : " + blArray[i].countVolume());
        }
    }
}
