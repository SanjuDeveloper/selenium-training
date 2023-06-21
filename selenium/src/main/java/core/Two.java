package core;

public class Two extends One{

	public Two(String name) {
		super(name);
		
	}

	public static void main(String[] args) {
		Two obj = new Two("sanjuji");
		obj.getName();
		obj.setName();
		obj.setName1();
		

	}

}
