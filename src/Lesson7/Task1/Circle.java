package Lesson7.Task1;

public class Circle extends Figure {

    double radius;

    public Circle(double radius) {
        this.radius = radius;
        perimeter = 2 * Math.PI * radius;
    }

    @Override
    public void findArea() {
        area = Math.PI * Math.pow(radius, 2);
    }
}
