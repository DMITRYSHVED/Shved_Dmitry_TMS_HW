package Lesson5_Task;

import java.util.Random;

/**
 * Создайте двумерный массив.
 * Выведите на консоль диагонали массива.
 */

public class Task5 {
    public static void main(String[] args) {

        Random random = new Random();
        int[][] array = new int[7][7];

        System.out.println("Двумерный массив:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10, 100);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nДиагонали массива\nПервая диагональ: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i][i] + " ");
        }
        System.out.println("\nВторая диагональ: ");
        for (int i = 0, j = array[i].length - 1; i < array.length; i++, j--) {
            System.out.print(array[i][j] + " ");
        }
    }
}
