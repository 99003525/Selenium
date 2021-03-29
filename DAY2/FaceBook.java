import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("working");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();   // Webdriver is an interface , Chromedriver is a class
		
		driver.get("https://www.facebook.com/campaign/landing.php?&campaign_id=973072061&extra_1=s%7Cc%7C231348943369%7Ce%7Cfacebook%7C&placement=&creative=231348943369&keyword=facebook&partner_id=googlesem&extra_2=campaignid%3D973072061%26adgroupid%3D54006406691%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-297690534863%26loc_physical_ms%3D1007773%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMIvavltZnQ7wIVVaaWCh2s1wUeEAAYASAAEgLY5_D_BwE");
		
		
		driver.findElement(By.id("u_0_n_6Y")).sendKeys("Sneha");
		driver.findElement(By.id("u_0_p_yS")).sendKeys("Anand");
		driver.findElement(By.id("u_0_s_4R")).sendKeys("012345678");
		driver.findElement(By.id("password_step_input")).sendKeys("trial@123");
		
		Select day= new Select(driver.findElement(By.id("day")));
		Thread.sleep(500);
		day.selectByIndex(5);
		
		Select bmonth= new Select(driver.findElement(By.id("month")));
		Thread.sleep(500);
		bmonth.selectByIndex(5);
		
		Select year= new Select(driver.findElement(By.id("year")));
		Thread.sleep(500);
		year.selectByIndex(5);
		
		driver.findElement(By.id("")).click();
		Thread.sleep(500);
		
	}
}
