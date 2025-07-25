package com.LSM.ch08_1_Book;

import java.util.List;

public interface BookService {

	public void addBook(Book book); //첵 한권의 정보를 입력하는 메소드
	public Book findBookByTitle(String title); //책 제목을 입력하면 해당 책 정보를 돌려주는 메소드
	public List<Book> getAllBooks(); //모든 책
}
