
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Shiksha_SignUpTest {

	
	WebDriver d = new ChromeDriver();
	
  @Test (priority=1)
  public void open() {
	  d.get("https://www.google.com/");     // Open Google Page
		d.manage().window().maximize();
		
		d.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input")).sendKeys("shiksha.com"); // Type shiksha.com in Google Search Bar
		d.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input")).sendKeys(Keys.ENTER);   //  After type shiksha.com Press Enter
		
		d.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS); // 30 Sec.Waiting Time
		
		d.findElement(By.cssSelector("#rso > div:nth-child(1) > div > div > div > div > div.r > a > h3")).click(); // Click On Shiksha.com Link
		
		d.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS); // 30 Sec.Waiting Time
		
		d.findElement(By.xpath("//*[@id=\"wrapperMainForCompleteShiksha\"]/div[6]/div/div/button")).click();
  }
  
  
  @Test (priority=2)
  public void login() {
	d.findElement(By.linkText("Sign Up")).click(); // Click On Sign Up Button
		
		d.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS); // 30 Sec.Waiting Time
		
	
		d.findElement(By.className("multiinput")).click();
		
		d.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS); // 30 Sec.Waiting Time
		
		d.findElement(By.id("stream_2")).click();
		
		//d.findElement(By.className(className))
		
		
		
		//Select s = new Select(d.findElement(By.xpath("//*[@id=\'stream_input_VWbaGh\']")));
		//d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//s.selectByValue("1");
		
		
		
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//d.findElement(By.linkText("Engineering")).click();
  }
}
