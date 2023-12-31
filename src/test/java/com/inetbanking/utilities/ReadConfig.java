package com.inetbanking.utilities;

import java.io.File;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	
	public ReadConfig(){
		File src =new File("./Configuration/config.properties");
	
	try{
		FileInputStream fis=new FileInputStream(src);     // in properties file it is case sensitive use the value from property file
		pro=new Properties();
		pro.load(fis);									// to load the file
	}catch (Exception e) {
		System.out.println("Exception is "+ e.getMessage());
	}
	}
	
	public String geApplicationURL()
	{
		String url=pro.getProperty("baseURL");
		return url;		
	}
	public String getUsername() {
		String username=pro.getProperty("username");
		return username;
	}
	
	public String getPassword() {
		String password=pro.getProperty("password");
		return password;
		
	}
	public String getChromePath()
	{
		String chromepath=pro.getProperty("chromepath");
		return chromepath;
	}
	public String getFirefoxPath()
	{
		String firefoxpath=pro.getProperty("firefoxpath");
		return firefoxpath;
	}

}
