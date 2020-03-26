package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	WebDriver driver;
	Properties prop;
	FileInputStream fp;
	
	public BaseClass()
	{
		try {
			//fp= new FileInputStream("C:\\Users\\sachin.mengade\\Desktop\\sachin\\1huddle-selenium\\config.properties");
			 fp=new FileInputStream("E:\\1huddle\\Automation\\Selenium\\Selenium1Huddle\\src\\main\\java\\config\\config.properties");
			prop= new Properties();
			try {
				prop.load(fp);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
		
	}
	
public void initialization()
{
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\sachin.mengade\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
			System.setProperty("webdriver.chrome.driver", "E:\\SOFTWARES\\chromedriver_win32\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.get(prop.getProperty("url"));
}
}