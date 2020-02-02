package com.kh.hw.member.controller;

import com.kh.hw.member.model.vo.Member;

public class MemberController {
	Member[] m = new Member[SIZE];
	public static final int SIZE = 10;
	
	public int existMemberNum() {
		int count = 0;
		
		if(m == null) {
			
		}else {
			for(int i = 0; i < m.length; i++) {
				if(m[i] != null) {
					count++;
				}
			}
		}
		return count;
	}
	
	public Boolean checkId(String inputId) {
		
		boolean isTrue = true;
		
		for(int i = 0; i < m.length; i++) {
			if(m[i] != null) {
				if(inputId.equals(m[i].getId())) {
					isTrue = false;
					break;
				}
			}
		}
		return isTrue;
	}
	
	public void insertMember(String id, String name, String password, String email, char gender, int age) {
		for(int i = 0; i < m.length; i++) {
			if(m[i] == null) {
				m[i] = new Member(id, name, password, email, gender, age);
				break;
			}
		}
	}
	
	public String searchId(String id) {
		
		String result = null;
		
		
		for(int i = 0; i < m.length; i++) {
			if(m[i] == null) {
				
			}else {
				if(m[i].getId() != null) {
					if(id.equals(m[i].getId())){
						result = m[i].inform();
						break;
					}
				}
			}
		}
		return result;
	}
	
	public Member[] searchName(String name) {
		
		Member[] m1 = new Member[SIZE];
		if(m == null) {
			
		}else {
			for(int i = 0; i < m.length; i++) {
				if(m[i] != null) {
					if(name.equals(m[i].getName())) {
						m1[i] = m[i];
					}else {
						m1 = null;
					}
				}
			}
		}
		return m1;
	}

	
	public Member[] searchEmail(String email) {
		Member[] m1 = new Member[SIZE];
		if(m == null) {
			
		}else {
			for(int i = 0; i < m.length; i++) {
				if(m[i] != null) {
					if(email.equals(m[i].getEmail())) {
						m1[i] = m[i];
					}else {
						m1 = null;
					}
				}
			}
		}
		return m1;
	}
	
	public Boolean updatePassword(String id, String password) {
		boolean is = false;
		
		if(m == null) {
			
		}else {
			for(int i = 0; i < m.length; i++) {
				if(m[i] == null) {
					
				}else {
					if(id.equals(m[i].getId())){
						m[i].setPassword(password);
						is = true;
					}
				}
			}
		}
		return is;
	}
	
	public Boolean updateName(String id, String name) {
		boolean is = false;
		
		if(m == null) {
			
		}else {
			for(int i = 0; i < m.length; i++) {
				if(m[i] == null) {
					
				}else {
					if(id.equals(m[i].getId())) {
						m[i].setName(name);
						is = true;
					}
				}
			}
		}
		return is;
	}
	
	public Boolean updateEmail(String id, String email) {
		boolean is = false;
		if(m == null) {
			
		}else {
			for(int i = 0; i < m.length; i++) {
				if(m[i] == null) {
					
				}else {
					if(id.equals(m[i].getId())) {
						m[i].setEmail(email);
						is = true;
					}
				}
			}
		}
		return is;
	}
	
	public Boolean delete(String id) {
		boolean is = false;
		
		if(m == null) {
			
		}else {
			for(int i = 0; i < m.length; i++) {
				if(m[i] == null) {
					
				}else {
					if(id.equals(m[i].getId())) {
						m[i] = null;
						is = true;
					}
				}
			}
		}
		return is;
	}
	
	public void delete() {
		if(m == null) {
			
		}else {
			for(int i = 0; i < m.length; i++) {
				if(m[i] == null) {
					
				}else {
					m = null;
				}
			}
		}
	}
	
	public Member[] printAll() {
		return m;
	}
}

