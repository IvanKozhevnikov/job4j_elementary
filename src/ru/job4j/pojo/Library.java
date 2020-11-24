package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book cleanCode = new Book("Clean code", 1);
        Book grokAlgorithms = new Book("Grok algorithms", 2);
        Book javaForDummies = new Book("Java for dummies", 3);
        Book designPatterns = new Book("Design patterns", 4);
        Book[] books = new Book[4];
        books[0] = cleanCode;
        books[1] = grokAlgorithms;
        books[2] = javaForDummies;
        books[3] = designPatterns;
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println(bk.getName() + " - " + bk.getCount());
        }
        System.out.println("Replacing a book with index 0 with a book with index 3.");
        Book replacement = null;
        replacement = books[0];
        books[0] = books[3];
        books[3] = replacement;
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println(bk.getName() + " - " + bk.getCount());
        }
        System.out.println("Shown only books.name \"Clean code\"");
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            if (bk.getName().equals("Clean code")) {
                System.out.println(bk.getName() + " - " + bk.getCount());
            }
        }
    }
}
