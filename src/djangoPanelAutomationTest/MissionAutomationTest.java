package djangoPanelAutomationTest;

import java.util.concurrent.TimeUnit;
import djangoPanelAutomationTest.SetMission;
import djangoPanelAutomationTest.SetLogInCredentials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MissionAutomationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automation Projects\\Programs\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://admin.staging.go-games.gg/admin/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		
		SetLogInCredentials.setLogInCredentials(driver);		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		SetMission.setMission(driver);
		  
//		driver.close();
//		driver.quit();
	}
	
}
