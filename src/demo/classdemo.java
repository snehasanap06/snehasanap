package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class classdemo {

	public static void main(String[] args) {
		
	
		
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sony\\Desktop\\chromedriver_win32\\chromedriver.exe");
WebDriver abc=new ChromeDriver();
abc.get("https://www.google.com");
System.out.println();

	}

}
