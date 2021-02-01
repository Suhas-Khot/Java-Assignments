package com.psl.assignment;

public class KeyProducts extends Product {
	public String os,memory, key;

	
	public KeyProducts(String name, int id, int serial_number,String os, String memory, String key) {
		super(name, id, serial_number);
		this.os= os;
		this.memory = memory;
		this.key= key;
	}
	public void display() {
		System.out.println("Product Details: "+"\n"+"Name - "+name+"\n"+"Id - "+id+"\n"+"Serial Number - "+serial_number+"\n"+"Operating Systm - "+os+"\n"+"Memory - "+memory+"\n"+"Key - "+key);
	}

	

}
