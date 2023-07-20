package com.example.demo.book;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/books")
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public ResponseEntity<List<Book>> getBooks() {
        List<Book> books = bookService.getBooks();
        if (!books.isEmpty()) {
            return ResponseEntity.ok(books);
        }
        return ResponseEntity.noContent().build();

    }

    @GetMapping(path = "{id}")
    public ResponseEntity<Book> getBookById(@PathVariable("id") Long id) {
        Book book = bookService.getBookById(id);
        if (book != null) {
            return ResponseEntity.ok(book);
        }
        return ResponseEntity.notFound().build();

    }

    @GetMapping(path = "/isbn/{isbn}")
    public ResponseEntity<Book> getBookByIsbn(@PathVariable("isbn") String isbn) {
        Book book = bookService.getBookByIsbn(isbn);
        if (book != null) {
            return ResponseEntity.ok(book);
        }
        return ResponseEntity.notFound().build();

    }

    @PostMapping
    public ResponseEntity<?> addNewBook(@RequestBody Book book) {
        if(!BookValidationUtils.isValidBook(book)) {
            return ResponseEntity.badRequest().body("Invalid book data");
        }
        if (bookService.addNewBook(book)) {
            return ResponseEntity.status(HttpStatus.CREATED).body(book);
        }
        return ResponseEntity.status(HttpStatus.CONFLICT).body("Book with the same ISBN already exists.");
    }

    @DeleteMapping(path = "{id}")
    public ResponseEntity<?> deleteBookById(@PathVariable("id") Long id) {
        if (bookService.deleteBookById(id)) {
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("book does not exist");

    }

    @DeleteMapping(path = "/isbn/{isbn}")
    public ResponseEntity<?> deleteBookByIsbn(@PathVariable("isbn") String isbn) {
        if (bookService.deleteBookByIsbn(isbn)) {
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("book does not exist");

    }

    @PutMapping(path = "{id}")
    public ResponseEntity<?> updateBookById(@PathVariable("id") Long id, @RequestBody Book book) {
        if (bookService.updateBookById(id, book)) {
            return ResponseEntity.ok(book);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("book does not exist");
    }

    @PutMapping(path = "/isbn/{isbn}")
    public ResponseEntity<?> updateBookByIsbn(@PathVariable("isbn") String isbn, @RequestBody Book book) {
        if(bookService.updateBookByIsbn(isbn, book)){
            return ResponseEntity.ok(book);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("book does not exist");
    }
}
