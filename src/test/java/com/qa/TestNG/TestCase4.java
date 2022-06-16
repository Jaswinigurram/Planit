package com.qa.TestNG;
import java.text.DecimalFormat;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase4 {
	@Test
	public void price() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Raja Chekuri\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jupiter2.cloud.planittesting.com/#/shop");
		WebElement Buy1 = driver.findElement(By.xpath("//*[@id=\"product-2\"]/div/p/a"));
		System.out.println(Buy1.isDisplayed());
		Buy1.isEnabled();
		Buy1.click();
		Buy1.click();
		Thread.sleep(2000);
		WebElement Buy2 = driver.findElement(By.xpath("//*[@id=\"product-4\"]/div/p/a"));
		System.out.println(Buy2.isDisplayed());
		Buy2.isEnabled();
	    int i;
	    for(i=0;i<=4;i++)
	    {
		Buy2.click();
		}
	    Thread.sleep(2000);
	    WebElement Buy3 = driver.findElement(By.xpath("//*[@id=\"product-7\"]/div/p/a"));
		System.out.println(Buy3.isDisplayed());
		Buy3.isEnabled();
	    for(i=0;i<=2;i++)
	    {
		  Buy3.click();
	    }
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"nav-cart\"]")).click();
	    java.util.List<WebElement> element = driver.findElements(By.xpath("//*[@id=\"nav-cart\"]/a"));
	    driver.findElement(By.xpath("//*[@id=\"nav-cart\"]/a")).equals("There are 10 items in your cart");
	    System.out.println("10 items in the cart");
	    
	    String item ="/html/body/div[2]/div/form/table/tbody/tr[1]/td[1]";
	    String value ="/html/body/div[2]/div/form/table/tbody/tr[1]/td[2]";
	    String text=driver.findElement(By.xpath(item)).getAttribute("title");
	    System.out.println(text);
	    String price=driver.findElement(By.xpath(value)).getText();
	    System.out.println(price);
	    
		DecimalFormat df = new DecimalFormat("$0.00");
		
	    System.out.println("the price is "+df.format(price));
	    
	    
	    String item1 ="/html/body/div[2]/div/form/table/tbody/tr[2]/td[1]";
	    String value1 ="/html/body/div[2]/div/form/table/tbody/tr[2]/td[2]";
	    String text1 = driver.findElement(By.xpath(item1)).getAttribute("title1");
	    System.out.println(text1);
	    String price1=driver.findElement(By.xpath(value1)).getText();
	    System.out.println(price1);
	    System.out.println("the price is "+df.format(price));
	    
	   
	    String item2 ="/html/body/div[2]/div/form/table/tbody/tr[3]/td[1]";
	    String value2 ="/html/body/div[2]/div/form/table/tbody/tr[3]/td[2]";
	    String text2 = driver.findElement(By.xpath(item2)).getAttribute("title2");
	    System.out.println(text2);
	    String price2=driver.findElement(By.xpath(value2)).getText();
	    System.out.println(price2);
	    System.out.println("the price is "+df.format(price));
	    

	   
	    
	    String terms = driver.findElement(By.xpath(("/html/body/div[2]/div/form/table/tbody/tr[1]"))).getText();
	    String [] temp_xy = terms.split("X");
	    double multiplicand = Double.parseDouble(temp_xy[0].trim());
	    double multiplier = Double.parseDouble(temp_xy[1].trim());
	    double product = multiplicand * multiplier;
	    System.out.println("product is "+product);
	  
	  String terms1 = driver.findElement(By.xpath(("/html/body/div[2]/div/form/table/tbody/tr[2]"))).getText();
	  String [] temp_yz = terms.split("Y");
	  double multiplicand1 = Double.parseDouble(temp_xy[0].trim());
	  double multiplier1 = Double.parseDouble(temp_xy[1].trim());
	  double product1 = multiplicand * multiplier; 
	  System.out.println("product is "+product1);
	  
	  String terms2 = driver.findElement(By.xpath(("/html/body/div[2]/div/form/table/tbody/tr[3]"))).getText();
	  String [] temp_zx = terms.split("Z");
	  double multiplicand2 = Double.parseDouble(temp_xy[0].trim());
	  double multiplier2 = Double.parseDouble(temp_xy[1].trim());
	  double product2 = multiplicand * multiplier; 
	  System.out.println("product is "+product2);
	  
	  double total = product * product1 * product2;
	  System.out.println("total is  "+df.format(total));
	}
}