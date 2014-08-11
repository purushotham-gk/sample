package com.sort;

public class MergeSort implements Sort {

	@Override
	public Object sort(Object o) {
		// TODO Auto-generated method stub
		System.out.println("\nI am Merge Sort!!!");
		 if (o instanceof MyArray) {
		    	MyArray new_name = (MyArray) o;
		    	int[] array = new_name.array;
		    	
		    	mergesort(array);
		    	for (int i = 0; i < array.length; i++) {
		    		System.out.print(array[i] + " ");
		    		
		    	}
		 }
		return null;
	}

	private void mergesort(int[] array) {
		// TODO Auto-generated method stub
		
	}

}
