import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class CustomRegex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileReader fstream = null;
		try {
			fstream = new FileReader("C:\\full_FetchDVPortsResponse.txt");

			  BufferedReader br = new BufferedReader(fstream);
			  String strLine = null;
			  String start = "<connectedEntity";
			  String end = "</connectedEntity>";
			  
			  while ((strLine = br.readLine()) != null) {
			 
				  if(start.equalsIgnoreCase(strLine)){
					  System.out.print(strLine);
					  while ((strLine = br.readLine()) != null) {
						  
						  if(end.equalsIgnoreCase(strLine)){
							  System.out.println(strLine);
							  break;
						  }
						  System.out.print(strLine);
						  
						  
					  }
					
				  }
				 
				  
			  }
			  
				
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 
		 

	}

}
