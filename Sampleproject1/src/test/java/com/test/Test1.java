package com.test;

import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test1 {

	public static void main(String[] args) {
		
		 String path = getConfigBundle().getString("KTR_FILENAME_PATTERN1");
		    System.out.println("the value of path from properties file : " + path);
		    String actualPath = resolveEnvVars(path);
		    System.out.println("Actual Path : " + actualPath);

	}
	
	private static ResourceBundle getConfigBundle() {
	    return ResourceBundle.getBundle("sample");
	 }

	
	private static String resolveEnvVars(String input) {
	    if (null == input) {
	        return null;
	     }

	    Pattern p = Pattern.compile("\\$\\{(\\w+)\\}|\\$(\\w+)");
	    Matcher m = p.matcher(input);
	    StringBuffer sb = new StringBuffer();
	    while (m.find()) {
	        String envVarName = null == m.group(1) ? m.group(2) : m.group(1);
	        String envVarValue = System.getenv(envVarName);
	       // m.appendReplacement(sb, null == envVarValue ? "" : envVarValue);
	        m.appendReplacement(sb, 
	        	    null == envVarValue ? "" : Matcher.quoteReplacement(envVarValue));
	     }
	    m.appendTail(sb);
	    return sb.toString();
	  }

}
