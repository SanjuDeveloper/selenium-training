package training.selenium;

/**
 * Hello world!
 *
 */
public class Child extends Constructor
{
	public static int a=10, b=20; // we use A and B in main fun. and main is static 
	
	public Child(int a,int b) 
	{
		super(a,b);
		
		
	}

	public static void main( String[] args )
    {
        System.out.println( "Hello World! sanjay" );
        Constructor obj  = new Constructor(a,b);
        obj.sum();
        obj.subtract();
    }
   
    //A+B
   
  
    
}
