//package com.example.demo.book;
//
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.util.List;
//
//@Configuration
//public class BookConfig {
//    @Bean
//    CommandLineRunner commandLineRunner(BookRepository bookRepository){
//        return args -> {
//            Book lotr = new Book("The Lord of the Rings: The Fellowship of the Ring", "J.R.R. Tolkien", 1954, "9780547928210");
//            Book kingkiller = new Book("The Name of the Wind","Patrick Rothfuss",2007,"9780756404741");
//            Book got = new Book("A Song of Ice and Fire: A Game of Thrones", "George R.R. Martin", 1996,"9780553381689");
//            bookRepository.saveAll(List.of(lotr,kingkiller,got));
//        };
//
//    }
//}
