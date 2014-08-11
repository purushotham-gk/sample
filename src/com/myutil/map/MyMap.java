package com.myutil.map;

public class MyMap {

  private final int DEFAULT_SIZE = 10; 
	private Object[] o = null; 
	
	public MyMap(){
		this.o = new Object[DEFAULT_SIZE];
		for(int i =0 ; i< DEFAULT_SIZE; i++){
			this.o[i] = new myEntry();
		}	
	}
	
	public void put(Object key, Object value){
		
		int pos = getIndex(key);
		myEntry entry = (myEntry)this.o[pos];
		
		if(entry.key == null && entry.value == null){
			//first entry
			entry.key = key;
			entry.value = value; 
			
			
		}
		
		
		
	}
	
	
	public Object get(Object key){
		int pos = getIndex(key);
		
		myEntry entry = (myEntry)this.o[pos];
		return entry.value;
	
		
	}
	
	private int getIndex(Object o){
		int hashCode = o.hashCode();
			return hashCode % this.o.length;
	}
	
}
