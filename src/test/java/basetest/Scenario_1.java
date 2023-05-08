package basetest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Scenario_1 extends Base {
	@Test
	public void scenario()
	{	
		WebDriverWait wait=new WebDriverWait(driver, 10);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		SoftAssert s=new SoftAssert();
	String title	=driver.getTitle();
	System.out.println(title);
Boolean flag	=title.equals("LambdaTest");
	s.assertFalse(flag);
	System.out.println("this is next statement");
	s.assertAll();
		
	}

}
