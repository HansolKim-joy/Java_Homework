package com.kh.practice.list.library.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.kh.practice.list.library.controller.BookController;
import com.kh.practice.list.library.model.vo.Book;

public class BookMenu {
	Scanner sc = new Scanner(System.in);
	BookController bc = new BookController();
	
	public void mainMenu() {
		System.out.println("== Welcome KH Library ==");
		
		while(true) {
			System.out.println("=====**** 메인 메뉴 *****=====");
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색 조회");
			System.out.println("4. 도서 삭제");
			System.out.println("5. 도서 명 오름차순 정렬");
			System.out.println("9. 종료");
			System.out.println();
			
			System.out.print("메뉴 번호 선택 : ");
			int num = Integer.parseInt(sc.nextLine());
			
			switch(num) {
			case 1: insertBook(); break;
			case 2: selectList(); break;
			case 3: searchBook(); break;
			case 4: deleteBook(); break;
			case 5: ascBook(); break;
			case 9: 
				System.out.println("프로그램을 종료합니다.");
				return;
			default: 
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void insertBook() {
		System.out.println("===== 새 도서 추가 =====");
		System.out.println("책 정보를 입력해주세요.");
		System.out.print("도서 명 : ");
		String title = sc.nextLine();
		System.out.print("저자 명 : ");
		String author = sc.nextLine();
		System.out.print("장르(1. 인문/ 2. 과학/ 3. 외국어/ 4. 기타) : ");
		int num = Integer.parseInt(sc.nextLine());
		String category = "";
		
		switch(num) {
		case 1: category = "인문"; break;
		case 2: category = "과학"; break;
		case 3: category = "외국어"; break;
		case 4: category = "기타"; break;
		}
		
		System.out.print("가격 : ");
		int price = Integer.parseInt(sc.nextLine());
		
		Book bk = new Book(title, author, category, price);
		bc.insertBook(bk);
		
		System.out.println();
	}
	public void selectList() {
		bc.selectList();
		List<Book> bookList = new ArrayList<Book>(bc.selectList());
		
		if(bookList == null) {
			System.out.println("존재하는 도서가 없습니다.");
		}else {
			for(int i = 0; i < bookList.size(); i++) {
				System.out.println(bookList.get(i));
			}
		}
		
		System.out.println();
	}
	
	public void searchBook() {
		System.out.println("===== 도서 검색 =====");
		System.out.print("검색 키워드 : ");
		String keyword = sc.nextLine();
		
		bc.searchBook(keyword);
		
		ArrayList<Book> searchList = bc.searchBook(keyword);
		
		if(searchList == null) {
			System.out.println("검색 결과가 없습니다.");
		}else {
			for(int i = 0; i < bc.searchBook(keyword).size(); i++) {
				System.out.println(bc.searchBook(keyword).get(i));
			}
		}
		
		System.out.println();
	}
	
	public void deleteBook() {
		System.out.println("===== 도서 삭제 =====");
		System.out.print("삭제할 도서 명 : ");
		String title = sc.nextLine();
		System.out.print("삭제할 저자 명 : ");
		String author = sc.nextLine();
		
		Book remove = bc.deleteBook(title, author);
		
		if(remove == null) {
			System.out.println("삭제할 도서를 찾지 못했습니다.");
		}else {
			System.out.println("성공적으로 삭제되었습니다.");
		}
		
		System.out.println();
	}
	
	public void ascBook() {
		if(bc.ascBook() == 1) {
			System.out.println("정렬에 성공하였습니다.");
		}else {
			System.out.println("정렬에 실패하였습니다.");
		}
		
		System.out.println();
	}
}
