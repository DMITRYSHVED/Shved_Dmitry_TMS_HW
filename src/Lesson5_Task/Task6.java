package Lesson5_Task;

import java.util.Arrays;
import java.util.Random;

/**
 * Создайте двумерный массив целых чисел.
 * Отсортируйте элементы в строках двумерного массива по возрастанию.
 */

public class Task6 {
    public static void main(String[] args) {

        Random random = new Random();
        int[][] array = new int[5][5];

        System.out.println("Двумерный массив:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10, 100);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
            Arrays.sort(array[i]);
        }
        System.out.print("\nПосле сортировки:\n");
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

    }
}
