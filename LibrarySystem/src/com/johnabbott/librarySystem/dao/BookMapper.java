package com.johnabbott.librarySystem.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.johnabbott.librarySystem.model.Book;

public class BookMapper implements RowMapper<Book> {

	@Override
	public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new Book(rs.getInt("bookid"), rs.getString("bookname"),
				rs.getString("booktype"), rs.getString("author"), rs.getInt("year"));
	}

}
