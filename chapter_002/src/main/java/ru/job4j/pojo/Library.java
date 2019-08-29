package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Kolobok", 10);
        Book book2 = new Book("Buratino", 112);
        Book book3 = new Book("Gulyver", 150);
        Book book4 = new Book("Clean code", 232);

        Book[] myBookshelf = new Book[4];
        myBookshelf[0] = book1;
        myBookshelf[1] = book2;
        myBookshelf[2] = book3;
        myBookshelf[3] = book4;

        for (int i = 0; i < myBookshelf.length; i++) {
            Book myBook = myBookshelf[i];
            System.out.println(myBook.name + " - " + myBook.pages);
        }

                System.out.println();
        Book tmp = new Book("", 0);
        tmp = myBookshelf[0];
        myBookshelf[0] = myBookshelf[3];
        myBookshelf[3] = tmp;
        for (int i = 0; i < myBookshelf.length; i++) {
            Book myBook = myBookshelf[i];
            System.out.println(myBook.name + " - " + myBook.pages);
        }

        System.out.println();
        for (Book book : myBookshelf) {
            if (book.name.equals("Clean code")){
                System.out.println(book.name+" - "+book.pages);
            }
        }
    }
}
