import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Training\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
	
		driver.findElement(By.xpath("//div[@class=\"col-md-6 text-left\"]/div[3]/div[@class=\"panel-body\"]/button")).click();
		
		//driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[3]/div[2]/button")).click();
		//Thread.sleep(500);
		Thread.sleep(500);
		driver.switchTo().alert().sendKeys("Sneha");
		Thread.sleep(500);
		driver.switchTo().alert().accept();
	}
}
