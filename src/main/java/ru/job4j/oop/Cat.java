package ru.job4j.oop;

public class Cat {
    private String food;
    private String name;

    public void show() {
        System.out.println("Кличка этого кота");
        System.out.println(this.name);
        System.out.println("Он ел");
        System.out.println(this.food);
    }
    public void eat(String meat) {
        this.food = meat;
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public static void main(String[] args) {
        Cat gav = new Cat();
        gav.eat("Котлета");
        gav.giveNick("Гав-гав");
        gav.show();

        Cat black = new Cat();
        black.eat("Рыба");
        black.giveNick("Черныш");
        black.show();
    }
}
