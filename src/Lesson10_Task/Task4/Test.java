package Lesson10_Task.Task4;

/**
 * Дана строка произвольной длины с произвольными словами.
 * Найти слово, в котором число различных символов минимально.
 * Слово может содержать буквы и цифры.
 * Если таких слов несколько, найти первое из них.
 * Например, в строке "fffff ab f 1234 jkjk" найденное слово должно быть "fffff".
 */

public class Test {
    public static void main(String[] args) {


        String line = "ffffghff bab   aaaa     dfghj  ,,,, 45 454354 fdftgyhuji 1234 jkjk";
        System.out.println(line);
        LineOptions.minCharVariety(line);
        }
    }

