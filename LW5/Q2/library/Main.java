package Q2.library;

import Q2.library.books.FictionBook;
import Q2.library.utils.BookUtils;

public class Main {
    public static void main(String[] args) {
        FictionBook hp = new FictionBook("Harry Potter", "J.K.Rowling", "Fiction");
        BookUtils.printBookDetails(hp);
    }
}