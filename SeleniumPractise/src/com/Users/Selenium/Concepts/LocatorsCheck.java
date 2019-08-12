package com.Users.Selenium.Concepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LocatorsCheck {
	public static void main(String[] args) throws Exception{
		
		System.setProperty("webdriver.chrome.driver", "lib/chromedriver2");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		WebElement firstNameEle = driver.findElement(By.xpath("//*[@id='u_0_q']"));
		
		WebDriverWait wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='u_0_q']")));
		
		js.executeScript("document.getElementByXPath('//div[@id='reg_form_box']/div[1]/div/div[1]/div[1]/div/input').value='saravanan'");
		
		//driver.findElement(By.xpath("//*[@id='u_0_q']")).sendKeys("saravanan");
//		driver.findElement(By.xpath("//*[@id='u_0_v']")).sendKeys("password123");
//		
//		WebElement dateEle = driver.findElement(By.xpath("//select[@id='day']")); 
//		
//		Select date = new Select(dateEle);
//		date.selectByIndex(1);
//		
		
	}

}
