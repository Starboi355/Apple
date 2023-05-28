package org.tcs;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day3Task {
	
	public static void main(String[] args) throws AWTException {
		
	  WebDriver driver = new ChromeDriver();
		
//	Task 1 - Amazon 
	  
//		driver.get("https://www.amazon.in/");
//		
//		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
//		 search.sendKeys("Iphone",Keys.ENTER);
		
//	Task 2 - FaceBook	
		
//		driver.get("https://www.facebook.com/");
//		 
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Ahamed@123");
//		 
//		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("5846"); 
//		 
//		driver.findElement(By.xpath("//button[@value='1']")).click();
		
// 	Task 3 - AutomationTesting	 
		 
//		driver.get("http://demo.automationtesting.in/Register.html"); 
//		
//		driver.manage().window().maximize();
//		
//        Robot rob = new Robot();
//		
//		rob.keyPress(KeyEvent.VK_TAB);
//		
//		for (int i = 1; i <= 29; i++) {
//
//			rob.keyPress(KeyEvent.VK_TAB);
//            rob.keyRelease(KeyEvent.VK_TAB);
//						
//		}
//		
//		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Ahamed");
//		 rob.keyPress(KeyEvent.VK_TAB);
//         rob.keyRelease(KeyEvent.VK_TAB);
//		 
//		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Ibrahim.M"); 
//		 rob.keyPress(KeyEvent.VK_TAB);
//         rob.keyRelease(KeyEvent.VK_TAB); 
//		
//		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("3840,54th cross street, Semmancherry, Chennai - 119");
//		 rob.keyPress(KeyEvent.VK_TAB);
//         rob.keyRelease(KeyEvent.VK_TAB); 
//		
//		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("iahamed355@gmail.com");
//		 rob.keyPress(KeyEvent.VK_TAB);
//         rob.keyRelease(KeyEvent.VK_TAB);
//		 
//		WebElement phone = driver.findElement(By.xpath("//input[@type='tel']"));
//		 phone.sendKeys("7448760620");
//		 
//		 rob.keyPress(KeyEvent.VK_TAB);
//         rob.keyRelease(KeyEvent.VK_TAB);
//		
//        WebElement gender = driver.findElement(By.name("radiooptions"));
//         gender.click();
//         
//         rob.keyPress(KeyEvent.VK_TAB);
//         rob.keyRelease(KeyEvent.VK_TAB);
//        
//        WebElement chkbox = driver.findElement(By.id("checkbox2")); 
//         chkbox.click();
//         
//         rob.keyPress(KeyEvent.VK_TAB);
//         rob.keyRelease(KeyEvent.VK_TAB);
//         rob.keyPress(KeyEvent.VK_TAB);
//         rob.keyRelease(KeyEvent.VK_TAB);
//         rob.keyPress(KeyEvent.VK_ENTER);
//         rob.keyRelease(KeyEvent.VK_ENTER);
//                                
//        WebElement skills = driver.findElement(By.id("Skills"));
//         skills.sendKeys("Java");
//            
//         rob.keyPress(KeyEvent.VK_TAB);
//         rob.keyRelease(KeyEvent.VK_TAB);
//         rob.keyPress(KeyEvent.VK_ENTER);
//         rob.keyRelease(KeyEvent.VK_ENTER);
//         
//        WebElement year = driver.findElement(By.id("yearbox"));
//         year.sendKeys("2000");
//         
//         rob.keyPress(KeyEvent.VK_TAB);
//         rob.keyRelease(KeyEvent.VK_TAB);
//         rob.keyPress(KeyEvent.VK_ENTER);
//         rob.keyRelease(KeyEvent.VK_ENTER);
//         
//        WebElement month = driver.findElement(By.xpath("//select[@placeholder='Month']"));
//         month.sendKeys("August");
//         
//        WebElement day = driver.findElement(By.xpath("//select[@placeholder='Day']"));
//         
//        rob.keyPress(KeyEvent.VK_TAB);
//        rob.keyRelease(KeyEvent.VK_TAB);
//        rob.keyPress(KeyEvent.VK_ENTER);
//        rob.keyRelease(KeyEvent.VK_ENTER);
//        
//        Select select3 = new Select(day); 
//         select3.selectByIndex(21);
//         
//         rob.keyPress(KeyEvent.VK_TAB);
//         rob.keyRelease(KeyEvent.VK_TAB); 
//         
//        WebElement pass2 = driver.findElement(By.id("firstpassword"));
//         pass2.sendKeys("Ahamed@123");
//          
//         rob.keyPress(KeyEvent.VK_TAB);
//         rob.keyRelease(KeyEvent.VK_TAB);
//          
//         WebElement pass3 = driver.findElement(By.id("secondpassword"));
//          pass3.sendKeys("Ahamed@123");
//           
//         WebElement btn = driver.findElement(By.id("submitbtn"));
//          btn.click();
          
//    Task 4 - Practice Form
          
//		driver.get("http://toolsqa.com/automation-practice-form/"); 
		 
//	  Task 5 - GreensTech
		 
		driver.get("http://greenstech.in/selenium-course-content.html"); 
		 
		driver.findElement(By.xpath("//h2[@class='title mb-0 center']")).click();
		
		driver.findElement(By.xpath("//a[text()='CTS Interview Question ']")).click();
		
		 
		 
		 
		 
		 
		 
		 
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
