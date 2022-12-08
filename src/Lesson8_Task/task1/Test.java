package Lesson8_Task.task1;

/**
 * Создайте класс Phone, который содержит переменные number, final model и weight, массив контактов.
 * создать класс Contact с полями имя контакта, номер контакта.
 * поля приватные.
 * Создайте три экземпляра этого класса.
 * Добавить конструктор в класс Phone, который принимает на вход три параметра для
 * инициализации переменных класса - number, model и weight.
 * Добавить конструктор, который принимает на вход два параметра для инициализации
 * переменных класса - number, model.
 * Добавить конструктор без параметров.
 * Вызвать из конструктора с тремя параметрами конструктор с двумя.
 * Добавить в класс Phone методы:
 * receiveCall, имеет один параметр – объект контакта.
 * Выводит на консоль сообщение “Звонит {name} + {номер телефона}”.
 * getNumber – возвращает номер телефона.
 * Добавьте перегруженный метод receiveCall, который принимает два параметра - имя звонящего
 * и номер телефона звонящего. Вернуть объект типа контакт найденный в массиве контаков по имени и номеру.
 * Создать метод sendMessage с аргументами переменной длины.
 * Данный метод принимает на вход контакты и сообщение, которым будет отправлено сообщение.
 * Метод выводит на консоль номера этих телефонов и само сообщение.
 */

public class Test {
    public static void main(String[] args) {

        Phone phone = new Phone("+375445533785", "IPHONE XR", 200);
        Contact firstContact = new Contact("Глеб", "+375445567876");
        Contact secondContact = new Contact("Дмитрий", "+375118745678");
        Contact thirdContact = new Contact("Вероника", "+375994466279");

        phone.saveContact(firstContact);
        phone.saveContact(secondContact);
        phone.saveContact(thirdContact);
        phone.showContactsInfo();
        phone.receiveCall(secondContact);
        System.out.println(phone.receiveCall(thirdContact.getContactName(), thirdContact.getContactNumber()));
        phone.sendMessage("Ну чо ты", firstContact, thirdContact);
    }
}
