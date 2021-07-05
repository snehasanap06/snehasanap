package demo;


import java.io.IOException;
import java.util.logging.FileHandler;

//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.server.handler.WebDriverHandler;
import java.io.File;

//import org.apache.commons.io.FileUtils;
import com.google.common.io.Files;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class demo33 {
	public static void main(String[] args) throws IOException {
	
//	//System.setProperty("webdriver.edge.driver","‪E:\\driver\\msedgedriver.exe");
//	WebDriverManager.chromedriver().setup();
//	driver = new ChromeDriver();
//	driver.get("https://www.google.com/");
//	//TakesScreenshot ts=(TakesScreenshot).driver;
//	driver.findElement(By.name("q")).sendKeys("Selenium Testing");
//	TakesScreenshot ts=(TakesScreenshot)driver;
//	File f = ts.getScreenshotAs(OutputType.FILE);
//	File dist=new File("‪E:\\selenium data\\screenshotpath\\google.jpg");
//	FileHandler.copy(f, dist);
//	driver.close();
//	
//		System.setProperty("webdriver.chrome.driver","‪‪‪C:\\Users\\Sony\\Desktop\\chromedriver_win32\\chromedriver.exe");
		// WebDriverManager.chromedriver().setup();
				WebDriver  driver = new ChromeDriver();
				driver.get("https://www.google.com/");
				//TakesScreenshot ts=(TakesScreenshot).driver;
				driver.findElement(By.name("q")).sendKeys("Selenium Testing");
				TakesScreenshot ts=(TakesScreenshot)driver;
				File f = ts.getScreenshotAs(OutputType.FILE);
				File dist=new File("E:\\selenium data\\screenshotpath\\abc.jpg");
			Files.copy(f, dist);
				driver.close();
				
				}
	}

	

