package parser;

import filehandle.FileLoader;
import filehandle.ResultWriter;

public class SurveyParser {
	
	public static void main(String[] args) {
		FileLoader loader = new FileLoader(1);
		ResultWriter writer = new ResultWriter();
		
		for (int i = 1; i <= 74; i++) {
			loader = new FileLoader(i);
			writer.writeResultFile(loader.loadFile());
		}
	}

}
