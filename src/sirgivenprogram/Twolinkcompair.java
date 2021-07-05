package sirgivenprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Twolinkcompair {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sony\\Desktop\\chromedriver_win32\\chromedriver.exe");

		
WebDriver driver=new ChromeDriver();
	
		driver.get("https://www.google.com");
		
		WebElement wb=driver.findElement(By.xpath("//a[contains(text(),'Gmail')]"));
		System.out.println("displayed Status of link is :"+wb.isDisplayed());
		System.out.println("Enabled Status of link is :"+wb.isEnabled());
		System.out.println("Capture Linke name :"+wb.getText());
		// it will go to google application
		wb.click();
		
//		Capture title and store in String variable
//		manual enter title 

		String Actualtitle=driver.getTitle();
		
		String ExpectedTitle="Google";
		//compare two String
		//System.out.println(Actualtitle.equals(ExpectedTitle));
		
		if(Actualtitle.equals(ExpectedTitle)) 
		{
			System.out.println("test case is passed");
		}
		else {
			System.out.println("test case is failed");
		}
		
		
		driver.close();

	}

}
