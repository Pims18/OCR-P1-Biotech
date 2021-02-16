package com.hemebiotech.analytics; 

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
/**
 *  ceci est la class principal  qui va lancer le programme elle indique les methodes a suivre pour obtenir une liste
 *  avec tous les symptoms et leur occurances
 *  cette methode utilise et instanci la methode "ReadDataFromFile" et l'inteface IsymptomeReader
 *  cette methode utilise et instanci la methode "WriteDataFromeFile" et l'interface Isymptomewriter 
 * @author pims
 *
 */
public class AnalyticsCounter {
    /**
     * 
     * @param args
     * @throws Exception 
     */

	public static void main(String args[]) throws Exception { // 
            //ISymptomReader lecteursymptomes = null;
		try {//chemin d'acceés pas bon chemin relatif //nomenclature 
                    ISymptomReader lecteursymptomes = new ReadSymptomDataFromFile("data/symptoms.txt");
			List<String> symptomes = lecteursymptomes.getSymptoms();// methode qui retourne une liste avec tous les symptomes
				
				
			HashMap<String, Integer> nbrCas = new HashMap<String, Integer>(); //dictionnaire associatif clé(string)/valeur(integer) 
					
			for (String str : symptomes) {//parcour la liste de symptome
                            /**
                             * 
                             */
				if (nbrCas.containsKey(str)) { //si ma clé existe deja 
					nbrCas.put(str, nbrCas.get(str)+1);//defini a ma clé ca valeur +1 
				} else {
					nbrCas.put(str, 1);//sinon j'ajoute la clé et je met a 1
				}
			}
			
			ISymptomWriter writersymptomes = new WriteSymptomDataFromFile();
			writersymptomes.writeSymptome(nbrCas);
                        /**
                         * 
                         */
			
		 }catch (FileNotFoundException e) {//si il y a une erreur java on essaye d'attrap l'erreur
				System.out.println("Fichier non trouvé");//message affiché si erreur filenotfound
		 }catch (IOException e) {
			    System.out.println("Fichier non trouvé");//message affiché si erreur ioexception
		 }catch (Exception e) {
				System.out.println(e.getMessage());//message affiché si autre erreur
		 }
	 }		
}

