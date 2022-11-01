package composition;

import java.util.Arrays;
import java.util.List;

public class DemoComposition {
    public static void main(String[] args) {
        Books book1 = new Books("title1", "author1", 123);
        Books book2 = new Books("title2","author2",12313);
        List<Books> books = Arrays.asList(book1,book2);
        Library lib = new Library(books);

        lib.getListOfBooksInLibrary().stream().map(book -> book.title).forEach(System.out::println);
    }
}
