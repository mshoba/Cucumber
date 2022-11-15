package com.amazon.stepsdef;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MobileSteps {
	static WebDriver driver;
	
	@Given("User needs to login amazon")
	public void user_needs_to_login_amazon() {
		 WebDriverManager.chromedriver().setup();
	     driver = new ChromeDriver();
		 driver.get("https://www.amazon.in/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   
	}


	@When("user can search mobile")
	public void user_can_search_mobile() {
		WebElement mobilesearch = driver.findElement(By.xpath("//input[@type='text']"));
		mobilesearch.sendKeys("samsung mobile");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	   
	}
	String mob;
	@When("user can search mobile with onedime list")
	public void user_can_search_mobile_with_onedime_list(DataTable dataTable) {
		List <String> mobname = dataTable.asList();
		mob = mobname.get(1);
		WebElement mobilesearch1 = driver.findElement(By.xpath("//input[@type='text']"));
		
		mobilesearch1.sendKeys(mob);
		driver.findElement(By.xpath("//input[@type='submit']")).click(); 
		driver.navigate().back();
	}
	

	@When("user can choose the mobile")
	public void user_can_choose_the_mobile() {
		System.out.println("User can choose mobile");
	    	}

	@When("user doing payment")
	public void user_doing_payment() {
		
		
		System.out.println("Window handling");
	}

	@Then("user receives confirmation information")
	public void user_receives_confirmation_information() {
		System.out.println("_______");
	     
	}
	@When("user can search mobile with onedime map")
	public void user_can_search_mobile_with_onedime_map(DataTable dataTable) {
		Map <String,String> mp =dataTable.asMap(String.class, String.class); 
		String mob1 = mp.get("phone2");
		WebElement mobilesearch1 = driver.findElement(By.xpath("//input[@type='text']"));
		
		mobilesearch1.sendKeys(mob1);
		driver.findElement(By.xpath("//input[@type='submit']")).click(); 
		driver.navigate().back();
	}

	@When("user can search mobile {string}")
	public void user_can_search_mobile(String string) {
	    
		String mob2 = string;
		WebElement mobilesearch1 = driver.findElement(By.xpath("//input[@type='text']"));
		
		mobilesearch1.sendKeys(mob2);
		driver.findElement(By.xpath("//input[@type='submit']")).click(); 
		driver.navigate().back();
		
	}

}
