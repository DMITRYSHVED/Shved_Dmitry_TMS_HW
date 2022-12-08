package Lesson10_Task.Task1;

/**
 * Доработать нулевое домашнее задание предыдущего урока.
 * Теперь надо создать свои классы исключений на каждую ситуацию:
 * - Проверить содержит ли номер документа последовательность abc.
 * - Проверить начинается ли номер документа с последовательности 555.
 * - Проверить заканчивается ли номер документа на последовательность 1a2b.
 * Если номер документа не удовлетворяет условию - то "бросить" исключение.
 * В методе класса, в котором будут вызываться эти методы для демонстрации работы, перехватить исключение
 * конструкцией try-catch и в блоке catch вывести сообщение для пользователя (сообщение на консоль).
 */

public class Test {

    public static void main(String[] args) {

        String documentNumber = "5756-LnR-8366-AnC-1a2b";
        try {
            System.out.println(documentNumber);
            DocumentNumberOptions.showNumberBlocks(documentNumber);
            DocumentNumberOptions.starsLetters(documentNumber);
            DocumentNumberOptions.onlyLettersLow(documentNumber);
            DocumentNumberOptions.onlyLettersHigh(documentNumber);
            DocumentNumberOptions.abcAvailability(documentNumber);
            DocumentNumberOptions.startWithCombination(documentNumber);
            DocumentNumberOptions.endWithCombination(documentNumber);
        } catch (AbcException ex) {
            System.out.println(AbcException.getDescription());
            System.out.println(ex.getMessage());
        } catch (NumberCombinationException ex) {
            System.out.println(NumberCombinationException.getDescription());
            System.out.println(ex.getMessage());
        } catch (SymbolsCombinationException ex) {
            System.out.println(SymbolsCombinationException.getDescription());
            System.out.println(ex.getMessage());
        }
    }
}
