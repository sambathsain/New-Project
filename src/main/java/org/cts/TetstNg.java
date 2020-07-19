package org.cts;



import java.util.List;
import java.util.Stack;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class TetstNg {
	
	@Test
	public void test1() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\samba\\selenium\\MavenData\\div\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://purple.com/");
	Thread.sleep(4000);
	WebElement wm = driver.findElement(By.xpath("(//a[text()='Mattresses'])[1]"));
	Actions ac = new Actions(driver);
	ac.moveToElement(wm).perform();
	Thread.sleep(3000);
	WebElement mat = driver.findElement(By.xpath("(//a[@href='/mattresses/purple-bed'])[1]"));
	mat.click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[@href='#']")).click();
	Thread.sleep(5000);
	WebElement item = driver.findElement(By.xpath("(//span[text()='The Purple Mattress'])[2]"));
	String text = item.getText();
	Assert.assertEquals(text, "The Purple Mattress");
	
	}
	
	
	
	
    
}