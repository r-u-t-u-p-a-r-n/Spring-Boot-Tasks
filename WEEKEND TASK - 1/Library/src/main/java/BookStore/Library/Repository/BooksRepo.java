package BookStore.Library.Repository;

import BookStore.Library.Models.Book;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BooksRepo extends JpaRepository<Book,Integer> {
}