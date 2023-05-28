package org.tcs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2Task {
	
	public static void main(String[] args) {
		
	WebDriver drive = new ChromeDriver();
		
//		Task 1 - FaceBook
		
//         drive.get("https://www.facebook.com/");
//		
//		WebElement txtuser = drive.findElement(By.id("email"));
//		 txtuser.sendKeys("Ahamed@123");
//		 
//		WebElement txtpass = drive.findElement(By.id("pass"));
//		 txtpass.sendKeys("Password123");
		
//		Task 2 - RedBus
		
//		drive.get("https://www.redbus.in/");
//		
//		WebElement txtfrom = drive.findElement(By.className("db"));
//		 txtfrom.sendKeys("chennai");
//
//		
//		WebElement txtto = drive.findElement(By.id("dest")); 
//		 txtto.sendKeys("Mumbai");
		
//		Task 3 - Google
		
//		drive.get("https://www.google.com/");
//		
//		WebElement entertxt = drive.findElement(By.name("q"));
//		 entertxt.sendKeys("Greens Technology");
		 
//		Task 4 - ICICI Bank (Due to security reason right click isn't allowed)
		
//		drive.get("https://infinity.icicibank.com/corp/Login.jsp");
//		 
//		drive.switchTo().frame(3);
//		
//		 WebElement user = drive.findElement(By.xpath("//input[@name='AuthenticationFG.USER_PRINCIPAL']"));
//		  user.sendKeys("Ahamed");
		  
//	    Task 5 - HDFC Bank 
	
//        drive.get("https://netbanking.hdfcbank.com/");
//	
//        drive.switchTo().frame(0);
//        
//	   WebElement txtid = drive.findElement(By.xpath("//input[@class='form-control text-muted']"));
//	    txtid.sendKeys("Ahamed5846");
	    
//      Task 6 - Swiggy	     
	
//	    drive.get("https://www.swiggy.com/");
//	      
//	    WebElement txtlocation = drive.findElement(By.id("location"));
//	    txtlocation.sendKeys("Sholinganallur");
	    
//	    Task 7 - SnapDeal
	
//	    drive.get("https://www.snapdeal.com/login");
//	    
//	    WebElement txtuser = drive.findElement(By.id("userName"));
//	     txtuser.sendKeys("8925217794");
	     
//	    Task 8 - Instagram (Exception)
	
//	    drive.get("https://www.instagram.com/accounts/login/?hl=en) login page");
//
//	    WebElement txtusername = drive.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']"));
//	     txtusername.sendKeys("Star Boi");
//	    
//	    WebElement txtpass = drive.findElement(By.xpath("//input[@aria-label='Password']"));
//	     txtpass.sendKeys("74487@123");
	      
//      Task 9 - AutomationTesting	   
	
//	    drive.get("http://demo.automationtesting.in/Register.html");
//	
//	    WebElement txtaddress = drive.findElement(By.xpath("//textarea[@ng-model='Adress']"));
//	     txtaddress.sendKeys("Chennai - 119");
	    
//	    Task 10 - Hotel App
	     
	    drive.get("http://adactinhotelapp.com/");
	    
	    WebElement txtuser = drive.findElement(By.id("username"));
	     txtuser.sendKeys("Chris@123");
	
	    WebElement txtpass = drive.findElement(By.id("password"));
	     txtpass.sendKeys("@123456"); 
	         
  }
}
