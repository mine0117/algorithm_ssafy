package com.ssafy.BookTest;

import com.ssafy.Book.Book;
import com.ssafy.Magazine.Magazine;

public class BookTest {

	public static void main(String[] args) {
		Book book = new Book("21424", "JAVA Pro", "김하나", "Jaen.kr", 15000, "JAVA 기본문법");
		Book book1 = new Book("35355", "분석설계", "소나무", "Jaen.kr", 30000, "SW 모델링");
		Magazine magazine = new Magazine("35535", "Java World", "편집부" , "java.com" , 7000, "첫걸음" , 2018,2);
		
		System.out.println("****************도서목록**********************");
		System.out.println(book.toString());
		System.out.println(book1.toString());
		System.out.println(magazine.toString());
	
	}

}
