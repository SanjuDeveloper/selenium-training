package JyotiPracticals;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter number to check number is even or odd");
		int a = sc.nextInt();
		
		if(a % 2 == 0)  // % this means finind remainer in division
	                    // / this means finind questiont		
		{
			System.out.println("Number is even");
		}
		else
		{
			System.out.println("Number is odd");
		}
			
	}
	

}
