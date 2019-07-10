package com.ntt.SeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase {
	static WebDriver driver;
	
	/*public void home() {
		WebElement login = driver.findElement(By.xpath("/html/body/center/form/p/a"));
		login.submit();
		WebElement register = driver.findElement(By.xpath("/html/body/center/form/input[1]"));
	}*/
	public void register() throws InterruptedException {
		// registering

		WebElement register = driver.findElement(By.xpath("/html/body/form[2]/input"));
		register.submit();
		WebElement name = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td/input"));
		WebElement pass2 = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td/input"));
		WebElement EID = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td/input"));
		WebElement contact = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[4]/td/input"));
		WebElement button2 = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td/input"));
		name.sendKeys("Rekha.y");
		pass2.sendKeys("abcd");
		EID.sendKeys("10");
		contact.sendKeys("145");
		button2.submit();
		System.out.println("Registration test passed");

	}

	public void login() throws InterruptedException {
		// login
		WebElement login = driver.findElement(By.xpath("/html/body/form[1]/input"));
		login.submit();
		WebElement name = driver.findElement(By.xpath("/html/body/form/input[1]"));
		WebElement pass = driver.findElement(By.xpath("/html/body/form/input[2]"));
		WebElement button = driver.findElement(By.xpath("/html/body/form/input[3]"));
		name.sendKeys("Rekha");
		pass.sendKeys("abc");
		button.submit();
		System.out.println("login test passed");
		Thread.sleep(5000);
		driver.navigate().back();
		driver.navigate().back();

	}
	public void fail() throws InterruptedException {
		WebElement login = driver.findElement(By.xpath("/html/body/form[1]/input"));
		login.submit();
		WebElement name = driver.findElement(By.xpath("/html/body/form/input[1]"));
		WebElement pass = driver.findElement(By.xpath("/html/body/form/input[2]"));
		WebElement button = driver.findElement(By.xpath("/html/body/form/input[3]"));
		name.sendKeys("Rekha");
		pass.sendKeys("abcdd");
		button.submit();
		System.out.println("tested for fail case");
		Thread.sleep(5000);
		driver.navigate().back();
		driver.navigate().back();
		
	
		

	}

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost:7070/spring-mvc-example/");
		TestCase test = new TestCase();
		test.register();
		test.login();
		test.fail();

	}

}