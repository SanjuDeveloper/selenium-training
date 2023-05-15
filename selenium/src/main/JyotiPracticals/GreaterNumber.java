package JyotiPracticals;

import java.util.Scanner;

public class GreaterNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 3 values");
		int a= sc.nextInt();
		int b= sc.nextInt();
		int c= sc.nextInt();
		
		if(a>b && b>c)
		{
			System.out.println(" A IS GRETAER");
		} else if (c>a && b>a)
		{
			System.out.println("b is greater");
		}
		else {
			System.out.println("c is greater");
		}
		
	}

}
