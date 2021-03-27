import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns {
	public static void main(String[] args) throws InterruptedException {
		
	System.out.println("Welcome");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Training\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();   // Webdriver is an interface , Chromedriver is a class
	driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");  //provide the url to redirect to the particular webpage
	
	//accessing dropdowns
	Select dd= new Select(driver.findElement(By.id("select-demo")));
	Thread.sleep(500);
	dd.selectByVisibleText("Sunday");
	Thread.sleep(500);
	dd.selectByValue("Tuesday");
	Thread.sleep(500);
	dd.selectByIndex(5);
	
	Select dd1= new Select(driver.findElement(By.id("multi-select")));
	Thread.sleep(500);
	dd1.selectByIndex(1);
	dd1.selectByIndex(2);
	dd1.selectByIndex(3);
	dd1.selectByIndex(4);
	driver.findElement(By.id("printAll")).click();
	
	
}
}
