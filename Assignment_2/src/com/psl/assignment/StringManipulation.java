package com.psl.assignment;
import java.util.ArrayList;
import java.util.Scanner;


class Permutation 
{ 
    static void permute(String str, int l, int r) 
    { 
        if (l == r) 
            System.out.println(str); 
        else
        { 
            for (int i = l; i <= r; i++) 
            { 
                str = swap(str,l,i); 
                permute(str, l+1, r); 
                str = swap(str,l,i); 
            } 
        } 
    } 
 
    static String swap(String a, int i, int j) 
    { 
        char temp; 
        char[] charArray = a.toCharArray(); 
        temp = charArray[i] ; 
        charArray[i] = charArray[j]; 
        charArray[j] = temp; 
        return String.valueOf(charArray); 
    } 
 
} 


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

class EzeeShop{
	static void initProductNames() {
		
		System.out.println("Enter no of products you want to add");
		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();
		String productNames[] = new String[num];
		String keys[] = new String[num];
		
		for(int i=0; i<num; i++) {
			System.out.println("Enter Product name");
			productNames[i]=sc.nextLine();
			
			System.out.println("Enter Product Key");
			keys[i]=sc.nextLine();
			 
		}
		System.out.println("Enter Product Key Which You Want To Search:");
		String key = sc.nextLine();
		
		boolean bl = isPresent(productNames,key,num);
		System.out.println("Keyword is present "+bl);
		
	}
	static boolean isPresent(String[] productNames, String keyword, int num) {
		boolean flag= false;
		for(int j=0; j<num; j++ ) {
			if(productNames[j].equals(keyword))
				flag=true;
		}
		return flag;
	}
}

public class StringManipulation {
	
	static int check(String sentence,String word){
		String s[] = sentence.split(" ");
		int count=0;
		for(int i=0;i<s.length; i++) {
			if(word.equals(s[i]))
				count+=1;
		}
		return count;
		
	}
	
	static int findPosition(int num,int[] nos) {
		for(int i=0; i<nos.length; i++) {
			if(nos[i]==num)
				return i;
		}
		return -1;
	}
	
	static String  makeReverse(String str) {
		StringBuilder b1 = new StringBuilder();
		b1.append(str);
		return b1.reverse().toString();
		
	}
	
	static void findAndReplace(){
		System.out.println("Enter the original string");
		Scanner sc = new Scanner(System.in);
		String org = sc.nextLine();
		System.out.println("Enter the string  you want to replace with another string");
		String replace = sc.nextLine();
		String repl[]= replace.split(" ");
		System.out.println("String after replacing: " + org.replace(repl[0],repl[1] ));
	}
	static ArrayList<Integer> findPrime(int x, int y) {
		ArrayList<Integer> prime = new ArrayList<Integer>();
		for(int i=x;i<=y;i++) {
			if(Prime.isPrimeNumber(i)==true)
				prime.add(i);
		}
		return prime;
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String sentence = sc.nextLine();
		
		System.out.println("Enter a word");
		String word = sc.nextLine();
		
		
		int cn = check(sentence,word);
		System.out.println("The word "+word+" has come "+cn+" times in sentence");

		
		EzeeShop.initProductNames();
		
		System.out.println("Enter no of Elements you want to enter");
		int num=sc.nextInt();
		
		int nos[] = new int[num];
		System.out.println("Enter Elements");
		for(int i=0; i<num; i++) {
			nos[i]=sc.nextInt();
		}
		System.out.println("Enter the number that you want to search");
		int n=sc.nextInt();
		sc.nextLine();
		if(findPosition(n,nos)>=0)
			System.out.println("Entered number is present in List");
		else
			System.out.println("Entered number is not present in List");
		
		
		
		System.out.println("Enter a string");
		String st = sc.nextLine();
		System.out.println(makeReverse(st));
		
		findAndReplace();
		
		int x[]= new int[2];
		System.out.println("Enter range");
		for(int i=0; i<2; i++) {
			x[i]= sc.nextInt();
		}
		sc.nextLine();
		ArrayList<Integer> arr = findPrime(x[0], x[1]);
		for(int j= 0; j<arr.size(); j++) {
			System.out.println(arr.get(j)+ " ");
		}
		
		System.out.println("Enter String for permutation");
        String str = sc.nextLine(); 
        int n1 = str.length(); 
        Permutation.permute(str, 0, n1-1); 

	}

}
