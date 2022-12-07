package Lesson10_Task.Task3;

/**
 * Дана строка произвольной длины с произвольными словами.
 * Найти самое короткое слово в строке и вывести его на экран.
 * Найти самое длинное слово в строке и вывести его на экран.
 * Если таких слов несколько, то вывести последнее из них.
 */

public class test {

    public static void main(String[] args) {

        String line = "Кошмары, на,   lou,.,.,.,.,.,. , .   ,  улице  тимирязева .";
        System.out.println(line);
        LineOptions.shortWord(line);
        LineOptions.longWord(line);
    }
}
