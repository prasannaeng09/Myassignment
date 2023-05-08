package basetest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Scenario_3 extends Base {
	@Test
	public void scenario3() throws InterruptedException
	{	

	WebElement jsalert=driver.findElement(By.xpath("//a[normalize-space()='Javascript Alerts']"));	
	jsalert.click();
	Thread.sleep(5000);
	
	driver.findElement(By.cssSelector("button[class*='my-30']")).click();
	System.out.println("button clicked");
	Thread.sleep(5000);
	Alert alert=driver.switchTo().alert();
	Boolean flag2=alert.getText().equals("I am an alert box!");
	System.out.println(flag2);
	if(flag2)
		alert.accept();
	}

}
