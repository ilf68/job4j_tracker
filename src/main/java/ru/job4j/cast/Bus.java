package ru.job4j.cast;

public class Bus implements  Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " движется по маршруту");
    }

    @Override
    public void passengerNum() {
        System.out.println(" перевозит до 100 пассажиров");
    }
}
