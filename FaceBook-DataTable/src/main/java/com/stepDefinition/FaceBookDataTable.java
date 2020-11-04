package com.stepDefinition;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FaceBookDataTable {

	public WebDriver driver;

	@Given("^user should enter the url$")
	public void user_should_enter_the_url() throws Throwable {
		Thread.sleep(2000);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\FaceBook-DataTable\\"
				+ "chrome3\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

	}

	@When("^title of the page is facebook$")

	public void title_of_the_page_is_facebook() throws Throwable {
		Thread.sleep(2000);
		String title = driver.getTitle();

		System.out.println(title);
		Assert.assertEquals("Facebook – log in or sign up", title);

	}

	@Then("^user should click on Create New Account$")
	public void user_should_click_on_Create_New_Account() throws Throwable {

		Thread.sleep(2000);
		WebElement element = driver.findElement(By.id("u_0_2"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);

		//*[@id='u_0_2']
	}

	@Then("^user should enter facebook details$")
	public void user_should_enter_facebook_registration_details(DataTable    facebookdetails) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)



		Thread.sleep(2000);
		List<List<String>>facebookValues =  facebookdetails.raw();
		driver.findElement(By.xpath("//*[@name='firstname']")) .sendKeys(facebookValues.get(0).get(0));
		driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys(facebookValues.get(0).get(1));
		driver.findElement(By.xpath("//*[@name='reg_email__']")).sendKeys(facebookValues.get(0).get(2));
		driver.findElement(By.xpath("//*[@name='reg_passwd__']")).sendKeys(facebookValues.get(0).get(3));

	}
	
	@Then("^Close the browser$")
	 public void close_the_browser() throws Throwable{
		Thread.sleep(2000);
		 driver.quit();
	 }
}
