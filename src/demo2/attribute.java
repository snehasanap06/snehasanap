package demo2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class attribute {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Sony\\Desktop\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		WebElement usernameTextBox=driver.findElement(By.id("email"));
		
		String enteredValue=usernameTextBox.getAttribute("value");
		System.out.println(enteredValue);


	}

}
