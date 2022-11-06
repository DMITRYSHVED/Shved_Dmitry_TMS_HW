package Lesson4_Task;

import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int size;
        int search = 0;
        int[] array;
        int[] array1;

        while (true) {
            System.out.println("Введите размер массива(5-10]");
            while (!scanner.hasNextInt()) {
                System.out.println("Нужно число, попробуй еще");
                scanner.next();
            }
            size = scanner.nextInt();
            if (size > 5 && size <= 10) {
                break;
            } else {
                System.out.println("Число не входит в диапазон");
            }
        }
        array = new int[size];
        System.out.println("Массив: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
            if (array[i] % 2 == 0) {
                search++;
            }
        }
        if (search == 0) {
            System.out.println("\n");
            System.out.println("В массиве нет четных чисел");
        } else {
            array1 = new int[search];
            for (int i = 0, a = 0; i < array.length; i++, a++) {
                if (array[i] % 2 != 0) {
                    a--;
                    continue;
                }
                System.arraycopy(array, i, array1, a, 1);
            }
            System.out.println("\n");
            System.out.println("Второй массив из четных элементов первого:");
            for (int value : array1) {
                System.out.print(value + " ");
            }
        }
    }
}
