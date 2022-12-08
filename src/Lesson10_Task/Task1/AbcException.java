package Lesson10_Task.Task1;

public class AbcException extends Exception {

    private String message;
    public static final String DESCRIPTION = "НОМЕР ДОКУМЕНТА СОДЕРЖИТ КОМБИНАЦИЮ БУКВ ABC";

    public AbcException(String message) {
        super(message);
    }

    public static String getDescription() {
        return DESCRIPTION;
    }
}
