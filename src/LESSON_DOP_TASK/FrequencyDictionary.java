package LESSON_DOP_TASK;

import java.util.HashMap;
import java.util.Scanner;

public class FrequencyDictionary {

    private static Scanner scanner = new Scanner(System.in);
    private static HashMap<Character, Integer> result = new HashMap<>();

    public static void showResult() {

        System.out.println("Enter line:");
        String line = scanner.nextLine().toLowerCase();
        line = line.trim();
        for (int i = 0; i < line.length(); i++) {
            if (result.isEmpty() && Character.isAlphabetic(line.charAt(i))) {
                result.put(line.charAt(i), 1);
            } else if (Character.isAlphabetic(line.charAt(i))) {
                if (!result.containsKey(line.charAt(i))) {
                    result.put(line.charAt(i), 1);
                } else {
                    result.put(line.charAt(i), result.get(line.charAt(i)) + 1);
                }
            }
        }
        System.out.println(result);
    }
}
