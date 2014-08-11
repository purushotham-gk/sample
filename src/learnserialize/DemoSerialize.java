/**
 * 
 */
package learnserialize;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

/**
 * @author pkondappa
 *
 */
public class DemoSerialize {

	/**
	 * 
	 */
	public DemoSerialize() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Room r = new Room();
		r.setACFitted(false);
		r.setBedType("Coir");
		r.setCotBoxType(false);
		r.setNoOfCloset(1);
		r.setNoOfWindows(3);
		r.setWoodenFloor(false);
		saveRoomObject(r);
	}

	private static void saveRoomObject(Room r) {
		// TODO Auto-generated method stub
		
		if(r instanceof Serializable){
			try{
				  FileOutputStream fos = new FileOutputStream("room.sav");
			      ObjectOutputStream oos = new ObjectOutputStream(fos);
			      oos.writeObject(new Date());
			      oos.writeObject(r);
			      oos.close();
				}catch(Exception e){
					System.out.println(e);
				}
		}
		
		if(r instanceof Cloneable){
			try {
				Room r1 = (Room)r.clone();
				System.out.println(r.toString());
			} catch (CloneNotSupportedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		

	    
		
	}

}
