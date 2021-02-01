package com.psl.assignment;

public class BatteryProduct extends Product{
	public String dimensions, capacity, brand, power_supply_requirements, battery_backup;

	public BatteryProduct(String name, int id, int serial_number, String dimensions, String capacity,String brand, String power_supply_requirements,  String battery_backup) {
		super(name, id, serial_number);
		this.dimensions = dimensions;
		this.brand = brand;
		this.capacity = capacity;
		this.power_supply_requirements = power_supply_requirements;
		this.battery_backup = battery_backup;
	}
	public void display() {
		System.out.println("Product Details: "+"\n"+"Name - "+name+"\n"+"Id - "+id+"\n"+"Serial Number - "+serial_number+"\n"+"Dimension - "+dimensions+"\n"+"Capacity - "+capacity+"\n"+"Brand - "+brand+"\n"+"Power  - "+power_supply_requirements+"\n"+"Battery Backup -"+battery_backup);
	}

}
