package mockdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Operationonlink {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Sony\\Desktop\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.google.com");
	WebElement wb= driver.findElement(By.xpath("//a[contains(text(),'Gmail')]"));
	System.out.println("link is display"+wb.isDisplayed());
	System.out.println("link is enabled"+wb.isEnabled());
	System.out.println("link is selected"+wb.isSelected());
	System.out.println("get link text"+wb.getText());
	wb.click();
String abc= driver.getTitle();

String pqr="Gmail";

System.out.println(abc.equalsIgnoreCase(pqr));
System.out.println(abc.concat(pqr));
System.out.println(abc.compareTo(pqr));

if(abc.equals(pqr))
{
System.out.println("text is pass");

}
else {
	System.out.println("text is failed");
	
}
	
	
driver.close();
	
	}
}
