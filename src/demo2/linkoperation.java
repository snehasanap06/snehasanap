package demo2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkoperation {

	public static void main(String[] args) {
		//check display status of link
		//check enabled status of link
		//return link name
		//click on link
			//Capture title and store in String variable
		//	manual enter title 
		//	compare two String
System.setProperty("webdriver.chrome.driver","C:\\Users\\Sony\\Desktop\\chromedriver_win32\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("https://www.google.com");
WebElement wb=driver.findElement(By.linkText("Gmail"));
System.out.println("wb.displayed()");
System.out.println("wb.Enabled()");
System.out.println(wb.getText());
wb.click();
String title=driver.getTitle();

System.out.println("title is"+driver.getTitle());
String abc="Gmail - Email from Google";


if(title.equals(abc))
{
	System.out.println("test cases passed");
}
else {
	System.out.println("test cases failed");
}
driver.close();

	}

}
