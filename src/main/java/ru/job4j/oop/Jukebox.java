package ru.job4j.oop;

public class Jukebox {

    public void music(int position){
        if (position == 1){
            System.out.println("Пусть бегут неуклюже");
        } else if (position == 2) {
            System.out.println("Спкойной ночи");
        } else {
            System.out.println("Песня не найдена");
        }
    }
    public static void main(String[] args) {
        Jukebox crocodile = new Jukebox();
        crocodile.music(1);
        crocodile.music(2);
        crocodile.music(45);
    }
}
