import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterClass {

	@BeforeClass
	public void bef() {
		System.out.println("Before method");
	}
	@AfterClass
	public void aft() {
		System.out.println("After method");
	}
	@Test
	public void a() {
		System.out.println("a");
	}
	
	@Test
	public void b() {
		System.out.println("b");
	}
	
	@Test
	public void c() {
		System.out.println("c");
	}
	
	@Test
	public void d() {
		System.out.println("d");
	}
	
	
}
