package Lesson6_Task;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Создать класс CreditCard c полями номер счета, текущая сумма на счету. Добавьте метод,
 * который позволяет начислять сумму на кредитную карточку.
 * Добавьте метод, который позволяет снимать с карточки некоторую сумму.
 * Добавьте метод, который выводит текущую информацию о карточке.
 * (переопределить toString(), пример:
 * Номер счёта : <сумма>
 * Количество денег на счету : <цифра>
 * Напишите программу, которая создает три объекта класса CreditCard у которых заданы номер счета и начальная сумма
 * Тестовый сценарий для проверки:
 * Положите деньги на первые две карточки и снимите с третьей. Выведите на экран текущее состояние всех трех карточек.
 */

public class CreditCardTask {

    ArrayList<CreditCard> creditCards = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    int function;
    int cardWork;

    public void createCreditCard() {

        CreditCard creditCard = new CreditCard();
        creditCard.createAccountNumber();
        creditCard.inputCardBalance();
        creditCard.setCardId(creditCards.size() + 1);
        creditCards.add(creditCard);

    }

    public int functionMethod() {
        System.out.println("\n1- Создать счет        2- Пополнить карту\n0- Выйти из программы  3- Снять с карты");
        while (!scanner.hasNextInt()) {
            System.out.println("Нужно число, попробуй еще");
            scanner.next();
        }
        function = scanner.nextInt();
        switch (function) {
            case 1:
                createCreditCard();
                return 1;
            case 2:
                topUpAccount();
                return 2;
            case 3:
                withdraw();
                return 3;
            case 0:
                return 0;
            default:
                return -1;
        }
    }

    public void run() {
        while (true) {
            if (functionMethod() == 0) {
                break;
            }
            showCardsInfo();
        }
    }

    public void showCardsInfo() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        for (CreditCard creditCard : creditCards) {
            System.out.println(creditCard);
        }
    }

    public void topUpAccount() {
        System.out.println("Введи порядковый номер карты:");
        while (!scanner.hasNextInt()) {
            System.out.println("Нужно число, попробуй еще");
            scanner.next();
        }
        cardWork = scanner.nextInt();
        System.out.println(creditCards.get(cardWork - 1));
        System.out.println("Введи сумму для пополнения:");
        while (!scanner.hasNextInt()) {
            System.out.println("Нужно число, попробуй еще");
            scanner.next();
        }
        creditCards.get(cardWork - 1).addSum(scanner.nextInt());
    }

    public void withdraw() {
        System.out.println("Введи порядковый номер карты:");
        while (!scanner.hasNextInt()) {
            System.out.println("Нужно число, попробуй еще");
            scanner.next();
        }
        cardWork = scanner.nextInt();
        System.out.println(creditCards.get(cardWork - 1));
        System.out.println("Введи сумму для снятия с карты:");
        while (!scanner.hasNextInt()) {
            System.out.println("Нужно число, попробуй еще");
            scanner.next();
        }
        creditCards.get(cardWork - 1).minusSum(scanner.nextInt());
    }
}
