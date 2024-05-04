package seleniumPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumClassDemo {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rohin\\Downloads\\chromedriver-win32 (2)\\chromedriver-win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.myntra.com/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
}
}
