package com.qa.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase2 {
	@Test
	public void populate() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Raja Chekuri\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jupiter.cloud.planittesting.com/#/");
		Thread.sleep(2000);
		driver.navigate().to("https://jupiter.cloud.planittesting.com/#/contact");
		Thread.sleep(2000);
		driver.findElement(By.id("forename")).sendKeys("jaswini");
		driver.findElement(By.id("email")).sendKeys("jaswini1997@gmail.com");
		driver.findElement(By.id("message")).sendKeys("Complete Assessment");
		Thread.sleep(2000);
		WebElement Submit = driver.findElement(By.xpath("//a[@class='btn-contact btn btn-primary']"));
		System.out.println(Submit.isDisplayed());
		Submit.isEnabled();
		Submit.click();
		System.out.println("submission successful");
	}
}
