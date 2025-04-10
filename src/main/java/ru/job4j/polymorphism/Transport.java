package ru.job4j.polymorphism;

public interface Transport {
    void move();

    int passengers(int count);

    int refuel(int fuel);
}
