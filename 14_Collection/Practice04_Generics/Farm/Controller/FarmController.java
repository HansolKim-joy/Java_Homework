package com.kh.practice.generics.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.practice.generics.model.vo.Farm;

public class FarmController {
	HashMap<Farm, Integer> hMap = new HashMap<Farm, Integer>();
	ArrayList<Farm> list = new ArrayList<Farm>();
	
	public boolean addNewKind(Farm f, int amount) {
		if(!hMap.containsKey(f)) {
			hMap.put(f, amount);
			return true;
		}
		return false;
	}
	
	public boolean removeKind(Farm f) {
		if(hMap.containsKey(f)) {
			hMap.remove(f);
			return true;
		}
		return false;
	}
	
	public boolean changeAmount(Farm f, int amount) {
		if(hMap.containsKey(f)) {
			hMap.put(f, amount);
			return true;
		}
		return false;
	}
	
	public HashMap<Farm, Integer> printFarm(){
		return hMap;
	}
	
	public boolean buyFarm(Farm f) {
		Set<Entry<Farm, Integer>> set = hMap.entrySet();
		Iterator<Entry<Farm, Integer>> it = set.iterator();
		
		if(it.hasNext()) {
			Entry<Farm, Integer> entry = it.next();
			if(entry.getKey().getKind().equals(f.getKind())){
				if(hMap.containsKey(f) && entry.getValue() >= 0) {
					list.add(f);
					entry.setValue(hMap.get(f) - 1);
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean removeFarm(Farm f) {
		Set<Entry<Farm, Integer>> set = hMap.entrySet();
		Iterator<Entry<Farm, Integer>> it = set.iterator();
		
		if(it.hasNext()) {
			Entry<Farm, Integer> entry = it.next();
			for(int i = 0; i < list.size(); i++) {
				if(list.get(i).equals(f)) {
					list.remove(i);
					entry.setValue(entry.getValue() + 1);
					return true;
				}
			}
		}
		return false;
	}
	
	public ArrayList<Farm> printBuyFarm(){
		return list;
	}
}
