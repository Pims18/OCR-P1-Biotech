package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;


public interface ISymptomReader {// ceci est une interface

    /**
     *
     * @return
     * @throws IOException
     */
    	List<String> getSymptoms () throws IOException;//ceci est la methode de l'interface

}
