package Lesson6_Task.Task3;

import java.util.Scanner;

/**
 * Создать класс, описывающий банкомат.
 * Набор купюр, находящихся в банкомате, должен задаваться тремя свойствами:
 * количеством купюр номиналом 20, 50 и 100.
 * Сделать метод для добавления денег в банкомат.
 */

public class AtmTask {

    Scanner scanner = new Scanner(System.in);
    ATM atm = new ATM(0,0,0);
    int function;
    double cash;

    public void run() {
        while (true) {
            System.out.println(atm);
            if (functionMethod() == 0) {
                break;
            }
        }
    }

    public int functionMethod() {
        System.out.println("1- добавить денег в банкомат  \n0- Выйти из программы");
        while (!scanner.hasNextInt()) {
            System.out.println("Нужно число, попробуй еще");
            scanner.next();
        }
        function = scanner.nextInt();
        switch (function) {
            case 1:
                topUpAtm();
                return 1;
            case 0:
                return 0;
            default:
                return -1;
        }
    }
    public void topUpAtm(){
        System.out.println("Введите сумму, которую хотите добавить в банкомат");
        while (!scanner.hasNextDouble()){
            System.out.println("Нужно число, попробуй еще");
            scanner.next();
        }
        cash = scanner.nextDouble();
        if (atm.addCash(cash)==-1){
            System.out.println("Нельзя добавить меньше чем 20");
        }
    }
}
