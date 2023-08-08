package ru.job4j.oop;

import static java.lang.Math.sqrt;

public class Triangle {
    private final Point a;
    private final Point b;
    private final Point c;

    public Triangle(Point ap, Point bp, Point cp) {
        this.a = ap;
        this.b = bp;
        this.c = cp;
    }

    public double semiPerimeter(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    public boolean exist(double ab, double ac, double bc) {
        return ab + ac > bc && ac + bc > ab && ab + bc > ac;
    }

    public double area() {
        double result = -1;
        double ab = a.distance(b);
        double ac = a.distance(c);
        double bc = b.distance(c);
        if (this.exist(ab, ac, bc)) {
            double p = semiPerimeter(ab, ac, bc);
            return sqrt(p * (p - ab) * (p - ac) * (p - bc));
        }
        return result;
    }
}