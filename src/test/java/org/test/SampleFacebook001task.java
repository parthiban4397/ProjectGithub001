package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleFacebook001task {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		WebElement txtUsername = driver.findElement(By.id("email"));
		txtUsername.sendKeys("parthiban.sri4397@gmail.com");
		WebElement txtPassword = driver.findElement(By.name("pass")); 
		txtPassword.sendKeys("1234567");
//		WebElement btnLogin = driver.findElement(By.name("login"));
//		btnLogin.click();
		System.out.println(txtUsername.getAttribute("value"));
		
		
		WebElement getText1 = driver.findElement(By.xpath("//h2[@class='_8eso']"));
		System.out.println(getText1.getAttribute("innerText"));
		System.out.println(getText1.getText());
		
		System.out.println(getText1.getAttribute("innerText"));
		System.out.println(getText1.getText());
		
	}
	
	
}
