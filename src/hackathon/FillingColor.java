/**
 * 
 */
package hackathon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * @author pkondappa
 *
 */
public class FillingColor {
	
	
	private static  Integer ROW_SIZE = 0; 
	private static  Integer COL_SIZE = 0; 
	
	 // declares an array of integers
	private static int[][] gridArray ; 

	
	

	/**
	 * 
	 */
	public FillingColor() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		
		
		
		// TODO Auto-generated method stub
		Queue queue = readInputs();
	    // An empty line or Ctrl-Z terminates the program
		
	/*	String arrayString1 = (String)queue.remove();
		String [] stringArray1 = arrayString1.split(" ");
		
		
		ROW_SIZE = Integer.parseInt(stringArray1[0]);
		//System.out.println(COL_SIZE);
		COL_SIZE = Integer.parseInt(stringArray1[1]);
		//System.out.println(ROW_SIZE);
	   
		gridArray = new int[ROW_SIZE][COL_SIZE];
		//printGridArray();
		while(!queue.isEmpty()){
			String arrayString = (String)queue.remove();
			String [] stringArray = arrayString.split(" ");
			
			String op = null, pos = null , color = null; 
	        for(int i = 0; i< stringArray.length;i++){
	         //  System.out.print(stringArray[i] + " ");
	        	switch(i){
	        	case 0: op = stringArray[i];
	        		    break;
	        	case 1: pos = stringArray[i];
	        	        break;
	        	case 2: color = stringArray[i];
	        	        break; 
	        	default : break;
	        	
	        	}
	        }
	        performOp(op,Integer.parseInt(pos),Integer.parseInt(color));
	        //printGridArray();
	        //System.out.println();
		}
		*/
		
		printGridArray();
		
     /*   System.out.println();
		COL_SIZE = Integer.parseInt(stack.pop().toString());
		System.out.println(COL_SIZE);
		ROW_SIZE = Integer.parseInt(stack.pop().toString());
		System.out.println(ROW_SIZE);
	   
		gridArray = new int[ROW_SIZE][COL_SIZE];
		
		printGridArray();
		performOp("ROW", 1 , 6);
		performOp("COL", 3 , 9);
	    printGridArray(); */
		
		
		

	}

	private static Queue readInputs() {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Queue<String> queue = new LinkedList<String>();
	    String s;
	       
	    try {
	    	int count = 0;
	    	
	    	s = in.readLine();
	    	String [] firstLine = s.split(" ");
	    	ROW_SIZE = Integer.parseInt(firstLine[0]);
	    	COL_SIZE = ROW_SIZE;
	    	gridArray = new int[ROW_SIZE][COL_SIZE];
	    	//printGridArray();
	    	int noOps = Integer.parseInt(firstLine[1]);
	    	
		  /*for(int i =0 ; i<noOps; i++){
		    	s = in.readLine();
		    	System.out.println(s);
		    	performOp(s);
		    	printGridArray();
		    	
		    }*/
	    	
	    		while ((s = in.readLine()) != null && s.length() != 0)
				{
		           
	    			performOp(s);
					
					
				} 
	    		
	    		
	    	
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return queue;
	}

	private static void performOp(String arrayString) {
		
		String [] stringArray = arrayString.split(" ");
		String select = stringArray[0];
		int pos = Integer.parseInt(stringArray[1]);
		int filler = Integer.parseInt(stringArray[2]);
		
		if(select.equalsIgnoreCase("ROW")){
			
			
				for(int j = 0; j <COL_SIZE; j++){
					
					gridArray[pos][j] = filler; 
				}
				
						
			
		}else {
			for(int i = 0; i <ROW_SIZE; i++)
			{
				
					
					gridArray[i][pos] = filler; 
				
				
			}
			
		}
		
	}

	private static void printGridArray() {
		int count =0; 
		//System.out.println("Array");
		for(int i = 0; i < ROW_SIZE; i++ )
		{
			for(int j = 0; j < COL_SIZE; j++){
				
				System.out.print(gridArray[i][j] + " ");
				count+=gridArray[i][j];
			}
			System.out.println();
		}
		
		System.out.println( count );
	}

}
