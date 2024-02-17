package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;
    public Error (boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }
    public Error(){

    }
    public void printInfo() {
        System.out.println("Опа-на! ошибочка вроде?");
        System.out.println("Наличие ошибки: " + active);
        System.out.println("Статус: " + status);
        System.out.println("Сообщение: " + message);
    }

    public static void main(String[] args) {
        Error err1 = new Error();
        Error err2 = new Error(true, 23, "Неизвестная ошибка");
        Error err3 = new Error(false, 45, "ошибка номер 45");
        err1.printInfo();
        err2.printInfo();
        err3.printInfo();
    }

}
