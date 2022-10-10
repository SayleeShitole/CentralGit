package Locators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LocatrosWithXpathAndCSSSelector {
	
	@Test
	public void login() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", 
	"C:\\\\Users\\\\MaKsys\\\\Documents\\\\Velocity\\\\Selenium\\\\BroswersWebdrivers\\\\Chrome driver\\\\chromedriver_win32\\\\chromedriver.exe");
		
		ChromeDriver obj=new ChromeDriver();
		WebDriver driver=obj;
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.findElement(By.id("inputUsername")).sendKeys("sayleeshitole0111@gmail.com");
		
		driver.findElement(By.name("inputPassword")).sendKeys("Prashant123#");
		
		driver.findElement(By.className("submit")).click();
		
		String actual_result=driver.findElement(By.cssSelector("p.error")).getText();
		
		System.out.println(actual_result);
		
		List<WebElement> list = driver.findElements(By.tagName("a"));
		
		System.out.println(list);
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).getText().equalsIgnoreCase("Forgot your password?"))
			{
			list.get(i).click();
			
			Thread.sleep(3000);
			}
		}
		
		//using xpath
		driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("saylee shitole");
		
		//using xpath parent-child
		
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("sayleeshitole48@gmail.com");
		
		//using css selector parent-child
		
		driver.findElement(By.cssSelector("form input[placeholder='Phone Number']")).sendKeys("9921397767");
		
		//
		
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		
		String str=driver.findElement(By.cssSelector("form p.infoMsg")).getText();
		
		System.out.println(str);
	}

}
