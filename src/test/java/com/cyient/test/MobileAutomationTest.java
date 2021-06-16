package com.cyient.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class MobileAutomationTest {

	@Test	
	public void test1() throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("deviceName", "Nexus5X");
		cap.setCapability("platformName", "Android");
		cap.setCapability("app", "D:\\AutomationTraining\\Component\\OneFootball Soccer News Scores Stats_v14.2.0_apkpure.com.apk");

		cap.setCapability("udid", "emulator-5554");
		
		AndroidDriver<WebElement>  driver=new AndroidDriver<WebElement>(new URL("http://localhost:4723/wd/hub"), cap);
		
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        
        driver.findElementByAndroidUIAutomator("UiSelector().text(\"Liverpool\")").click();
        
        String visibleText = "India";

        driver.findElementByAndroidUIAutomator
        ("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"" + visibleText + "\").instance(0))").click();
        
        driver.findElementByAndroidUIAutomator("UiSelector().text(\"OKAY!\")").click();
        
        String visibleText2 = "Euro 2020";
        
        driver.findElementByAndroidUIAutomator
        ("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"" + visibleText2 + "\").instance(0))").click();
        
        
       Thread.sleep(5000); 
      driver.quit();

	}
	
	@Test
	public void test2() throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("deviceName", "Nexus5X");
		cap.setCapability("platformName", "Android");
		cap.setCapability("app", "D:\\AutomationTraining\\Component\\OneFootball Soccer News Scores Stats_v14.2.0_apkpure.com.apk");

		cap.setCapability("udid", "emulator-5554");
		
		AndroidDriver<WebElement>  driver=new AndroidDriver<WebElement>(new URL("http://localhost:4723/wd/hub"), cap);
		
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        
        driver.findElementByAndroidUIAutomator("UiSelector().text(\"Liverpool\")").click();
        
        String visibleText = "India";
        driver.findElementByAndroidUIAutomator
        ("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"" + visibleText + "\").instance(0))").click();
        
        driver.findElementByAndroidUIAutomator("UiSelector().text(\"OKAY!\")").click();
        
        driver.findElementByAndroidUIAutomator("UiSelector().text(\"Games\")").click();
        
        driver.findElementByAndroidUIAutomator("UiSelector().text(\"All\")").click();
        
        String visibleText2 = "UEFA EURO 2020™";
        driver.findElementByAndroidUIAutomator
        ("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"" + visibleText2 + "\").instance(0))").click();
        
        String visibleText3 = "Germany";
        driver.findElementByAndroidUIAutomator
        ("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"" + visibleText3 + "\").instance(0))").click();
        
        
      /* Write your Custom code here */
        
       Thread.sleep(5000); 
      driver.quit();

	}

}
