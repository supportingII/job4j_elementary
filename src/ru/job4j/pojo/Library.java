package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book oneBook = new Book("Learn Java", 376);
        Book secondBook = new Book("Learn C++", 432);
        Book thirdBook = new Book("Learn Python", 324);
        Book fourBook = new Book("Clean code", 285);

        Book[] arrBook = new Book[4];
        arrBook[0] = oneBook;
        arrBook[1] = secondBook;
        arrBook[2] = thirdBook;
        arrBook[3] = fourBook;

        printBook(arrBook);

        Book tempBook = arrBook[0];
        arrBook[0] = arrBook[3];
        arrBook[3] = tempBook;

        printBook(arrBook);

        printBook(arrBook, fourBook);

    }

    private static void printBook(Book[] arrBook) {
        for (int i = 0; i < arrBook.length; i++) {
            System.out.println("Name book : " + arrBook[i].getName() + ", count pages: " + arrBook[i].getCountPages());
        }
    }

    private static void printBook(Book[] arrBook, Book book) {
        for (int i = 0; i < arrBook.length; i++) {
            if (arrBook[i].equals(book)) {
                System.out.println("Name book : " + arrBook[i].getName() + ", count pages: " + arrBook[i].getCountPages());
            }
        }
    }
}
