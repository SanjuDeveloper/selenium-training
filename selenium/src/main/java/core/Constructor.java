package core;

public class Constructor {
	public int A,B;
	public Constructor(int a,int b)
	{
		this.A = a;
		this.B = b;
	}
	
	public static void main(String[] args) throws InterruptedException {
		Constructor pune = new Constructor(10,20);
		pune.pune();
		//pune.multi();
	}
	
	public void pune() {
		System.out.println(A+B);
		System.out.println(A*B);
		sanju();
	}
	
	public void sanju() {
		System.out.println(A-B);
	}
}
