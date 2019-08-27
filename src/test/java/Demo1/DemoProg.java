package Demo1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class DemoProg 
{

	static
	{
	System.setProperty("webdriver.chrome.driver", "D:\\seleniumWS\\Assignment1\\driver\\chromedriver.exe");
	}

	@Test
	public static void A() throws InterruptedException
	{

//		ChromeOptions opt=new ChromeOptions();
//		opt.setBinary(path)
	
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		WebElement sbox = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		Thread.sleep(2000);
		sbox.sendKeys("oneplus 7",Keys.ENTER);
		System.out.println("hi");
	}
}
