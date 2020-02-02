package com.kh.practice.chap01_poly.view;

import java.util.Scanner;

import com.kh.practice.chap01_poly.controller.LibraryController;
import com.kh.practice.chap01_poly.model.vo.AniBook;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.CookBook;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryMenu {
	LibraryController lc = new LibraryController();
	Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("나이 : ");
		int age = Integer.parseInt(sc.nextLine());
		System.out.print("성별 : ");
		char gender = sc.nextLine().charAt(0);
		
		Member mem = new Member(name, age, gender);
		lc.insertMember(mem);
		
		int num = 0;
		do {
			System.out.println("==== 메뉴 ====");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("9. 프로그램 종료하기");
			
			System.out.print("메뉴 번호 : ");
			num = sc.nextInt();
			sc.nextLine();
			
			if(num == 1) {
				lc.myinfo();
			}else if (num == 2) {
				selectAll();
			}else if(num == 3) {
				searchBook();
			}else if(num == 4) {
				rentBook();
			}else if(num == 9) {
				System.out.println("프로그램을 종료합니다.");
				return;
			}
			if(num == 1) {
				System.out.println(mem.toString());
			}	
		}while(num != 1 || num != 2|| num != 3 || num !=4);
	}
	
	public void selectAll() {
		
		Book[] bList = lc.selectAll();
	
		for(int i = 0; i < lc.selectAll().length; i++) {
			if(bList[i] instanceof AniBook) {
				System.out.println(i + "번 도서 : " + "[Book : [title=" + ((AniBook)bList[i]).getTitle() + ", author=" + ((AniBook)bList[i]).getAuthor() + ", publisher=" + ((AniBook)bList[i]).getPublisher() + ", accessAge=" + ((AniBook)bList[i]).getAccessAge());
			}else if (bList[i] instanceof CookBook) {
				System.out.println(i + "번 도서 : " + "[Book : [title=" + ((CookBook)bList[i]).getTitle() + ", author=" + ((CookBook)bList[i]).getAuthor() + ", publisher=" + ((CookBook)bList[i]).getPublisher() + ", coupon="+ ((CookBook)bList[i]).getCoupon());
			}
		}
	}
	
	public void searchBook() {
		System.out.print("검색할 제목 키워드 : ");
		String keyword = sc.nextLine();
		lc.searchBook(keyword);
		
		Book[] b = lc.searchBook(keyword);
		for(int i = 0; i < lc.searchBook(keyword).length; i++) {
			if(b[i] instanceof AniBook) {
				System.out.println("AniBook [Book : [title=" + ((AniBook)b[i]).getTitle() + ", author=" + ((AniBook)b[i]).getAuthor() + ", publisher=" + ((AniBook)b[i]).getPublisher() + ", accessAge=" + ((AniBook)b[i]).getAccessAge());
			}else if (b[i] instanceof CookBook) {
				System.out.println("CookBook [Book : [title=" + ((CookBook)b[i]).getTitle() + ", author=" + ((CookBook)b[i]).getAuthor() + ", publisher=" + ((CookBook)b[i]).getPublisher() + ", coupon="+ ((CookBook)b[i]).getCoupon());
			}
		}
	}
	
	public void rentBook() {
		
		Book[] bList = lc.selectAll();
		
		for(int i = 0; i < lc.selectAll().length; i++) {
			if(bList[i] instanceof AniBook) {
				System.out.println(i + "번 도서 : " + "[Book : [title=" + ((AniBook)bList[i]).getTitle() + ", author=" + ((AniBook)bList[i]).getAuthor() + ", publisher=" + ((AniBook)bList[i]).getPublisher() + ", accessAge=" + ((AniBook)bList[i]).getAccessAge());
			}else if (bList[i] instanceof CookBook) {
				System.out.println(i + "번 도서 : " + "[Book : [title=" + ((CookBook)bList[i]).getTitle() + ", author=" + ((CookBook)bList[i]).getAuthor() + ", publisher=" + ((CookBook)bList[i]).getPublisher() + ", coupon="+ ((CookBook)bList[i]).getCoupon());
			}
		}
		
		System.out.print("대여할 도서 번호 선택 : ");
		int index = sc.nextInt();
		
		switch(lc.rentBook(index)) {
		case 1: System.out.println("나이제한으로 불가능"); break;
		case 2: System.out.println("성공적 요리쿠폰"); break;
		case 3: System.out.println("성공"); break;
		}
		
		
	}
}
