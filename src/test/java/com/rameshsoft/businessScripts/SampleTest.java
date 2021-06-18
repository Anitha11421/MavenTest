package com.rameshsoft.businessScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleTest {
	@Test
	public static void testOne() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		System.out.println("browser lunched susccessfully");
		driver.manage().window().maximize();
		System.out.println("maximise the window");
		driver.get("https://www.rameshsoft.com");
		System.out.println("Navigaed to : "+driver.getCurrentUrl());
		
		Thread.sleep(2000);
		driver.close();
		
	}

}
