package de.Tunfisch.GUI;

public class ApplicationVersion {

	String devVersionnumber = "1.5.1.2 [Console-output]";
	String userVersionnumber = "RELEASE 1.0";
	String author = "Marco Rohn";
	String language = "DE";
	
	public String getVersionnumber(){
		return userVersionnumber;
	}
	public String getAuthor(){
		return author;
	}
	public String getLang(){
		return language;
	}
}