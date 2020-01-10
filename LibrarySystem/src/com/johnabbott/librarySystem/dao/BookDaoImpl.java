package com.johnabbott.librarySystem.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.johnabbott.librarySystem.model.Book;

@Repository
public class BookDaoImpl implements BookDao {

	JdbcTemplate jdbcTemplate;

	private final String SQL_INSERT_BOOK = "insert into "
			+ "books(bookName, bookType, author, year) values(?, ?, ?, ?)";
	private final String SQL_SELECT_BOOK = "select bookId, bookName, bookType, author, year from books";
	private final String SQL_UPDATE_BOOK = "update books set bookname= ? , booktype =? , author = ?, year = ? where bookid = ? ";
	private final String SQL_SELECT_BOOK_BY_ID = "select bookid, bookName, bookType, author, year from books where bookid = ?";

	public BookDaoImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public int insertBook(Book book) {
		return jdbcTemplate.update(SQL_INSERT_BOOK, 
						book.getBookName(), 
						book.getBookType(), 
						book.getAuthor(),
						book.getYear());
	}

	@Override
	public List<Book> getBooks() {
		
		return jdbcTemplate.query(SQL_SELECT_BOOK, new BookMapper());
		
	}

	@Override
	public boolean updateBook(Book book) {
		int updateResult = jdbcTemplate.update
				(SQL_UPDATE_BOOK, 
						book.getBookName(), 
						book.getBookType(), 
						book.getAuthor(),
						book.getYear(),
						book.getBookId());
		return updateResult > 0;
	}

	@Override
	public Book getBookById(int bookId) {
		return jdbcTemplate.queryForObject(SQL_SELECT_BOOK_BY_ID, 
				new Object[]{bookId}, new BookMapper());
	}
}
