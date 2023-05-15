package JyotiPracticals;

public class DuplicateProblm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {1,1, 2, 3, 4, 4, 5, 6, 7, 8, 8 };
	
		
		for (int a=0; a < array.length;a++) 
		{
			for (int b = a + 1; b < array.length; b++ ) 
		{
				
			if ( array[a]== array[b] )
						
			System.out.println("Duplicate values are " + array[b] + "," );
			
       
	    }
		}
	}
}
				
     

			
		
		
		
	


