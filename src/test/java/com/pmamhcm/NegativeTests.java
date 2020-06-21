package com.pmamhcm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeTests {

	@Test
	public void incorrectUsernameTest() throws InterruptedException {
		System.out.println("Starting incorrectUsernameTest");

//			Create driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

//			sleep for 3 seconds
		sleep(3000);

//			maximize browser window
		driver.manage().window().maximize();

//			open test page
		driver.get("https://www.pmamhcm.com/");
		System.out.println("Page is opened.");

//	 		sleep for 2 seconds		
		sleep(2000);

//			enter username
		driver.findElement(By.xpath("//div[@class='modal-header']//child::button")).click();
		Actions action = new Actions(driver);
		WebElement hoverLogin = driver.findElement(By.xpath("//div[@id='navbarDropdownLogin']"));
		action.moveToElement(hoverLogin).build().perform();
		driver.switchTo().frame(driver.findElement(By.id("frmLogin")));
		action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtUserName']"))).click()
				.sendKeys("incorrectUsername").build().perform();

//			enter password
		action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtPassword']"))).click()
				.sendKeys("Dallas@2019").build().perform();

//			click login button
		action.moveToElement(driver.findElement(By.xpath("//input[@name='btnNewLogin']"))).click().build().perform();

//			sleep for 2 seconds
		sleep(2000);

// 		Verifications
		WebElement errorMessage = driver.findElement(By.xpath("//b[contains(text(),'Alert Message:')]"));
		String expectedErrorMessage = "";
		String actualErrorMessage = errorMessage.getText();

		Assert.assertTrue(actualErrorMessage.contains(expectedErrorMessage),
				"Actual error message does not contain expected. \nActual: " + actualErrorMessage + "\nExpected: "
						+ expectedErrorMessage);

		// Close browser
		driver.quit();

	}

	@Test
	public void incorrectPasswordTest() throws InterruptedException {
		System.out.println("Starting incorrectPasswordTest");

//			Create driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

//			sleep for 3 seconds
		sleep(3000);

//			maximize browser window
		driver.manage().window().maximize();

//			open test page
		driver.get("https://www.pmamhcm.com/");
		System.out.println("Page is opened.");

//	 		sleep for 2 seconds		
		sleep(2000);

//			enter username
		driver.findElement(By.xpath("//div[@class='modal-header']//child::button")).click();
		Actions action = new Actions(driver);
		WebElement hoverLogin = driver.findElement(By.xpath("//div[@id='navbarDropdownLogin']"));
		action.moveToElement(hoverLogin).build().perform();
		driver.switchTo().frame(driver.findElement(By.id("frmLogin")));
		action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtUserName']"))).click()
				.sendKeys("sales.demo@pmam.com").build().perform();

//			enter password
		action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtPassword']"))).click()
				.sendKeys("incorrectPassword").build().perform();

//			click login button
		action.moveToElement(driver.findElement(By.xpath("//input[@name='btnNewLogin']"))).click().build().perform();

//			sleep for 2 seconds
		sleep(2000);

		// Verifications
		WebElement errorMessage = driver.findElement(By.xpath("//b[contains(text(),'Alert Message:')]"));
		String expectedErrorMessage = "";
		String actualErrorMessage = errorMessage.getText();

		Assert.assertTrue(actualErrorMessage.contains(expectedErrorMessage),
				"Actual error message does not contain expected. \nActual: " + actualErrorMessage + "\nExpected: "
						+ expectedErrorMessage);

		// Close browser
		driver.quit();

	}

	private void sleep(long m) {
		try {
			Thread.sleep(m);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
