package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import org.junit.Assert;

public class OrangeHRMSteps {
   
	WebDriver driver;
	
	@Given("I launch chrome browser")
	public void i_launch_chrome_browser() {
		
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
	}

	@When("I open OrangeHRM home page")
	public void i_open_orange_hrm_home_page() {
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@Then("I verify that the logo present on page")
	public void i_verify_that_the_logo_present_on_page() {

		Boolean status = driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img")).isDisplayed();
        Assert.assertEquals(true,status);
	}
	
	@When("Enter username and password")
	public void enter_username_and_password() {
		driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
	}
	
	@When("Enter username {string} and password {string}")
	public void enter_username_and_password(String user, String pwd) {
        driver.findElement(By.name("username")).sendKeys(user);
        driver.findElement(By.name("password")).sendKeys(pwd);
    }
	
	@When("Enter username and password from Data Table")
	public void enter_username_and_password_from_Data_Table(DataTable credentials) {

	     List<List<String>>  data= credentials.asLists(String.class);

	        driver.findElement(By.id("txtUsername")).sendKeys(data.get(0).get(0));
	        driver.findElement(By.id("txtPassword")).sendKeys(data.get(0).get(1));
	    }


	@When("Click on login button")
	public void click_on_login_button() {
		driver.findElement(By.id("btnLogin")).click();
	}

	@Then("User must successfully login to the Dashboard page")
	public void user_must_successfully_login_to_the_dashboard_page() {
		String text=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/h1")).getText();
        Assert.assertEquals(text,"Dashboard");
	}


	@Then("Close browser")
	public void close_browser() {

		driver.close();
	}

}
