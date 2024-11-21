package com.sampletest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LoginTest {

	WebDriver driver;
	
    @Test
	public void Sample() throws InterruptedException
	     

	         {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");	
		driver = new ChromeDriver(); //ctl+shift+o to import package.
    	driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.name("login-button")).click();
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("logout_sidebar_link")).click();
 	
	         }
		
	}
	

