package com.psl.assignment;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Contact {
	public String First_name, middle_name, last_name, date_of_birth, Gender, Anniversary, Address, Area, City, Pincode, State, Country, Telephone_number, Mobile_number, Email, Website;
	
	
	public Contact(String first_name, String middle_name, String last_name, String date_of_birth, String gender,
			String anniversary, String address, String area, String city, String pincode, String state, String country,
			String telephone_number, String mobile_number, String email, String website) {
		super();
		First_name = first_name;
		this.middle_name = middle_name;
		this.last_name = last_name;
		this.date_of_birth = date_of_birth;
		Gender = gender;
		Anniversary = anniversary;
		Address = address;
		Area = area;
		City = city;
		Pincode = pincode;
		State = state;
		Country = country;
		Telephone_number = telephone_number;
		Mobile_number = mobile_number;
		Email = email;
		Website = website;
	}

	public void validate() {
		try {String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
		 
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(Email);
		if(matcher.matches()==false)
			throw new Exception("Wrong email for "+this.First_name);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			if(First_name == null || last_name == null || date_of_birth == null || Email == null)
				throw new Exception();
		}
		catch(Exception e){
			System.out.println(e+" Provide all the details for contact");
		}
		try {
			if(Telephone_number == null && Mobile_number == null)
				throw new Exception("Provide atleast one contact number for"+this.First_name);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		
	}
	
	public static void main(String [] args) {
		Contact [] co = new Contact[10];
		co[0] = new Contact(null, "raj", "pawar", "03/06/1998", "Male", "03/06/1998", "03/06/1998", "03/06/1998", "03/06/1998", "03/06/1998", "03/06/1998", "03/06/1998", "03/06/1998", "03/06/1998", "Suhas@gmail.com", "03/06/1998");
		co[1] = new Contact("Rahul", "Shiva", "Mujumdar", "03/06/1998", "Male", "03/06/1998", "03/06/1998", "03/06/1998", "03/06/1998", "03/06/1998", "03/06/1998", "03/06/1998", "03/06/1998", "03/06/1998", "Rahul", "03/06/1998");
		

		co[0].validate();
		co[1].validate();

	}
}
