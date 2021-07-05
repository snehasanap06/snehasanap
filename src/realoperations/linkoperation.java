package realoperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkoperation {

	public static void main(String[] args) {
		//launch browser
		// open url
		// check enabled status and display status
		//click on link
		//System.getProperty("webdriver.chrome.driver","C:\\Users\\Sony\\Desktop\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sony\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		WebElement wb= driver.findElement(By.name("q"));
		System.out.println(wb.isDisplayed());
		System.out.println(wb.isEnabled());
		System.out.println(wb.getTagName());
	
		
		wb.click();
        wb.clear();
        
        
	}

}
