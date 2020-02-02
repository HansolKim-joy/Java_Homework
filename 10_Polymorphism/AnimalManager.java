package practice3.controller;

import practice3.model.vo.Animal;
import practice3.model.vo.Cat;
import practice3.model.vo.Dog;

public class AnimalManager {
	public static void main(String[] args) {
		Animal[] aArr = new Animal[5];
		
		aArr[0] = new Dog("�ٵ���", "��Ƽ��", 12);
		aArr[1] = new Cat("�߿���", "�븣����", "��", "���");
		aArr[2] = new Dog("�ູ��", "��������", 5);
		aArr[3] = new Cat("ī��", "������", "����", "�����");
		aArr[4] = new Dog("�۸���", "�޸��þ�", 9);
		
		for(int i = 0; i < aArr.length; i++) {
			aArr[i].speak();
		}
	}
}
