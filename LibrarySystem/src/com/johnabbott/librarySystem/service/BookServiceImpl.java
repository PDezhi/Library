package com.johnabbott.librarySystem.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.johnabbott.librarySystem.dao.BookDao;
import com.johnabbott.librarySystem.model.Book;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	BookDao bookDao;
	
	@Override
	public List<Book> getComputerBooks() {
		// TODO Auto-generated method stub
		List<Book> computerBooks = new ArrayList<Book>();
		computerBooks.add(new Book("Head First Java","Computer","Kathy Sierra and Bert Bates",2016));
		computerBooks.add(new Book("Thinking in Java","Computer","Bruce Eckel",1996));
		return computerBooks;
	}

	@Override
	public List<Book> getNovelBooks() {
		// TODO Auto-generated method stub
		List<Book> novelBooks = new ArrayList<Book>();
		novelBooks.add(new Book("Hari Poter","Novel","Roling",2015));
		novelBooks.add(new Book("The Red and the Black","Novel","Stendhal and Roger Gard",1999));
		return novelBooks;
	}

	@Override
	public boolean addBook(Book book) {
		// TODO Auto-generated method stub
		return bookDao.insertBook(book) > 0;
	}

	@Override
	public List<Book> getBooks() {
		return bookDao.getBooks();
	}

	@Override
	public boolean updateBook(Book book) {
		// TODO Auto-generated method stub
		return bookDao.updateBook(book);
	}

	@Override
	public Book getBookById(int bookId) {
		// TODO Auto-generated method stub
		return bookDao.getBookById(bookId);
	}

	
	
}
