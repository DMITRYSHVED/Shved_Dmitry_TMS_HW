package Lesson3_Task;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Bender bender = new Bender();
        bender.benderFraze();
    }
}

class Bender {

    Scanner sc = new Scanner(System.in);
    int number;
    int groupNumber;

    private void findGroup() {
        while (true) {
            System.out.println("Введи число: ");
            number = sc.nextInt();
            if (number > 0 && number < 15) {
                System.out.println("Группа 1");
                groupNumber = 1;
                break;
            } else if (number >= 15 && number < 30) {
                System.out.println("Группа 2");
                groupNumber = 2;
                break;
            } else if (number >= 30) {
                System.out.println("Группа 3");
                groupNumber = 3;
                break;
            } else {
                System.out.println("Не в диапазоне, проверь введенное число...");
            }
        }
    }

    public void benderFraze() {
        findGroup();
        for (int i = 0; i < groupNumber; i++) {
            System.out.println("Вино, деньги и женщины нам обеспечены!");
        }
    }
}
