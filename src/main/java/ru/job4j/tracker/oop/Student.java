package ru.job4j.tracker.oop;

public class Student {
    public void sing() {
        System.out.println("I believe I can fly");
    }

    public void music() {
        System.out.println("Tra tra tra");
    }

    public static void main(String[] args) {
        Student petya = new Student();
        petya.music();
        petya.sing();
        petya.music();
        petya.sing();
        petya.music();
        petya.sing();
    }
}
