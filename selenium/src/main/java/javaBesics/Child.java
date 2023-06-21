package javaBesics;

public class Child extends AbstractClass {
	// Method Overloading
	 public void run(int a,int b) {
		 System.out.println("Bike is running safely");
	 } 
	 
	 public void run(String name) {
		 System.out.println("Bike is running safely");
	 } 
	 
	 public void run(int a) {
		 
		 System.out.println(a);
		 // update bank account balance
	 }
	 
	public static void main(String[] args) {
		Child obj  = new Child(); // call object automatically
		obj.run("sanju");
		obj.run(10);
	}

}
