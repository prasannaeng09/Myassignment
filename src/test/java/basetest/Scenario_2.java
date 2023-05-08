package basetest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Scenario_2 extends Base {
	@Test
	public void scenario2()
	{	
		
		driver.findElement(By.xpath("//a[.='Checkbox Demo']")).click();
	WebElement checkbox	=driver.findElement(By.xpath("//label/input[@type='checkbox']"));	
	checkbox.click();
	Boolean flag1=checkbox.isSelected();
	Assert.assertTrue(flag1);
	checkbox.click();
	Boolean flag2=checkbox.isSelected();
	Assert.assertFalse(flag2);	
	}

}
