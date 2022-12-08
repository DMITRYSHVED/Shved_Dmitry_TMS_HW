package Lesson7.Task1;

public class Rectangle extends Figure {

    double a;
    double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
        perimeter = 2 * (a + b);
    }

    @Override
    public void findArea() {
        area = a * b;
    }
}
