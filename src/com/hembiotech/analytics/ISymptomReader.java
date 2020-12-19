package com.hembiotech.analytics;

import java.io.IOException;
import java.util.List;


public interface ISymptomReader {// ceci est une interface
	List<String> GetSymptoms () throws IOException;
}
