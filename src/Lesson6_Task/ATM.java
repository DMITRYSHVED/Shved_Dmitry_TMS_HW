package Lesson6_Task;

public class ATM {
    int numOfTwenty;
    int numOfFifty;
    int numOfHundreds;

    public ATM(int numOfTwenty, int numOfFifty, int numOfHundreds) {
        this.numOfTwenty = numOfTwenty;
        this.numOfFifty = numOfFifty;
        this.numOfHundreds = numOfHundreds;
    }

    @Override
    public String toString() {
        return "Денег в банкомате \n" + "Купюры номиналом 20: " + numOfTwenty + "\nКупюры номиналом 50: " + numOfFifty +
                "\nКупюры номиналом 100: " + numOfHundreds;
    }

    public double addCash(double cash) {
        double change = -1;
        int bills;
        if (cash >= 20) {
            change = cash % 100;
            bills = (int) ((cash - change) / 100);
            numOfHundreds = numOfHundreds + bills;
            cash = change;
            change = cash % 50;
            bills = (int) ((cash - change) / 50);
            numOfFifty = numOfFifty + bills;
            cash = change;
            change = cash % 20;
            bills = (int) ((cash - change) / 20);
            numOfTwenty = numOfTwenty + bills;
            System.out.println("Ваша сдача " + change);
        }
        return change;
    }
}
