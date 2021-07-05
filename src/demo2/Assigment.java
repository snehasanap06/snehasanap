package demo2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Assigment {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sony\\Desktop\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver= new ChromeDriver();
				driver.get("https://s2.demo.opensourcecms.com/orangehrm/symfony/web/index.php/auth/login");
				//user name
				driver.findElement(By.id("txtUsername")).sendKeys("opensourcecms");
				//Password
				driver.findElement(By.id("txtPassword")).sendKeys("opensourcecms");
				//login button
				driver.findElement(By.id("btnSaveGenInfo")).click();
				
				//go to file
				 driver.findElement(By.id("admin")).click();
				 //edit option click
				 driver.findElement(By.id("btnSaveGenInfo")).click();
				 //fill details
				 driver.findElement(By.id("organization_name")).sendKeys("Softtech classes");
				 
				driver.findElement(By.id("organization_registraionNumber")).sendKeys("445715");
				
				driver.findElement(By.id("organization_phone")).sendKeys("9403399568");
				 Thread.sleep(3000);
				 driver.findElement(By.id("organization_email")).sendKeys("Softtechclass25@gmail.com");
				Thread.sleep(3000);
				 
				driver.findElement(By.id("organization_street1")).sendKeys("kothrud depo");
				 Thread.sleep(3000);
				 
				 driver.findElement(By.id("organization_province")).sendKeys("kothrud");
				 Thread.sleep(3000);
				
				driver.findElement(By.id("organization_city")).sendKeys("pune");
				 
				WebElement wb=driver.findElement(By.id("organization_country"));
				Select ind= new Select(wb);
				ind.selectByVisibleText("India");
				
				driver.findElement(By.id("btnSaveGenInfo")).click();
				
				
				 

	}

}
