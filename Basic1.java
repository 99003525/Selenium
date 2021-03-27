import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic1 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Welcome");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();   // Webdriver is an interface , Chromedriver is a class
		driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");  //provide the url to redirect to the particular webpage
		driver.findElement(By.id("user-message")).sendKeys("Hello there");
		Thread.sleep(500);
		driver.findElement(By.className("at-cm-no-button")).click();
		driver.findElement(By.className("btn-default")).click();
		
	}
}
