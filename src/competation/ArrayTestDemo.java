/**
 * 
 */
package competation;

/**
 * @author pkondappa
 *
 */
public class ArrayTestDemo {
	
	private static int[] arrayA = {1,2,3,6,7,8,9};
	private static int[] arrayB = {1,2,3,4,5,6,9,10};
	private static int sum; 

	/**
	 * 
	 */
	public ArrayTestDemo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*		int countI = 0; 
		int countJ = 0;
		int sum = 0; 
        while(countI<arrayA.length){
        	
        	int tempA = arrayA[countI];
        	int tempB = arrayB[countJ];
        	
        	if(tempA!=tempB){
        		sum += arrayA[countI];
        	}else if(tempA==tempB){
        		//sum += arrayA[countI];
        		//toggle
        		while(countJ<arrayB.length){
        			sum+=arrayB[countJ];
        			countJ++;	
        		}
        	}
        	countI++; 	
        }
        
        System.out.println("Sum is " + sum);*/
        
       addUntillOtherArrayGetSameDigit(arrayA,arrayB,0,0);
        System.out.println("Sum is " + sum);
	}
	


	static void addUntillOtherArrayGetSameDigit(int[] arrayA, int[] arrayB, int Ai,int Bi){
		
		if(Ai==arrayA.length || Bi==arrayB.length ){
			return;
		}
		while(Ai<=arrayA.length&&Bi<=arrayB.length){
			System.out.println("Element is " +arrayA[Ai] + " Pos of Ai: " + Ai + " Pos of Bi: " + Bi);
			sum+=arrayA[Ai];
			if(arrayA[Ai] ==  arrayB[Bi]){
				//toggle;
				Bi++;
				Ai++;
				addUntillOtherArrayGetSameDigit(arrayB,arrayA,Bi,Ai);
				return;
			}
			Ai++;	
		}
		return;
	}

}
