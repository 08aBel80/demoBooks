package com.example.demo.book;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    public Book getBookById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    public Book getBookByIsbn(String isbn) {
        return bookRepository.findBookByIsbn(isbn).orElse(null);
    }

    public boolean addNewBook(Book book) {
        if (bookRepository.findBookByIsbn(book.getIsbn()).isPresent()) {
           return false;
        }
        bookRepository.save(book);
        return true;
    }

    public boolean deleteBookById(Long id) {
        if (!bookRepository.existsById(id)) {
            return false;
        }
        bookRepository.deleteById(id);
        return true;
    }

    public boolean deleteBookByIsbn(String isbn) {
        Book book = bookRepository.findBookByIsbn(isbn).orElse(null);
        if (book == null) {
            return false;
        }
        bookRepository.deleteById(book.getId());
        return true;
    }

    @Transactional
    public boolean updateBookById(Long id, Book book) {
        Book bookById = bookRepository.findById(id).orElse(null);
        if (bookById == null) {
            return false;
        }
        bookById.setBook(book);
        return true;
    }

    @Transactional
    public boolean updateBookByIsbn(String isbn, Book book) {
        Book bookByIsbn = bookRepository.findBookByIsbn(isbn).orElse(null);
        if (bookByIsbn == null) {
            return false;
        }
        bookByIsbn.setBook(book);
        return true;
    }
}
