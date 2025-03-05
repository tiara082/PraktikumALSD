package jobsheet3.week3;

public class Triangle {
    public int base, height;

    public Triangle(int a, int t) {
        base = a;
        height = t;
    }

    public double countArea() {
        return 0.5 * base * height;
    }

    public double countPerimeter() {
        double side = Math.sqrt((base / 2.0) * (base / 2.0) + height * height);
        return 2 * side + base;
    }
}
