package com.ssafy.BookTest;

import com.ssafy.Book.Book;
import com.ssafy.Magazine.Magazine;

public class BookTest {

	public static void main(String[] args) {
		Book book = new Book("21424", "JAVA Pro", "���ϳ�", "Jaen.kr", 15000, "JAVA �⺻����");
		Book book1 = new Book("35355", "�м�����", "�ҳ���", "Jaen.kr", 30000, "SW �𵨸�");
		Magazine magazine = new Magazine("35535", "Java World", "������" , "java.com" , 7000, "ù����" , 2018,2);
		
		System.out.println("****************�������**********************");
		System.out.println(book.toString());
		System.out.println(book1.toString());
		System.out.println(magazine.toString());
	
	}

}
