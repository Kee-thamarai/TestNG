package exclude_TC;
import org.testng.annotations.Test; 

public class Disable_exa {
	
	@Test(enabled=false)
	public void test1()
	{
		System.out.println("Hello TestNG!!!");
	}
	@Test
	public void test2() {
		System.out.println("Welcome to TestNG framework!!!");
	}
	
}
