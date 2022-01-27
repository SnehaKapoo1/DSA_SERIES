package com.lc.model;

public class Book extends Item{

	int bookTypeId;
	String title;
	String author;
	
	
	public Book(int itemId, String itemType, Record record, int bookTypeId, String title, String author) {
		super(itemId, itemType, record);
		this.bookTypeId = bookTypeId;
		this.title = title;
		this.author = author;
	}
	
	public Book(int itemId, String itemType, int bookTypeId, String title, String author) {
		super(itemId, itemType, null);
		this.bookTypeId = bookTypeId;
		this.title = title;
		this.author = author;
	}


	public int getBookTypeId() {
		return bookTypeId;
	}


	public void setBookTypeId(int bookTypeId) {
		this.bookTypeId = bookTypeId;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}
	
	@Override
	public String toString() {
		return "Book [bookTypeId=" + bookTypeId + ", title=" + title + ", author=" + author + ", getItemId()="
				+ getItemId() + ", getItemType()=" + getItemType() + ", getRecord()=" + getRecord() + "]";
	}

	
}
