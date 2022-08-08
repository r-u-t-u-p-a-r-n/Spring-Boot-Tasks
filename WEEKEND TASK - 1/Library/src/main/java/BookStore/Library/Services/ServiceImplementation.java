package BookStore.Library.Services;

import BookStore.Library.Models.Book;
import BookStore.Library.Repository.BooksRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceImplementation implements BookServices{
    @Autowired
    private BooksRepo booksRepo;

    public ServiceImplementation(BooksRepo booksRepo) {
        this.booksRepo = booksRepo;
    }
    @Override
    public Book saveBook(Book book)
    {
        return booksRepo.save(book);
    }
    @Override
    public List<Book> getAllBooks()
    {
        return booksRepo.findAll();
    }
    @Override
    public Book getBookById(int id)
    {
        Book book = null ;
        try
        {
            book = booksRepo.findById(id).orElseThrow(Exception::new);
        }
        catch(Exception e) {}
        return book ;
    }
    @Override
    public Book updateBook(Book book,int id)
    {
        Book existingBook = null ;
        try
        {
            existingBook=booksRepo.findById(id).orElseThrow(Exception::new);
            existingBook.setAuthorName(book.getAuthorName());
            existingBook.setBookName(book.getBookName());
            existingBook.setPrice(book.getPrice());
            booksRepo.save(existingBook);
        }
        catch(Exception e) {}
        return existingBook;
    }
    @Override
    public void deleteBookInfo(int id)
    {
        try
        {
            booksRepo.findById(id).orElseThrow(Exception::new);
            booksRepo.deleteById(id);
        }
        catch(Exception e){}
    }
}