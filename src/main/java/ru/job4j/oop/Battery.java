package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int load) {
        this.load = load;
    }

        public String about() {
        return "My charge: " + load + "%";
    }

        public void exchange(Battery another) {
            another.load += this.load;
            this.load = 0;

    }
}
