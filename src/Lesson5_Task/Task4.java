package Lesson5_Task;

import java.util.Random;
import java.util.Scanner;

/**
 * Создайте двумерный массив целых чисел.
 * Выведите на консоль сумму всех элементов массива.
 */

public class Task4 {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int line;
        int column;
        int[][] array;
        int arraySum = 0;

        System.out.println("Введите строки массива: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Нужно число, попробуй еще");
            scanner.next();
        }
        line = scanner.nextInt();
        System.out.println("Введите столбцы массива: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Нужно число, попробуй еще");
            scanner.next();
        }
        column = scanner.nextInt();
        array = new int[line][column];
        System.out.println("Двумерный массив:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10);
                arraySum += array[i][j];
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nСумма всех элементов массива: " + arraySum);
    }
}
