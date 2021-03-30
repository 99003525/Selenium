import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Demotest {
	   // Webdriver is an interface , Chromedriver is a class
	WebDriver driver;
	
	@Test(priority = 1,description = "launch the page") 
	public void launch() {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Training\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe");
		driver=new FirefoxDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login"); 
	}
	
	@Test(priority = 2)
	public void login() throws InterruptedException {
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admi123");
		driver.findElement(By.id("btnLogin")).click();

		}
	
	@Test(priority = 4,enabled=true)// enabled : decide if u wanna run the mehtod or nt
	public void leave() throws InterruptedException {
	driver.findElement(By.id("menu_leave_viewLeaveModule")).click();
	Thread.sleep(500);
	}
	
	@Test(priority = 5,dependsOnMethods = "leave")// dependsonmethod : skips the logout if leave fails
	public void logout() {
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
	}
	
	@Test(priority = 3,alwaysRun = true)// true : always passes
	public void leavetry() throws InterruptedException {
	driver.findElement(By.id("menu_leave_viewLeaveModule")).click();
	Thread.sleep(500);
	}
	
	
}
