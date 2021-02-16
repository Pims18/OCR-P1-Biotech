package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
/**
 * cette classe definie la methode que l'interface d'ecriture "isymptomewriter" 
 * elle nous indique la methode que le writer va utilisé pour ecrire le fichier result.out
 * @author pims
 *
 */
public class WriteSymptomDataFromFile implements ISymptomWriter{
/**
* 
* @param nbrCas
* @throws IOException 
*/
		public void writeSymptome(HashMap<String, Integer> nbrCas) throws IOException {//l'ecriture du fichier result avec le traitement des exeptions
			FileWriter writer = new FileWriter ("result.out");
			
			TreeMap<String, Integer> tm=new  TreeMap<String,Integer> (nbrCas);  // pour avoir les entré et valeur dans l'ordre alphabétique
			
			
			System.out.println("Liste des symptomes : nombres de cas ");// pour l'affichage 
                        /**
                         * 
                         */
			for(Map.Entry<String, Integer> entry : tm.entrySet()) {
				System.out.print(entry.getKey());// pour avoir la clé /ln est retirer pour l'affichage
				System.out.print(" : ");
				System.out.println(entry.getValue());//pour avoir la valeur  
			    
				writer.write(entry.getKey() + ":"+ entry.getValue() + "\n");
			}
			// next generate output
			
			 writer.close();	
			
		}

}
