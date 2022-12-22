package Lesson13_Task;

/**
 * Представим, что в Java нет коллекции типа ArrayList.
 * Создать свой класс, симулирующий работу класса динамической
 * коллекции - т.е. создать свою кастомную коллекцию.
 * В основе коллекции будет массив.
 * Кастомная коллекция должна хранить элементы разных классов(т.е. это
 * generic).
 * Предусмотреть операции добавления элемента, удаления элемента,
 * получение элемента по индексу, проверка есть ли элемент в коллекции,
 * метод очистки всей коллекции.
 * Предусмотреть конструктор без параметров - создает массив размером
 * по умолчанию.
 * Предусмотреть конструктор с задаваемым размером внутреннего
 * массива.
 * Предусмотреть возможность автоматического расширения коллекции при
 * добавлении элемента в том случае, когда коллекция уже заполнена.
 */

public class Test {

    public static void main(String[] args) {

        CustomList<Integer> customList = new CustomList<>();

    }
}
