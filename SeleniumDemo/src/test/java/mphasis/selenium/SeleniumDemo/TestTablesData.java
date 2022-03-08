package mphasis.selenium.SeleniumDemo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestTablesData 
{
	private WebDriver driver;
	private String url;


	@BeforeMethod
	public void before()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		url = "https://demo.guru99.com/test/web-table-element.php";
		driver.navigate().to(url);
		// implicit wait also finds the invisible element with display:none
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}	
	@Test
	public void shouldGetTableValues() throws InterruptedException
	{ 	
		WebElement tableEle = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody"));
		
		List<WebElement> rows = tableEle.findElements(By.tagName("tr"));
		
		
		
		Thread.sleep(2000);
	}
	@AfterMethod
	public  void closeBrowser()
	{
		// 4) close the browser
		driver.close();
	}
}