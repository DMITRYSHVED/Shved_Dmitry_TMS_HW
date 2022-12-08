package Lesson10_Task.Task1;

public class SymbolsCombinationException extends Exception {

    private String message;
    public static final String DESCRIPTION = "НОМЕР ДОКУМНТА ЗАКАНЧИВАЕТСЯ НА КОМБИНАЦИЮ СИМВОЛОВ '1a2b'";

    public SymbolsCombinationException(String message) {
        super(message);
    }

    public static String getDescription() {
        return DESCRIPTION;
    }
}
