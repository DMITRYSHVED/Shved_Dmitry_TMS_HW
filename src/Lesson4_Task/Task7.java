package Lesson4_Task;

import java.util.Random;

public class Task7 {
    public static void main(String[] args) {

        Random random = new Random();
        int[] array = new int[random.nextInt(10, 15)];
        int temp;
        boolean unSorted = true;

        System.out.println("Неотсортированный масив: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
        }
        while (unSorted) {
            unSorted = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    unSorted = true;
                }
            }
        }
        System.out.println("\n");
        System.out.println("Отсортированный массив:");
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}
