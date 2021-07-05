package sirgivenprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Operationonelement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sony\\Desktop\\chromedriver_win32\\chromedriver.exe");

		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		driver.findElement(By.linkText("Gmail")).click();
		
		String ActualUrl=driver.getCurrentUrl();
		String ExpectedUrl="https://www.google.com/intl/en-GB/gmail/about/";
		
//		Boolean status=ActualUrl.equals(ExpectedUrl);
//		System.out.println(status);

		if(ActualUrl.equalsIgnoreCase(ExpectedUrl))
		{
			System.out.println("Test case is passed....");
		}
		else {
			System.out.println("test case is failed....");
		}
		
		driver.close();

	}

}
