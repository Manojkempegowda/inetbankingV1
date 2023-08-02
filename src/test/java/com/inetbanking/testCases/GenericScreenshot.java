package com.inetbanking.testCases;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class GenericScreenshot {
	public void getphoto(WebDriver driver) throws IOException
	{
	String photo="./Screenshots";
	Date d=new Date();
	TakesScreenshot tss=(TakesScreenshot) driver;
	File src=tss.getScreenshotAs(OutputType.FILE);
	File dst=new File(photo+d+".jpeg");
	org.openqa.selenium.io.FileHandler.copy(src, dst);
	}
}
