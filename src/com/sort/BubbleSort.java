package com.sort;

public class BubbleSort implements Sort {

	@Override
	public Object sort(Object o) {
		// TODO Auto-generated method stub
		System.out.println("\nI am Bubble Sort!!!");
		 if (o instanceof MyArray) {
		    	MyArray new_name = (MyArray) o;
		    	int[] array = new_name.array;
		    	for (int i = 0; i < array.length; i++) {
		    		for(int j = 0 ; j< array.length; j++){
		    			if(array[i] < array[j]){
		    				int temp = array[i];
		    	    		array[i] = array[j];
		    	    		array[j] = temp;
		    				
		    			}
		    		}
		    		
		    	}
		    	for (int i = 0; i < array.length; i++) {
					System.out.print(array[i] + " ");
				}
		    	
		 }
		return null;
	}

}
