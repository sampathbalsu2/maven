package regression;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Locatorstest {
	WebDriver dr;
  @Test
  public void f() {
	  dr.get("https://www.google.com");
<<<<<<< HEAD
	  dr.findElement(By.cssSelector(".gLFyf.gsfi")).sendKeys("Hi");

=======
	  dr.findElement(By.cssSelector(".gLFyf.gsfi")).sendKeys("Hi"+Keys.ENTER);
>>>>>>> branch 'master' of https://github.com/sampathbalsu2/maven.git
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\test\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  dr= new ChromeDriver();
  }

  @AfterMethod
  public void afterMethod() {
	  dr.quit();
  }

}
