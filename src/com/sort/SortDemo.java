/**
 * 
 */
package com.sort;

/**
 * @author pkondappa
 *
 */
public class SortDemo {

	/**
	 * 
	 */
	public SortDemo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyArray array = new MyArray();
		
		Sort s = (Sort)FactorySort.getItSorted("SelectionSort");
		s.sort(array);
		
		MyArray array1 = new MyArray();
		s = (Sort)FactorySort.getItSorted("BubbleSort");
		s.sort(array1);
		
		MyArray array2 = new MyArray();
		s = (Sort)FactorySort.getItSorted("MergeSort");
		s.sort(array2);

	}

}
