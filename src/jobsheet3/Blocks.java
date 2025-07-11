package jobsheet3;

public class Blocks {
    public int length, width, height;

    public Blocks(int p, int l, int t) {
        length = p;
        width = l;
        height = t;
    }

    public int countVolume() {
        return length * width * height;
    }

    


}
