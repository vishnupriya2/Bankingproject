package bankingProject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

	public class BankingProj{
		WebDriver driver;
		@BeforeSuite
			public void openBrowser(){
			System.setProperty("webdriver.chrome.driver","D://priya//chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			
		}
		
		@Test
		public void openDemo() throws AWTException
		{
			driver.get("http://www.demo.guru99.com/V4/");
			driver.findElement(By.name("uid")).sendKeys("mngr98513");
			 driver.findElement(By.name("password")).sendKeys("jyhEd12");
			 Robot r = new Robot();
			 r.keyPress(KeyEvent.VK_ENTER);
			 r.keyRelease(KeyEvent.VK_ENTER);
			//switch to alert and accept it
			 org.openqa.selenium.Alert alert=driver.switchTo().alert();
				alert.accept();
				driver.findElement(By.name("uid")).sendKeys("mngr98513");
				 driver.findElement(By.name("password")).sendKeys("jyhEdEP");
				 Robot r1 = new Robot();
				 r1.keyPress(KeyEvent.VK_ENTER);
				 r1.keyRelease(KeyEvent.VK_ENTER);
			 
			 String managerid=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[3]")).getText();
				if (managerid.contains("Manger Id")) {
					System.out.println("login successful");
				}
				else {
					System.out.println("login not successful");
				
			}
	}


}
