package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/*import ISymptomReader.java;*/
/**
 * cette classe indique la methode a utilise pour l'interface
 * @author pims
 *
 */
public class ReadSymptomDataFromFile implements ISymptomReader{
   
	private String filepath;
	
    /**
     *
     * @param filepath
     */
    public ReadSymptomDataFromFile (String filepath){
		this.filepath = filepath;
	}
	/**
         * 
         * @return
         * @throws IOException 
         */
        
	public List<String> getSymptoms() throws IOException {//cette methode retourne une liste qui vas contenire tous les symptomes et levé l'exeption
		ArrayList<String> result = new ArrayList<String>();
		
		if (filepath != null) {
			BufferedReader reader = new BufferedReader (new FileReader(filepath)); // lecture du fichier 
			String line = reader.readLine();//lecture du fichier
			
			while (line != null) {
				result.add(line);
				line = reader.readLine();
			}
			reader.close();
		}
		
		return result;
	}
}


	