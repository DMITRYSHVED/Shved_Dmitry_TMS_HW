package Lesson6_Task;

import java.util.Random;
import java.util.Scanner;

public class CreditCard {

    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    int cardId;
    int bankAccountNumber;
    int currentBalance;

    public void setCardId(int cardId) {
        this.cardId = cardId;
    }

    public int getCardId() {
        return cardId;
    }

    public void setBankAccountNumber(int bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public int getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setCurrentBalance(int currentBalance) {
        this.currentBalance = currentBalance;
    }

    public int getCurrentBalance() {
        return currentBalance;
    }

    public void inputCardBalance() {
        System.out.println("Введите сумму");
        while (!scanner.hasNextInt()) {
            System.out.println("Нужно число, попробуй еще");
            scanner.next();
        }
        setCurrentBalance(scanner.nextInt());
    }

    public void createAccountNumber() {
        setBankAccountNumber(random.nextInt(100000000, 1000000000));
    }

    public void addSum(int sumToAdd) {
        currentBalance = currentBalance + sumToAdd;
    }

    public void minusSum(int sumToMinus) {
        currentBalance = currentBalance - sumToMinus;
    }
    @Override
    public String toString() {
        return "\nКарта " + cardId + "\nНомер счета: <" + getBankAccountNumber() + ">\nСумма на счету: <"
                + getCurrentBalance() + ">";
    }
}
