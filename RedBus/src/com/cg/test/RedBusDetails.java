package com.cg.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class RedBusDetails {
	private static WebElement element;
	public static WebElement viewSeats(WebDriver driver) {
		
		element=driver.findElement(By.xpath("//*[@id=\"4488356\"]/div/div[2]/div[1]"));
		return element;
	}
	public static WebElement selectSeat(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"rt_4488356\"]/div/div/div/div[2]/div[2]/div[2]/canvas"));

	    Actions builder = new Actions(driver);
	    builder.moveToElement(element,60,30).click().build().perform();
	    
		return element;
	}
	public static WebElement boardPoint(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//*[@id=\"4488356\"]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[1]/div[2]/div/div/div/div[1]/ul/li[1]/span[2]"));
		return element;
	}
	public static WebElement droppingPoint(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//*[@id=\"4488356\"]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[1]/div[2]/div/div/div/div[2]/ul/li[1]/span[2]"));
		return element;
	}
	public static WebElement proceed(WebDriver driver) {
		element=driver.findElement(By.xpath("//*[@id=\"4488356\"]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[6]/button"));
		return element;
	}
	public static WebElement name(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//*[@id=\"seatno-04\"]"));
		return element;
	}
	public static WebElement gender(WebDriver driver)
	{
		List<WebElement> gender = driver.findElements(By.name("Gender0"));
		gender.get(1).click();
		return element;
	}
	public static WebElement age(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//*[@id=\"seatno-01\"]"));
		return element;
	}
	public static WebElement mail(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//*[@id=\"seatno-05\"]"));
		return element;
	}

	public static WebElement mobileNum(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//*[@id=\"seatno-06\"]"));
		return element;
	}
}
