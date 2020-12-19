package analytics;

import java.io.IOException;
import java.util.HashMap;

public interface ISymptomwriter {
	public void writesymptome(HashMap<String, Integer> nbrCas) throws IOException;
    
}
