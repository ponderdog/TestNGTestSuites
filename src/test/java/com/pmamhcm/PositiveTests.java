package com.pmamhcm;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class PositiveTests {

	@Test(priority = 1)
	public void singleLoginLogoutTest() {
		System.out.println("Starting singleLoginLogoutTest");

//	Create driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

//	sleep for 3 seconds
		sleep(3000);

//	maximize browser window
		driver.manage().window().maximize();

//	open test page
		driver.get("https://www.pmamhcm.com/");
		System.out.println("Page is opened.");

// 	sleep for 2 seconds		
		sleep(2000);

//	enter username
		driver.findElement(By.xpath("//div[@class='modal-header']//child::button")).click();
		Actions action = new Actions(driver);
		WebElement hoverLogin = driver.findElement(By.xpath("//div[@id='navbarDropdownLogin']"));
		action.moveToElement(hoverLogin).build().perform();
		driver.switchTo().frame(driver.findElement(By.id("frmLogin")));
		action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtUserName']"))).click()
				.sendKeys("sales.demo@pmam.com").build().perform();

//	enter password
		action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtPassword']"))).click()
				.sendKeys("Dallas@2019").build().perform();

//	click login button
		action.moveToElement(driver.findElement(By.xpath("//input[@name='btnNewLogin']"))).click().build().perform();

//	sleep for 2 seconds
		sleep(2000);

//	click logout button
		driver.findElement(By.xpath("//a[@class='logout']")).click();

//	Close browser
		driver.quit();
	}

//	End of Test

//	Beginning of Test
//	This tests Login/Logout of 10 different users

	@Test(priority = 2)
	public void multipleLoginLogoutTest() {
		System.out.println("Starting multipleLoginLogoutTest");

//	Create driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

//	sleep for 3 seconds
		sleep(3000);

//	maximize browser window
		driver.manage().window().maximize();

//	open test page
		driver.get("https://www.pmamhcm.com/");
		System.out.println("Page is opened.");

//	 sleep for 2 seconds		
		sleep(2000);

//	login credentials
		String arr[][] = { { "sales.demo@pmam.com", "Dallas@2019" }, { "ruser@pmam.com", "Dallas@123" },
				{ "support_test@pmam.com", "Dallas@123" }, { "lieutenant.smith@gmial.com", "Dallas@2019" },
				{ "peter.smith@gmial.com", "dallas@123" }, { "officer.smith@gmial.com", "Dallas@2019" },
				{ "smith.peter@gmial.com", "dallas@2019" }, { "captain.smith@gmial.com", "Dallas@2019" },
				{ "david.smith@gmial.com", "Dallas@2019" }, { "admin@pmam.com", "dallas@2017" } };
		for (int i = 0; i < arr.length; i++)

//	enter username
		{
			driver.findElement(By.xpath("//div[@class='modal-header']//child::button")).click();
			Actions action = new Actions(driver);
			WebElement move = driver.findElement(By.xpath("//div[@id='navbarDropdownLogin']"));
			action.moveToElement(move).build().perform();
			driver.switchTo().frame(driver.findElement(By.id("frmLogin")));
			action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtUserName']"))).click()
					.sendKeys(arr[i][0]).build().perform();

//	enter password
			action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtPassword']"))).click()
					.sendKeys(arr[i][1]).build().perform();

//	click login button
			action.moveToElement(driver.findElement(By.xpath("//input[@name='btnNewLogin']"))).click().build()
					.perform();

//	sleep for 2 seconds
			sleep(2000);

//	click logout button
			driver.findElement(By.xpath("//a[@class='logout']")).click();

		}

//	Close browser
		driver.quit();

	}

//	End of test

//	Beginning of test
//	This tests the links within the footer of the page

	@Test(priority = 3)
	public void footerLinksTest() {
		System.out.println("Starting footerLinksTest");

//	Create driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

//	sleep for 3 seconds
		sleep(3000);

//	maximize browser window
		driver.manage().window().maximize();

//	open test page
		driver.get("https://www.pmamhcm.com/");
		System.out.println("Page is opened.");

//	sleep for 2 seconds		
		sleep(2000);

//	close video window
		driver.findElement(By.xpath("//div[@class='modal-header']//child::button")).click();

//	open footer links
		WebElement footerdriver = driver.findElement(By.xpath("//div[@class='row footerspc']"));

		for (int i = 0; i < footerdriver.findElements(By.tagName("a")).size(); i++) {
			String clickonlinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			footerdriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
			sleep(5000);
		}

//	Close browser
		driver.quit();

	}

//	End of test

//	Beginning of test
//	Assign and Unassign a Policy

	@Test(priority = 4)
	public void assignUnassignPolicyTest() {
		System.out.println("Starting AssignUnassignPolicyTest");

//	Create driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

//	sleep for 3 seconds
		sleep(3000);

//	maximize browser window
		driver.manage().window().maximize();

//	open test page
		driver.get("https://www.pmamhcm.com/");
		System.out.println("Page is opened.");

// 	sleep for 2 seconds		
		sleep(2000);

//	enter username
		driver.findElement(By.xpath("//div[@class='modal-header']//child::button")).click();
		Actions action = new Actions(driver);
		WebElement hoverLogin = driver.findElement(By.xpath("//div[@id='navbarDropdownLogin']"));
		action.moveToElement(hoverLogin).build().perform();
		driver.switchTo().frame(driver.findElement(By.id("frmLogin")));
		action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtUserName']"))).click()
				.sendKeys("sales.demo@pmam.com").build().perform();

//	enter password
		action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtPassword']"))).click()
				.sendKeys("Dallas@2019").build().perform();

//	click login button
		action.moveToElement(driver.findElement(By.xpath("//input[@name='btnNewLogin']"))).click().build().perform();

//	sleep for 2 seconds
		sleep(2000);

//	assign policy
		driver.findElement(By.xpath("//a[contains(text(),'Policy')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Assign Policy')]")).click();
		sleep(2000);
		driver.findElement(By.xpath("//a[@id='gvCourse_ctl06_HyperLink1']")).click();
		driver.findElement(By.xpath("//input[@id='rptLevel_ctl01_rptLevelContent_ctl03_chkpublishLevelContent']"))
				.click();
		driver.findElement(By.xpath("//input[@id='btnpublish']")).click();
		driver.findElement(By.xpath("//input[@id='btnAssignSelected']")).click();
		driver.findElement(By.xpath("//input[@id='TabIntExternalEmpList_PanlInternal_EmpDtl_ctl10_chkId']")).click();
		driver.findElement(By.xpath("//input[@id='btnTopContinue']")).click();
		driver.findElement(By.xpath("//input[@id='TabContainer1_TabPanel1_GvAssignPolicyDoc_ctl02_BtnFromdate']"))
				.click();
		driver.findElement(
				By.xpath("//div[@id='TabContainer1_TabPanel1_GvAssignPolicyDoc_ctl02_CalendarExtender21_today']"))
				.click();
		driver.findElement(By.xpath("//input[@id='TabContainer1_TabPanel1_GvAssignPolicyDoc_ctl02_btnEndDate']"))
				.click();
		driver.findElement(
				By.xpath("//div[@id='TabContainer1_TabPanel1_GvAssignPolicyDoc_ctl02_CalendarExtender1_today']"))
				.click();
		driver.findElement(By.xpath("//input[@id='BtnSave']")).click();
		driver.findElement(By.xpath("//input[@id='btnCloseContent1']")).click();

		sleep(2000);
//	unassign policy	
		driver.findElement(By.xpath("//input[@id='BtnUnAssign']")).click();
		driver.findElement(By.xpath("//a[@id='EmpDtl_ctl02_lnkView']")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='ifrmAssessmentLog']")));
		sleep(5000);
		driver.findElement(By.xpath("//input[@id='GrdAssignedTraining_ctl02_ChkAssignedTraining']")).click();
		driver.findElement(By.xpath("//input[@id='btnDeleteAssignedPolicy']")).click();

//	switch window
		Alert alert = driver.switchTo().alert();
		alert.accept();
		String winHandleBefore = driver.getWindowHandle();
		driver.switchTo().window(winHandleBefore);
		driver.findElement(By.xpath("//input[@id='imgbCloseLog']")).click();

//	logout
		driver.findElement(By.xpath("//a[@class='logout']")).click();

//	Close browser
		driver.quit();

	}

//	End of test

// 	Beginning of test
// 	Assign and Complete a Policy

	@Test(priority = 5)
	public void completePolicyTest() {
		System.out.println("Starting completePolicyTest");

//	Create driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

//	sleep for 3 seconds
		sleep(3000);

//	maximize browser window
		driver.manage().window().maximize();

//	open test page
		driver.get("https://www.pmamhcm.com/");
		System.out.println("Page is opened.");

// 	sleep for 2 seconds		
		sleep(2000);

//	enter username
		driver.findElement(By.xpath("//div[@class='modal-header']//child::button")).click();
		Actions action = new Actions(driver);
		WebElement hoverLogin = driver.findElement(By.xpath("//div[@id='navbarDropdownLogin']"));
		action.moveToElement(hoverLogin).build().perform();
		driver.switchTo().frame(driver.findElement(By.id("frmLogin")));
		action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtUserName']"))).click()
				.sendKeys("sales.demo@pmam.com").build().perform();

//	enter password
		action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtPassword']"))).click()
				.sendKeys("Dallas@2019").build().perform();

//	click login button
		action.moveToElement(driver.findElement(By.xpath("//input[@name='btnNewLogin']"))).click().build().perform();

//	sleep for 2 seconds
		sleep(2000);

//	assign policy
		driver.findElement(By.xpath("//a[contains(text(),'Policy')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Assign Policy')]")).click();
		sleep(2000);
		driver.findElement(By.xpath("//a[@id='gvCourse_ctl06_HyperLink1']")).click();
		driver.findElement(By.xpath("//input[@id='rptLevel_ctl01_rptLevelContent_ctl03_chkpublishLevelContent']"))
				.click();
		driver.findElement(By.xpath("//input[@id='btnpublish']")).click();
		driver.findElement(By.xpath("//input[@id='btnAssignSelected']")).click();
		driver.findElement(By.xpath("//input[@id='TabIntExternalEmpList_PanlInternal_EmpDtl_ctl34_chkId']")).click();
		driver.findElement(By.xpath("//input[@id='btnTopContinue']")).click();
		driver.findElement(By.xpath("//input[@id='TabContainer1_TabPanel1_GvAssignPolicyDoc_ctl02_BtnFromdate']"))
				.click();
		driver.findElement(
				By.xpath("//div[@id='TabContainer1_TabPanel1_GvAssignPolicyDoc_ctl02_CalendarExtender21_today']"))
				.click();
		driver.findElement(By.xpath("//input[@id='TabContainer1_TabPanel1_GvAssignPolicyDoc_ctl02_btnEndDate']"))
				.click();
		driver.findElement(
				By.xpath("//div[@id='TabContainer1_TabPanel1_GvAssignPolicyDoc_ctl02_CalendarExtender1_today']"))
				.click();
		driver.findElement(By.xpath("//input[@id='BtnSave']")).click();
		driver.findElement(By.xpath("//input[@id='btnCloseContent1']")).click();

//	Go to Homepage
		driver.findElement(By.xpath("//a[@id='homelogo']")).click();

//	Open Policy Document
		driver.findElement(By.xpath("//a[@id='gvPolicy_ctl02_lnkPolicyContent']")).click();
		String parentHandle = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		driver.close();
		driver.switchTo().window(parentHandle);
		driver.findElement(By.xpath("//input[@id='gvPolicy_ctl02_chkCompltdTrng']")).click();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}

//	Complete Policy Assignment

		driver.findElement(By.xpath("//input[@id='chkSelectAll']")).click();
		driver.findElement(By.xpath("//input[@name='GrdSignature$ctl02$btnESign']")).click();
		driver.findElement(By.xpath("//input[@id='btnSubmit']")).click();
		driver.switchTo().window(parentHandle);

//	Logout
		driver.findElement(By.xpath("//a[@class='logout']")).click();

//	Close browser
		driver.quit();

	}

//	End of test

//	Beginning of test
//	Assigns and Unassigns a training

	@Test(priority = 6)
	public void assignUnassignTrainingTest() {
		System.out.println("Starting assignUnassignTrainingTest");

//	Create driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

//	sleep for 3 seconds
		sleep(3000);

//	maximize browser window
		driver.manage().window().maximize();

//	open test page
		driver.get("https://www.pmamhcm.com/");
		System.out.println("Page is opened.");

// 	sleep for 2 seconds		
		sleep(2000);

//	enter username
		driver.findElement(By.xpath("//div[@class='modal-header']//child::button")).click();
		Actions action = new Actions(driver);
		WebElement hoverLogin = driver.findElement(By.xpath("//div[@id='navbarDropdownLogin']"));
		action.moveToElement(hoverLogin).build().perform();
		driver.switchTo().frame(driver.findElement(By.id("frmLogin")));
		action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtUserName']"))).click()
				.sendKeys("sales.demo@pmam.com").build().perform();

//	enter password
		action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtPassword']"))).click()
				.sendKeys("Dallas@2019").build().perform();

//	click login button
		action.moveToElement(driver.findElement(By.xpath("//input[@name='btnNewLogin']"))).click().build().perform();

//	sleep for 2 seconds
		sleep(2000);

//	assign training
		driver.findElement(By.xpath("//a[contains(text(),'Training')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Assign Training')]")).click();
		// Thread.sleep(5000);
		driver.findElement(By.id("GridviewTraining_ctl04_ChkTraining")).click();
		driver.findElement(By.xpath("//input[@id='btnAssign']")).click();
		driver.findElement(By.xpath("//input[@id='btnAssignSelected']")).click();
		driver.findElement(By.xpath("//input[@id='TabIntExternalEmpList_PanlInternal_EmpDtl_ctl10_chkId']")).click();
		driver.findElement(By.xpath("//input[@id='btnEmployeeNew']")).click();
		driver.findElement(By.id("TabContainer1_TabPanel1_GridviewAssign_ctl02_GridviewTraining_ctl02_BtnFromdate"))
				.click();
		driver.findElement(
				By.id("TabContainer1_TabPanel1_GridviewAssign_ctl02_GridviewTraining_ctl02_CalendarExtender21_today"))
				.click();
		driver.findElement(By.id("TabContainer1_TabPanel1_GridviewAssign_ctl02_GridviewTraining_ctl02_btnEndDate"))
				.click();
		driver.findElement(
				By.id("TabContainer1_TabPanel1_GridviewAssign_ctl02_GridviewTraining_ctl02_CalendarExtender1_today"))
				.click();
		driver.findElement(By.xpath("//input[@id='BtnSave']")).click();
		driver.findElement(By.xpath("//input[@id='btnCloseContent1']")).click();

// unassign training
		driver.findElement(By.id("GridviewTraining_ctl04_lnkUnassign")).click();
		sleep(5000);
		String parentHandle = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}

		driver.findElement(By.xpath("//*[@id='GrdAssignedTraining_ctl02_ChkAssignedTraining']")).click();
		driver.findElement(By.xpath("//input[@id='btnDeleteAssignedTraining']")).click();

		Alert alert = driver.switchTo().alert();
		alert.accept();
		String winHandleBefore = driver.getWindowHandle();
		driver.switchTo().window(winHandleBefore);
		driver.close();
		driver.switchTo().window(parentHandle);

//	logout
		driver.findElement(By.xpath("//a[@class='logout']")).click();

//	Close browser
		driver.quit();

	}

//	End of test

//	Beginning of test
//	Assign and complete a training

	@Test(priority = 7)
	public void completeTrainingTest() {
		System.out.println("Starting completeTrainingTest");

//	Create driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

//	sleep for 3 seconds
		sleep(3000);

//	maximize browser window
		driver.manage().window().maximize();

//	open test page
		driver.get("https://www.pmamhcm.com/");
		System.out.println("Page is opened.");

// 	sleep for 2 seconds		
		sleep(2000);

//	enter username
		driver.findElement(By.xpath("//div[@class='modal-header']//child::button")).click();
		Actions action = new Actions(driver);
		WebElement hoverLogin = driver.findElement(By.xpath("//div[@id='navbarDropdownLogin']"));
		action.moveToElement(hoverLogin).build().perform();
		driver.switchTo().frame(driver.findElement(By.id("frmLogin")));
		action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtUserName']"))).click()
				.sendKeys("sales.demo@pmam.com").build().perform();

//	enter password
		action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtPassword']"))).click()
				.sendKeys("Dallas@2019").build().perform();

//	click login button
		action.moveToElement(driver.findElement(By.xpath("//input[@name='btnNewLogin']"))).click().build().perform();

//	sleep for 2 seconds
		sleep(2000);

//	assign training
		driver.findElement(By.xpath("//a[contains(text(),'Training')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Assign Training')]")).click();
		// Thread.sleep(5000);
		driver.findElement(By.id("GridviewTraining_ctl04_ChkTraining")).click();
		driver.findElement(By.xpath("//input[@id='btnAssign']")).click();
		driver.findElement(By.xpath("//input[@id='btnAssignSelected']")).click();
		driver.findElement(By.xpath(
				"/html[1]/body[1]/form[1]/div[3]/table[2]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[1]/div[1]/table[1]/tbody[1]/tr[4]/td[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[2]/td[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/div[1]/table[1]/tbody[1]/tr[34]/td[1]/span[1]/input[1]"))
				.click();
		driver.findElement(By.xpath("//input[@id='btnEmployeeNew']")).click();
		driver.findElement(By.id("TabContainer1_TabPanel1_GridviewAssign_ctl02_GridviewTraining_ctl02_BtnFromdate"))
				.click();
		driver.findElement(
				By.id("TabContainer1_TabPanel1_GridviewAssign_ctl02_GridviewTraining_ctl02_CalendarExtender21_today"))
				.click();
		driver.findElement(By.id("TabContainer1_TabPanel1_GridviewAssign_ctl02_GridviewTraining_ctl02_btnEndDate"))
				.click();
		driver.findElement(
				By.id("TabContainer1_TabPanel1_GridviewAssign_ctl02_GridviewTraining_ctl02_CalendarExtender1_today"))
				.click();
		driver.findElement(By.xpath("//input[@id='BtnSave']")).click();
		driver.findElement(By.xpath("//input[@id='btnCloseContent1']")).click();

//	Go to homepage
		driver.findElement(By.xpath("//a[@id='homelogo']")).click();

//	Complete and Submit Training
		driver.findElement(By.id("EmpGrid_ctl02_lnkTrngName")).click();
		String parentHandle = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		driver.close();
		driver.switchTo().window(parentHandle);
		driver.findElement(By.xpath("//input[@id='EmpGrid_ctl02_chkCompltdTrng']")).click();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		driver.findElement(By.xpath("//input[@id='chkSelectAll']")).click();
		driver.findElement(By.xpath("//input[@name='GrdSignature$ctl02$btnESign']")).click();
		driver.findElement(By.xpath("//input[@id='btnSubmit']")).click();
		driver.switchTo().window(parentHandle);

//	Logout
		driver.findElement(By.xpath("//a[@class='logout']")).click();

//	Close browser
		driver.quit();

	}

//	End of test

//	Beginning of test
//	Switch to PAS Module

	@Test(priority = 8)
	public void switchModuleTest() {
		System.out.println("Starting switchModuleTest");

//	Create driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

//	sleep for 3 seconds
		sleep(3000);

//	maximize browser window
		driver.manage().window().maximize();

//	open test page
		driver.get("https://www.pmamhcm.com/");
		System.out.println("Page is opened.");

// 	sleep for 2 seconds		
		sleep(2000);

//	enter username
		driver.findElement(By.xpath("//div[@class='modal-header']//child::button")).click();
		Actions action = new Actions(driver);
		WebElement hoverLogin = driver.findElement(By.xpath("//div[@id='navbarDropdownLogin']"));
		action.moveToElement(hoverLogin).build().perform();
		driver.switchTo().frame(driver.findElement(By.id("frmLogin")));
		action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtUserName']"))).click()
				.sendKeys("sales.demo@pmam.com").build().perform();

//	enter password
		action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtPassword']"))).click()
				.sendKeys("Dallas@2019").build().perform();

//	click login button
		action.moveToElement(driver.findElement(By.xpath("//input[@name='btnNewLogin']"))).click().build().perform();

//	sleep for 2 seconds
		sleep(2000);

//	switch module
		WebElement hoverDropdown = driver.findElement(By.xpath("//input[@id='HCM_Menu_imgSet']"));
		action.moveToElement(hoverDropdown).build().perform();

//	sleep for 5 seconds
		sleep(5000);

//	select PAS
		driver.findElement(By.xpath("//a[@href='HCM_EmployeeAppAccess.aspx']")).click();
		driver.findElement(By.xpath("//input[@id='imgPas']")).click();

//	sleep for 5 seconds	
		sleep(5000);

//	close browser
		driver.close();

	}

//	End of test

//	Beginning of test
//	Post Message

	@Test(priority = 9)
	public void postMessageTest() {
		System.out.println("Starting postMessageTest");

//	Create driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

//	sleep for 3 seconds
		sleep(3000);

//	maximize browser window
		driver.manage().window().maximize();

//	open test page
		driver.get("https://www.pmamhcm.com/");
		System.out.println("Page is opened.");

//	sleep for 2 seconds		
		sleep(2000);

//	enter username
		driver.findElement(By.xpath("//div[@class='modal-header']//child::button")).click();
		Actions action = new Actions(driver);
		WebElement hoverLogin = driver.findElement(By.xpath("//div[@id='navbarDropdownLogin']"));
		action.moveToElement(hoverLogin).build().perform();
		driver.switchTo().frame(driver.findElement(By.id("frmLogin")));
		action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtUserName']"))).click()
				.sendKeys("sales.demo@pmam.com").build().perform();

//	enter password
		action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtPassword']"))).click()
				.sendKeys("Dallas@2019").build().perform();

//	click login button
		action.moveToElement(driver.findElement(By.xpath("//input[@name='btnNewLogin']"))).click().build().perform();

//	sleep for 2 seconds
		sleep(2000);

//	go to Send Message
		WebElement hoverDropdown = driver.findElement(By.xpath("//input[@id='HCM_Menu_imgSet']"));
		action.moveToElement(hoverDropdown).build().perform();

//	sleep for 5 seconds	
		sleep(5000);

//	post Message
		driver.findElement(By.xpath("//a[contains(text(),'Send Message')]")).click();
		driver.findElement(By.xpath("//input[@id='txtSubject']")).sendKeys("This is a Test Message");
		driver.findElement(By.id("txtMessage")).sendKeys("Test Automation of the Message Section");
		driver.findElement(By.xpath("//input[@value='Select Employees & Send Message']")).click();

//	sleep for 5 seconds
		sleep(5000);

//	assign to employee
		driver.findElement(By.xpath("//input[@id='EmpDtl_ctl30_ChkSelectEmp']")).click();
		driver.findElement(By.xpath("//input[@id='btnBroadcastEmp']")).click();

//	sleep for 5 seconds
		sleep(5000);

//	accept
		driver.findElement(By.xpath("//input[@id='Button2']")).click();

//	go to homepage	
		driver.findElement(By.xpath("//a[@id='homelogo']")).click();

//	archive message	
		driver.findElement(By.xpath("//a[@id='GrdMsg_ctl02_lnkArchive']")).click();

//	close browser	
		driver.close();

	}

//	End of test

//	Beginning of test
//	Inactivate Activate an Employee

	@Test(priority = 10)
	public void inactivateActivateEmployeeTest() {
		System.out.println("Starting inactivateActivateEmployeeTest");

//	Create driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

//	sleep for 3 seconds
		sleep(3000);

//	maximize browser window
		driver.manage().window().maximize();

//	open test page
		driver.get("https://www.pmamhcm.com/");
		System.out.println("Page is opened.");

//	sleep for 2 seconds		
		sleep(2000);

//	enter username
		driver.findElement(By.xpath("//div[@class='modal-header']//child::button")).click();
		Actions action = new Actions(driver);
		WebElement hoverLogin = driver.findElement(By.xpath("//div[@id='navbarDropdownLogin']"));
		action.moveToElement(hoverLogin).build().perform();
		driver.switchTo().frame(driver.findElement(By.id("frmLogin")));
		action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtUserName']"))).click()
				.sendKeys("sales.demo@pmam.com").build().perform();

//	enter password
		action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtPassword']"))).click()
				.sendKeys("Dallas@2019").build().perform();

//	click login button
		action.moveToElement(driver.findElement(By.xpath("//input[@name='btnNewLogin']"))).click().build().perform();

//	sleep for 2 seconds
		sleep(2000);

//	click Employee section
		driver.findElement(By.xpath("//a[@id='employeemenu']")).click();

//	inactivate employee		
		driver.findElement(By.xpath("//input[@id='EmpDtl_ctl07_DelBtn']")).click();

//	select ok		
		driver.switchTo().alert().accept();

//	sleep for 5 seconds	
		sleep(5000);

//	go to inactive employee
		driver.findElement(By.xpath("//a[@id='lnkArchiveEmp']")).click();

//	activate employee		
		driver.findElement(By.xpath("//input[@id='EmpDtl_ctl16_BtnActivate']")).click();

//	select ok		
		driver.switchTo().alert().accept();

//	sleep for 5 seconds	
		sleep(5000);

//	go to active employee
		driver.findElement(By.xpath("//a[@id='lnkActiveEmp']")).click();

//	closer browser	
		driver.close();

	}

//	End of test

//	Beginning of test
//	Inactivate and Activate a Feedback Form

	@Test(priority = 11)
	public void inactivateActivateFeedbackTest() {
		System.out.println("Starting inactivateActivateFeedbackTest");

//	Create driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

//	sleep for 3 seconds
		sleep(3000);

//	maximize browser window
		driver.manage().window().maximize();

//	open test page
		driver.get("https://www.pmamhcm.com/");
		System.out.println("Page is opened.");

//	sleep for 2 seconds		
		sleep(2000);

//	enter username
		driver.findElement(By.xpath("//div[@class='modal-header']//child::button")).click();
		Actions action = new Actions(driver);
		WebElement hoverLogin = driver.findElement(By.xpath("//div[@id='navbarDropdownLogin']"));
		action.moveToElement(hoverLogin).build().perform();
		driver.switchTo().frame(driver.findElement(By.id("frmLogin")));
		action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtUserName']"))).click()
				.sendKeys("sales.demo@pmam.com").build().perform();

//	enter password
		action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtPassword']"))).click()
				.sendKeys("Dallas@2019").build().perform();

//	click login button
		action.moveToElement(driver.findElement(By.xpath("//input[@name='btnNewLogin']"))).click().build().perform();

//	sleep for 2 seconds
		sleep(2000);

// click Feedback
		driver.findElement(By.xpath(
				"/html[1]/body[1]/form[1]/table[1]/tbody[1]/tr[2]/td[1]/div[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[6]/a[1]"))
				.click();

// click Feedback Form
		driver.findElement(By.xpath("//div[@class='menu']//a[contains(text(),'Feedback Form')]")).click();

// click Inactivate
		WebElement hoverInactivate = driver.findElement(By.xpath(
				"//body/form[@id='form1']/table/tbody/tr/td/table/tbody/tr[@id='getActiveFeedback']/td/div[@id='PnlCertList']/div/table[@id='gvCertificationList']/tbody/tr[8]/td[6]/div[1]/div[1]/img[1]"));
		action.moveToElement(hoverInactivate).build().perform();
		sleep(2000);
		driver.findElement(By.id("gvCertificationList_ctl08_lkinactivate")).click();

// confirm
		Alert alert = driver.switchTo().alert();
		alert.accept();

// sleep for 2 seconds
		sleep(2000);

// confirm
		alert.accept();

// sleep for 2 seconds
		sleep(2000);

// click Inactive Tab
		driver.findElement(By.id("dvInActiveDtl")).click();

// click Activate
		WebElement hoverActivate = driver.findElement(By.xpath(
				"/html[1]/body[1]/form[1]/table[4]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[4]/td[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[6]/div[1]/div[1]/img[1]"));
		action.moveToElement(hoverActivate).build().perform();
		sleep(2000);
		driver.findElement(By.id("gvCertificationListInValid_ctl02_lkactivate")).click();

// confirm
		alert.accept();

// sleep for 2 seconds
		sleep(2000);

// confirm
		alert.accept();

// close driver
		driver.close();

	}

//	End of test

//	Beginning of test		
//	Inactivate and Activate a Policy

	@Test(priority = 12)
	public void inactivateActivatePolicyTest() {
		System.out.println("Starting inactivateActivatePolicyTest");

//	Create driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

//	sleep for 3 seconds
		sleep(3000);

//	maximize browser window
		driver.manage().window().maximize();

//	open test page
		driver.get("https://www.pmamhcm.com/");
		System.out.println("Page is opened.");

//	sleep for 2 seconds		
		sleep(2000);

//	enter username
		driver.findElement(By.xpath("//div[@class='modal-header']//child::button")).click();
		Actions action = new Actions(driver);
		WebElement hoverLogin = driver.findElement(By.xpath("//div[@id='navbarDropdownLogin']"));
		action.moveToElement(hoverLogin).build().perform();
		driver.switchTo().frame(driver.findElement(By.id("frmLogin")));
		action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtUserName']"))).click()
				.sendKeys("sales.demo@pmam.com").build().perform();

//	enter password
		action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtPassword']"))).click()
				.sendKeys("Dallas@2019").build().perform();

//	click login button
		action.moveToElement(driver.findElement(By.xpath("//input[@name='btnNewLogin']"))).click().build().perform();

//	sleep for 2 seconds
		sleep(2000);

//	click on Policy
		driver.findElement(By.xpath("//a[contains(text(),'Policy')]")).click();

// 	sleep for 2 seconds
		sleep(2000);

// 	click on List and Add Policy Category
		driver.findElement(By.xpath("//a[contains(text(),'List and Add Policy Category')]")).click();

// 	switch to Grid view
		driver.findElement(By.xpath("//select[@id='ddlCourseView']")).click();
		driver.findElement(By.xpath("//option[contains(text(),'Grid')]")).click();

// 	Inactivate Policy
		driver.findElement(By.id("gvCourse_ctl09_lnkInActive")).click();

// 	confirm
		Alert alert = driver.switchTo().alert();
		alert.accept();

// 	switch to Inactive
		driver.findElement(By.id("ddlActive")).click();
		driver.findElement(By.xpath("//option[contains(text(),'In Active')]")).click();

// 	sleep for 5 seconds
		sleep(5000);

// 	Activate Policy
		driver.findElement(By.id("rptPager_ctl06_lnkPage")).click();

// 	sleep for 5 seconds
		sleep(5000);

// 	switch to Active
		driver.findElement(By.id("gvCourse_ctl29_lnkActive")).click();

// 	sleep for 5 seconds
		sleep(5000);

// 	click on Policy
		driver.findElement(By.xpath("//a[contains(text(),'Policy')]")).click();

// 	sleep for 2 seconds
		sleep(2000);

// 	click on List and Add Policy Category
		driver.findElement(By.xpath("//a[contains(text(),'List and Add Policy Category')]")).click();

// 	close driver
		driver.close();

	}

//	End of test

//	Beginning of test
//	Inactivate and Activate a Policy

	@Test(priority = 13)
	public void inactivateActivateTrainingTest() {
		System.out.println("Starting inactivateActivateTrainingTest");

//	Create driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

//	sleep for 3 seconds
		sleep(3000);

//	maximize browser window
		driver.manage().window().maximize();

//	open test page
		driver.get("https://www.pmamhcm.com/");
		System.out.println("Page is opened.");

//	sleep for 2 seconds		
		sleep(2000);

//	enter username
		driver.findElement(By.xpath("//div[@class='modal-header']//child::button")).click();
		Actions action = new Actions(driver);
		WebElement hoverLogin = driver.findElement(By.xpath("//div[@id='navbarDropdownLogin']"));
		action.moveToElement(hoverLogin).build().perform();
		driver.switchTo().frame(driver.findElement(By.id("frmLogin")));
		action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtUserName']"))).click()
				.sendKeys("sales.demo@pmam.com").build().perform();

//	enter password
		action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtPassword']"))).click()
				.sendKeys("Dallas@2019").build().perform();

//	click login button
		action.moveToElement(driver.findElement(By.xpath("//input[@name='btnNewLogin']"))).click().build().perform();

//	sleep for 2 seconds
		sleep(2000);

//	click on Training
		driver.findElement(By.xpath("/html[1]/body[1]/form[1]/table[1]/tbody[1]/tr[2]/td[1]/div[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[3]/a[1]")).click();
		
//	sleep for 2 seconds
		sleep(2000);
		
//	click on Activate/Inactivate Training
		driver.findElement(By.xpath("//a[contains(text(),'Activate')]")).click();
		
// 	sleep for 2 seconds
		sleep(2000);
		
// 	deactivate training
		driver.findElement(By.id("TabContainer_panelActiveTr_gvActiveTrList_ctl04_lnkDeactive")).click();
		
//	sleep for 2 seconds	
		sleep(2000);
		
// 	confirm
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
// 	click on Inactive Training Tab		
		driver.findElement(By.id("__tab_TabContainer_panelDeactiveTrList")).click();
		
// 	sleep for 2 seconds
		sleep(2000);
		
// 	click on Activate
		driver.findElement(By.id("TabContainer_panelDeactiveTrList_gvDeactiveTrList_ctl04_lnkActive")).click();
	
// 	confirm
		alert.accept();
		
//	sleep for 2 seconds
		sleep(2000);
	
// 	click on Active Training Tab
		driver.findElement(By.id("__tab_TabContainer_panelActiveTr")).click();
		
// 	close driver
		driver.close();
		
	}

//	End of test

//	Beginning of test
//	Assign and Complete a Feedback

	@Test(priority = 14)
	public void completeFeedbackTest() {
		System.out.println("Starting completeFeedbackTest");

//	Create driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

//	sleep for 3 seconds
		sleep(3000);

//	maximize browser window
		driver.manage().window().maximize();

//	open test page
		driver.get("https://www.pmamhcm.com/");
		System.out.println("Page is opened.");

//	sleep for 2 seconds		
		sleep(2000);

//	enter username
		driver.findElement(By.xpath("//div[@class='modal-header']//child::button")).click();
		Actions action = new Actions(driver);
		WebElement hoverLogin = driver.findElement(By.xpath("//div[@id='navbarDropdownLogin']"));
		action.moveToElement(hoverLogin).build().perform();
		driver.switchTo().frame(driver.findElement(By.id("frmLogin")));
		action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtUserName']"))).click()
				.sendKeys("sales.demo@pmam.com").build().perform();

//	enter password
		action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtPassword']"))).click()
				.sendKeys("Dallas@2019").build().perform();

//	click login button
		action.moveToElement(driver.findElement(By.xpath("//input[@name='btnNewLogin']"))).click().build().perform();

//	sleep for 2 seconds
		sleep(2000);
	
//	click on Feedback
		driver.findElement(By.xpath("/html[1]/body[1]/form[1]/table[1]/tbody[1]/tr[2]/td[1]/div[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[6]/a[1]")).click();

// 	click on Feedback Form
		driver.findElement(By.xpath("//div[@class='menu']//a[contains(text(),'Feedback Form')]")).click();
		
// 	sleep for 2 seconds
		sleep(2000);

//	hover over Assign
		WebElement hoverAssign=driver.findElement(By.xpath("//body/form[@id='form1']/table/tbody/tr/td/table/tbody/tr[@id='getActiveFeedback']/td/div[@id='PnlCertList']/div/table[@id='gvCertificationList']/tbody/tr[8]/td[6]/div[1]/div[1]/img[1]"));
		action.moveToElement(hoverAssign).build().perform();
		
//	sleep for 2 seconds
		sleep(2000);
		
//	click on Assign
		driver.findElement(By.id("gvCertificationList_ctl08_LnkAssign")).click();
	
//	select Employee
		driver.findElement(By.id("EmpDtl_ctl34_ChkSelectEmp")).click();
		
//	select Next
		driver.findElement(By.id("btnDone")).click();
		
//	select Completion Date
		action.moveToElement(driver.findElement(By.xpath("//input[@id='TxtCompletionDate']"))).click().sendKeys("12/31/2050").build().perform();
		
//	sleep for 2 seconds
		sleep(2000);
		
//	Assign
		driver.findElement(By.xpath("//a[contains(text(),'Close')]")).click();
		driver.findElement(By.id("btnAssign")).click();
		
// 	click on homepage
		driver.findElement(By.xpath("//a[@id='homelogo']//img")).click();
		
// 	click on survey
		driver.findElement(By.id("tcSurveys_tpPending_GrdViewSurveys_ctl02_lnkSurveyName")).click();
		
//	click on Submit
		driver.findElement(By.id("btnSubmit")).click();
		
//	click on Send
		driver.findElement(By.id("BtnSend")).click();	
		
//	close driver
		driver.close();
		
	}

//	End of test

//	Beginning of test		
//	Opens an Employee Wise Detailed Policy Report

	@Test(priority = 15)
	public void reportsEmployeeWiseDetailedPolicyTest() {
		System.out.println("Starting reportsEmployeeWiseDetailedPolicyTest");

//	Create driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

//	sleep for 3 seconds
		sleep(3000);

//	maximize browser window
		driver.manage().window().maximize();

//	open test page
		driver.get("https://www.pmamhcm.com/");
		System.out.println("Page is opened.");

//	sleep for 2 seconds		
		sleep(2000);

//	enter username
		driver.findElement(By.xpath("//div[@class='modal-header']//child::button")).click();
		Actions action = new Actions(driver);
		WebElement hoverLogin = driver.findElement(By.xpath("//div[@id='navbarDropdownLogin']"));
		action.moveToElement(hoverLogin).build().perform();
		driver.switchTo().frame(driver.findElement(By.id("frmLogin")));
		action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtUserName']"))).click()
				.sendKeys("sales.demo@pmam.com").build().perform();

//	enter password
		action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtPassword']"))).click()
				.sendKeys("Dallas@2019").build().perform();

//	click login button
		action.moveToElement(driver.findElement(By.xpath("//input[@name='btnNewLogin']"))).click().build().perform();

//	sleep for 2 seconds
		sleep(2000);		
		
// 	go to the Reports section
		driver.findElement(By.xpath("//a[contains(text(),'Reports')]")).click();
		
// 	go to Employee-wise Detailed Policy Report
		driver.findElement(By.xpath("//a[contains(text(),'Employee-wise Detailed Policy')]")).click();
		
//	select the policy
		driver.findElement(By.xpath("//select[@id='ddlPolicy']")).click();
		driver.findElement(By.xpath("//option[contains(text(),'TPCA POLICY')]")).click();
		
//	run the report
		driver.findElement(By.id("btnEmployeeWise")).click();
		
//	close the driver
		driver.quit();			
		
	}

//	End of test

//	Beginning of test	
//	Opens an Employee Wise Detailed Training Report

	@Test(priority = 16)
	public void reportsEmployeeWiseDetailedTrainingTest() {
		System.out.println("Starting reportsEmployeeWiseDetailedTrainingTest");

//	Create driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

//	sleep for 3 seconds
		sleep(3000);

//	maximize browser window
		driver.manage().window().maximize();

//	open test page
		driver.get("https://www.pmamhcm.com/");
		System.out.println("Page is opened.");

//	sleep for 2 seconds		
		sleep(2000);

//	enter username
		driver.findElement(By.xpath("//div[@class='modal-header']//child::button")).click();
		Actions action = new Actions(driver);
		WebElement hoverLogin = driver.findElement(By.xpath("//div[@id='navbarDropdownLogin']"));
		action.moveToElement(hoverLogin).build().perform();
		driver.switchTo().frame(driver.findElement(By.id("frmLogin")));
		action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtUserName']"))).click()
				.sendKeys("sales.demo@pmam.com").build().perform();

//	enter password
		action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtPassword']"))).click()
				.sendKeys("Dallas@2019").build().perform();

//	click login button
		action.moveToElement(driver.findElement(By.xpath("//input[@name='btnNewLogin']"))).click().build().perform();

//	sleep for 2 seconds
		sleep(2000);		
		
// 	go to the Reports section
		driver.findElement(By.xpath("//a[contains(text(),'Reports')]")).click();
		
//	go to Employee-wise Detailed Training Report
		driver.findElement(By.xpath("//a[contains(text(),'Employee-wise Detailed Training')]")).click();
		
// 	insert date range
		action.moveToElement(driver.findElement(By.id("txtFromDt"))).click().sendKeys("12/31/2050").build().perform();
		action.moveToElement(driver.findElement(By.id("txtToDt"))).click().sendKeys("12/31/2050").build().perform();
		
//	sleep for 2 seconds
		sleep(2000);
		
//	close calendar
		driver.findElement(By.xpath("//a[contains(text(),'Close')]")).click();
		
//	run report
		driver.findElement(By.id("btnRun")).click();

//	sleep for 2 seconds
		sleep(2000);

//	close driver
		driver.quit();	
		
	}

//	End of test

//	Beginning of test
//	Opens a Policy Status Report

	@Test(priority = 17)
	public void reportsPolicyStatusTest() {
		System.out.println("Starting reportsPolicyStatusTest");

//	Create driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

//	sleep for 3 seconds
		sleep(3000);

//	maximize browser window
		driver.manage().window().maximize();

//	open test page
		driver.get("https://www.pmamhcm.com/");
		System.out.println("Page is opened.");

//	sleep for 2 seconds		
		sleep(2000);

//	enter username
		driver.findElement(By.xpath("//div[@class='modal-header']//child::button")).click();
		Actions action = new Actions(driver);
		WebElement hoverLogin = driver.findElement(By.xpath("//div[@id='navbarDropdownLogin']"));
		action.moveToElement(hoverLogin).build().perform();
		driver.switchTo().frame(driver.findElement(By.id("frmLogin")));
		action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtUserName']"))).click()
				.sendKeys("sales.demo@pmam.com").build().perform();

//	enter password
		action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtPassword']"))).click()
				.sendKeys("Dallas@2019").build().perform();

//	click login button
		action.moveToElement(driver.findElement(By.xpath("//input[@name='btnNewLogin']"))).click().build().perform();

//	sleep for 2 seconds
		sleep(2000);		
		
// 	go to the Reports section
		driver.findElement(By.xpath("//a[contains(text(),'Reports')]")).click();	
		
//	go to Policy Status		
		driver.findElement(By.xpath("//a[contains(text(),'Policy Status')]")).click();
		
//	select policy
		driver.findElement(By.id("gvPolicy_ctl10_chkPolicy")).click();
		
//	sleep for 2 seconds
		sleep(2000);
		
//	select Display by Employee		
		driver.findElement(By.id("btnEmployeeWise")).click();
		
//	close driver
		driver.close();

	}

//	End of test

//	Beginning of test	
//	Opens a Training Status Report

	@Test(priority = 18)
	public void reportsTrainingStatusTest() {
		System.out.println("Starting reportsTrainingStatusTest");

//	Create driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

//	sleep for 3 seconds
		sleep(3000);

//	maximize browser window
		driver.manage().window().maximize();

//	open test page
		driver.get("https://www.pmamhcm.com/");
		System.out.println("Page is opened.");

//	sleep for 2 seconds		
		sleep(2000);

//	enter username
		driver.findElement(By.xpath("//div[@class='modal-header']//child::button")).click();
		Actions action = new Actions(driver);
		WebElement hoverLogin = driver.findElement(By.xpath("//div[@id='navbarDropdownLogin']"));
		action.moveToElement(hoverLogin).build().perform();
		driver.switchTo().frame(driver.findElement(By.id("frmLogin")));
		action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtUserName']"))).click()
				.sendKeys("sales.demo@pmam.com").build().perform();

//	enter password
		action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtPassword']"))).click()
				.sendKeys("Dallas@2019").build().perform();

//	click login button
		action.moveToElement(driver.findElement(By.xpath("//input[@name='btnNewLogin']"))).click().build().perform();

//	sleep for 2 seconds
		sleep(2000);		
		
// 	go to the Reports section
		driver.findElement(By.xpath("//a[contains(text(),'Reports')]")).click();
		
//	go to Training Status
		driver.findElement(By.xpath("//a[contains(text(),'Training Status')]")).click();
		
//	select Display by Employee
		driver.findElement(By.id("btnEmployeeWise")).click();
		
//	close driver
		driver.close();
		
	}

//	End of test

//	Beginning of test		
		
	private void sleep(long m) {
		try {
			Thread.sleep(m);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
