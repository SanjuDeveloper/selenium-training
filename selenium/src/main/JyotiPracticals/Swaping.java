package JyotiPracticals;

import java.util.Scanner;

public class Swaping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter two names");
		
		System.out.println("Name is ");
		String name = sc.next();
		System.out.println("Surname is ");
		String surname = sc.next();
//		String swap = sc.next();
//		
		
//		name = name + surname;
//		surname = name - surname;
//		name = name - surname;
		
		String swap = name;
		name = surname;
		surname = swap;
		
		System.out.println("print swap value " +name+ " - " +surname);
		
	}

}
