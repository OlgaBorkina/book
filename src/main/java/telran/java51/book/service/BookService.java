package telran.java51.book.service;

import java.util.Collection;

import telran.java51.book.dto.AuthorDto;
import telran.java51.book.dto.BookDto;

public interface BookService {
	boolean addBook(BookDto bookDto);

	BookDto findBookByIsbn(String isbn);
	
	BookDto remove(String isbn);

	BookDto updateBook(String isbn, String title);
	
	AuthorDto removeAuthor(String authorName);

	Collection<BookDto> findBooksByAuthor(String authorName);

	Collection<BookDto> findBooksByPublisher(String publisherName);

	Collection<AuthorDto> findBookAuthors(String isbn);

	Collection<String> findPublishersByAuthor(String authorName);

	
}
