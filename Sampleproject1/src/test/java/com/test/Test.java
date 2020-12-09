package com.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;

public class Test {

	// protected Locale defaultLocale = Locale.getDefault();

	// protected ResourceBundle rb = ResourceBundle.getBundle("sample",
	// defaultLocale);

	public static void main(String[] args) {

		String fileName = "F:/LOGS/SAMPLE/KTR/newFile.txt";
        //String content = "hello world!";
        
        try {

           
            //Files.write(Paths.get(fileName),content.getBytes(StandardCharsets.UTF_8));

        	  File file = new File(fileName);

              
              if (file.createNewFile()) {
                  System.out.println("File is created!");
              } else {
                  System.out.println("File already exists.");
              } 
              
             
        } catch (IOException e) {
            e.printStackTrace();
        }

	}
}
