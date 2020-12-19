package com.hembiotech.analytics; 

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class AnalyticsCounter {

	public static void main(String args[]) throws Exception { 
		try {
			ISymptomReader lecteursymptomes = new ReadSymptomDataFromFile("C:/Users/pims/Desktop/Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application-master/Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application-master/Project02Eclipse/symptoms.txt");
			List<String> symptomes = lecteursymptomes.GetSymptoms();
				
				
			HashMap<String, Integer> nbrCas = new HashMap<String, Integer>(); 
					
			for (String str : symptomes) {
				if (nbrCas.containsKey(str)) { 
					nbrCas.put(str, nbrCas.get(str)+1);
				} else {
					nbrCas.put(str, 1);//
				}
			}
			ISymptomwriter writersymptomes = new WriteSymptomDataFromFile();
			writersymptomes.writesymptome(nbrCas);
		
			
		 } catch (FileNotFoundException e) {
				System.out.println("Fichier non trouvé");
		 } catch (IOException e) {
			    System.out.println("Fichier non trouvé");
		 } catch (Exception e) {
				System.out.println(e.getMessage());
		 }
	 }		
}

