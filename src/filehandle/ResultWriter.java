package filehandle;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;


public class ResultWriter {
	
	private String filename = "src/Files/out.csv";
	
	// Write the values to csv
	public void writeResultFile(List<String> values) {
		
		try{
    		
    		File file =new File(filename);
    		
    		//if file doesnt exists, then create it
    		if(!file.exists()){
    			file.createNewFile();
    		}
    		
    		//true = append file
    		FileWriter fileWritter = new FileWriter(filename,true);
	        BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
	        for (String value : values) {
	        	 bufferWritter.write(value);
	        	 bufferWritter.write(";");
			}
	        bufferWritter.write("\n");
	        bufferWritter.close();
    	    
	        System.out.println("Done");
	        
    	}catch(IOException e){
    		e.printStackTrace();
    	}
	}
}
