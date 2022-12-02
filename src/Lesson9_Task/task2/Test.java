package Lesson9_Task.task2;

/**
 * Предыдущее задание обобщить и написать один класс Vector для произвольной размерности.
 * Для этого в классе вектор для хранения координат следует использовать массив.
 */
public class Test {
    public static void main(String[] args) {

        VectorOptions vectorOptions = new VectorOptions();
        Vector vector = new Vector(12,5,8);
        Vector vector1 = new Vector(1,3,9);
        System.out.println(vector);
    }
}
