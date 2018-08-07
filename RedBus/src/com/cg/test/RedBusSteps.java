package com.cg.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RedBusSteps {
	WebDriver driver;
	@Given("^The homePage of RedBus is displayed$")
	public void the_webpage_of_RedBus_is_loaded() throws Throwable {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
	}

	@When("^\"([^\"]*)\" and \"([^\"]*)\" are provided$")
	public void and_are_provided(String arg1, String arg2) throws Throwable {
		HomePage.source(driver).sendKeys(arg1);
		Thread.sleep(2000);
		HomePage.source(driver).sendKeys(Keys.ENTER);
		HomePage.destination(driver).sendKeys(arg2);
		Thread.sleep(2000);
		HomePage.destination(driver).sendKeys(Keys.ENTER);
	}

	@When("^Date of journey is selected$")
	public void selecting_journey_date_is_provided() throws Throwable {
				Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[6]/td[5]")).click();
		driver.findElement(By.id("search_btn")).click();
	}


	@Then("^Select seat to book ticket$")
	public void book_ticket_for_the_corresponding_details() throws Throwable {
		Thread.sleep(2000);
	   RedBusDetails.viewSeats(driver).click();
	   Thread.sleep(4000);
	   RedBusDetails.selectSeat(driver);
	   Thread.sleep(4000);
	  RedBusDetails.boardPoint(driver).click();
	  Thread.sleep(2000);
	  RedBusDetails.droppingPoint(driver).click();
	  Thread.sleep(2000);
	  RedBusDetails.proceed(driver).click();
	}

@Then("^Enter details of the person$")
public void enter_person_details() throws Throwable {
	Thread.sleep(2000);
	RedBusDetails.name(driver).sendKeys("Sravs");
  RedBusDetails.gender(driver);
  RedBusDetails.age(driver).sendKeys("21");
  RedBusDetails.mail(driver).sendKeys("sravs96@gmail.com");
  RedBusDetails.mobileNum(driver).sendKeys("9876543219");
  //driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[4]/div/div/div[2]/div[2]/input")).click();
}




}
