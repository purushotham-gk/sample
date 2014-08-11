/**
 * 
 */
package com.sort;

/**
 * @author pkondappa
 *
 */
public class SelectionSort implements Sort{

	@Override
	public Object sort(Object o) {
		// TODO Auto-generated method stub
		
		System.out.println("I am selection Sort!!!");
	    if (o instanceof MyArray) {
	    	MyArray new_name = (MyArray) o;
	    	int[] array = new_name.array;
	    	for (int i = 0; i < array.length; i++) {
				
	    		int index_min = i; 
	    		
	    		for(int j = i; j< array.length; j++){
	    			
	    			if(array[j] < array[index_min]){
	    				index_min = j;
	    			}
	    			
	    		}
	    		
	    		//swap b/w  array[i] and  array[index_min]
	    		int temp = array[i];
	    		array[i] = array[index_min];
	    		array[index_min] = temp;
	    		
	    		
			}
	    	
	    	for (int i = 0; i < array.length; i++) {
				System.out.print(array[i] + " ");
			}
	    	
			
		}
		
		return null;
	}
  

}
