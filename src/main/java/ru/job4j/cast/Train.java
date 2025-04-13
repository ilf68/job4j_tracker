package ru.job4j.cast;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " движется по рельсам");
    }

    @Override
    public void passengerNum() {
        System.out.println(" перевозит до 1000 пассажиров");
    }
}
