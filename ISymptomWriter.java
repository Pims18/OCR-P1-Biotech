package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.HashMap;
//cette class est une interface d'ecriture , elle nous indique la methode a utilis� 
    public interface ISymptomWriter {
        /**
         * 
         * @param nbrCas
         * @throws IOException 
         */
	public void writeSymptome(HashMap<String, Integer> nbrCas) throws IOException;
    
}
