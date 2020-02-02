package practice3.controller;

import practice3.model.vo.Animal;
import practice3.model.vo.Cat;
import practice3.model.vo.Dog;

public class AnimalManager {
	public static void main(String[] args) {
		Animal[] aArr = new Animal[5];
		
		aArr[0] = new Dog("바둑이", "말티즈", 12);
		aArr[1] = new Cat("야옹이", "노르웨이", "집", "흰색");
		aArr[2] = new Dog("행복이", "슈나우져", 5);
		aArr[3] = new Cat("카레", "길고양이", "파주", "노란색");
		aArr[4] = new Dog("멍멍이", "달마시안", 9);
		
		for(int i = 0; i < aArr.length; i++) {
			aArr[i].speak();
		}
	}
}
