package org.waterproject;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class WaterProject {


	public static void main(String[] args) {
//		Odd or Even
		
		int number=13;
		if(number%2==0) {
			System.out.println("The given number is even");
		}else
		{System.out.println("The given number is odd");}
		
	//Print all odd numbers
		
		for(int num=1; num<10; num++) {
			if(num%2==1) {System.out.println(num);}
		}
		
	//Count of Odd numbers
		int count =0;
		for(int i=1;i<100;i++) {
			if(i%2==1) {
				count++;
			}
		}
	 System.out.println(count);
	 
//	 Reverse the given number
	 String num= "Welcome to java";
	 String rev= "" ;
	 
	 for(int i=0; i<num.length(); i++) {
		 char ch = num.charAt(i);
		 rev= ch+rev;
	 }
	 System.out.println(rev);
	 
//	 Reverse the given number using magic 10
	 
	 int numb = 512;
	 int rem = 0;
	 int output = 0;
	 
	 while(numb>0) {
		 rem = numb%10;
		 output=(output*10)+rem;
		 numb=numb/10;
		 
	 }
	 System.out.println(output);
		
		
//	 Reverse the given number
	 String numbu= "Welcome to python";
	 String rever= "" ;
	 String[] str = numbu.split(" ");
	 
	 for(int j=0; j<str.length; j++) {
		 String sp =str[j];
		 String Rev ="";
		 
		 
	 for(int i=0; i<sp.length(); i++) {
		 char c = sp.charAt(i);
		 Rev= c+Rev;
	 }
	 rever= rever+Rev+" ";
	 }
	 System.out.println(rever);
	 
	 String dup = "raining...";
	 String result =" ";
	 Set<Character> se = new LinkedHashSet<>();
	 for(int i=0; i<dup.length(); i++) {
		 char c = dup.charAt(i);
		 se.add(c);
		 }for(Character c: se) {
			 result = result+ c;
		 }
	System.out.println(result);
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
	
	

	

}
