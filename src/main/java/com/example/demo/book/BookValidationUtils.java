package com.example.demo.book;

public class BookValidationUtils {

    public static boolean isValidBook(Book book) {
        return isValidTitle(book.getTitle()) &&
                isValidAuthor(book.getAuthor()) &&
                isValidReleaseYear(book.getReleaseYear()) &&
                isValidIsbn(book.getIsbn());
    }

    private static boolean isValidTitle(String title) {
        return title != null && !title.trim().isEmpty();
    }

    private static boolean isValidAuthor(String author) {
        return author != null && !author.trim().isEmpty();
    }

    private static boolean isValidReleaseYear(Integer releaseYear) {
        return releaseYear !=null && releaseYear > 0;
    }

    private static boolean isValidIsbn(String isbn) {
        return isbn != null && !isbn.trim().isEmpty();
    }
}
