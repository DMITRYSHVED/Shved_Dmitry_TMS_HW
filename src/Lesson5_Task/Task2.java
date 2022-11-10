package Lesson5_Task;

/**
 * Шахматная доска
 * Создать программу для раскраски шахматной доски с помощью цикла.
 * Создать двумерный массив String'ов 8х8. С помощью циклов задать элементами
 * циклам значения B(Black) или W(White).
 */

public class Task2 {
    public static void main(String[] args) {

        String[][] chessDesk = new String[8][8];

        for (int i = 0; i < chessDesk.length; i++) {
            for (int j = 0; j < chessDesk[i].length; j++) {
                chessDesk[i][j] = (i % 2 == 0 && j % 2 == 0) || (i % 2 == 1 && j % 2 == 1) ? "W" : "B";
                System.out.print(chessDesk[i][j] + " ");
            }
            System.out.println();
        }
    }
}
