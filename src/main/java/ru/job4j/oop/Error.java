package ru.job4j.oop;

public class Error {

   private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Online: " + active);
        System.out.println("Количество лайков: " + status);
        System.out.println("Сообщение:  " + message);
    }

    public static void main(String[] args) {
        Error client = new Error();
        client.printInfo();
        Error user = new Error(true, 123, "Всем привет!");
        user.printInfo();

    }
}
