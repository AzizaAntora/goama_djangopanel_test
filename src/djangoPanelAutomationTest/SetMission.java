package djangoPanelAutomationTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SetMission {
	public static void setMission(WebDriver driver) {
		driver.findElement(By.xpath("//*[@id=\"content-main\"]/div[12]/table/tbody/tr[11]/th/a")).click();
		String title1 = driver.getTitle();
		System.out.println(title1);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id=\"content-main\"]/ul/li[2]/a")).click();
		String title2 = driver.getTitle();
		System.out.println(title2);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.name("application")).sendKeys("aziza");
		driver.findElement(By.xpath("//*[@id=\"id_disable_notification\"]")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement webelement = driver.findElement(By.name("countries"));
		Select select = new Select(webelement);
		select.selectByValue("BD");
		
		driver.findElement(By.name("mission")).sendKeys("1");
		WebElement webelementVariables = driver.findElement(By.name("variables"));
		webelementVariables.clear();
		webelementVariables.sendKeys("2");
		
		WebElement webelementRewards = driver.findElement(By.name("reeward"));
		webelementRewards.clear();
		webelementRewards.sendKeys("10");
		
		driver.findElement(By.xpath("//*[@id=\"missionoffer_form\"]/div/fieldset/div[7]/div/p/span[1]/a[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"missionoffer_form\"]/div/fieldset/div[7]/div/p/span[2]/a[1]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"calendarlink1\"]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"calendarbox1\"]/div[3]/a[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"missionoffer_form\"]/div/fieldset/div[8]/div/p/span[2]/a[1]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"missionoffer_form\"]/div/div/input[1]")).click();
	}
}
