package realoperations;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class pageoperation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sony\\Desktop\\chromedriver_win32\\chromedriver.exe");
		// 1) launch the browser
		WebDriver driver=new ChromeDriver();
		// 2) launch the url
		driver.get("https://www.facebook.com");
		//WebElement WebElement = driver.findElement(By.id("email"));
		
		WebElement wb = driver.findElement(By.id("pass"));
		// 3) see enabled and display status
		System.out.println(wb.isEnabled());
		System.out.println(wb.isDisplayed());
		Thread.sleep(4000);
		// 4) enter value in textbox
		wb.sendKeys("jave for selenium");
		//wb.close();
		// wb.sendKeys("java for testing");
		
		// 5) clear value in textbox
		Thread.sleep(4000);
		wb.clear();
		
		//wb..quit();
		
		
	}

}
