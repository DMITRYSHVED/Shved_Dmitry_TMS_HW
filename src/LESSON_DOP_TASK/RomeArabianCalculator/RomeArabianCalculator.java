package LESSON_DOP_TASK.RomeArabianCalculator;

import java.util.*;

//123 - арабские
//IXV - римские

public class RomeArabianCalculator {

    private static Scanner scanner = new Scanner(System.in);
    private static boolean romeOutput;
    private static String expression;
    private static int finalResult;
    private static int runCounter;
    public static final Set<String> OPERATORS = new HashSet<>();
    public static final Map<Integer, String> ROME_NUMBERS = new HashMap<>();
    public static final Map<String, Integer> ARABIAN_NUMBERS = new HashMap<>();
    private static final ArrayList<Long> FIBONACCI_NUMBERS = new ArrayList<>();

    public static void run() {

        runCounter = 0;

            while (true) {
                operatorsNumbersBase();
                if (enterExpression().contains("EX")) {
                    break;
                }
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
                try {
                calculator(processedExpression());
                }catch (WrongExpressionFormatException e){
                    finalResult = 0;
                    System.err.println(e.getMessage());
                }
            }
            fibonacciSequence(finalResult);
    }

    private static String enterExpression() {

        System.out.println("'ex'- exit\nENTER:");
        if (romeOutput && runCounter > 0) {
            System.out.println(toRomeConvert(finalResult));
        } else if (runCounter > 0) {
            System.out.println(finalResult);
        }
        expression = scanner.nextLine().toUpperCase();
        expression = expression.trim();
        expression = runCounter > 0 ? finalResult + " " + expression : expression;
        runCounter++;
        return expression;
    }

    private static List<String> processedExpression() throws WrongExpressionFormatException {

        List<String> values = new ArrayList<>();
        boolean isNegative;
        boolean operatorExists = false;
        romeOutput = false;
        values.addAll(Arrays.asList(expression.split(" ")));

        for (String value : values) {

            isNegative = false;

            if (value.isBlank()) {
                throw new WrongExpressionFormatException("УБЕРИ ЛИШНИЕ ПРОБЕЛЫ");
            }
            if (OPERATORS.contains(value) && values.indexOf(value) > 0 && values.indexOf(value) < values.size() - 1) {
                operatorExists = true;
                continue;
            }
            if (value.startsWith("-")) {
                value = value.substring(1);
                isNegative = true;
            }
            if (Character.isDigit(value.charAt(0))) {
                for (int i = 0; i < value.length(); i++) {
                    if (!Character.isDigit(value.charAt(i))) {
                        throw new WrongExpressionFormatException("INVALID NUMBER FORMAT <" + value + ">");
                    }
                }
            } else if (!Character.isDigit(value.charAt(0))) {
                for (int i = 0; i < value.length(); i++) {
                    if (!ROME_NUMBERS.containsValue(value.substring(i, i + 1))) {
                        throw new WrongExpressionFormatException("INVALID NUMBER FORMAT <" + value + ">");
                    }
                }
                if (value.length() >= 3) {
                    for (int i = 2; i < value.length(); i++) {
                        if (ARABIAN_NUMBERS.get(value.substring(i - 2, i - 1)) <
                                ARABIAN_NUMBERS.get(value.substring(i, i + 1))) {
                            throw new WrongExpressionFormatException("INVALID ROME_NUMBER FORMAT <" + value + ">");
                        }
                    }
                }
            }
            if (Character.isAlphabetic(value.charAt(0))) {
                if (values.indexOf(value) == 0|| values.indexOf(value) == 1) {
                    romeOutput = true;
                }
                values.set(values.indexOf(value), String.valueOf(toArabianConvert(value)));
            }
            value = isNegative ? "-" + value : value;
        }
        if (!operatorExists || (runCounter > 1 && OPERATORS.contains(values.get(2)))) {
            values = values.subList(1, values.size());
        }
        return values;
    }

    private static void calculator(List<String> values) {

        int result = Integer.parseInt(values.get(0));
        String operator = "";

        for (int i = 0; i < values.size(); i++) {
            if (OPERATORS.contains(values.get(i))) {
                operator = values.get(i);
                continue;
            }
            result = operator.equals("+") ? result += Integer.parseInt(values.get(i)) : result;
            result = operator.equals("-") ? result -= Integer.parseInt(values.get(i)) : result;
            result = operator.equals("*") ? result *= Integer.parseInt(values.get(i)) : result;
            result = operator.equals("/") ? result /= Integer.parseInt(values.get(i)) : result;
        }
        finalResult = result;
    }

    private static void operatorsNumbersBase() {

        ROME_NUMBERS.put(1, "I");
        ROME_NUMBERS.put(5, "V");
        ROME_NUMBERS.put(10, "X");
        ROME_NUMBERS.put(50, "L");
        ROME_NUMBERS.put(100, "C");
        ROME_NUMBERS.put(500, "D");
        ROME_NUMBERS.put(1000, "M");
        OPERATORS.add("+");
        OPERATORS.add("-");
        OPERATORS.add("*");
        OPERATORS.add("/");
        for (Map.Entry<Integer, String> entry : ROME_NUMBERS.entrySet()) {
            ARABIAN_NUMBERS.put(entry.getValue(), entry.getKey());
        }
    }

    private static String toRomeConvert(int arabian) {

        int counter;
        boolean isNegative = false;
        String rome = "";

        if (arabian < 0) {
            arabian = Math.abs(arabian);
            isNegative = true;
        }
        for (int i = 1; arabian != 0; i *= 10) {
            counter = arabian % 10;
            if (counter < 4) {
                while (counter > 0) {
                    rome = ROME_NUMBERS.get(i) + rome;
                    counter--;
                }
            } else if (counter == 4 || counter == 9) {
                rome = ROME_NUMBERS.get(i) + ROME_NUMBERS.get(i * counter + i) + rome;
            } else if (counter > 5) {
                rome = ROME_NUMBERS.get(i * 5) + rome;
                while (counter - 5 > 0) {
                    rome = rome + ROME_NUMBERS.get(i);
                    counter--;
                }
            } else {
                rome = ROME_NUMBERS.get(i * counter) + rome;
            }
            arabian = arabian / 10;
        }
        rome = isNegative ? "-" + rome : rome;
        return rome;
    }

    private static int toArabianConvert(String rome) {

        int arabian = 0;
        boolean isNegative = rome.startsWith("-");

        rome = isNegative ? rome = rome.substring(1) : rome;
        for (int i = 1; i < rome.length(); i++) {
            if (ARABIAN_NUMBERS.get(rome.substring(i, i + 1)) > ARABIAN_NUMBERS.get(rome.substring(i - 1, i))) {
                arabian -= ARABIAN_NUMBERS.get(rome.substring(i - 1, i)) * 2;
            }
            arabian += ARABIAN_NUMBERS.get(String.valueOf(rome.charAt(i)));
        }
        arabian += ARABIAN_NUMBERS.get(rome.substring(0, 1));
        arabian = isNegative ? arabian *= -1 : arabian;
        return arabian;
    }

    private static void fibonacciSequence(int result) {

        FIBONACCI_NUMBERS.add(0L);
        FIBONACCI_NUMBERS.add(1L);
        if (result >= 0) {
            for (int i = 2; i < result + 1; i++) {
                FIBONACCI_NUMBERS.add(FIBONACCI_NUMBERS.get(i - 2) + FIBONACCI_NUMBERS.get(i - 1));
            }
        } else {
            result = Math.abs(result);
            for (int i = 2; i < result + 1; i++) {
                FIBONACCI_NUMBERS.add(FIBONACCI_NUMBERS.get(i - 2) - FIBONACCI_NUMBERS.get(i - 1));
            }
        }
        System.out.println("Число из последовательности Фибоначчи: " + FIBONACCI_NUMBERS.get(result));
    }
}
