package ru.job4j.tracker.checkstyle;

public class Broken {
    public static final String NEW_VALUE = "";
    private String name;
    private String surname;
    private int sizeOfEmpty = 10;

    public Broken() { }

    public void echo() { }

    public void media(Object obj) {
        if (obj != null) {
            System.out.println(obj);
        }
    }

    public void method(int a, int b, int c, int d, int e, int f, int g) { }
}