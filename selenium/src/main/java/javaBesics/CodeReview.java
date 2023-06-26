package javaBesics;

public class CodeReview {
	
	public CodeReview(int a, int b) {
		System.out.println(a+b);
	}
	
	public CodeReview() {
		System.out.println("this is cons..");
	}
	
	
	public static void main(String[] args ) {
		new CodeReview(1,2); // Object created
		new CodeReview();
		
	}
	
	
	
}
