import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ibefpage {
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("working");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();   // Webdriver is an interface , Chromedriver is a class
		driver.get("https://www.ibef.org/ibefusers/signUpRequest");
		
		//driver.findElement(By.xpath("//*[@id=\"userSignUpForm\"]/div/div/div[1]/ul/li[1]/div/div/div/a")).click();
		//Thread.sleep(500);
		
		//Select salu= new Select(driver.findElement(By.className("jqTransformSelectOpen")));
		//salu.selectByIndex(2);
		
		driver.findElement(By.id("signupFname")).sendKeys("Sneha");
		Thread.sleep(500);
		
		driver.findElement(By.id("signupLname")).sendKeys("Anand");
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//*[@id=\"userSignUpForm\"]/div/div/div[2]/ul[1]/li/span[2]/span/a")).click();
		Thread.sleep(500);
		
		driver.findElement(By.id("signupEmail")).sendKeys("sneh23@gmail.com");
		Thread.sleep(500);
		
		driver.findElement(By.id("signupPassword")).sendKeys("trial@123");
		Thread.sleep(500);
		
		driver.findElement(By.id("signupCPassword")).sendKeys("trial@123");
		Thread.sleep(500);
		
		driver.findElement(By.id("signupUserOrg")).sendKeys("LTTS");
		Thread.sleep(500);
		
		driver.findElement(By.id("signupUserContact")).sendKeys("1234567891");
		Thread.sleep(500);
		
		//driver.findElement(By.className("jqTransformSelectWrapper"));
		//Thread.sleep(500);
		
		Select country= new Select(driver.findElement(By.id("signupUserCountry")));
		country.selectByIndex(2);
		
		//driver.findElement(By.id("submitSignUpForm")).click();
		driver.findElement(By.xpath("//*[@id=\"submitSignUpForm\"]")).click();
		Thread.sleep(500);
}
}
