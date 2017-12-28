package com.support;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	FirefoxDriver driver;
	
	public void openBrowser() {
		System.setProperty("webdriver.gecko.driver", "/Users/jarrellsimon/Downloads/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
	    }
	public void url(String url) {
		driver.get(url);
		}
	public void type(By x,String s) {
		driver.findElement(x).sendKeys(s);
		}
	//We can do this way type method too and we can dynamic the SendKeys value.
	public void type(WebElement ele,String text) {
		ele.sendKeys(text);
		}
	public void typePass(By x,String s) {
		driver.findElement(x).sendKeys(s);
	    }
	public void login(By x) {
		driver.findElement(x).click();
	    }
	//for ChromeDriver method that we can call the method and get the driver
	public ChromeDriver getDriver() {
		ChromeDriver dr = new ChromeDriver();
		return dr;
		}
	public void verifyTittle(String text) {
		boolean xy = driver.getTitle().contains(text);
		System.out.println(xy);
	    }
	//Another Way We Can Define the verifyTitle is Down There !
	
	public void verifyTitle(String text) {
		String title = driver.getTitle();
		boolean xy = title.contains(text);
		System.out.println(xy);
	    }
	public void click(By x) {
		driver.findElement(x).click();
	    }
	public void getText(WebElement ele) {
		driver.findElement(By.xpath(""));
		}
	public void getValue(WebElement ele) {
		driver.findElement(By.id(""));
		}
	public void textPresent(String s) {
		System.out.println(s);
		}
	public void elementPresent(WebElement ele) {
		driver.findElement(By.xpath(""));
		}
	public void getElements(List<WebElement> ele) {
		getElements(driver.findElements(By.xpath("")));
	    }
	public void login(WebDriver dr) {
		driver.get("");
		}
	public void getElement(String s) {
		driver.findElement(By.xpath(""));
		}
	public void verifyElement(By x) {
		driver.findElement(x).isDisplayed();
	    }
	public void closeBrowser() {
		driver.quit();
	    }
	//those only for WebElement.
	public void parameterizedMethod(WebElement ele,By x,String s) {
		driver.findElement(By.xpath("x")).sendKeys(s);
	    }
	//normal parameterized method for name or address.
	public void parameterizedMethod(String name,String address) {
		driver.findElement(By.xpath(name)).sendKeys(address);
	    }
	//for return type method you must put the return value like 5.
	int m() {
		return 5;
		}
	//A x = new A(); create the object for main class.
	//int xp = x.m(); call the method by creating object.
	//when we will call the main method we will get the return value 5.
			
	String m1() {
		return "Hello";
		}
	
	

}
