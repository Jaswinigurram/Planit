package com.qa.TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestCase3 {
	private static final boolean True = false;
	@Test
	public void shop() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Raja Chekuri\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jupiter.cloud.planittesting.com/#/");
		Thread.sleep(2000);
		driver.navigate().to("https://jupiter.cloud.planittesting.com/#/shop");
		Thread.sleep(2000);
		WebElement Buy1 = driver.findElement(By.xpath("//*[@id=\"product-6\"]/div/p/a"));
		System.out.println(Buy1.isDisplayed());
		Buy1.isEnabled();
		Buy1.click();
		Buy1.click();
		WebElement Buy2 = driver.findElement(By.xpath("//*[@id=\"product-4\"]/div/p/a"));
		System.out.println(Buy2.isDisplayed());
		Buy2.isEnabled();
		Buy2.click();
		Thread.sleep(2000);
		driver.navigate().to("https://jupiter.cloud.planittesting.com/#/cart");
		java.util.List<WebElement> element = driver.findElements(By.xpath("//*[@id=\"nav-cart\"]/a"));
		driver.findElement(By.xpath("//*[@id=\"nav-cart\"]/a")).equals("There are 3 items in your cart");
	    System.out.println("3 items in the cart");
	}
	    boolean validateText(WebDriver driver1, WebElement element1, String expectedtext)
	    {
	    	String observedText = element1.getText();
	    	System.out.println(observedText);
	    	if(observedText.equals(expectedtext))
	    	{
	    	return True;
	    }
			return false;

}
}
