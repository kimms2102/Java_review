package com.java.reprot2;

public class MySqlDao implements DataAccessObject{
	@Override
	public void select() {
		System.out.println("�˻�");
		
	}

	@Override
	public void insert() {
		
		System.out.println("����");
	}

	@Override
	public void update() {
		System.out.println("����");
		
	}

	@Override
	public void delete() {
		
		System.out.println("����");
	}
}
