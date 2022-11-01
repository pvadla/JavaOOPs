package composition;

import java.awt.print.Book;
import java.util.List;

public class Library {

    public List<Books> books;

    public Library(List<Books> books) {
        this.books = books;
    }

    public List<Books> getListOfBooksInLibrary(){
        return books;
    }
}
