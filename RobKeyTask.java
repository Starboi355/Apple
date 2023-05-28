package org.tcs;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobKeyTask {

	public static void main(String[] args) throws AWTException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement txtuser = driver.findElement(By.id("email"));
		 txtuser.sendKeys("Ahamed@123");
		
		Robot rob = new Robot();
		
		rob.keyPress(KeyEvent.VK_CONTROL);
		
		 rob.keyPress(KeyEvent.VK_A);
		 rob.keyRelease(KeyEvent.VK_A);
		 
		 rob.keyPress(KeyEvent.VK_C);
		 rob.keyRelease(KeyEvent.VK_C);
		 
		rob.keyRelease(KeyEvent.VK_CONTROL);
		
		 rob.keyPress(KeyEvent.VK_TAB);
		 rob.keyRelease(KeyEvent.VK_TAB);
		 
		rob.keyPress(KeyEvent.VK_CONTROL);
		
		 rob.keyPress(KeyEvent.VK_V);
		 rob.keyRelease(KeyEvent.VK_V);
		 
		rob.keyRelease(KeyEvent.VK_CONTROL);
				
	}
	
}
