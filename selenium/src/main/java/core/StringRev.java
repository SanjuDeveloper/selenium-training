package core;

import java.util.*;

public class StringRev extends Parent{
	
	public static void main(String[] args) {
		//System.out.println(Parent.name);
		int[] array = {89,60,30,20,50,10};
		
		Arrays.sort(array);   
		System.out.print(Arrays.toString(array));
		
	}
}