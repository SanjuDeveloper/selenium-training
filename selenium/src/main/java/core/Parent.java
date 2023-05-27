package core;

import java.util.Arrays;

public class Parent {
	
	protected static  String name="sanju";
	
	public Parent() {
		System.out.println("This is constructor");
	}
	
	public Parent(int count) {
		System.out.println("This is"+count);
	}
	
	public void sum() {
		System.out.println("this is sum");
	}
	
	public static void main(String[] args) {
		new Parent();
		new Parent(20);
	}
	
	public static void sortArray(int[] array) {
		int i, j,temp;
		for (i = 0; i < array.length; i++) {
			for (j = 0; j < array.length - 1; j++) {
				if (array[i] < array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}

		System.out.print(Arrays.toString(array));
	}
}
