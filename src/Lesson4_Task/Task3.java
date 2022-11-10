package Lesson4_Task;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {

        Random random = new Random();
        int[] array = new int[5];
        int[] array1 = new int[5];
        double arraySum = 0;
        double array1Sum = 0;
        double arrayAverage;
        double array1Average;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            array1[i] = random.nextInt(100);
        }
        System.out.println("Массив 1: ");
        for (int value : array) {
            System.out.print(value + " ");
            arraySum = arraySum + value;
        }
        arrayAverage = arraySum / array.length;
        System.out.println();
        System.out.println("Массив 2: ");
        for (int value : array1) {
            System.out.print(value + " ");
            array1Sum = array1Sum + value;
        }
        array1Average = array1Sum / array1.length;
        System.out.println("\n");
        System.out.println("Среднее арифметическое первого массива: " + arrayAverage);
        System.out.println("Среднее арифметическое второго массива: " + array1Average);
        if (arrayAverage > array1Average) {
            System.out.println("Среднее арифметическое первого массива больше чем у второго");
        } else if (arrayAverage < array1Average) {
            System.out.println("Среднее арифметическое второго массива больше чем у первого");
        } else {
            System.out.println("Средние арифметические массивов равны");
        }
    }
}
