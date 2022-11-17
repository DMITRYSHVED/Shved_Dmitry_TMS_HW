package Lesson7.Task1;

public class Triangle extends Figure {

    double a;
    double b;
    double c;
    double p;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        perimeter = a + b + c;
    }

    @Override
    public void findArea() {
        p = perimeter / 2;
        area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
