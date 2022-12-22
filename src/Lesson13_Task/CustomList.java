package Lesson13_Task;

public class CustomList<T> {

    private T[] mainArray;

    public CustomList() {
        T[] array = (T[]) new Object[0];
        mainArray = array;
    }

    public CustomList(int capacity) {
        T[] array = (T[]) new Object[capacity];
        mainArray = array;
    }

    public int size() {
        return mainArray.length;
    }

    public T get(int index) {
        return mainArray[index];
    }

    public void addElement(T element) {

        if (mainArray.length == 0 || mainArray[mainArray.length - 1] != null) {
            increaseCapacity();
        }
        for (int i = 0; i < mainArray.length; i++) {
            if (mainArray[i] == null) {
                mainArray[i] = element;
                break;
            }
        }
    }

    public void deleteAll() {

        T[] array = (T[]) new Object[0];

        mainArray = array;
    }

    private void increaseCapacity() {

        T[] array = (T[]) new Object[mainArray.length + 1];

        System.arraycopy(mainArray, 0, array, 0, mainArray.length);
        mainArray = array;
    }

    public void deleteElement(int index) {

        T[] array = (T[]) new Object[mainArray.length - 1];

        for (int i = 0, j = 0; i < mainArray.length; i++) {
            if (index != i) {
                System.arraycopy(mainArray, i, array, j, 1);
                j++;
            }
        }
        mainArray = array;
    }

    public boolean containsElement(T element) {

        boolean contains = false;

        for (T t : mainArray) {
            if (t.equals(element)) {
                return true;
            }
        }
        return contains;
    }
}
