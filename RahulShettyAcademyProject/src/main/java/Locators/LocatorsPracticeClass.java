package Locators;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LocatorsPracticeClass {

	@Test
	public void display() throws InterruptedException  {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", 
	"C:\\\\Users\\\\MaKsys\\\\Documents\\\\Velocity\\\\Selenium\\\\BroswersWebdrivers\\\\Chrome driver\\\\chromedriver_win32\\\\chromedriver.exe");
		
		ChromeDriver obj=new ChromeDriver();
		WebDriver driver=obj;
		
		driver.manage().window().maximize();
		
		driver.get("https://sso.teachable.com/secure/9521/identity/login/password");
		
		
		// by id
		
		driver.findElement(By.id("email")).sendKeys("sayleeshitole481@gmail.com");
		
		//by name
		
		driver.findElement(By.name("password")).sendKeys("Shitole");
		
		// by classname
		
		driver.findElement(By.className("btn-primary")).click();
		
		Thread.sleep(3000);
		String actual_result=driver.findElement(By.cssSelector("div[class='bodySmall m-b-3-xs text-center-xs auth-flash-error']")).getText().trim();
		
		//String actual_result=driver.findElement(By.cssSelector("div.bodySmall m-b-3-xs text-center-xs auth-flash-error")).getText().trim();
		
		System.out.println(actual_result);
		
		String expected_result="Your email or password is incorrect.";
		Assert.assertEquals(actual_result, expected_result);
		
	
	}

}
