import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class AppTest1 
{

	static AppiumDriver<MobileElement> driver;

	
	  public static void main(String[] args) {
	  
	  try 
	  { 
		  openCalculator();
	  } 
	  catch (Exception e) 
	  { // TODO Auto-generated catch
	  e.printStackTrace(); 
	  } 
	  }
	 
	public static void openCalculator() throws Exception
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Galaxy M30S");
		cap.setCapability("udid", "RZ8N10BC9CT");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "10");
		cap.setCapability("appPackage", "com.sec.android.app.popupcalculator");
		cap.setCapability("appActivity", "com.sec.android.app.popupcalculator.calculator");
		cap.setCapability("automationName", "UiAutomator2");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(url,cap);
		System.out.println("My First Appium Test script for Calculator is running..");
	}

}
