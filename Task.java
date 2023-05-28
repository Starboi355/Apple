package org.tcs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
        driver.get("http://www.greenstechnologys.com/");
        
		driver.manage().window().maximize();
		
		WebElement course = driver.findElement(By.xpath("//a[text()='COURSES']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(course).perform();
		
		WebElement blueprism = driver.findElement(By.xpath("//span[text()='Blue Prism Training']"));
		
		act.moveToElement(blueprism).perform();
		
	}
}
