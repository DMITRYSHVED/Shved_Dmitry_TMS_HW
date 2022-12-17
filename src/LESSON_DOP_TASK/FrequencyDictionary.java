package LESSON_DOP_TASK;

import java.util.*;

public class FrequencyDictionary {

    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Character> allSymbols = new ArrayList<>();
    private static HashSet<Character> uniqueSymbols = new HashSet<>();
    private static HashMap<Character, Integer> result = new HashMap<>();

    private static void enterLine() {

        String line;

        System.out.println("Введите строку:");
        line = scanner.nextLine().toLowerCase();
        for (int i = 0; i < line.length(); i++) {
            if (Character.isAlphabetic(line.charAt(i))) {
                allSymbols.add(line.charAt(i));
                uniqueSymbols.add(line.charAt(i));
            }
        }
    }

    private static void countSymbols() {

        int counter;

        for (Character uniqueSymbol : uniqueSymbols) {
            counter = 0;
            for (Character symbol : allSymbols) {
                if (uniqueSymbol.equals(symbol)) {
                    counter++;
                }
            }
            result.put(uniqueSymbol, counter);
        }
    }

    public static void showResult() {

        enterLine();
        countSymbols();

        for (Map.Entry<Character, Integer> entry : result.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
