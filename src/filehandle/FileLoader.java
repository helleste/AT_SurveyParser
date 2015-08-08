package filehandle;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;



public class FileLoader {
	

	private String filename;
	
	public FileLoader(int filenumber) {
		this.filename = "src/Files/" + Integer.toString(filenumber) + ".txt";
		System.out.println(this.filename);
	}
	
	// Parse the file and return array of values
	public List<String> loadFile() {
		
		try {
			FileInputStream fstream = new FileInputStream(filename);
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in, "x-MacCentralEurope"));
			
			String strLine;
			List<String> values = new ArrayList<String>();
			
			// Read till you reach EOF
			while ((strLine = br.readLine()) != null) {
				if (strLine.startsWith("(text)")) {
					values.add(strLine.substring(7));
				}
			}
			
			// Close the input stream
			in.close();
			
			// Return list of instances
			for (String string : values) {
				System.out.println(string);
			}
			return values;
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			return null;
		}
	}
}
