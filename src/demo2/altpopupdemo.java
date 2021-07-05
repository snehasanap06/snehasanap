package demo2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class altpopupdemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sony\\Desktop\\chromedriver_win32\\chromedriver.exe");

		WebDriver  driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();
		
		Alert a=driver.switchTo().alert();
		
		System.out.println(a.getText());
		Thread.sleep(3000);
		// it will click on ok button
		a.accept();
		
		// it will click on cancel button
		
		//a.dismiss();

	}

}
