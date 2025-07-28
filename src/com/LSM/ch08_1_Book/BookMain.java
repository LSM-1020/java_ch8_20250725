package com.LSM.ch08_1_Book;

import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BookService bookService = new BookServiceImpl(); //구현 클래스 인스턴스화
		Scanner scanner = new Scanner(System.in);//키보드로부터 입력 받아주는 클래스
		
		while(true) {
			System.out.println("==도서관리 시스템");
			System.out.println("1. 도서 추가");
			System.out.println("2. 도서 목록 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 프로그램 종료");
			System.out.println("=================");
			System.out.println("메뉴 선택 : ");
			int choiceNum = scanner.nextInt();//사용자가 입력한 정수 번호 가져오기 netint
			System.out.println("=================");
			switch(choiceNum) {
			

			case 1:
				System.out.println("도서ID : ");
				int bookId = scanner.nextInt();
				System.out.println("도서제목 : ");
				String bookTitle = scanner.nextLine();
				System.out.println("도서저자 : ");
				String bookAuthor = scanner.nextLine();
				
				Book book = new Book (bookId, bookTitle, bookAuthor);
				bookService.addBook(book);
			case 2:
			case 3:
			case 4:
			default :
				System.out.println("잘못된 번호 선택 입니다");
				
			}
			
		}
		
		
	}

}
