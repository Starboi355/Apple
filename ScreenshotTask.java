package org.tcs;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotTask {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.moneycontrol.com/markets/fno-market-snapshot");
		
		driver.manage().window().maximize();
		
		WebElement table = driver.findElement(By.xpath("(//div[@class='clearfix PL15 PR15 PT10 PB20'])[1]"));
		
		File screenshot = table.getScreenshotAs(OutputType.FILE);
		
	    File f = new File("C:\\ScreenShot\\money.png");
	    
	    FileUtils.copyFile(screenshot, f);
	     
	     driver.close();
	     
	}
	
}
