package Lesson4_Task;

import java.util.Random;
import java.util.Scanner;

public class Task0 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int number;
        int search = 0;
        int[] array = new int[10];

        System.out.println("Массив:");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
        }
        System.out.println("\n\nВведите число: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Нужно число, попробуй еще");
            scanner.next();
        }
        number = scanner.nextInt();
        for (int value : array) {
            if (value == number) {
                search++;
            }
        }
        if (search == 0) {
            System.out.println("Число не входит в массив");
        } else {
            System.out.println("Число входит в массив");
        }
    }
}
