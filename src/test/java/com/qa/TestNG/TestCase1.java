package com.qa.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase1{ 
	@Test
    public void Submit()
    {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Raja Chekuri\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://jupiter.cloud.planittesting.com/");
		driver.navigate().to("https://jupiter.cloud.planittesting.com/#/contact");
    }
		@Test
		public void submit()
		{
	    WebDriver driver = new ChromeDriver();
        driver.get("https://jupiter.cloud.planittesting.com/#/contact");
		WebElement Submit = driver.findElement(By.xpath("//a[@class='btn-contact btn btn-primary']"));
		System.out.println(Submit.isDisplayed());
		Submit.isEnabled();
		Submit.click();	
	    String first_element=driver.findElement(By.id("forename-err")).getText();
		String middle_element=driver.findElement(By.id("email-err")).getText();
		String last_element=driver.findElement(By.id("message-err")).getText();
		String expect="Forename is required";
        String Required="Email is required";
        String message="Message is required";
		Assert.assertEquals(first_element, expect);
		System.out.println("Forename is required");
		Assert.assertEquals(middle_element, Required);
		System.out.println("Email is required");
		Assert.assertEquals(last_element, message);
		System.out.println("Message is required");
		driver.findElement(By.id("forename")).sendKeys("jaswini");
		driver.findElement(By.id("email")).sendKeys("jaswini1997@gmail.com");
		driver.findElement(By.id("message")).sendKeys("Complete Assessment");
		System.out.println("errors are gone");
		}
		}
	

