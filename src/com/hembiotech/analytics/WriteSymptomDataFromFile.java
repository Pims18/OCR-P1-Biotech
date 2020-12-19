package com.hembiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class WriteSymptomDataFromFile implements ISymptomwriter {

		@Override
		public void writesymptome(HashMap<String, Integer> nbrCas) throws IOException {
			FileWriter writer = new FileWriter ("result.out");
			
			TreeMap<String, Integer> tm=new  TreeMap<String,Integer> (nbrCas);  
			
			
			System.out.println("Liste des symptomes : nombres de cas ");
			for(Map.Entry<String, Integer> entry : tm.entrySet()) {
				System.out.print(entry.getKey());// ln est retirer pour l'affichage
				System.out.print(" : ");
				System.out.println(entry.getValue());// ceci est pour avoir la valeur
			    
				writer.write(entry.getKey() + ":"+ entry.getValue() + "\n");
			}
			// next generate output
			
			 writer.close();	// TODO Auto-generated method stub
			
		}

}
