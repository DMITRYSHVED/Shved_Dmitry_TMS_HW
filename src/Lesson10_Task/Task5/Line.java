package Lesson10_Task.Task5;

import java.util.ArrayList;

public class Line {

    private String line;
    private StringBuilder reverseWord = new StringBuilder();

    public Line(String line) {
        this.line = line;
    }

    public void isPalindrome(int wordIndex) {

        String[] words = line.split(" ");
        ArrayList<StringBuilder> processedWords = new ArrayList<>();
        StringBuilder wordToAdd;

        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].replaceAll("\\p{P}", "");
            if (words[i].isEmpty()) {
                continue;
            }
            words[i] = words[i].trim();
            wordToAdd = new StringBuilder(words[i]);
            processedWords.add(wordToAdd);
        }
        if (wordIndex > processedWords.size() || wordIndex <= 0) {
            System.out.println("Нет столько слов в строке");
            return;
        }
        reverseWord.append(processedWords.get(wordIndex));
        reverseWord.reverse();
        if (processedWords.get(wordIndex).compareTo(reverseWord) == 0) {
            System.out.println("Слово '" + processedWords.get(wordIndex) + "' является палиндромом");
        } else {
            System.out.println("Слово '" + processedWords.get(wordIndex) + "' не является палиндромом");
        }
    }
}
