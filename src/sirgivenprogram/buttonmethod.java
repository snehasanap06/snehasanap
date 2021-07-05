package sirgivenprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class buttonmethod {

	public static void main(String[] args) {

		
//		1) check displayed status
//		2) check enabled status
//		3) return name of object.----------- getAttitbute("name")
//		4) return type of object.----------- getAttitbute("type")
//		5) click on button
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sony\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		WebElement LoginBtn=driver.findElement(By.name("login"));
		//1) check displayed status
		System.out.println(LoginBtn.isDisplayed());
		//2) check enabled status
		System.out.println(LoginBtn.isEnabled());
		
		//3) return name of object.----------- getAttitbute("name")
		
		System.out.println(LoginBtn.getAttribute("name"));//Log In
		
		//4) return type of object.----------- getAttitbute("type")
		
		System.out.println(LoginBtn.getAttribute("type"));//
		
		LoginBtn.click();
		
		driver.close();		

	}

}
