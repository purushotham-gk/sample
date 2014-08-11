package hackathon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Solution {

	/**This is a simple challenge to get things started. Given a sorted array (ar) and a number (V), 
	 * can you print the index location of V in the array?
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println
		//https://www.linkedin.com/pub/purushotham-gk/11/6a3/264
		Stack stack = readInputs();
		
		//String arrayString = stack.pop().toString();
		//sortedArray
		String [] arrayString = stack.pop().toString().split(" ");
		Integer [] ar = new Integer[arrayString.length];
		for(int i =0; i< arrayString.length;i++){
			ar[i] = Integer.parseInt(arrayString[i]);
        	//System.out.print(arrayString[i] + " ");
        }
		
		//size of the Array 
		Integer size = Integer.parseInt(stack.pop().toString());
		//Number to be searched 
		Integer search = Integer.parseInt(stack.pop().toString());
        
		int first  = 0;
	    int last   = size - 1;
	    int middle = (first + last)/2;
	 
	    while( first <= last )
	    {
	      if ( ar[middle] < search )
	        first = middle + 1;    
	      else if ( ar[middle] == search ) 
	      {
	        System.out.println(middle);
	        break;
	      }
	      else
	         last = middle - 1;
	 
	      middle = (first + last)/2;
	   }
	   if ( first > last )
	      System.out.println(search + " is not present in the list.\n");
	  }
		

	
	
	private static Stack readInputs() {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Stack stack = new Stack();
	    String s;
	    try {
	    		while ((s = in.readLine()) != null && s.length() != 0)
				{
	    			stack.push(s);		
				}  	
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stack;
	}

}
