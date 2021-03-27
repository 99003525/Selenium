import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Welcome");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();   // Webdriver is an interface , Chromedriver is a class
		driver.get("https://opensource-demo.orangehrmlive.com/");  //provide the url to redirect to the particular webpage
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		Thread.sleep(500);
		driver.findElement(By.name("txtUsername")).clear();//to clear the text box
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
	}
}
