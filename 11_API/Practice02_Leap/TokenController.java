package com.kh.practice.token.controller;

public class TokenController {
	public TokenController(){}
	
	public String afterToken(String str) {
		return str.replaceAll(" ", "");
	}
	
	public String firstCap(String input) {
		return input.substring(0, 1).toUpperCase() + input.substring(1);
	}
	
	public int findChar(String input, char one) {
		int count = 0;
		
		for(int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == one) {
				count++;
			}
		}
		return count;
	}
}
