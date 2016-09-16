/**
 * Created by evanotero
 * 9/15/16
 */
public class Triangle {
    private final double a, b, c;

    public Triangle(double a, double b, double c) throws TriangleException {
        if (a + b <= c || a + c <= b || b + c <= a)
            throw new TriangleException();

        this.a = a;
        this.b = b;
        this.c = c;
    }

    public TriangleKind getKind() {
        TriangleKind kind;
        if (a == b && b == c)
            kind = TriangleKind.EQUILATERAL;
        else if (a != b && b != c && a != c)
            kind = TriangleKind.SCALENE;
        else
            kind = TriangleKind.ISOSCELES;
        return kind;
    }
}
