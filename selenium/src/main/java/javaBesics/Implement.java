package javaBesics;

public class Implement implements Animal {
	
	public static void main(String[] args) {
		String Firstname = new String("sanju");
		String lastName = new String("sanju");
		if (Firstname == lastName) {
			// it will check memory [address of variable ]
			System.out.println("true");
		} else {
			System.out.println("False");
		}
		
		if(lastName.equals(Firstname)) {
			System.out.println("True1");
		}else {
			System.out.println("False1");
		}
		//Implement obj  = new Implement();
		//obj.calculation();
		//obj.sleep();
	}
	
	@Override
	public void calculation() {
		// The body of calculation() is provided here
		System.out.println("The pig says: wee wee");
	}

	@Override
	public void sleep() {
		System.out.println("Zzz"); // The body of sleep() is provided here
	}
	
}
