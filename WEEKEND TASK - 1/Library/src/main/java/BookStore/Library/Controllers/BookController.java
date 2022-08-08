package BookStore.Library.Controllers;

import BookStore.Library.Models.Book;
import BookStore.Library.Services.BookServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bookstore")
public class BookController {
    @Autowired
    private BookServices bookServices;

    public BookController(BookServices bookServices) {
        this.bookServices = bookServices ;
    }
    @PostMapping
    public ResponseEntity<Book> saveBook(@RequestBody Book book)
    {
        return new ResponseEntity<Book>(bookServices.saveBook(book), HttpStatus.CREATED);
    }
    @GetMapping
    public List<Book> getAllBooks()
    {
        return bookServices.getAllBooks();
    }
    @GetMapping("{id}")
    public ResponseEntity<Book> getBookById(@PathVariable("id")int id)
    {
        return new ResponseEntity<Book>(bookServices.getBookById(id),HttpStatus.OK);
    }
    @PutMapping("{id}")
    public ResponseEntity<Book> updateBook(@PathVariable("id")int id,@RequestBody Book book)
    {
        return new ResponseEntity<Book>(bookServices.updateBook(book,id), HttpStatus.OK);
    }
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteBook(@PathVariable("id")int id)
    {
        bookServices.deleteBookInfo(id);
        return new ResponseEntity<String>("Book is  deleted, successfully",HttpStatus.OK);
    }
}