package Lesson4_Task;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {

        String[] names = {"Андрей ", "Михаил ", "Виктория ", "Светлана ", "Ярослав ", "Глеб ", "Дмитрий ", "Кристина "};

        System.out.println("Список имен:");
        for (String name : names) {
            System.out.print(name + " ");
        }
        Arrays.sort(names);
        System.out.println("\n");
        System.out.println("Список имен по алфавиту: ");
        for (String name : names) {
            System.out.print(name + " ");
        }
    }
}
