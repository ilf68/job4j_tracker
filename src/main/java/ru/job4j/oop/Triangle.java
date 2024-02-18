package ru.job4j.oop;

public class Triangle {
    private Point first;
    private Point second;
    private Point third;

        public Triangle(Point first, Point second, Point third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }
    public double area() {
        double result = -1;
        double a = first.distance(second);
        double b = first.distance(third);
        double c = second.distance(third);
        double p = semiPerimetr(a, b, c);
        if (this.exist(a, b, c)) {
            result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
        return result;
    }

    public double semiPerimetr(double a, double b, double c) {
        return (a + b + c) / 2;
    }
    public boolean exist(double a, double c, double b) {
        return (a + c > b) && (a + b > c) && (b + c > a);
    }


}