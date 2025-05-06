package ru.job4j.ooa;

public class Airport {
    public static void main(String[] args) {
        final Airbus airbus = new Airbus("A320");
        airbus.printModel();
        airbus.printCountEngine();

        airbus.setName("A380");
        airbus.printModel();
        airbus.printCountEngine();

    }
}
