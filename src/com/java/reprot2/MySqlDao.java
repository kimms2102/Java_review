package com.java.reprot2;

public class MySqlDao implements DataAccessObject{
	@Override
	public void select() {
		System.out.println("°Ë»ö");
		
	}

	@Override
	public void insert() {
		
		System.out.println("»ğÀÔ");
	}

	@Override
	public void update() {
		System.out.println("¾÷µ«");
		
	}

	@Override
	public void delete() {
		
		System.out.println("»èÁ¦");
	}
}
