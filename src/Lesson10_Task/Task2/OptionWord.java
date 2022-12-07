package Lesson10_Task.Task2;

import java.util.Scanner;

public class OptionWord {

    private static String inputWord() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово, буквы которого хотите продублировать: ");
        return scanner.next();
    }

    public static void letterDouble() {
        String str = inputWord();
        char[] letters = str.toCharArray();
        StringBuilder letterDoubleWord = new StringBuilder();

        for (char letter : letters) {
            letterDoubleWord.append(letter).append(letter);
        }
        System.out.println(letterDoubleWord);
    }
}
