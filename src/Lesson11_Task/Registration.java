package Lesson11_Task;

public class Registration {

    public static boolean logIn(String login, String password, String confirmPassword) {

        boolean regStatus = true;
        boolean haveNumber = false;

        try {
            if (login.length() > 20 || password.length() > 20 || login.contains(" ") || password.contains(" ")) {
                throw new RegistrationException("Логин и пароль должны содержать менее 20-ти символов, " +
                        "и не иметь пробела");
            } else {
                for (int i = 0; i < password.length(); i++) {
                    if (Character.isDigit(password.charAt(i))) {
                        haveNumber = true;
                    }
                }
                if (!haveNumber) {
                    throw new WrongPasswordException("Пароль должен содержать хотябы одну цифру");
                }
                if (!password.equals(confirmPassword)) {
                    throw new WrongPasswordException("Пароли должны совпадать");
                }
            }
        } catch (RegistrationException ex) {
            ex.initCause(new Throwable("Логин и пароль должны содержать менее 20-ти символов," +
                    "и не иметь пробела"));
            regStatus = false;
//            System.err.println(ex.getMessage());
//            ex.printStackTrace();
            System.err.println(ex.getCause());
        }
        return regStatus;
    }
}
