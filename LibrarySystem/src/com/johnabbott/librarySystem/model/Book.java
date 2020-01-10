package com.johnabbott.librarySystem.model;

public class Book {
	
	int bookId;
	String bookName;
	String bookType;
	String author;
	boolean used;
	int year;
	
	
	
	public boolean isUsed() {
		return used;
	}

	public void setUsed(boolean used) {
		this.used = used;
	}

	public Book() {
	}

	public Book(String bookName, String bookType, String author, int year) {
		this.bookName = bookName;
		this.bookType = bookType;
		this.author = author;
		this.year = year;
	}
	
	


	public Book(int bookId, String bookName, String bookType, String author, int year) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookType = bookType;
		this.author = author;
		this.year = year;
	}

	public String getAuthor() {
		return author;
	}

	public int getYear() {
		return year;
	}

	public String getBookName() {
		return bookName;
	}
	public int getBookId() {
		return bookId;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookType() {
		return bookType;
	}
	public void setBookType(String bookType) {
		this.bookType = bookType;
	}
	
}
