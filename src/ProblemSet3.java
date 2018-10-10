/**
 * INSTRUCTIONS.
 * 
 * Problem Set 3 will be more extensive than the first two. You've been warned. Practice makes perfect,
 * and we'll get a lot of practice with conditional and iterative control structures.
 * 
 * A few new concepts are being introduced with this assignment. Last time, we saw methods (other than
 * the @main method) for the first time. Now, we're seeing parameters, which are the variables inside
 * the parentheses in our methods. We'll cover these in more detail later. For now, you just need to
 * understand the basics.
 * 
 * A parameter is data that is provided to the method. It helps the method do its job. It's passed in
 * through the parentheses, and you can reference these variables by name as if they're your own.
 */

import java.util.Scanner;

public class ProblemSet3 {


	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ProblemSet3 ps3 = new ProblemSet3();
		System.out.println("How stylish are you on a scale of 1 to 10?");
		int a = input.nextInt();
		System.out.println("How stylish is your date on a scale of 1 to 10?");
		int b = input.nextInt();
		ps3.dateFashion( a , b );
		System.out.println("give me a word (fizzString)");
		String c = input.nextLine();
		c = input.nextLine();
		ps3.fizzString(c);
		System.out.println("Give me a the temperature");
		int d = input.nextInt();
		System.out.println("is it summer?");
		boolean e = input.nextBoolean();
		ps3.squirrelPlay(d, e);
		System.out.println("Give me a number (fizzStringAgain)");
		int f = input.nextInt();
		ps3.fizzStringAgain(f);
		System.out.println("How many small bricks?");
		int h = input.nextInt();
		System.out.println("How many big bricks?");
		int i = input.nextInt();
		System.out.println("What is the goal?");
		int j = input.nextInt();
		ps3.makeBricks(h, i, j);
		System.out.println("Give me three numbers to add up (lonesum)");
		int k = input.nextInt();
		int l = input.nextInt();
		int m = input.nextInt();
		ps3.loneSum(k, l, m);
		System.out.println("Give me three numbers to add up (luckysum)");
		int n = input.nextInt();
		int o = input.nextInt();
		int p = input.nextInt();
		ps3.luckySum(n, o, p);
		System.out.println("Give me a number (factorialWithFor)");
		int q = input.nextInt();
		ps3.factorialWithFor(q);
		System.out.println("Give me a number (factorialWithWhile)");
		int r = input.nextInt();
		ps3.factorialWithWhile(r);
		System.out.println("Give me a number (isPrime)");
		int s = input.nextInt();
		ps3.isPrime(s);
		input.close();
	}
		
	public void dateFashion(int you, int date) {
		
		if (you < 0 || you > 10 || date < 0 || date > 10) {
			System.out.println("please input a number between 1 and 10 for both you and your date");
		}
		else if (you <= 2 || date <= 2) {
			System.out.println("NO.");
		}
		else if (you >= 8 || date >= 8) {
			System.out.println("YES.");
		}
		else {
			System.out.println("MAYBE.");
		}
	}
	
	public void fizzString(String str) {
		
		char a = str.charAt(0);
		char b = str.charAt(str.length() - 1);
		if ((a == 'f' || a == 'f') && (b == 'b' || b == 'B')) {
			System.out.println("FIZZBUZZ.");
		}
		else if (b == 'b' || b ==  'B') {
			System.out.println("BUZZ.");
		}
		else if (a == 'f' || a == 'F') {
			System.out.println("FIZZ.");
		}
		else {
			System.out.println(str);
		}
	}
		
	public void squirrelPlay(int temp, boolean isSummer) {
		if (60 <= temp && temp <= 90 && isSummer == false) {
			System.out.println("YES.");
		}
		else if ((60 > temp || temp > 90 ) && isSummer == false) {
			System.out.println("NO.");
		}
		else if ((60 <= temp && temp <= 100 ) && isSummer == true) {
			System.out.println("YES.");
		}
		else if ((60 > temp || temp > 100 ) && isSummer == true) {
			System.out.println("NO.");
		}
	}
	
	public void fizzStringAgain(int n) {
		int m = n % 5;
		int o = n % 3;
		if (m == 0 && o == 0) {
			System.out.println("FIZZBUZZ!");
		}
		else if (m == 0 && o != 0) {
			System.out.println("BUZZ!");
		}
		else if (m != 0 && o == 0) {
			System.out.println("FIZZ!");
		}
		else {
			System.out.println(n + "!");
		}
	}
	
	public void makeBricks(int small, int big, int goal) {
		if ((small >= goal % 5) && (small + big*5 >= goal)) {
			System.out.println("YES.");
		}
		else {
			System.out.println("NO.");
		}
	}
	
	public void loneSum(int a, int b, int c) {
		if (a == b ) {
			if (a == c) {
				System.out.println(0 + ".");
			}
			else {
				System.out.println(c + ".");
			}
		}
		else if (a == c ) {
			if (a == b) {
				System.out.println(0 + ".");
			}
			else {
				System.out.println(b + ".");
			}
		}
		else if (b == c) {
			if (a == b) {
				System.out.println(0 + ".");
			}
			else {
				System.out.println(a + ".");
			}
		}
		else {
			System.out.println(a+b+c+ ".");
		}
	}
	
	public void luckySum(int a, int b, int c) {
		if ( a == 13 || b == 13 || c == 13) {
			System.out.println(a+b+c-13+ ".");
		}
		else {
			System.out.println(a+b+c+ ".");
		}
	}
	
	public void factorialWithFor(int n) {
		int a = 1;
		for (int x = 1; x <= n; x ++) {
			a = a*x;
		}
		System.out.println(n + "! = " + a + ".");
	}
	
	public void factorialWithWhile(int n) {
		int a = 1;
		int x = 1;
		while ( x <= n) {
			a = a * x ;
			x++;
		}
		System.out.println(n +"! = " + a + ".");
	}
	
	public void isPrime(int n) {
		boolean prime = true;
	     if (n == 0 || n ==1) {
	    	 System.out.println("NOT PRIME.");
	     }
	     else {
	    	 for(int i=2;i<n;i++) {
	 	        if(n%i==0) {
	 	        	prime = false;

	 	        }
	 	    }
	 	    if (prime == true ) {
	 	    	System.out.println("PRIME.");
	 	    }
	 	    else {
	 	    	System.out.println("NOT PRIME.");
	 	    }
	     }
		

	}
}