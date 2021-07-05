package sirgivenprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class elementoperation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sony\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	
		WebElement wb=driver.findElement(By.xpath(".//*[@id='identifierNext']/div/button"));
	
		Boolean displayeStatus=wb.isDisplayed();
		System.out.println("Displayed status of Button is :"+displayeStatus);
		
		Boolean EnabledStatus=wb.isEnabled();
		System.out.println("Enabled status of Button is :"+EnabledStatus);
		
		String ObjectType=wb.getAttribute("type");
		System.out.println("object type :"+ObjectType);//
		
		String ObjectName=wb.getText();
		System.out.println("Object name is :"+ObjectName);
				
		wb.click();
		
		driver.close();

	}

}
