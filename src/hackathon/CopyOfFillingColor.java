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
public class CopyOfFillingColor {


	private static  Integer ROW_SIZE = 0; 
	private static  Integer COL_SIZE = 0; 

	// declares an array of integers
	private static int[][] gridArray ; 




	/**
	 * 
	 */
	public CopyOfFillingColor() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s;

		try {
			s = in.readLine();
			String [] firstLine = s.split(" ");
			ROW_SIZE = Integer.parseInt(firstLine[0]);
			COL_SIZE = ROW_SIZE;
			gridArray = new int[ROW_SIZE][COL_SIZE];

			int noOps = Integer.parseInt(firstLine[1]);
            int count = 0; 
			while ((s = in.readLine()) != null && s.length() != 0)
			{
				count++;
				if(count > noOps)
					break;
				performOp(s);
				
			} 

		} catch (IOException e) {

			e.printStackTrace();
		}

		printGridArray();

	}



	private static void performOp(String arrayString) {

		String [] stringArray = arrayString.split(" ");
		String select = stringArray[0];
		int pos = Integer.parseInt(stringArray[1])-1;
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
		for(int i = 0; i < ROW_SIZE; i++ )
		{
			for(int j = 0; j < COL_SIZE; j++){

				//System.out.print(gridArray[i][j] + " ");
				count+=gridArray[i][j];
			}
			//System.out.println();
		}

		System.out.println( count );
	}

}
