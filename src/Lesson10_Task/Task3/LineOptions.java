package Lesson10_Task.Task3;

import java.util.ArrayList;
import java.util.Arrays;

public class LineOptions {

    public static void shortWord(String str) {

        int shortWordIndex = 0;
        String[] words = str.split(" ");
        ArrayList<String> processedWords = new ArrayList<>();
        int[] wordsLength;

        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].replaceAll("\\p{P}", "");
            if (words[i].isEmpty()) {
                continue;
            }
            words[i] = words[i].trim();
            processedWords.add(words[i]);
        }
        wordsLength = new int[processedWords.size()];
        for (int i = 0; i < processedWords.size(); i++) {
            wordsLength[i] = processedWords.get(i).length();
        }
        Arrays.sort(wordsLength);
        for (int i = 0; i < processedWords.size(); i++) {
            if (wordsLength[0] == processedWords.get(i).length()) {
                shortWordIndex = i;
            }
        }
        System.out.println("Самое короткое слово в строке: ");
        System.out.println("'" + processedWords.get(shortWordIndex) + "'");

    }

    public static void longWord(String str) {

        int longWordIndex = 0;
        String[] words = str.split(" ");
        ArrayList<String> processedWords = new ArrayList<>();
        int[] wordsLength;

        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].replaceAll("\\p{P}", "");
            if (words[i].isEmpty()) {
                continue;
            }
            words[i] = words[i].trim();
            processedWords.add(words[i]);
        }
        wordsLength = new int[processedWords.size()];
        for (int i = 0; i < processedWords.size(); i++) {
            wordsLength[i] = processedWords.get(i).length();
        }
        Arrays.sort(wordsLength);
        for (int i = 0; i < processedWords.size(); i++) {
            if (wordsLength[processedWords.size() - 1] == processedWords.get(i).length()) {
                longWordIndex = i;
            }
        }
        System.out.println("Самое длинное слово в строке: ");
        System.out.println("'" + processedWords.get(longWordIndex) + "'");
    }
}
