package com.sort;

public class FactorySort {
	
	
	static Sort getItSorted(String type){
		
		if(type.equalsIgnoreCase("SelectionSort")){
			return new SelectionSort();
		}else if(type.equalsIgnoreCase("BubbleSort")){
			return new BubbleSort();
		}else if(type.equalsIgnoreCase("MergeSort")){
			return new MergeSort();
		}
		
		return null;
		
	}

}
