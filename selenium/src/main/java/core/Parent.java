package core;



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

}
