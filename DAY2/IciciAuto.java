import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class IciciAuto {
public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();   // Webdriver is an interface , Chromedriver is a class
		driver.get("https://loan.icicibank.com/asset-portal-all/check-eligibility?loanType=al&WT.mc_id=Desk_OAPN_cms_cl_index_btn_applynow");
		driver.manage().window().maximize();
		Thread.sleep(500);
		
		Actions act= new Actions(driver);
		
		//type of loan
		driver.findElement(By.id("carRelbtn")).click();
		driver.findElement(By.linkText("Used Car Loan")).click();
		
		//ph.number 
		driver.findElement(By.id("MOBILENUM")).sendKeys("1234567890");

		//first name
		driver.findElement(By.id("CUSTFIRSTNAME")).sendKeys("Sneha");
		//second name
		driver.findElement(By.id("CUSTLASTNAME")).sendKeys("Anand");
		
		//current city
		
		//driver.findElement(By.id("CUSTCOMMUCITY")).sendKeys("Mysore");
		//act.moveToElement(driver.findElement(By.id("CUSTCOMMUCITY"))).sendKeys("Mys");
		
		WebElement currcity=driver.findElement(By.id("CUSTCOMMUCITY"));
		currcity.sendKeys("MYS");
		Thread.sleep(500);
		currcity.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(500);
		currcity.sendKeys(Keys.ENTER);
		Thread.sleep(500);
		
		//residence type
		driver.findElement(By.id("residancebtn")).click();
		
		//driver.findElement(By.linkText("Owned By Parents/Siblings")).click();
		
		act.moveToElement(driver.findElement(By.linkText("Owned By Parents/Siblings"))).click().perform();
		//year
		driver.findElement(By.id("yrbtn")).click();
		driver.findElement(By.linkText("2018")).click();
		//month
		driver.findElement(By.id("mnthspan")).click();
		driver.findElement(By.linkText("Jul")).click();
		
		
		
		//dob 
		driver.findElement(By.name("DATEOFBIRTH")).clear();
		driver.findElement(By.id("DATEOFBIRTH")).sendKeys("05/12/1998");
		
		//car model 
		WebElement model=driver.findElement(By.id("CAR_MODEL_NAME"));
		model.sendKeys("Hyundai Creta");
		Thread.sleep(500);
		model.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(500);
		model.sendKeys(Keys.ENTER);
		Thread.sleep(500);
		
		//city name
		
		WebElement city=driver.findElement(By.id("CITY_NAME"));
		city.sendKeys("Kochi");
		Thread.sleep(500);
		city.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(500);
		city.sendKeys(Keys.ENTER);
		Thread.sleep(500);
		
		//year of manufacture
		
		//WebElement year=driver.findElement(By.id("yrspan_manufact"));
		driver.findElement(By.id("yrspan_manufact")).click();
		driver.findElement(By.linkText("2020")).click();
		
		//month of manufacture
		
		//WebElement year=driver.findElement(By.id("yrspan_manufact"));
		driver.findElement(By.id("mnthspan_yr")).click();
		driver.findElement(By.linkText("Sept")).click();
		
		//ownership
		driver.findElement(By.id("NOV_totalworkexp")).click();
		driver.findElement(By.linkText("2")).click();
		
		//type of employment
		driver.findElement(By.id("selSalspan")).click();
		driver.findElement(By.linkText("Self Employed")).click();
		
		//name of business
		WebElement business=driver.findElement(By.id("NAME_OF_BUSSINESS"));
		business.sendKeys("LARSEN AND TOUBRO");
		Thread.sleep(500);
		
		//type of business
		driver.findElement(By.id("Nobspan")).click();
		driver.findElement(By.linkText("SERVICES")).click();
		
		
		//year of emp
		driver.findElement(By.id("yrspan_sdb")).click();
		driver.findElement(By.linkText("2019")).click();
		//month of emp
		driver.findElement(By.id("mnthspan_1")).click();
		driver.findElement(By.linkText("Mar")).click();
		//work exper
		driver.findElement(By.id("totalworkexp_1")).click();
		driver.findElement(By.linkText("3")).click();
		
		//salary 
		driver.findElement(By.id("LATEST_Y_GROSS_T_INC")).sendKeys("5000000");
		
		//emi 
		driver.findElement(By.id("TOTAL_CURR_EMI_PAID")).sendKeys("10000");
		
		driver.findElement(By.id("relwithBankNo")).click();
}
}
