package com.kh.practice.file.model.dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDAO {
	public boolean checkName(String file) {
		boolean isTrue = true;
		File f1 = new File(file);
		
		if(f1.exists()) {
			isTrue = false; // Á¸Àç½Ã false¹Ý
		}
		return isTrue;
	}
	
	public void fileSave(String file, String s) {
		try(FileWriter fw = new FileWriter(file);){
			fw.write(s);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public StringBuilder fileOpen(String file) {
		
		StringBuilder sb = new StringBuilder();
		
		try(FileReader fr = new FileReader(file);){
			int value;
			while((value = fr.read()) != -1){
				sb.append((char)value);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return sb;
	}
	
	public void fileEdit(String file, String s) {
		
		try (FileWriter fw = new FileWriter(file);){
			fw.write(s);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
