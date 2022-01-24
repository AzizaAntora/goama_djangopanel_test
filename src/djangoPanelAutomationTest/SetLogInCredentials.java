package djangoPanelAutomationTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SetLogInCredentials {
	
	public static void setLogInCredentials(WebDriver driver ) {
		driver.findElement(By.name("username")).sendKeys("gg-aziza");
		driver.findElement(By.name("password")).sendKeys("goama1234");
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).click();
	}
	

}
