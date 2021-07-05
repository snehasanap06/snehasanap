package sirgivenprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Operation_on_textbox {

	public static void main(String[] args) throws Throwable {
		
//		1) displayed status
//		2) enabled status
//		3) enter value
//		4) get entered value
//		5) clear value
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sony\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		WebElement usernameTextBox=driver.findElement(By.id("email"));
		
		//1) displayed status
		Boolean displayStatus=usernameTextBox.isDisplayed();
		System.out.println(displayStatus);
		
		
		//2) enabled status
		Boolean enabledStatus=usernameTextBox.isEnabled();
		System.out.println(enabledStatus);
		//3) enter value
		usernameTextBox.sendKeys("Selenium Testing with the help of Java");
		//4) get entered value
		String enteredValue=usernameTextBox.getAttribute("value");
		System.out.println(enteredValue);

		Thread.sleep(3000);
		
		//clear value
		usernameTextBox.clear();
		
		driver.close();

	}

}
