package mphasis.selenium.SeleniumDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;

public class TestSeleniumGrid {
	WebDriver driver;
	String baseURL, nodeURL;
  @Test
  public void f() {
	  driver.navigate();
	  String title=driver.getTitle();
  }
  @BeforeMethod
  public void setUp() throws MalformedURLException {
	  baseURL="https://www.techgatha..com";
	  nodeURL="http://localhost:4444";
	  DesiredCapabilities capabilities=new DesiredCapabilities();
	  driver = new RemoteWebDriver(new URL(nodeURL), capabilities);
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
