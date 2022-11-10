package Lesson4_Task;

import java.util.Random;

public class Task5 {
    public static void main(String[] args) {

        Random random = new Random();
        int[] array = new int[random.nextInt(5, 10)];

        System.out.println("Массив: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
        }
        for (int i = 1; i < array.length; i += 2) {
            array[i] = 0;
        }
        System.out.println();
        System.out.println("Массив после обработки: ");
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}
