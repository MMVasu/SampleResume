package com.step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.github.dockerjava.api.model.Driver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageStepClass {

	public WebDriver driver;

	@Given("User should be in Adactin Login Page")
	public void tc01() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");

	}

	@When("User should Enter the {string}, and {string}")
	public void tc02(String User, String Pass) {
		WebElement textUser = driver.findElement(By.id("username"));
		textUser.sendKeys(User);
		WebElement textPass = driver.findElement(By.id("password"));
		textPass.sendKeys(Pass);

	}

	@When("User should Click the Login")
	public void tc03() {
		WebElement loginButton = driver.findElement(By.id("login"));
		loginButton.click();
	}

	@Then("User should verify login successfull message")
	public void tc04() {
    WebElement welcome= driver.findElement(By.xpath("//td[text()='Welcome to Adactin Group of Hotels']"));
    
    if (welcome.isDisplayed()) {
    	System.out.println(welcome.getText());
    	System.out.println("login successfull");
		
	}
	}
   
    @When("User should Enter the {string}, and {string},{string}")
    public void tc05(String locat, String hotels, String roomtype) {
    	
    	WebElement location = driver.findElement(By.id("location"));
    	Select s = new Select(location);
    	s.selectByValue("Melbourne");
    	
        
    WebElement hotel = driver.findElement(By.id("hotels"));
    Select s1 = new Select(hotel);
    s1.selectByValue("Hotel Sunshine");
    
    
    WebElement room = driver.findElement(By.id("room_type"));
    Select s2 = new Select(room);
    s2.selectByValue("Deluxe");

 
    }



       
	}


