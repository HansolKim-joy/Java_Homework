package com.kh.practice.book.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;

import com.kh.practice.book.model.dao.BookDAO;
import com.kh.practice.book.model.vo.Book;

public class BookController implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BookDAO bd = new BookDAO();
	
	public void makeFile() {
		File file = new File("book.txt");
		try (FileInputStream fis = new FileInputStream(file);){
			
		} catch (FileNotFoundException e) {
			try {
				file.createNewFile();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
//		File file = new File("book.txt");
//		if(file.exists()) {
//			try (FileReader fr = new FileReader(file);){
//				
//			} catch (FileNotFoundException e) {
//				e.printStackTrace();
//			} catch(IOException e) {
//				e.printStackTrace();
//			}
//		}else {
//			try {
//				file.createNewFile();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
	}
	
	public void fileSave(Book[] bArr) {
		bd.fileSave(bArr);
	}
	
	public Book[] fileRead() {
		return bd.fileRead();
	}
}
