package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book fantazi = new Book("1984", 125);
        Book tale = new Book("Tales of a Umber See", 90);
        Book programing = new Book("Clean code", 489);
        Book garden = new Book("About Aple", 83);
        Book[] books = new Book[4];
        books[0] = fantazi;
        books[1] = tale;
        books[2] = programing;
        books[3] = garden;
        for (Book book : books) {
            System.out.println(book.getName() + " - " + book.getNumOfPages());
        }
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;

        for (Book book : books) {
            System.out.println(book.getName() + " - " + book.getNumOfPages());
        }

        for (Book book : books) {
            if ("Clean code".equals(book.getName())) {
                System.out.println(book.getName() + " - " + book.getNumOfPages());
            }
        }
    }
}
