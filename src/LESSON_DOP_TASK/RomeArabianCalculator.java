package LESSON_DOP_TASK;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//123 - арабские
//IXV - римские

public class RomeArabianCalculator {

    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Integer> numbers;
    private static Map<Integer, String> romeNumbers;
    private static Map<String, Integer> arabianNumbers;

    private static void numbersBase() {

        romeNumbers = new HashMap<>();
        arabianNumbers = new HashMap<>();

        romeNumbers.put(0, "");
        romeNumbers.put(1, "I");
        romeNumbers.put(5, "V");
        romeNumbers.put(10, "X");
        romeNumbers.put(50, "L");
        romeNumbers.put(100, "C");
        romeNumbers.put(500, "D");
        romeNumbers.put(1000, "M");

//        for (Map.Entry<Integer, String> entry : romeNumbers.entrySet()) {
//            arabianNumbers.put(entry.getValue(), entry.getKey());
//        }
    }

    private static int function() {

        int function;

        System.out.println("\n1- сложение   2- разность\n3- умножение  4- деление\n0- выход");
        function = scanner.nextInt();
        switch (function) {
            case 1:
                addition();
                return function;
            case 2:
                difference();
                return function;
            case 3:
                multiplication();
                return function;
            case 4:
                division();
                return function;
            case 0:
                return function;
            default:
                return -1;
        }
    }

    public static void showMenu() {

        numbersBase();
        while (true) {
            if (function() == 0) {
                break;
            }
        }
    }

    private static void addition() {

        numbers = new ArrayList<>();
        int result = 0;

        for (int i = 0, n = 1; i < 2; i++, n++) {
            System.out.println("Введите число " + n + " : ");
            while (!scanner.hasNextInt()) {
                System.out.println("Нужно число, попробуй еще");
                scanner.next();
            }
            numbers.add(scanner.nextInt());
            result = result + numbers.get(i);
        }
        System.out.println(toRomeConvert(result));
    }

    private static void difference() {

        numbers = new ArrayList<>();
        int result = 0;

        for (int i = 0, n = 1; i < 2; i++, n++) {
            System.out.println("Введите число " + n + " : ");
            while (!scanner.hasNextInt()) {
                System.out.println("Нужно число, попробуй еще");
                scanner.next();
            }
            numbers.add(scanner.nextInt());
            result = numbers.get(0) - numbers.get(i);
        }
        System.out.println(toRomeConvert(result));
    }

    private static void multiplication() {

        numbers = new ArrayList<>();
        int result = 1;

        for (int i = 0, n = 1; i < 2; i++, n++) {
            System.out.println("Введите число " + n + " : ");
            while (!scanner.hasNextInt()) {
                System.out.println("Нужно число, попробуй еще");
                scanner.next();
            }
            numbers.add(scanner.nextInt());
            result = result * numbers.get(i);
        }
        System.out.println(toRomeConvert(result));
    }

    private static void division() {

        numbers = new ArrayList<>();
        int result = 1;

        for (int i = 0, n = 1; i < 2; i++, n++) {
            System.out.println("Введите число " + n + " : ");
            while (!scanner.hasNextInt()) {
                System.out.println("Нужно число, попробуй еще");
                scanner.next();
            }
            numbers.add(scanner.nextInt());
            result = numbers.get(0) / numbers.get(i);
        }
        System.out.println(toRomeConvert(result));
    }

    private static String toRomeConvert(int arabian) {

        int counter;
        String rome = "";

        if (arabian<0){
            arabian = Math.abs(arabian);
            rome="-";
        }
        for (int i = 1000; i > 0; i = i / 10) {
            counter = arabian / i;
            if (counter < 4) {
                while (counter > 0) {
                    rome = rome + romeNumbers.get(i);
                    counter--;
                    arabian = arabian - i;
                }
            } else if (counter == 4 || counter == 9) {
                rome = rome + romeNumbers.get(i) + romeNumbers.get(i * counter + i);
                arabian = arabian - i * counter;
            } else if (counter > 5 && counter < 9) {
                rome = rome + romeNumbers.get(i * 5);
                arabian = arabian - i * 5;
                while (counter - 5 > 0) {
                    rome = rome + romeNumbers.get(i);
                    arabian = arabian - i;
                    counter--;
                }
            } else {
                rome = rome + romeNumbers.get(i * counter);
                arabian = arabian - i * counter;
            }
        }
        return rome;
    }

//    private static int toArabianConvert(){
//
//
//    }
}
