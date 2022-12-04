package Lesson10_Task.Task4;

import java.util.ArrayList;
import java.util.Arrays;

public class LineOptions {

    public static void minCharVariety(String str) {

        String[] words = str.split(" ");
        ArrayList<String> processedWords = new ArrayList<>();
        int minCharIndex = 0;
        String[][] letters;
        int[] counters;
        int[] sortedCounters;

        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].replaceAll("\\p{P}", "");
            if (words[i].isEmpty()) {
                continue;
            }
            words[i] = words[i].trim();
            processedWords.add(words[i]);
        }
        counters = new int[processedWords.size()];
        sortedCounters = new int[counters.length];
        letters = new String[processedWords.size()][];
        for (int i = 0; i < processedWords.size(); i++) {
            letters[i] = new String[processedWords.get(i).length()];
        }
        for (int i = 0; i < letters.length; i++) {
            for (int j = 0; j < letters[i].length; j++) {
                letters[i][j] = processedWords.get(i).substring(j, j + 1);
            }
        }
        for (String[] letter : letters) {
            Arrays.sort(letter);
        }
        for (int i = 0; i < letters.length; i++) {
            int counter = 1;
            for (int j = 1; j < letters[i].length; j++) {
                if (letters[i][j - 1].equals(letters[i][j])) {
                    continue;
                }
                counter++;
            }
            counters[i] = counter;
        }
        System.arraycopy(counters, 0, sortedCounters, 0, counters.length);
        Arrays.sort(sortedCounters);
        for (int i = 0; i < counters.length; i++) {
            if (sortedCounters[0] == counters[i]) {
                minCharIndex = i;
                break;
            }
        }
        System.out.println("Слово, в котором число различных символов минимально: '" +
                processedWords.get(minCharIndex) + "'");
    }
}
