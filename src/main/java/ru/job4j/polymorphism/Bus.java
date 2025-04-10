package ru.job4j.polymorphism;

public class Bus implements Transport {

    @Override
    public void move() {
        System.out.println("Частые остановки");
    }

    @Override
    public int passengers(int count) {
        return count;
    }

    @Override
    public int refuel(int fuel) {
        int price = 60;
        return fuel * price;
    }

}

