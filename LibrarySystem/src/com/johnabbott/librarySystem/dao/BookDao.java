package com.johnabbott.librarySystem.dao;

import java.util.List;

import com.johnabbott.librarySystem.model.Book;

public interface BookDao {
	public int insertBook(Book book);
	public List<Book> getBooks();

	public boolean updateBook(Book book);
	public Book getBookById(int bookId);

}
