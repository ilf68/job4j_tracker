package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;

public class StartUI {
    private static final DateTimeFormatter FORMATTER
            = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");

    public static void main(String[] args) {
        Item item1 = new Item();
        System.out.println(item1.getCreated().format(FORMATTER));
    }
}