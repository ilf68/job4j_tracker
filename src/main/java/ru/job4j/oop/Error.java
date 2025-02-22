package ru.job4j.oop;

public  class Error {
    private boolean active;
    private int status;
    private String message;

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public Error() {

    }

    public void printInfo() {
        if (active) {
            System.out.println("Возникла ошибка " + status + message);
        } else {
            System.out.println("Устранена ошибка " + status + message);

        }
    }

    public static void main(String[] args) {
        Error error1 = new Error();
        error1.printInfo();
        Error error2 = new Error();
        error2.printInfo();
        Error error3 = new Error(true, 545, " никто не знает, что это такое");
        error3.printInfo();
        Error error4 = new Error(false, 141, " это было нелегко");
        error4.printInfo();

    }
}


