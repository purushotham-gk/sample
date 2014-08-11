/**
 * 
 */
package competation;

/**
 * @author pkondappa
 *
 */
public class MyArrayListDemo {

	/**
	 * 
	 */
	public MyArrayListDemo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       MyArrayList myList = new MyArrayList();
       myList.add("1");
       myList.add("2");
       myList.add("3");
       myList.add("4");
       myList.add("5");
       myList.add("6");
       myList.add("7");
       myList.add("8");
       myList.add("9");
       myList.add("10");
       myList.add("11");
       myList.add("12");
       for(int i =0 ; i< myList.getSize(); i++){
    	   System.out.println(myList.get(i)); 
       }
       
	}

}
