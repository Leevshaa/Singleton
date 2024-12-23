package app;

public class Main {

    public static void main(String[] args) {

        Logger test = Logger.getInstance();
        test.logging("Тестове повідомлення :)");

        Logger test1 = Logger.getInstance();
        test1.logging("Це друге тестове повідомлення ;)");

        System.out.println("\nЗмінні test та test1 викликають один і той же екземпляр? " + (test == test1));
    }
}
