package demo2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sony\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://s2.demo.opensourcecms.com/orangehrm/symfony/web/index.php/auth/login");
		String abc=driver.getTitle();
		System.out.println("title is "+abc);
		WebElement wb= driver.findElement(By.id("txtUsername"));
	System.out.println(wb.isEnabled());	
	System.out.println(wb.isDisplayed());
	wb.sendKeys("opensourcecms");
    String a =wb.getAttribute("value");
    System.out.println("attribute value is"+a);

	}

}
