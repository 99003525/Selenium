import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sliders1 {
	public static void main(String[] args) {
		System.out.println("Welcome");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();   // Webdriver is an interface , Chromedriver is a class
		driver.get("https://emicalculator.net/");
		
		
		driver.findElement(By.id("personal-loan")).click();
		WebElement ele=driver.findElement(By.id("loanamountslider"));
		Actions act= new Actions(driver);
		act.dragAndDropBy(ele, 50, 0).build().perform();
		
		WebElement ele1=driver.findElement(By.id("loaninterestslider"));
		Actions act1= new Actions(driver);
		act1.dragAndDropBy(ele1, 10, 0).build().perform();
		
		WebElement ele2=driver.findElement(By.id("loantermslider"));
		Actions act2= new Actions(driver);
		act2.dragAndDropBy(ele2, 67, 0).build().perform();
	}
}
