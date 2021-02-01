package com.psl.assignment;

public abstract  class Product {
	public String name;
	public int id;
	public int serial_number;
	
	public Product(String name, int id, int serial_number) {
		this.id = id;
		this.name = name;
		this.serial_number = serial_number;
	}
	public abstract void display();
	
	public static void main(String args[]) {

		Product [] po = new Product[10];
		po[0] = new KeyProducts("Tally",1,1641026,"windows","16gb", "AGSTRW" );
		po[1] = new BatteryProduct("TV",2,1641010,"30*15","1tb", "ASUS","600w","6hr" );
		
		for(int i=0; i<2; i++) {
			po[i].display();
		}
	}
	
}


