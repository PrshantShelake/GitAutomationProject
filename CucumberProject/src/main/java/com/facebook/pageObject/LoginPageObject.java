package com.facebook.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageObject {
	
	WebDriver driver;
	
	public void openUrl() {
		
		System.setProperty("chromedriver.chrome.driver", "E:\\\\prashant\\\\BMS\\\\software\\\\chromedriver_win32\\\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}
	
	public void enterUserName() {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("prashant@gmail.com");
	}
	
	public void enterPAssword() {
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("prashant@gmail.com");

	}
	
	public void loginButton() {
		driver.findElement(By.xpath("//button[@id='u_0_b']")).click();
	}
	

}
