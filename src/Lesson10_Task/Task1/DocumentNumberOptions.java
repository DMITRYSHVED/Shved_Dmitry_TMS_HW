package Lesson10_Task.Task1;

public class DocumentNumberOptions {

    public static void showNumberBlocks(String str) {
        String firstBlock = str.substring(0, 4);
        String secondBlock = str.substring(9, 13);
        System.out.println("<" + firstBlock + ">" + " " + "<" + secondBlock + ">");
    }

    public static void starsLetters(String str) {
        StringBuilder starBlocks = new StringBuilder();
        String[] blocks = str.split("-");
        for (int i = 0; i < blocks.length; i++) {
            if (i % 2 == 1) {
                blocks[i] = blocks[i].replace(blocks[i], "-***-");
            }
            starBlocks.append(blocks[i]);
        }
        System.out.println(starBlocks);
    }

    public static void onlyLettersLow(String str) {
        String onlyLetters;
        onlyLetters = str.substring(5, 8) + "/" + str.substring(14, 17) + "/" + str.substring(19, 20) + "/" + str.substring(21, 22);
        onlyLetters = onlyLetters.toLowerCase();
        System.out.println(onlyLetters);
    }

    public static void onlyLettersHigh(String str) {
        StringBuilder onlyLetters = new StringBuilder("Letters: ");
        onlyLetters.append(str.substring(5, 8).toUpperCase()).append("/").append(str.substring(14, 17).toUpperCase())
                .append("/").append(str.substring(19, 20).toUpperCase()).append("/").append(str.substring(21, 22).
                        toUpperCase());
        System.out.println(onlyLetters);
    }

    public static void abcAvailability(String str) throws AbcException {
        if (str.contains("abc") || str.contains("ABC")) {
            throw new AbcException("УСТРАНИ ОШИБКУ И ПОПРОБУЙ ЕЩЕ");
        } else {
            System.out.println("Документ не содержит комбинацию букв 'abc'");
        }
    }

    public static void startWithCombination(String str) throws NumberCombinationException {
        String combination = "555";
        if (str.startsWith(combination)) {
            throw new NumberCombinationException("УСТРАНИ ОШИБКУ И ПОПРОБУЙ ЕЩЕ");
        } else {
            System.out.println("Номер не начинается с последовательности цифр '" + combination + "'");
        }
    }

    public static void endWithCombination(String str) throws SymbolsCombinationException {
        String combination = "1a2b";
        if (str.endsWith(combination)) {
            throw new SymbolsCombinationException("УСТРАНИ ОШИБКУ И ПОПРОБУЙ ЕЩЕ");
        } else {
            System.out.println("Номер не заканчивается последовательностью цифр '" + combination + "'");
        }
    }
}
