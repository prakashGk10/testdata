package com.adactin.helper;

import java.io.IOException;

public class FileReaderManager {

	
	private FileReaderManager() {
		
		
	}
	public static FileReaderManager getinstance() {
    FileReaderManager frm = new FileReaderManager();
    return frm;
    
    
	}
	public ConfigurationReader GetCrInstance() throws IOException {
    ConfigurationReader cr = new ConfigurationReader();
    return cr;
	}
	
}
