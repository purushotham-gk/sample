/**
 * 
 */
package learnserialize;

import java.io.Serializable;

/**
 * @author pkondappa
 *
 */
public class Room implements Serializable,Cloneable{
	
	
	private boolean isWoodenFloor; 
	private boolean isCotBoxType; 
	private boolean isACFitted;
	private String bedType; 
	private Integer noOfWindows; 
	private Integer noOfCloset; 

	/**
	 * 
	 */
	public Room() {
		// TODO Auto-generated constructor stub
		
	
		
	}

	public boolean isWoodenFloor() {
		return isWoodenFloor;
	}

	public boolean isCotBoxType() {
		return isCotBoxType;
	}

	public boolean isACFitted() {
		return isACFitted;
	}

	public String getBedType() {
		return bedType;
	}

	public Integer getNoOfWindows() {
		return noOfWindows;
	}

	public Integer getNoOfCloset() {
		return noOfCloset;
	}

	public void setWoodenFloor(boolean isWoodenFloor) {
		this.isWoodenFloor = isWoodenFloor;
	}

	public void setCotBoxType(boolean isCotBoxType) {
		this.isCotBoxType = isCotBoxType;
	}

	public void setACFitted(boolean isACFitted) {
		this.isACFitted = isACFitted;
	}

	public void setBedType(String bedType) {
		this.bedType = bedType;
	}

	public void setNoOfWindows(Integer noOfWindows) {
		this.noOfWindows = noOfWindows;
	}

	public void setNoOfCloset(Integer noOfCloset) {
		this.noOfCloset = noOfCloset;
	}
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
		}

}
