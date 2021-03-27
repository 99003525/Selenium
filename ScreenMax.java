import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenMax {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("working");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();   // Webdriver is an interface , Chromedriver is a class
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");  //provide the url to redirect to the particular webpage
		
		//maximize the window, once maximized in cant be minimized
		driver.manage().window().maximize();
		Thread.sleep(500);
		
		//fullscreen
		driver.manage().window().fullscreen();
		
		//scroll down the page
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(500);
		
		//scroll up
		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		Thread.sleep(500);
	}
}
