package ru.job4j.oop;

public class DummyDic {
    public String engToRus(){
        String eng = "it english";
        return eng; /*redundant*/
    }
    public  static void main(String[] args) {
       DummyDic petr = new DummyDic();
       String newWord = petr.engToRus();
       System.out.println("Неизвестное слово. " + newWord);
    }
}
