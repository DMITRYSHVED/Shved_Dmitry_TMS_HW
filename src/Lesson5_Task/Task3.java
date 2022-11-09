package Lesson5_Task;

/**
 * Умножение двух матриц
 * Создайте два массива целых чисел размером 3х3 (две матрицы). Напишите программу для умножения двух матриц.
 * Первый массив:
 * {{1,0,0,0},
 * {0,1,0,0},
 * {0,0,0,0}}
 * Второй массив:
 * {{1,2,3},
 * {1,1,1},
 * {0,0,0},
 * {2,1,0}}
 * Ожидаемый результат:
 * 1 2 3
 * 1 1 1
 * 0 0 0
 */

public class Task3 {
    public static void main(String[] args) {

        int[][] firstMatrix = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        int[][] secondMatrix = {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}};
        int[][] resultMatrix = new int[firstMatrix.length][secondMatrix[0].length];
        int counter = 0;
        int secondCounter = 0;

        System.out.println("Даны две матрицы: ");
        for (int[] matrix : firstMatrix) {
            for (int i : matrix) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int[] matrix : secondMatrix) {
            for (int i : matrix) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        while (secondCounter != resultMatrix[counter].length) {
            while (counter < resultMatrix.length) {
                for (int j = 0; j < firstMatrix[0].length; j++) {
                    resultMatrix[counter][secondCounter] = resultMatrix[counter][secondCounter]
                            + firstMatrix[counter][j] * secondMatrix[j][secondCounter];
                }
                counter++;
            }
            secondCounter++;
            counter = 0;
        }
        System.out.println("Результат их умножения:");
        for (int[] matrix : resultMatrix) {
            for (int i : matrix) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
