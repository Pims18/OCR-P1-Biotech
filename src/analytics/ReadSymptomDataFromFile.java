package analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadSymptomDataFromFile implements ISymptomReader  {

	private String filepath;
	

	public ReadSymptomDataFromFile (String filepath) {
		this.filepath = filepath;
	}
	

	public List<String> GetSymptoms() throws IOException {
		ArrayList<String> result = new ArrayList<String>();
		
		if (filepath != null) {
			BufferedReader reader = new BufferedReader (new FileReader(filepath));
			String line = reader.readLine();
			
			while (line != null) {
				result.add(line);
				line = reader.readLine();
			}
			reader.close();
		}
		
		return result;
	}

}
