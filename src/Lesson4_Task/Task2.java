package Lesson4_Task;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int size;
        int[] array;

        while (true) {
            System.out.println("Введите размер массива, который хотите создать:");
            while (!scanner.hasNextInt()) {
                System.out.println("Нужно число, попробуй еще");
                scanner.next();
            }
            size = scanner.nextInt();
            if (size <= 0) {
                System.out.println("Размер не может быть отрицательным или равным нулю");
            } else {
                break;
            }
        }
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        Arrays.sort(array);
        System.out.println("Минимальное значение: " + array[0]);
        System.out.println("Среднее значение: " + array[size / 2]);
        System.out.println("Максимальное значение: " + array[size - 1]);
    }
}
