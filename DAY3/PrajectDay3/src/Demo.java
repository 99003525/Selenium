import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Demo {
	@Test
	public void login() throws InterruptedException{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Training\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.name("txtUsername")).sendKeys("Trial");
		Thread.sleep(500);
		driver.findElement(By.id("txtPassword")).sendKeys("password");
		Thread.sleep(500);
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(500);
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		Thread.sleep(500);
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		Thread.sleep(500);
		driver.findElement(By.id("btnLogin")).click();
	}
}
