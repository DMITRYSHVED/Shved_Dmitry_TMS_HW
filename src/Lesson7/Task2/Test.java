package Lesson7.Task2;

/**
 * 2. Создать классы "Директор", "Рабочий", "Бухгалтер".
 * Реализовать интерфейс с методом, который печатает название должности
 * и имплементировать этот метод в созданные классы.
 */

public class Test {
    public static void main(String[] args) {
        Director director = new Director("директор");
        Worker worker = new Worker("рабочий");
        Accountant accountant = new Accountant("бухгалтер");
        director.printJobTitle();
        worker.printJobTitle();
        accountant.printJobTitle();
    }
}
