import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Actions1 {
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Welcome");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();   
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(500);
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		Thread.sleep(500);
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		
		
		WebElement ele=driver.findElement(By.linkText("Leave"));
		Actions act= new Actions(driver);
		act.moveToElement(ele).build().perform();
		
		Thread.sleep(500);
		WebElement ele2=driver.findElement(By.linkText("Leave List"));
		Actions act2= new Actions(driver);
		act2.moveToElement(ele2).build().perform();
		Thread.sleep(500);
		
		driver.findElement(By.id("menu_leave_viewLeaveModule")).click();
		driver.findElement(By.id("calFromDate")).clear();
		driver.findElement(By.id("calFromDate")).sendKeys("2020-12-05");
		
		Thread.sleep(500);
		
		driver.findElement(By.id("calToDate")).clear();
		driver.findElement(By.id("calToDate")).sendKeys("2021-02-05");
		driver.findElement(By.className("ui-datepicker-month")).click();
		
		driver.findElement(By.id("leaveList_cmbSubunit"));

		
	}
}