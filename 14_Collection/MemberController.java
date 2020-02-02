package com.kh.practice.map.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import com.kh.practice.map.model.vo.Member;

public class MemberController {
	HashMap<String, Member> map = new HashMap<String, Member>();
	
	public boolean joinMembership(String id, Member m) {
		if(map.containsKey(id) != true) {
			map.put(id, m);
			return true;
		}else {
			return false;
		}
	}
	
	public String logIn(String id, String password) {
		Set<Entry<String, Member>> set = map.entrySet();
		Iterator<Entry<String, Member>> it = set.iterator();
		
		while(it.hasNext()) {
			Entry<String, Member> entry = it.next();
			if(map.containsKey(id) == true && entry.getValue().getPassword().contentEquals(password)) {
				return entry.getValue().getName();
			}
		}
		return null;
	}
	
	public boolean changePassword(String id, String oldPw, String newPw) {
		Set<Entry<String, Member>> set = map.entrySet();
		Iterator<Entry<String, Member>> it = set.iterator();
		
		while(it.hasNext()) {
			Entry<String, Member> entry = it.next();
			if(map.containsKey(id) == true && entry.getValue().getPassword().equals(oldPw)) {
				map.put(id, new Member(newPw, entry.getValue().getName()));
				return true;
			}
		}
		return false;
	}
	
	public void changeName(String id, String newName) {
		Set<Entry<String, Member>> set = map.entrySet();
		Iterator<Entry<String, Member>> it = set.iterator();
		
		while(it.hasNext()) {
			Entry<String, Member> entry = it.next();
			if(map.containsKey(id) == true) {
				map.put(id, new Member(entry.getValue().getPassword(), newName));
			}
		}
	}
	
	public TreeMap sameName(String name) {
//		TreeMap<String, Member> map1 = new TreeMap<String, Member>();
//		Set<Entry<String, Member>> set = map.entrySet();
//		Iterator<Entry<String, Member>> it = set.iterator();
//		
//		while(it.hasNext()) {
//			Entry<String, Member> entry = it.next();
//			if(entry.getValue().getName().equals(name)) {
//				map1.put(entry.getKey(), entry.getValue());
//			}
//		}
		// 위는 Entry() 사용 = 아래는 KeySet() 사용
		TreeMap<String, Member> map1 = new TreeMap<String, Member>();
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		
		while(it.hasNext()) {
			String id = it.next();
			if(name.equals(map.get(id).getName())) {
				map1.put(id, new Member(map.get(id).getPassword(), map.get(id).getName()));
			}
		}
		return map1;
	}
}
