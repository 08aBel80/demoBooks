package com.example.demo;

import com.example.demo.book.Book;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import java.util.Arrays;

@SpringBootTest
@AutoConfigureMockMvc
public class DemoApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private ObjectMapper objectMapper;

	@Test
	public void testCreateRetrieveUpdateDeleteBook() throws Exception {
//		// Create three books
//		Book book1 = new Book("Title 1", "Author 1", 2023, "978-0-123456-78-1");
//		Book book2 = new Book("Title 2", "Author 2", 2022, "978-0-123456-78-2");
//		Book book3 = new Book("Title 3", "Author 3", 2021, "978-0-123456-78-3");
//
//		// POST: Create the books
//		mockMvc.perform(MockMvcRequestBuilders.post("/api/books")
//						.contentType(MediaType.APPLICATION_JSON)
//						.content(objectMapper.writeValueAsString(book1)))
//				.andExpect(MockMvcResultMatchers.status().isCreated());
//
//		mockMvc.perform(MockMvcRequestBuilders.post("/api/books")
//						.contentType(MediaType.APPLICATION_JSON)
//						.content(objectMapper.writeValueAsString(book2)))
//				.andExpect(MockMvcResultMatchers.status().isCreated());
//
//		mockMvc.perform(MockMvcRequestBuilders.post("/api/books")
//						.contentType(MediaType.APPLICATION_JSON)
//						.content(objectMapper.writeValueAsString(book3)))
//				.andExpect(MockMvcResultMatchers.status().isCreated());
//
//		// GET: Retrieve each book and check if added successfully
//		mockMvc.perform(MockMvcRequestBuilders.get("/api/books/isbn/" + book1.getIsbn()))
//				.andExpect(MockMvcResultMatchers.status().isOk())
//				.andExpect(MockMvcResultMatchers.jsonPath("$.title").value("Title 1"))
//				.andExpect(MockMvcResultMatchers.jsonPath("$.author").value("Author 1"))
//				.andExpect(MockMvcResultMatchers.jsonPath("$.releaseYear").value(2023))
//				.andExpect(MockMvcResultMatchers.jsonPath("$.isbn").value("978-0-123456-78-1"));
//
//		mockMvc.perform(MockMvcRequestBuilders.get("/api/books/isbn/" + book2.getIsbn()))
//				.andExpect(MockMvcResultMatchers.status().isOk())
//				.andExpect(MockMvcResultMatchers.jsonPath("$.title").value("Title 2"))
//				.andExpect(MockMvcResultMatchers.jsonPath("$.author").value("Author 2"))
//				.andExpect(MockMvcResultMatchers.jsonPath("$.releaseYear").value(2022))
//				.andExpect(MockMvcResultMatchers.jsonPath("$.isbn").value("978-0-123456-78-2"));
//
//		mockMvc.perform(MockMvcRequestBuilders.get("/api/books/isbn/" + book3.getIsbn()))
//				.andExpect(MockMvcResultMatchers.status().isOk())
//				.andExpect(MockMvcResultMatchers.jsonPath("$.title").value("Title 3"))
//				.andExpect(MockMvcResultMatchers.jsonPath("$.author").value("Author 3"))
//				.andExpect(MockMvcResultMatchers.jsonPath("$.releaseYear").value(2021))
//				.andExpect(MockMvcResultMatchers.jsonPath("$.isbn").value("978-0-123456-78-3"));
//
//		// PUT: Update one book
//		book2.setTitle("Updated Title 2");
//		book2.setAuthor("Updated Author 2");
//		book2.setReleaseYear(2025);
//		book2.setIsbn("978-0-123456-78-2");
//
//		mockMvc.perform(MockMvcRequestBuilders.put("/api/books/isbn/" + book2.getIsbn())
//						.contentType(MediaType.APPLICATION_JSON)
//						.content(objectMapper.writeValueAsString(book2)))
//				.andExpect(MockMvcResultMatchers.status().isOk());
//
//		// GET: Retrieve the updated book and check if updated successfully
//		mockMvc.perform(MockMvcRequestBuilders.get("/api/books/isbn/" + book2.getIsbn()))
//				.andExpect(MockMvcResultMatchers.status().isOk())
//				.andExpect(MockMvcResultMatchers.jsonPath("$.title").value("Updated Title 2"))
//				.andExpect(MockMvcResultMatchers.jsonPath("$.author").value("Updated Author 2"))
//				.andExpect(MockMvcResultMatchers.jsonPath("$.releaseYear").value(2025))
//				.andExpect(MockMvcResultMatchers.jsonPath("$.isbn").value("978-0-123456-78-2"));
//
//		// DELETE: Delete one book
//		mockMvc.perform(MockMvcRequestBuilders.delete("/api/books/isbn/" + book1.getIsbn()))
//				.andExpect(MockMvcResultMatchers.status().isOk());
//
//		// GET: Attempt to retrieve the deleted book and check if not found
//		mockMvc.perform(MockMvcRequestBuilders.get("/api/books/isbn/" + book1.getIsbn()))
//				.andExpect(MockMvcResultMatchers.status().isNotFound());
	}
}
