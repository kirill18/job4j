package ru.job4j.condition;

public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double period(double ab, double ac, double bc) {
        return (ab + ac + bc) / 2;
    }

    public double area() {
        double rsl = -1; // мы устанавливаем значение -1, так как может быть что треугольника нет. Это значение говорит о том. что треугольника нет.
        double ab = a.distance(b);
        double ac = a.distance(c);
        double bc = b.distance(c);
        double p = this.period(ab, ac, bc);
        if (this.exist(ab, ac, bc)) {
            rsl = Math.sqrt(p * (p - ab) * (p - bc) * (p - ac));
        }
        return rsl;
    }

    private boolean exist(double ab, double ac, double bc) {
        return (ab + ac > bc && bc + ac > ab && ab + bc > ac);
    }
}