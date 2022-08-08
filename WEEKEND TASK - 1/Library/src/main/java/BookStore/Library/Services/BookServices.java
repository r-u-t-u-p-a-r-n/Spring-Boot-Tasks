package BookStore.Library.Services;

import BookStore.Library.Models.Book;

import java.util.List;

public interface BookServices {
    Book saveBook(Book book);
    List<Book> getAllBooks();
    Book getBookById(int id);
    Book updateBook(Book book,int id);
    void deleteBookInfo(int id);
}