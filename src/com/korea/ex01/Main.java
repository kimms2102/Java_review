package com.korea.ex01;

public class Main {

	public static void main(String[] args) {
		AbstractCls at = new ChildCls();//�θ�Ÿ�Կ� �ڽ�Ŭ������ ��Ƽ� ���
		ChildCls cl = new ChildCls();
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
		
		System.out.println("-----------------------");
		
		Animal animal = null;
		animal = new Dog();
		
		animal.sound();
		
		animal = new Cat();
		
		animal.sound();
		System.out.println("-----------------------");
		animalSound(new Dog());
		animalSound(new Cat());//�޼ҵ�����ε�
		
	}

	private static void animalSound(Animal animal) {
		animal.sound();	
	}

}
