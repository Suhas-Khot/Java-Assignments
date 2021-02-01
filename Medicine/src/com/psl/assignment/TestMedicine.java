package com.psl.assignment;


class MyClass {
	  static int randomWithRange(int min, int max){   
		int range = (max - min) + 1;     
	    return (int)(Math.random() * range) + min;
}  
}


class Medicine {
	String name, address;
	
	void displayLabel() {
		name = "Cipla";
		address = "Mumbai";
		
		System.out.println(name + " " + address);
		
	}
}
class Tablet extends Medicine{
	void displayLabel() {
		
		System.out.println("store in a cool dry place");
		
	}
}
class Syrup extends Medicine {
    void displayLabel() {
        System.out.println("take after taking eatables");
    }
}

class Ointment extends Medicine {
    void displayLabel() {
        System.out.println("for external use only");
    }
}

public  class TestMedicine {
	public static void main(String args[]) {
		
		int n = MyClass.randomWithRange(1,3);
		Medicine [] m = new Medicine[10];
		
		switch(n)
	       {
	    	  case 1:m[0]=new Medicine();
	    	         m[0].displayLabel();
	                 m[1]=new Tablet();
	                 m[1].displayLabel();
	                 break;
	          
	    	  case 2:m[2]=new Medicine();
	    	         m[2].displayLabel();
	                 m[3]=new Syrup();
	                 m[3].displayLabel();
	                 break;
	                 
	    	  case 3:m[4]=new Medicine();
	    	         m[4].displayLabel();
	                 m[5]=new Ointment();
	                 m[5].displayLabel();
	       }
		
	}
}