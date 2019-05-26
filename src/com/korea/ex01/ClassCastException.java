package com.korea.ex01;

public class ClassCastException {

	public static void main(String[] args) {
		Dog g = new Dog();
		Cat c = new Cat();
		
		Animal animal = new Dog(); 
		Dog dog = (Dog)animal;
		Cat cat = (Cat)animal;
	}

}
