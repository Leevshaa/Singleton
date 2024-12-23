package app;

public class Logger {

    private static Logger instance;

    private Logger() {
        System.out.println("Створено клас Logger ;)"); // для розуміння, що екзепляр створено 1 раз
    }

    public static Logger getInstance() {
        if (instance == null) { // якщо екземпляр ще не створений (null), то створюємо його
            instance = new Logger();
        }
        return instance; // якщо створений - повертаємо його одразу
    }

    public void logging(String message) {
        System.out.println("Log:" + message);
    }
}
