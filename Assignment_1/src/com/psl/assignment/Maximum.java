package com.psl.assignment;
import java.util.Scanner;

class Prime {
	public static boolean isPrimeNumber( int num) {
		int flag=0;
		for (int i=2; i<num; i++) {
			if(num%i==0)
				flag=1;
		}
		if(flag==0)
			return true;
		else
			return false;
	}

}

class MultiTable{
	void showtable() {
		int Table[][] = new int[10][12];
		int row=1, col=1;
		for(int i=0;i<Table.length; i++) {
			for(int j=0; j<Table[i].length; j++) {
				Table[i][j]=row*col;
				col+=1;
			}
			row+=1;
			col=1;
		}
		for(int i=0;i<Table.length; i++) {
			for(int j=0; j<Table[i].length; j++) {
				System.out.print(""+Table[i][j]+"\t|");
		
			}
			System.out.println("\n");
		}
	}
}

class CreditCard{
	static void calPayBack(int money) {
		if(money<=500)
		{
			System.out.println("Payback is "+ money*0.0025);
		}
		else if(money>500 && money<=1500)
		{
			System.out.println("Payback is "+ ((500*0.0025)+((money-500)*0.0050)));
		}
		else if(money>1500 && money<=2500)
		{
			System.out.println("Payback is "+ ((500*0.0025)+(1000*0.0050)+((money-1500)*0.0075)));
		}
		else
		{
			System.out.println("Payback is "+ ((500*0.0025)+(1000*0.0050)+(1000*0.0075)+((money-2500)*0.01)));
		}
		
	}
}

class PrintPrime{
	static void printPrime(int maxVal) {
		for(int i=2;i<=maxVal;i++) {
			if(Prime.isPrimeNumber(i)==true)
				System.out.println(i);
		}
	}
}

class Theatre{
	static float calculateProfit( int numAttendees){
		return (float) ((numAttendees*5)-(20+(numAttendees* 0.5)));
	}
}

class Electricity{
	
	static void showBill() {
		System.out.println("Enter type of Electricty connection you have");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
	switch(str)
	{
		case "Domestic":
			System.out.println("Enter number of units consumed");
			int uni=sc.nextInt();
			if(uni<=100)
			{
				int bill= (uni*4)<250?250:uni*4;
				System.out.println("Your Electricity Bill is "+bill);
			}
			else if(uni>100  && uni<=500)
			{
				System.out.println("Your Electricity Bill is "+ (float)(uni*4.75));

			}
			else
			{
				System.out.println("Your Electricity Bill is "+(uni*5));

			}
			break;
		
		case "Commercial":
			System.out.println("Enter number of units consumed");
			int uni1=sc.nextInt();
			if(uni1<=100)
			{
				int bill= (uni1*4.25)<350?250:uni1*4;
				System.out.println("Your Electricity Bill is "+bill);
			}
			else if(uni1>100  && uni1<=300)
			{
				System.out.println("Your Electricity Bill is "+ (float)(uni1*4.75));

			}
			else if(uni1>300  && uni1<=500)
			{
				System.out.println("Your Electricity Bill is "+ (uni1*5));

			}
			else
			{
				System.out.println("Your Electricity Bill is "+ (float)(uni1*5.25));

			}
			break;
			
			
	}
	}
	
	
}
public class Maximum {
	static int calMax(int x,int y, int z) {
		if(x>y)
		{
			if(x>z)
				return x;
			else
				return z;
		}
		else 
		{
			if(y>z)
				return y;
			else
				return z;
		}
	}
	
	static boolean checkAlpha(char alph) {
		if(alph=='a' || alph=='e' || alph=='i' || alph=='o' || alph=='u')
			return true;
		else
			return false;
			
	}
	
	static double calInterest(int amt) {
		if(amt < 1000)
			return amt*0.04;
		else if((amt<5000) && (amt>1000)  ) 
			return amt*0.045;
		else
			return amt*0.05;
		
	}
	
	static double calTax(int gp) {
		if(gp < 240)
			return gp*0;
		else if((gp<480) && (gp>240)  ) 
			return gp*0.15;
		else
			return gp*0.28;
	}

	public static void main(String[] args) {
		int a,b,c,deposit;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first Number");
		a=sc.nextInt();
		System.out.println("Enter second Number");
		b=sc.nextInt();
		System.out.println("Enter third Number");
		c=sc.nextInt();
		int d=calMax(a,b,c);
		System.out.println("Maximum of three numbers is"+" "+d);
		
		System.out .println("Enter an alphabet");
		char ch=sc.next().charAt(0);
		boolean boo=checkAlpha(ch);
		System.out.println(boo);
		
		System.out.println("Enter Deposit Amount");
		deposit=sc.nextInt();
		double interest=calInterest(deposit);
		System.out.println("Interest for on year is "+interest);
		
		
		System.out.println("Enter Gross pay");
		int gp=sc.nextInt();
		double tax=calTax(gp);
		System.out.println("Your tax is "+tax);
		
		
		System.out.println("Enter a number");
		int num=sc.nextInt();
		boolean bl = Prime.isPrimeNumber(num);
		System.out.println(bl);
		
		
		System.out.println("Enter a number");
		int numb=sc.nextInt();
		PrintPrime.printPrime(numb);
		
		
		System.out.println("Enter No of attendees in theatre");
		int atte=sc.nextInt();
		float profit=Theatre.calculateProfit(atte);
		System.out.println("The profit earned is $"+profit);
		
		
		Electricity.showBill();
		
		
		System.out.println("Enter money spent in one year");
		int money=sc.nextInt();
		CreditCard.calPayBack(money);
		
		MultiTable ml = new MultiTable();
		ml.showtable();
	}

}
