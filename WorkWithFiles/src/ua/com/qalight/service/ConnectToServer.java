package ua.com.qalight.service;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Date;

import ua.com.qalight.entity.EntityObj;

public class ConnectToServer {
	
	private static final String OBJ_FINAL_PATH = 
			System.getProperty("user.dir") + 
			System.getProperty("file.separator") +
			"files" +
			System.getProperty("file.separator") +
			"entity.obj";
	
		  
	    public static void writeObjectToFile(EntityObj entityObj) {
	          
	        Date date =  new Date();
	        
	        try{
	        	FileOutputStream fileOutputStream = new FileOutputStream(OBJ_FINAL_PATH);
	        	ObjectOutputStream datetxt = new ObjectOutputStream();
	        	
	        	
	        	
			} catch (IOException e) {
				e.printStackTrace();
	    
			}
	    }
	


