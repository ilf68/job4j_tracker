package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int a) {
        return a - x;
    }

    public int divide(int a) {
        return a / x;
    }

    public int sumAllOperation(int a) {
        return sum(a) + minus(a) + multiply(a) + divide(a);
    }

        public static void main(String[] args) {
            int a = 10;
            Calculator calculator = new Calculator();
            System.out.println("сумма равна " + sum(a));
            System.out.println("разница равна " + minus(a));
            System.out.println("произведение равно " + calculator.multiply(a));
            System.out.println("частное равно " + calculator.divide(a));
            System.out.println("Сумма всех действий равна " + calculator.sumAllOperation(a));

    }
}

