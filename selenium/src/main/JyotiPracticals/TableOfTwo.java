package JyotiPracticals;

import java.util.Scanner;

public class TableOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numeber for which you want tabel of : ");
		int num = sc.nextInt();
	   
	
		for(int a=1;a<=10;a++) 
		{
			System.out.println( num+ " * " +a+ " = "+num*a );
		}
		
	}

}
