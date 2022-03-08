package mphasis.selenium.SeleniumDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class NewTest1 {
	private WebDriver driver;
	private String url;
 
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  url="https://demoqa.com/automation-practise-form";
	  driver.navigate().to(url);
	  driver.manage().window().maximize();
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

  public void testByLinkTestStrategy() throws InterruptedException{
	  WebElement ele= driver.findElement(By.cssSelector("input[id^=first]"));
	  ele.sendKeys("Mphasis");
	  Thread.sleep(3000);
  }
}
