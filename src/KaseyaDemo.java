/**
 * 
 */

/**
 * @author pkondappa
 *
 */
public class KaseyaDemo {

	/**
	 * 
	 */
	public KaseyaDemo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int height = 4; 
		
		for(int i = 1 ; i<=height; i++){
			
		   int noOfDigits = 2 * i - 1 ;
		   
		   for(int j=1; j<=noOfDigits ; j++){
			   
			   while(j<=noOfDigits)
			   {
				
				   
				   if(j>i)
				   {
					   System.out.print(j-i); 
				   }else {
					   //less than i; 
					   System.out.print(j); 
				   }
				   
				   j++; 
				   
				   
			   }
			   System.out.println("");
			   
		   }
			   
			   
		   
			
			
		}
		
		
	}

}
