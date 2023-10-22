package com.example.demo.model;
 
//import java.util.Date;

public class User {
	
 private String Isbn;
 private String Book;
 private String Author;
// private Choice Role;
public String getIsbn() {
	return Isbn;
}
public void setIsbn(String isbn) {
	Isbn = isbn;
}
public String getBook() {
	return Book;
}
public void setBook(String book) {
	Book = book;
}
public String getAuthor() {
	return Author;
}
public void setAuthor(String author) {
	Author = author;
}
@Override
public String toString() {
	return "User [Isbn=" + Isbn + ", Book=" + Book + ", Author=" + Author + "]";
}
 
 
}
