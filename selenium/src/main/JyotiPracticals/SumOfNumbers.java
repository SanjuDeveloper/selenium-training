package JyotiPracticals;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner add = new Scanner(System.in);  //Scanner and system.in used to take value from user 
		
		System.out.println("Enter value of a :- ");
		int a = add.nextInt(); //nextint used to take value from user and print
		System.out.println("Value of a = " +a); // it will print alue of a
		
		System.out.println("Enter value of b :- ");
		int b = add.nextInt();
		System.out.println("Value of b = " +b);
		
		int sum = a+b;
		System.out.println("Sum of two numbera :- " +a+"+"+b+" = " +sum);
		
		
		
		
	}

}
