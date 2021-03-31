package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {

	WebDriver driver;
	@Given("I will launch the chrome browser")
	public void i_will_launch_the_chrome_browser() {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/Driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}

	@Given("I will enter the url")
	public void i_will_enter_the_url() {
		//driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}

	@When("I enter the username")
	public void i_enter_the_username() {
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	}

	@When("I enter the passowrd")
	public void i_enter_the_passowrd() {
		driver.findElement(By.id("txtPassword")).sendKeys("admi123");
	    
	}

	@When("I click on login button")
	public void i_click_on_login_button() {
		driver.findElement(By.id("btnLogin")).click();
	}

	@Then("I should see the home page")
	public void i_should_see_the_home_page() {
	    
	}
	
}
