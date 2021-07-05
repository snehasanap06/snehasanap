package sirgivenprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class errorfinding {

	public static void main(String[] args) throws Throwable {

//		1) open fb application
//		2) click on login button
//		3) capture error message --------------- getText();
//		4) print error
//		5) close application
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sony\\Desktop\\chromedriver_win32\\chromedriver.exe");
			WebDriver wb=new ChromeDriver();
			//1) open fb application
			wb.get("https://www.facebook.com");
			
			//2) click on login button
			wb.findElement(By.name("login")).click();
			
			//		3) capture error message --------------- getText();
			String error=wb.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[2]")).getText();
			System.out.println(error);
			Thread.sleep(4000);
			
			//close app
			wb.close();

	}

}
