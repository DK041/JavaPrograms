package org.waterproject;

public class looping {

	public static void main(String[] args) {
//		Armstrong number
//		int num = 153;
//		int rem = 0;
//		int res = 0;
//		while (num > 0) {
//			rem = num % 10;
//			res = res + rem;
//			num = num / 10;
//
//		}
//		System.out.println(res);
//	}
//	
	
	
//	//Factorial
//	int numb=5;
//	int fact=1;
//	
//	for(int i=1;i<=numb;i++) {
//		fact=fact*i;
//	}	
//	System.out.println(fact);
				
		
//		Fibonacci
		
	int a=0;
	int b=1;
		System.out.println(a);
		System.out.println(b);
	for(int i=0; i<=15; i++) {
			int c= a+b;
			System.out.println(c);
			a=b;
			b=c;
	}
//				
		
		
////		Reverse the word
		String str = "Welcome to java";
		String res="";
		String[] sp = str.split(" ");
		
		for(int i=0;i<sp.length; i++) {
			String S = sp[i];
			String rev="";	
			
			for(int j=0; j<S.length(); j++)
			{
				char ch= S.charAt(j);
				rev= ch +rev;
			}
			res = res+rev+" ";	
		}
		System.out.println(res);
		
		

}
}