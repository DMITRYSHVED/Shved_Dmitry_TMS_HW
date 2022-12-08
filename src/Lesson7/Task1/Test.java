package Lesson7.Task1;

/**
 * 1. Написать иерархию классов «Фигуры».
 * Фигура -> Треугольник -> Прямоугольник -> Круг.
 * Реализовать ф-ю подсчета площади для каждого типа фигуры и подсчет периметра. Площадь треугольника по формуле Герона.
 * Создать массив из 5 фигур.
 * Вывести на экран сумму периметров и сумму площадей всех фигур в массиве.
 */

public class Test {
    public static void main(String[] args) {

        Triangle triangle = new Triangle(6, 6, 6);
        Rectangle rectangle = new Rectangle(7, 5);
        Rectangle rectangle1 = new Rectangle(8, 9);
        Circle circle = new Circle(5);
        Circle circle1 = new Circle(7);
        double areaSum = 0;
        double perimeterSum = 0;
        Figure[] figures = {triangle, rectangle, rectangle1, circle, circle1};

        triangle.findArea();
        rectangle.findArea();
        rectangle1.findArea();
        circle.findArea();
        circle1.findArea();
        for (int i = 0; i < figures.length; i++) {
            areaSum += figures[i].area;
            perimeterSum += figures[i].perimeter;
        }
        System.out.println("Сумма площадей фигур в массиве: " + areaSum);
        System.out.println("Сумма периметров фигур в массиве: " + perimeterSum);
    }
}
