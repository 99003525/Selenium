import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterMethods {

	@BeforeMethod
	public void bef() {
		System.out.println("Before method");
	}
	@AfterMethod
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
