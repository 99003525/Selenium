import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training\\Downloads\\chromedriver_win32\\chromedriver.exe");					
		WebDriver driver= new ChromeDriver();					
	       driver.get("http://demo.guru99.com/test/drag_drop.html");					
	       driver.manage().window().maximize();
			//Element which needs to drag.    		
	   	
	       
	       	WebElement Drag1=driver.findElement(By.id("credit"));	
		    WebElement Drop1=driver.findElement(By.id("bank"));					
		    Actions act1=new Actions(driver);					
		    act1.dragAndDrop(Drag1, Drop1).build().perform();	
		    
	      	WebElement Drag2=driver.findElement(By.id("fourth"));	
		    WebElement Drop2=driver.findElement(By.id("amt7"));					
		    Actions act2=new Actions(driver);					
		    act2.dragAndDrop(Drag2, Drop2).build().perform();	
		       
		    WebElement Drag3=driver.findElement(By.id("credit0"));	
		    WebElement Drop3=driver.findElement(By.id("/html/body/section/div/div/main/div/div/div/div/div/div/table/tbody/tr/td[2]/table/tbody/tr/td[2]/div/div/ol"));					
		    Actions act3=new Actions(driver);					
		    act3.dragAndDrop(Drag3, Drop3).build().perform();	
		    
		    WebElement Drag4=driver.findElement(By.id("fourth"));	
		    WebElement Drop4=driver.findElement(By.id("/html/body/section/div/div/main/div/div/div/div/div/div/table/tbody/tr/td[2]/table/tbody/tr/td[1]/div/div/ol/li"));					
		    Actions act4=new Actions(driver);					
		    act4.dragAndDrop(Drag4, Drop4).build().perform();	
	       
	}
}
