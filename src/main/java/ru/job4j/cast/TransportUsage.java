package ru.job4j.cast;

public class TransportUsage {
    public static void main(String[] args) {
        Vehicle air = new Airplane();
        Vehicle bus = new Bus();
        Vehicle train = new Train();
        Vehicle[] vehicles = new Vehicle[]{air, train, bus};
        for (Vehicle object : vehicles) {
            object.move();
            object.passengerNum();
        }
    }
}
