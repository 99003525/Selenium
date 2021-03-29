import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop1 {
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
		
		driver.findElement(By.id("menu_leave_viewLeaveModule")).click();
		driver.findElement(By.id("calFromDate")).sendKeys("2020-12-05");
		
		Select dd= new Select(driver.findElement(By.id("ui-datepicker-month")));
		dd.selectByValue("12");

		//driver.findElement(By.id("menu_maintenance_purgeEmployee")).click();
		//driver.findElement(By.id("menu_maintenance_accessEmployeeData")).click();
		//driver.findElement(By.id("confirm_password")).sendKeys("Admin");
		//driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/form/div/div/input")).click();
		
}
}