/**
 * 
 */

/**
 * @author pkondappa
 *
 */
public class StringDemo {

	/**
	 * 
	 */
	public StringDemo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "hello";
		String s2 = new String("hello");
		String s3 = "hello";	
		
		if(s1==s2){
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		
		if(s1==s3){
			System.out.println("True");
		}else {
			System.out.println("False");
		}

	}

}
