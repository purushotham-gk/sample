/**
 * 
 */
package learnserialize;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * @author pkondappa
 *
 */
public class DemoDeSerialize {

	/**
	 * 
	 */
	public DemoDeSerialize() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      List arrayOfObjects = getSavedRoomObject();
      
      for (Iterator iterator = arrayOfObjects.iterator(); iterator.hasNext();) {
		Object object = (Object) iterator.next();
		System.out.println(object.toString());
		
		
	}
	}

	private static List getSavedRoomObject() {
		// TODO Auto-generated method stub
		List arrayOfObjects = new ArrayList();
		try{
			  FileInputStream fos = new FileInputStream("room.sav");
		      ObjectInputStream oos = new ObjectInputStream(fos);
		     
		      
		      
		      Object o = oos.readObject();
		      
		      while(o != null){
		    	  arrayOfObjects.add(o);
		    	  o = oos.readObject();
		      }
		      
		      
		      
		      
			}catch(EOFException e){
				System.out.println("Completed!!");
			}catch(Exception e){
				System.out.println(e);
			}
		return arrayOfObjects;
	}

}
