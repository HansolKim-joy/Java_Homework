package com.kh.practice7.run;

import com.kh.practice7.model.vo.Employee;

public class Run {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setEmpNo(100);
		e.setEmpName("홍길동");
		e.setDept("영업부");
		e.setJob("과장");
		e.setGender('남');
		e.setSalary(2500000);
		e.setBonusPoint(0.05);
		e.setPhone("010-1234-5678");
		e.setAddress("서울시 강남구");
		
		System.out.println(e.getEmpNo());
		System.out.println(e.getEmpName());
		System.out.println(e.getDept());
		System.out.println(e.getJob());
		System.out.println(e.getGender());
		System.out.println(e.getSalary());
		System.out.println(e.getBonusPoint());
		System.out.println(e.getPhone());
		System.out.println(e.getAddress());
		
	}
}
