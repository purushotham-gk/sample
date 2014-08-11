/**
 * 
 */
package competation;

import com.myutil.map.MyMap;

/**
 * @author pkondappa
 *
 */
public class MyMapDemo {

	/**
	 * 
	 */
	public MyMapDemo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMap map = new MyMap();
		map.put("Puru", "Ranjitha");
		map.put("Ranjitha", "Puru");
		
		System.out.println(map.get("Puru"));
		System.out.println(map.get("Ranjitha"));

	}

}
