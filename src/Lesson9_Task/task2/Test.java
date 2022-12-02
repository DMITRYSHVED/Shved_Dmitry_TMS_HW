package Lesson9_Task.task2;

/**
 * Предыдущее задание обобщить и написать один класс Vector для произвольной размерности.
 * Для этого в классе вектор для хранения координат следует использовать массив.
 */
public class Test {
    public static void main(String[] args) {

        Vector vector = new Vector(12,5,8);
        Vector vector1 = new Vector(1,3,9);
        //Vector.compareVectors(vector,vector1);
        System.out.println(vector);
        System.out.println(Vector.vectorAddition(vector,vector1));
    }
}
