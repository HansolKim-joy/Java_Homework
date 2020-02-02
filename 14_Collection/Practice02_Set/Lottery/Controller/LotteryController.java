package com.kh.practice.set.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

import com.kh.practice.set.model.compare.SortedLottery;
import com.kh.practice.set.movdel.vo.Lottery;

public class LotteryController {
	HashSet<Lottery> lottery = new HashSet<Lottery>();
	HashSet<Lottery> win = new HashSet<Lottery>();
	
	public boolean insertObject(Lottery l) {
		if(lottery.add(l) == true) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean deleteObject(Lottery l) {
		if(lottery.remove(l) == true) {
			if(win.contains(l) == true) {
				win.remove(l);
			}
			return true;
		}else {
			return false;
		}
	}
	
	public HashSet winObject() {
		List<Lottery> list = new ArrayList<Lottery>();
		list.addAll(lottery);
		
		while(win.size() < 4) {
			int random = (int)(Math.random() * list.size());
			win.add(list.get(random));
			if(!lottery.contains(list.get(random))) {
				win.remove(list.get(random));
				// 제거된 사람만을 제거하고 남은 자리만 채우는 것이기 때문에 
			}
		}
		return win;
	}
	
	public TreeSet sortedWinObject() {
		TreeSet<Lottery> set = new TreeSet<Lottery>(new SortedLottery());
		set.addAll(win);
		return set;
	}
	
	public boolean searchWinner(Lottery l) {
		if(win.contains(l) == true) {
			return true;
		}else {
			return false;
		}
	}
}
