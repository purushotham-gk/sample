package competation;

public class MyArrayList
{
	
	final private int DEFAULT_SIZE = 10;
	Object[] objArray = null;
	
	
	public MyArrayList(){
		this.objArray = new Object[DEFAULT_SIZE];
	}
	
	public boolean add(Object o){
		for(int i = 0; i< this.objArray.length; i++){
			if(this.objArray[i] == null){
				this.objArray[i] = o; 
				return true;
			}
			
		}
		
		//Once its full
		Object[] tempArray = new Object[this.objArray.length + 1];
		for(int i = 0 ; i<=tempArray.length; i++ ){
			if(this.objArray.length > i && this.objArray[i] != null){
				tempArray[i] = this.objArray[i]; 
				//System.out.println(i);
			}
			else {
				tempArray[i] = o;
				this.objArray = tempArray;
				return true;
			}
			
		}
		
		return false;
	}
	
	public Object get(int i){
		return this.objArray[i];
	}
	
	public int getSize(){
		int count = 0; 
		for(int i=0; i< this.objArray.length; i++){
			if(this.objArray[i]!= null){
				count++;
				
			}
		}
		 return count;
	}

}
