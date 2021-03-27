import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("working");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();   // Webdriver is an interface , Chromedriver is a class
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");  //provide the url to redirect to the particular webpage
		
		/*driver.findElement(By.className("btn-default")).click();
		 handling javascript pop-ups
		Thread.sleep(500);
		driver.switchTo().alert().accept(); //
		Thread.sleep(500);*/
		Thread.sleep(500);
		driver.findElement(By.className("btn-lg")).click();
		Thread.sleep(500);
		driver.switchTo().alert().accept();//
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/button")).click();
		Thread.sleep(500);
		driver.switchTo().alert().dismiss();
	}
}
