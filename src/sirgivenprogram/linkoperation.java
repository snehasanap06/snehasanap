package sirgivenprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkoperation {

	public static void main(String[] args) {

		//check display status
		//check enabled statu
		//return link name
		//click on link
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sony\\Desktop\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/r.php");
				
				WebElement wb=driver.findElement(By.name("sex"));
				//check display status
				Boolean a=wb.isDisplayed();
				System.out.println(a);//t
				
				//check enabled status
				System.out.println(wb.isEnabled());//t
				
				//return link name-------------- getText();
				
				System.out.println(wb.getText());//SofTech classes in Pune
				
				wb.click();	

	}

}
