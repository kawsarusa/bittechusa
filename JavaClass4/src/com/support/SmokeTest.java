package com.support;

import org.openqa.selenium.By;

public class SmokeTest {

	public static void main(String[] args) throws InterruptedException {
		Base xy = new Base();
		xy.openBrowser();
		xy.url("http://www.facebook.com");
		xy.type(By.id("email"),("kawsar_faith@yahoo.com"));
		xy.typePass(By.id("pass"),("ghvghhgvhjvj"));
		Thread.sleep(3000);
		xy.click(By.xpath("//input[@id='u_0_3']"));
		//xy.login(By.xpath("//input[@id='u_0_3']"));
		xy.verifyTittle("facebook");
		System.out.println(xy);
	    //xy.click(By.xpath(""));
		xy.verifyElement(By.id(""));
		xy.getElement("");
		
		
		
		
		
		
		}

}
