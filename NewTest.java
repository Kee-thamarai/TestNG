package firstTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
	public String baseUrl = "http://demo.guru99.com/test/newtours/";
    String driverPath = "C:\\SELENIUM\\Selenium_WebDriver\\geckodriver.exe";
    public WebDriver driver ;
  @Test
  public void verifyHomepageTitle() {
	  //Setting system property
	  System.setProperty("webdriver.gecko.driver", driverPath);
	  //Instantiating driver
	  driver = new FirefoxDriver();
	  //Launching browser
	  driver.get(baseUrl);
	  //Maximizing browser
	  driver.manage().window().maximize();
	  //Expected title
	  String expectedTitle = "Welcome: Mercury Tours";
	  // get the actual value of the title
      String actualTitle = driver.getTitle();
      Assert.assertEquals(actualTitle, expectedTitle);
      //Terminating the browser
      driver.close();
      System.out.println("Test passed!!!");
  }
}
