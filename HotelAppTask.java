package org.tcs;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HotelAppTask {
	
	public static void main(String[] args) throws AWTException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		Robot robot = new Robot();
		
	for (int i = 0; i < 3; i++) {
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
	}
	
		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
		
		 robot.keyPress(KeyEvent.VK_A);
		 robot.keyRelease(KeyEvent.VK_A); 
		 
		 robot.keyPress(KeyEvent.VK_H);
		 robot.keyRelease(KeyEvent.VK_H); 
		
		 robot.keyPress(KeyEvent.VK_A);
		 robot.keyRelease(KeyEvent.VK_A); 		
		
		 robot.keyPress(KeyEvent.VK_M);
		 robot.keyRelease(KeyEvent.VK_M); 
		
		 robot.keyPress(KeyEvent.VK_E);
		 robot.keyRelease(KeyEvent.VK_E); 
		
		 robot.keyPress(KeyEvent.VK_D);
		 robot.keyRelease(KeyEvent.VK_D); 
		 
		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
		robot.keyRelease(KeyEvent.VK_CAPS_LOCK); 
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		 robot.keyPress(KeyEvent.VK_1);
		 robot.keyRelease(KeyEvent.VK_1);
		
		 robot.keyPress(KeyEvent.VK_2);
		 robot.keyRelease(KeyEvent.VK_2);
		
		 robot.keyPress(KeyEvent.VK_3);
		 robot.keyRelease(KeyEvent.VK_3);	
		
		 
	}
}
