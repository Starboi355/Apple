package org.tcs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActTask {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		
        driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		driver.manage().window().maximize();
		
		WebElement src = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		
		WebElement des = driver.findElement(By.xpath("(//li[@Class='placeholder']) [1]"));
		
		Actions acts = new Actions(driver);
		
		acts.dragAndDrop(src, des).perform();
		
		WebElement src2 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		
		WebElement des2 = driver.findElement(By.xpath("(//li[@Class='placeholder']) [1]"));
		
		acts.dragAndDrop(src2, des2).perform();
		
		WebElement src3 = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		
		WebElement des3 = driver.findElement(By.xpath("(//li[@Class='placeholder']) [1]"));
		
		acts.dragAndDrop(src3, des3).perform();
		
		WebElement src4 = driver.findElement(By.xpath("//a[text()=' 5000']"));
		
		WebElement des4 = driver.findElement(By.xpath("//li[@class='placeholder']"));
		
		acts.dragAndDrop(src4, des4).perform();
		
		WebElement txt = driver.findElement(By.xpath("//a[text()='Perfect!']"));
		
		String text = txt.getText();
		 System.out.println(text);
			
	}
}
