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
		String arr[][] = { { "sales.demo@pmam.com", "Dallas@2019" }, { "ruser@pmam.com", "pmam@123" },
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

//	sleep for 3 seconds
			sleep(3000);

//	click logout button
			driver.findElement(By.xpath("//a[@class='logout']")).click();

		}

//	Close browser
		driver.quit();

	}

//	End of test

//	Beginning of test
//	This tests the Industries links within the footer of the page

	@Test(priority = 3)
	public void footerLinksIndustriesTest() {
		System.out.println("Starting footerLinksIndustriesTest");

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
		WebElement footerdriver = driver.findElement(By.xpath("//div[@class='row footerspc']/div[3]"));

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
		driver.findElement(By.xpath("//a[contains(text(),'TPCA POLICY')]")).click();
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
		driver.findElement(By.xpath("//a[contains(text(),'TPCA POLICY')]")).click();
		driver.findElement(By.xpath("//input[@id='rptLevel_ctl01_rptLevelContent_ctl03_chkpublishLevelContent']"))
				.click();
		driver.findElement(By.xpath("//input[@id='btnpublish']")).click();
		driver.findElement(By.xpath("//input[@id='btnAssignSelected']")).click();
		driver.findElement(By.xpath("//input[@id='TabIntExternalEmpList_PanlInternal_EmpDtl_ctl38_chkId']")).click();
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
		driver.findElement(By.xpath("//a[contains(text(),'1.3 Fiscal Management')]")).click();
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
		driver.findElement(By.xpath("//a[contains(text(),'ALERRT - Active Shooter')]")).click();
		driver.findElement(By.xpath("//input[@id='btnUpdateAssign']")).click();
		sleep(2000);
		driver.findElement(By.xpath("//input[@id='btnAssignSelected']")).click();
		driver.findElement(By.xpath("//input[@id='TabIntExternalEmpList_PanlInternal_EmpDtl_ctl38_chkId']")).click();
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
		driver.findElement(By.id("GridviewTraining_ctl81_lnkUnassign")).click();
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
		driver.findElement(By.xpath("//a[contains(text(),'ALERRT - Active Shooter')]")).click();
		driver.findElement(By.xpath("//input[@id='btnUpdateAssign']")).click();
		sleep(2000);
		driver.findElement(By.xpath("//input[@id='btnAssignSelected']")).click();
		sleep(5000);
		driver.findElement(By.id("TabIntExternalEmpList_PanlInternal_EmpDtl_ctl38_chkId")).click();
		sleep(5000);
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
		driver.findElement(By.xpath("//a[@id='homelogo']//img")).click();

//	Complete and Submit Training
		driver.findElement(By.xpath("//a[contains(text(),'ALERRT - Active Shooter')]")).click();
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
		driver.findElement(By.xpath("//input[@id='EmpDtl_ctl38_ChkSelectEmp']")).click();
		driver.findElement(By.xpath("//input[@id='btnBroadcastEmp']")).click();

//	sleep for 5 seconds
		sleep(5000);

//	accept
		driver.findElement(By.xpath("//input[@id='Button2']")).click();

//	go to homepage	
		driver.findElement(By.xpath("//a[@id='homelogo']//img")).click();

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
		driver.findElement(By.xpath("//input[@id='EmpDtl_ctl39_DelBtn']")).click();

//	select ok		
		driver.switchTo().alert().accept();

//	sleep for 5 seconds	
		sleep(5000);

//	go to inactive employee
		driver.findElement(By.xpath("//a[@id='lnkArchiveEmp']")).click();

//	activate employee		
		driver.findElement(By.xpath("//input[@id='EmpDtl_ctl47_BtnActivate']")).click();

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
		driver.findElement(By.xpath("//div[@class='menu']//a[contains(text(),'Feedback')]")).click();

// click Feedback Form
		driver.findElement(By.xpath("//div[@class='menu']//a[contains(text(),'Feedback Form')]")).click();

// click Inactivate
		WebElement hoverInactivate = driver.findElement(By.xpath(
				"/html[1]/body[1]/form[1]/table[4]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[3]/td[1]/div[1]/div[1]/table[1]/tbody[1]/tr[21]/td[6]/div[1]/div[1]/img[1]"));
		action.moveToElement(hoverInactivate).build().perform();
		sleep(2000);
		driver.findElement(By.id("gvCertificationList_ctl21_lkinactivate")).click();

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
		driver.findElement(By.id("gvCourse_ctl11_lnkInActive")).click();

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
		driver.findElement(By.id("gvCourse_ctl39_lnkActive")).click();

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
		driver.findElement(By.xpath("//a[contains(text(),'Training')]")).click();
		
//	sleep for 2 seconds
		sleep(2000);
		
//	click on Activate/Inactivate Training
		driver.findElement(By.xpath("//a[contains(text(),'Activate')]")).click();
		
// 	sleep for 2 seconds
		sleep(2000);
		
// 	deactivate training
		driver.findElement(By.id("TabContainer_panelActiveTr_gvActiveTrList_ctl05_lnkDeactive")).click();
		
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
		driver.findElement(By.xpath("//div[@class='menu']//a[contains(text(),'Feedback')]")).click();
// 	click on Feedback Form
		driver.findElement(By.xpath("//div[@class='menu']//a[contains(text(),'Feedback Form')]")).click();
		
// 	sleep for 2 seconds
		sleep(2000);

//	hover over Assign
		WebElement hoverAssign=driver.findElement(By.xpath("/html[1]/body[1]/form[1]/table[4]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[3]/td[1]/div[1]/div[1]/table[1]/tbody[1]/tr[21]/td[6]/div[1]/div[1]/img[1]"));
		action.moveToElement(hoverAssign).build().perform();
		
//	sleep for 2 seconds
		sleep(2000);
		
//	click on Assign
		driver.findElement(By.id("gvCertificationList_ctl21_LnkAssign")).click();
	
//	select Employee
		driver.findElement(By.id("EmpDtl_ctl38_ChkSelectEmp")).click();
		
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
		driver.findElement(By.xpath("//a[contains(text(),'CSR Training Feedback Form')]")).click();
		
		for (String winHandle : driver.getWindowHandles())
		{
			driver.switchTo().window(winHandle);
		}
		
//	click on Submit
		driver.findElement(By.id("btnSubmit")).click();
		
//	click on Send
		driver.findElement(By.id("BtnSend")).click();
		
		for (String winHandle : driver.getWindowHandles())	
		{
			driver.switchTo().window(winHandle);
		}
		
		
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
//	This tests the Product Resources links within the footer of the page

	@Test(priority = 19)
	public void footerLinksProductResourcesTest() {
		System.out.println("Starting footerLinksProductResourcesTest");

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
		WebElement footerdriver = driver.findElement(By.xpath("//div[@class='row footerspc']/div[2]"));

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
//	View Activate Inactivate Training Demo

	@Test(priority = 20)
	public void viewDemoActivateInactivateTrainingTest() {
		System.out.println("Starting viewDemoActivateInactivateTrainingTest");

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
		
// 	go to Training
		driver.findElement(By.xpath("//a[contains(text(),'Training')]")).click();
		
// 	go to Activate Inactivate Training
		driver.findElement(By.xpath("//a[contains(text(),'Activate/Inactivate Training')]")).click();
		
//	view demo
		driver.findElement(By.xpath("//input[@id='imgViewDemo']")).click();
	
//	sleep for 2 seconds		
		sleep(2000);
		
//		Close browser
			driver.quit();

		}

//		End of test

//		Beginning of test
//	View Add New Training Demo

	@Test(priority = 21)
	public void viewDemoAddNewTrainingTest() {
		System.out.println("Starting viewDemoAddNewTrainingTest");

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
		
// 	go to Training
		driver.findElement(By.xpath("//a[contains(text(),'Training')]")).click();
		
// 	go to Add New Training
		driver.findElement(By.xpath("//a[contains(text(),'Add New Training')]")).click();
		
//	view demo
		driver.findElement(By.xpath("//input[@id='imgViewDemo']")).click();
	
//	sleep for 2 seconds		
		sleep(2000);
		
//		Close browser
			driver.quit();

		}

//		End of test	
	
//	Beginning of test
//View Assign Policy Demo

@Test(priority = 22)
public void viewDemoAssignPolicyTest() {
	System.out.println("Starting viewDemoAssignPolicyTest");

//Create driver
	System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
	WebDriver driver = new ChromeDriver();

//sleep for 3 seconds
	sleep(3000);

//maximize browser window
	driver.manage().window().maximize();

//open test page
	driver.get("https://www.pmamhcm.com/");
	System.out.println("Page is opened.");

//	sleep for 2 seconds		
	sleep(2000);

//enter username
	driver.findElement(By.xpath("//div[@class='modal-header']//child::button")).click();
	Actions action = new Actions(driver);
	WebElement hoverLogin = driver.findElement(By.xpath("//div[@id='navbarDropdownLogin']"));
	action.moveToElement(hoverLogin).build().perform();
	driver.switchTo().frame(driver.findElement(By.id("frmLogin")));
	action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtUserName']"))).click()
			.sendKeys("sales.demo@pmam.com").build().perform();

//enter password
	action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtPassword']"))).click()
			.sendKeys("Dallas@2019").build().perform();

//click login button
	action.moveToElement(driver.findElement(By.xpath("//input[@name='btnNewLogin']"))).click().build().perform();

//sleep for 2 seconds
	sleep(2000);
	
//	go to Policy
	driver.findElement(By.xpath("//body/form[@id='form1']/table/tbody/tr/td/div/div[@class='topnav']/div[@class='fl']/div[@id='HCM_Menu_dvTopMenu']/div[@class='menu']/ul/li[4]/a[1]")).click();
	
//	go to Assign Policy
	driver.findElement(By.xpath("//a[contains(text(),'Assign Policy')]")).click();
	
//view demo
	driver.findElement(By.xpath("//input[@id='imgViewDemo']")).click();

//sleep for 2 seconds		
	sleep(2000);
	
//	Close browser
		driver.quit();

	}

//	End of test	

//Beginning of test
//View Assign Training Demo

@Test(priority = 23)
public void viewDemoAssignTrainingTest() {
System.out.println("Starting viewDemoAssignTrainingTest");

//Create driver
System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
WebDriver driver = new ChromeDriver();

//sleep for 3 seconds
sleep(3000);

//maximize browser window
driver.manage().window().maximize();

//open test page
driver.get("https://www.pmamhcm.com/");
System.out.println("Page is opened.");

//sleep for 2 seconds		
sleep(2000);

//enter username
driver.findElement(By.xpath("//div[@class='modal-header']//child::button")).click();
Actions action = new Actions(driver);
WebElement hoverLogin = driver.findElement(By.xpath("//div[@id='navbarDropdownLogin']"));
action.moveToElement(hoverLogin).build().perform();
driver.switchTo().frame(driver.findElement(By.id("frmLogin")));
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtUserName']"))).click()
		.sendKeys("sales.demo@pmam.com").build().perform();

//enter password
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtPassword']"))).click()
		.sendKeys("Dallas@2019").build().perform();

//click login button
action.moveToElement(driver.findElement(By.xpath("//input[@name='btnNewLogin']"))).click().build().perform();

//sleep for 2 seconds
sleep(2000);

//go to Training
driver.findElement(By.xpath("//a[contains(text(),'Training')]")).click();

//go to Assign Training
driver.findElement(By.xpath("//a[contains(text(),'Assign Training')]")).click();

//view demo
driver.findElement(By.xpath("//input[@id='imgViewDemo']")).click();

//sleep for 2 seconds		
sleep(2000);

//Close browser
	driver.quit();

}

//End of test	

//Beginning of test
//View Assign Training to All Employees Demo

@Test(priority = 24)
public void viewDemoAssignTrainingtoAllEmployeesTest() {
System.out.println("Starting viewDemoAssignTrainingtoAllEmployeesTest");

//Create driver
System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
WebDriver driver = new ChromeDriver();

//sleep for 3 seconds
sleep(3000);

//maximize browser window
driver.manage().window().maximize();

//open test page
driver.get("https://www.pmamhcm.com/");
System.out.println("Page is opened.");

//sleep for 2 seconds		
sleep(2000);

//enter username
driver.findElement(By.xpath("//div[@class='modal-header']//child::button")).click();
Actions action = new Actions(driver);
WebElement hoverLogin = driver.findElement(By.xpath("//div[@id='navbarDropdownLogin']"));
action.moveToElement(hoverLogin).build().perform();
driver.switchTo().frame(driver.findElement(By.id("frmLogin")));
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtUserName']"))).click()
		.sendKeys("sales.demo@pmam.com").build().perform();

//enter password
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtPassword']"))).click()
		.sendKeys("Dallas@2019").build().perform();

//click login button
action.moveToElement(driver.findElement(By.xpath("//input[@name='btnNewLogin']"))).click().build().perform();

//sleep for 2 seconds
sleep(2000);

//go to Training
driver.findElement(By.xpath("//a[contains(text(),'Training')]")).click();

//go to Assign Training
driver.findElement(By.xpath("//a[contains(text(),'Assign Training to All Employees')]")).click();

//view demo
driver.findElement(By.xpath("//input[@id='imgViewDemo']")).click();

//sleep for 2 seconds		
sleep(2000);

//Close browser
	driver.quit();

}

//End of test	
	
//Beginning of test
//View Audit Submission Demo

@Test(priority = 25)
public void viewDemoAuditSubmissionTest() {
System.out.println("Starting viewDemoAuditSubmissionTest");

//Create driver
System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
WebDriver driver = new ChromeDriver();

//sleep for 3 seconds
sleep(3000);

//maximize browser window
driver.manage().window().maximize();

//open test page
driver.get("https://www.pmamhcm.com/");
System.out.println("Page is opened.");

//sleep for 2 seconds		
sleep(2000);

//enter username
driver.findElement(By.xpath("//div[@class='modal-header']//child::button")).click();
Actions action = new Actions(driver);
WebElement hoverLogin = driver.findElement(By.xpath("//div[@id='navbarDropdownLogin']"));
action.moveToElement(hoverLogin).build().perform();
driver.switchTo().frame(driver.findElement(By.id("frmLogin")));
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtUserName']"))).click()
		.sendKeys("sales.demo@pmam.com").build().perform();

//enter password
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtPassword']"))).click()
		.sendKeys("Dallas@2019").build().perform();

//click login button
action.moveToElement(driver.findElement(By.xpath("//input[@name='btnNewLogin']"))).click().build().perform();

//sleep for 2 seconds
sleep(2000);

//go to Audit
WebElement hoverAudit=driver.findElement(By.xpath("//a[contains(text(),'Audit')]//img"));
action.moveToElement(hoverAudit).build().perform();

//go to Audit Submission
driver.findElement(By.xpath("//a[contains(text(),'Audit Submission')]")).click();

//view demo
driver.findElement(By.xpath("//input[@id='imgViewDemo']")).click();

//sleep for 2 seconds		
sleep(2000);

//Close browser
	driver.quit();

}

//End of test

//Beginning of test
//View Employees Demo

@Test(priority = 26)
public void viewDemoEmployeesTest() {
System.out.println("Starting viewDemoEmployeesTest");

//Create driver
System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
WebDriver driver = new ChromeDriver();

//sleep for 3 seconds
sleep(3000);

//maximize browser window
driver.manage().window().maximize();

//open test page
driver.get("https://www.pmamhcm.com/");
System.out.println("Page is opened.");

//sleep for 2 seconds		
sleep(2000);

//enter username
driver.findElement(By.xpath("//div[@class='modal-header']//child::button")).click();
Actions action = new Actions(driver);
WebElement hoverLogin = driver.findElement(By.xpath("//div[@id='navbarDropdownLogin']"));
action.moveToElement(hoverLogin).build().perform();
driver.switchTo().frame(driver.findElement(By.id("frmLogin")));
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtUserName']"))).click()
		.sendKeys("sales.demo@pmam.com").build().perform();

//enter password
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtPassword']"))).click()
		.sendKeys("Dallas@2019").build().perform();

//click login button
action.moveToElement(driver.findElement(By.xpath("//input[@name='btnNewLogin']"))).click().build().perform();

//sleep for 2 seconds
sleep(2000);

//go to Employees
driver.findElement(By.xpath("//a[@id='employeemenu']")).click();

//view demo
driver.findElement(By.xpath("//input[@id='imgViewDemo']")).click();

//sleep for 2 seconds		
sleep(2000);

//Close browser
	driver.quit();

}

//End of test

//Beginning of test
//View Feedback Form Demo

@Test(priority = 27)
public void viewDemoFeedbackFormTest() {
System.out.println("Starting viewDemoFeedbackFormTest");

//Create driver
System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
WebDriver driver = new ChromeDriver();

//sleep for 3 seconds
sleep(3000);

//maximize browser window
driver.manage().window().maximize();

//open test page
driver.get("https://www.pmamhcm.com/");
System.out.println("Page is opened.");

//sleep for 2 seconds		
sleep(2000);

//enter username
driver.findElement(By.xpath("//div[@class='modal-header']//child::button")).click();
Actions action = new Actions(driver);
WebElement hoverLogin = driver.findElement(By.xpath("//div[@id='navbarDropdownLogin']"));
action.moveToElement(hoverLogin).build().perform();
driver.switchTo().frame(driver.findElement(By.id("frmLogin")));
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtUserName']"))).click()
		.sendKeys("sales.demo@pmam.com").build().perform();

//enter password
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtPassword']"))).click()
		.sendKeys("Dallas@2019").build().perform();

//click login button
action.moveToElement(driver.findElement(By.xpath("//input[@name='btnNewLogin']"))).click().build().perform();

//sleep for 2 seconds
sleep(2000);

//go to Feedback
driver.findElement(By.xpath("//a[contains(text(),'Feedback')]")).click();

//go to Feedback Form
driver.findElement(By.xpath("//a[contains(text(),'Feedback Form')]")).click();

//view demo
driver.findElement(By.xpath("//input[@id='imgViewDemo']")).click();

//sleep for 2 seconds		
sleep(2000);

//Close browser
	driver.quit();

}

//End of test

//Beginning of test
//View Home Demo

@Test(priority = 28)
public void viewDemoHomeTest() {
System.out.println("Starting viewDemoHomeTest");

//Create driver
System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
WebDriver driver = new ChromeDriver();

//sleep for 3 seconds
sleep(3000);

//maximize browser window
driver.manage().window().maximize();

//open test page
driver.get("https://www.pmamhcm.com/");
System.out.println("Page is opened.");

//sleep for 2 seconds		
sleep(2000);

//enter username
driver.findElement(By.xpath("//div[@class='modal-header']//child::button")).click();
Actions action = new Actions(driver);
WebElement hoverLogin = driver.findElement(By.xpath("//div[@id='navbarDropdownLogin']"));
action.moveToElement(hoverLogin).build().perform();
driver.switchTo().frame(driver.findElement(By.id("frmLogin")));
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtUserName']"))).click()
		.sendKeys("sales.demo@pmam.com").build().perform();

//enter password
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtPassword']"))).click()
		.sendKeys("Dallas@2019").build().perform();

//click login button
action.moveToElement(driver.findElement(By.xpath("//input[@name='btnNewLogin']"))).click().build().perform();

//sleep for 2 seconds
sleep(2000);

//view demo
driver.findElement(By.id("imgViewDemo")).click();

//sleep for 2 seconds		
sleep(2000);

//Close browser
	driver.quit();

}

//End of test

//Beginning of test
//View List and Add Policy Category Demo

@Test(priority = 29)
public void viewDemoListAndAddPolicyCategoryTest() {
System.out.println("Starting viewDemoListAndAddPolicyCategoryTest");

//Create driver
System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
WebDriver driver = new ChromeDriver();

//sleep for 3 seconds
sleep(3000);

//maximize browser window
driver.manage().window().maximize();

//open test page
driver.get("https://www.pmamhcm.com/");
System.out.println("Page is opened.");

//sleep for 2 seconds		
sleep(2000);

//enter username
driver.findElement(By.xpath("//div[@class='modal-header']//child::button")).click();
Actions action = new Actions(driver);
WebElement hoverLogin = driver.findElement(By.xpath("//div[@id='navbarDropdownLogin']"));
action.moveToElement(hoverLogin).build().perform();
driver.switchTo().frame(driver.findElement(By.id("frmLogin")));
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtUserName']"))).click()
		.sendKeys("sales.demo@pmam.com").build().perform();

//enter password
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtPassword']"))).click()
		.sendKeys("Dallas@2019").build().perform();

//click login button
action.moveToElement(driver.findElement(By.xpath("//input[@name='btnNewLogin']"))).click().build().perform();

//sleep for 2 seconds
sleep(2000);

//go to Policy
driver.findElement(By.xpath("//body/form[@id='form1']/table/tbody/tr/td/div/div[@class='topnav']/div[@class='fl']/div[@id='HCM_Menu_dvTopMenu']/div[@class='menu']/ul/li[4]/a[1]")).click();

//go to List and Add Policy Category
driver.findElement(By.xpath("//a[contains(text(),'List and Add Policy Category')]")).click();

//view demo
driver.findElement(By.xpath("//input[@id='imgViewDemo']")).click();

//sleep for 2 seconds		
sleep(2000);

//Close browser
	driver.quit();

}

//End of test

//Beginning of test
//View Manage Questions Demo

@Test(priority = 30)
public void viewDemoManageQuestionsTest() {
System.out.println("Starting viewDemoManageQuestionsTest");

//Create driver
System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
WebDriver driver = new ChromeDriver();

//sleep for 3 seconds
sleep(3000);

//maximize browser window
driver.manage().window().maximize();

//open test page
driver.get("https://www.pmamhcm.com/");
System.out.println("Page is opened.");

//sleep for 2 seconds		
sleep(2000);

//enter username
driver.findElement(By.xpath("//div[@class='modal-header']//child::button")).click();
Actions action = new Actions(driver);
WebElement hoverLogin = driver.findElement(By.xpath("//div[@id='navbarDropdownLogin']"));
action.moveToElement(hoverLogin).build().perform();
driver.switchTo().frame(driver.findElement(By.id("frmLogin")));
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtUserName']"))).click()
		.sendKeys("sales.demo@pmam.com").build().perform();

//enter password
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtPassword']"))).click()
		.sendKeys("Dallas@2019").build().perform();

//click login button
action.moveToElement(driver.findElement(By.xpath("//input[@name='btnNewLogin']"))).click().build().perform();

//sleep for 2 seconds
sleep(2000);

//go to Test
driver.findElement(By.xpath("//a[contains(text(),'Test')]")).click();

//go to Manage Questions
driver.findElement(By.xpath("//a[contains(text(),'Manage Question(s)')]")).click();

//view demo
driver.findElement(By.xpath("//input[@id='imgViewDemo']")).click();

//sleep for 2 seconds		
sleep(2000);

//Close browser
	driver.quit();

}

//End of test

//Beginning of test
//View Manage Questions Demo

@Test(priority = 31)
public void viewDemoMyPagesOtherAvailableTrainingsTest() {
System.out.println("Starting viewDemoMyPagesOtherAvailableTrainingsTest");

//Create driver
System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
WebDriver driver = new ChromeDriver();

//sleep for 3 seconds
sleep(3000);

//maximize browser window
driver.manage().window().maximize();

//open test page
driver.get("https://www.pmamhcm.com/");
System.out.println("Page is opened.");

//sleep for 2 seconds		
sleep(2000);

//enter username
driver.findElement(By.xpath("//div[@class='modal-header']//child::button")).click();
Actions action = new Actions(driver);
WebElement hoverLogin = driver.findElement(By.xpath("//div[@id='navbarDropdownLogin']"));
action.moveToElement(hoverLogin).build().perform();
driver.switchTo().frame(driver.findElement(By.id("frmLogin")));
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtUserName']"))).click()
		.sendKeys("sales.demo@pmam.com").build().perform();

//enter password
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtPassword']"))).click()
		.sendKeys("Dallas@2019").build().perform();

//click login button
action.moveToElement(driver.findElement(By.xpath("//input[@name='btnNewLogin']"))).click().build().perform();

//sleep for 2 seconds
sleep(2000);

//go to My Pages
driver.findElement(By.xpath("//a[contains(text(),'My Pages')]")).click();

//go to Other Available Trainings
driver.findElement(By.xpath("//a[contains(text(),'Other Available Trainings')]")).click();

//view demo
driver.findElement(By.xpath("//input[@id='imgViewDemo']")).click();

//sleep for 2 seconds		
sleep(2000);

//Close browser
	driver.quit();

}

//End of test

//Beginning of test
//View Pending Request Demo

@Test(priority = 32)
public void viewDemoPendingRequestTest() {
System.out.println("Starting viewDemoPendingRequestTest");

//Create driver
System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
WebDriver driver = new ChromeDriver();

//sleep for 3 seconds
sleep(3000);

//maximize browser window
driver.manage().window().maximize();

//open test page
driver.get("https://www.pmamhcm.com/");
System.out.println("Page is opened.");

//sleep for 2 seconds		
sleep(2000);

//enter username
driver.findElement(By.xpath("//div[@class='modal-header']//child::button")).click();
Actions action = new Actions(driver);
WebElement hoverLogin = driver.findElement(By.xpath("//div[@id='navbarDropdownLogin']"));
action.moveToElement(hoverLogin).build().perform();
driver.switchTo().frame(driver.findElement(By.id("frmLogin")));
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtUserName']"))).click()
		.sendKeys("sales.demo@pmam.com").build().perform();

//enter password
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtPassword']"))).click()
		.sendKeys("Dallas@2019").build().perform();

//click login button
action.moveToElement(driver.findElement(By.xpath("//input[@name='btnNewLogin']"))).click().build().perform();

//sleep for 2 seconds
sleep(2000);

//go to Training
driver.findElement(By.xpath("//a[contains(text(),'Training')]")).click();

//go to Pending Request
driver.findElement(By.xpath("//a[contains(text(),'Pending Request')]")).click();

//view demo
driver.findElement(By.xpath("//input[@id='imgViewDemo']")).click();

//sleep for 2 seconds		
sleep(2000);

//Close browser
	driver.quit();

}

//End of test

//Beginning of test
//View Publish Training Calendar Demo

@Test(priority = 33)
public void viewDemoPublishTrainingCalendarTest() {
System.out.println("Starting viewDemoPublishTrainingCalendarTest");

//Create driver
System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
WebDriver driver = new ChromeDriver();

//sleep for 3 seconds
sleep(3000);

//maximize browser window
driver.manage().window().maximize();

//open test page
driver.get("https://www.pmamhcm.com/");
System.out.println("Page is opened.");

//sleep for 2 seconds		
sleep(2000);

//enter username
driver.findElement(By.xpath("//div[@class='modal-header']//child::button")).click();
Actions action = new Actions(driver);
WebElement hoverLogin = driver.findElement(By.xpath("//div[@id='navbarDropdownLogin']"));
action.moveToElement(hoverLogin).build().perform();
driver.switchTo().frame(driver.findElement(By.id("frmLogin")));
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtUserName']"))).click()
		.sendKeys("sales.demo@pmam.com").build().perform();

//enter password
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtPassword']"))).click()
		.sendKeys("Dallas@2019").build().perform();

//click login button
action.moveToElement(driver.findElement(By.xpath("//input[@name='btnNewLogin']"))).click().build().perform();

//sleep for 2 seconds
sleep(2000);

//go to Training
driver.findElement(By.xpath("//a[contains(text(),'Training')]")).click();

//go to Publish Training Calendar
driver.findElement(By.xpath("//a[contains(text(),'Publish Training Calendar')]")).click();

//view demo
driver.findElement(By.xpath("//input[@id='imgViewDemo']")).click();

//sleep for 2 seconds		
sleep(2000);

//Close browser
	driver.quit();

}

//End of test

//Beginning of test
//View Message Demo

@Test(priority = 34)
public void viewDemoReportsTrainingTest() {
System.out.println("Starting viewDemoReportsTrainingTest");

//Create driver
System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
WebDriver driver = new ChromeDriver();

//sleep for 3 seconds
sleep(3000);

//maximize browser window
driver.manage().window().maximize();

//open test page
driver.get("https://www.pmamhcm.com/");
System.out.println("Page is opened.");

//sleep for 2 seconds		
sleep(2000);

//enter username
driver.findElement(By.xpath("//div[@class='modal-header']//child::button")).click();
Actions action = new Actions(driver);
WebElement hoverLogin = driver.findElement(By.xpath("//div[@id='navbarDropdownLogin']"));
action.moveToElement(hoverLogin).build().perform();
driver.switchTo().frame(driver.findElement(By.id("frmLogin")));
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtUserName']"))).click()
		.sendKeys("sales.demo@pmam.com").build().perform();

//enter password
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtPassword']"))).click()
		.sendKeys("Dallas@2019").build().perform();

//click login button
action.moveToElement(driver.findElement(By.xpath("//input[@name='btnNewLogin']"))).click().build().perform();

//sleep for 2 seconds
sleep(2000);

//go to Reports
driver.findElement(By.xpath("//a[contains(text(),'Reports')]")).click();

//sleep for 2 seconds
sleep(2000);

//go to Training Test
driver.findElement(By.xpath("//a[contains(text(),'Training Test')]")).click();

//sleep for 2 seconds		
sleep(2000);

//view demo
driver.findElement(By.xpath("//input[@id='imgViewDemo']")).click();

//sleep for 2 seconds		
sleep(2000);

//Close browser
	driver.quit();

}

//End of test

//Beginning of test
//View Send Message Demo

@Test(priority = 35)
public void viewDemoSendMessageTest() {
System.out.println("Starting viewDemoSendMessageTest");

//Create driver
System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
WebDriver driver = new ChromeDriver();

//sleep for 3 seconds
sleep(3000);

//maximize browser window
driver.manage().window().maximize();

//open test page
driver.get("https://www.pmamhcm.com/");
System.out.println("Page is opened.");

//sleep for 2 seconds		
sleep(2000);

//enter username
driver.findElement(By.xpath("//div[@class='modal-header']//child::button")).click();
Actions action = new Actions(driver);
WebElement hoverLogin = driver.findElement(By.xpath("//div[@id='navbarDropdownLogin']"));
action.moveToElement(hoverLogin).build().perform();
driver.switchTo().frame(driver.findElement(By.id("frmLogin")));
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtUserName']"))).click()
		.sendKeys("sales.demo@pmam.com").build().perform();

//enter password
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtPassword']"))).click()
		.sendKeys("Dallas@2019").build().perform();

//click login button
action.moveToElement(driver.findElement(By.xpath("//input[@name='btnNewLogin']"))).click().build().perform();

//sleep for 2 seconds
sleep(2000);

//go to Send Message
WebElement hoverDropdown=driver.findElement(By.xpath("//input[@id='HCM_Menu_imgSet']"));
action.moveToElement(hoverDropdown).build().perform();
sleep(5000);
driver.findElement(By.xpath("//a[contains(text(),'Send Message')]")).click();

//sleep for 2 seconds		
sleep(2000);

//view demo
driver.findElement(By.xpath("//td[@class='topheader']//a//img")).click();

//sleep for 2 seconds		
sleep(2000);

//Close browser
	driver.quit();

}

//End of test

//Beginning of test
//View Setup Demo

@Test(priority = 36)
public void viewDemoSetupTest() {
System.out.println("Starting viewDemoSetupTest");

//Create driver
System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
WebDriver driver = new ChromeDriver();

//sleep for 3 seconds
sleep(3000);

//maximize browser window
driver.manage().window().maximize();

//open test page
driver.get("https://www.pmamhcm.com/");
System.out.println("Page is opened.");

//sleep for 2 seconds		
sleep(2000);

//enter username
driver.findElement(By.xpath("//div[@class='modal-header']//child::button")).click();
Actions action = new Actions(driver);
WebElement hoverLogin = driver.findElement(By.xpath("//div[@id='navbarDropdownLogin']"));
action.moveToElement(hoverLogin).build().perform();
driver.switchTo().frame(driver.findElement(By.id("frmLogin")));
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtUserName']"))).click()
		.sendKeys("sales.demo@pmam.com").build().perform();

//enter password
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtPassword']"))).click()
		.sendKeys("Dallas@2019").build().perform();

//click login button
action.moveToElement(driver.findElement(By.xpath("//input[@name='btnNewLogin']"))).click().build().perform();

//sleep for 2 seconds
sleep(2000);

//go to Setup
WebElement hoverDropdown=driver.findElement(By.xpath("//input[@id='HCM_Menu_imgSet']"));
action.moveToElement(hoverDropdown).build().perform();
sleep(5000);
driver.findElement(By.xpath("//a[contains(text(),'Setup')]")).click();

//sleep for 2 seconds		
sleep(2000);

//view demo
driver.findElement(By.xpath("//input[@id='imgViewDemo']")).click();

//sleep for 2 seconds		
sleep(2000);

//Close browser
	driver.quit();

}

//End of test

//Beginning of test
//View Standard Master Demo

@Test(priority = 37)
public void viewDemoStandardMasterTest() {
System.out.println("Starting viewDemoStandardMasterTest");

//Create driver
System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
WebDriver driver = new ChromeDriver();

//sleep for 3 seconds
sleep(3000);

//maximize browser window
driver.manage().window().maximize();

//open test page
driver.get("https://www.pmamhcm.com/");
System.out.println("Page is opened.");

//sleep for 2 seconds		
sleep(2000);

//enter username
driver.findElement(By.xpath("//div[@class='modal-header']//child::button")).click();
Actions action = new Actions(driver);
WebElement hoverLogin = driver.findElement(By.xpath("//div[@id='navbarDropdownLogin']"));
action.moveToElement(hoverLogin).build().perform();
driver.switchTo().frame(driver.findElement(By.id("frmLogin")));
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtUserName']"))).click()
		.sendKeys("sales.demo@pmam.com").build().perform();

//enter password
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtPassword']"))).click()
		.sendKeys("Dallas@2019").build().perform();

//click login button
action.moveToElement(driver.findElement(By.xpath("//input[@name='btnNewLogin']"))).click().build().perform();

//sleep for 2 seconds
sleep(2000);

//go to Policy
driver.findElement(By.xpath("//body/form[@id='form1']/table/tbody/tr/td/div/div[@class='topnav']/div[@class='fl']/div[@id='HCM_Menu_dvTopMenu']/div[@class='menu']/ul/li[4]/a[1]")).click();

//go to Standard Master
driver.findElement(By.xpath("//a[contains(text(),'Standard Master')]")).click();

//view demo
driver.findElement(By.xpath("//input[@id='imgViewDemo']")).click();

//sleep for 2 seconds		
sleep(2000);

//Close browser
	driver.quit();

}

//End of test

//Beginning of test
//View Training Dashboard Demo

@Test(priority = 38)
public void viewDemoTrainingDashboardTest() {
System.out.println("Starting viewDemoTrainingDashboardTest");

//Create driver
System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
WebDriver driver = new ChromeDriver();

//sleep for 3 seconds
sleep(3000);

//maximize browser window
driver.manage().window().maximize();

//open test page
driver.get("https://www.pmamhcm.com/");
System.out.println("Page is opened.");

//sleep for 2 seconds		
sleep(2000);

//enter username
driver.findElement(By.xpath("//div[@class='modal-header']//child::button")).click();
Actions action = new Actions(driver);
WebElement hoverLogin = driver.findElement(By.xpath("//div[@id='navbarDropdownLogin']"));
action.moveToElement(hoverLogin).build().perform();
driver.switchTo().frame(driver.findElement(By.id("frmLogin")));
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtUserName']"))).click()
		.sendKeys("sales.demo@pmam.com").build().perform();

//enter password
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtPassword']"))).click()
		.sendKeys("Dallas@2019").build().perform();

//click login button
action.moveToElement(driver.findElement(By.xpath("//input[@name='btnNewLogin']"))).click().build().perform();

//sleep for 2 seconds
sleep(2000);

//go to Training
driver.findElement(By.xpath("//a[contains(text(),'Training')]")).click();

//go to Training Dashboard
driver.findElement(By.xpath("//a[contains(text(),'Training Dashboard')]")).click();

//view demo
driver.findElement(By.xpath("//input[@id='imgViewDemo']")).click();

//sleep for 2 seconds		
sleep(2000);

//Close browser
	driver.quit();

}

//End of test

//Beginning of test
//View All Training Demo

@Test(priority = 39)
public void viewDemoViewAllTrainingTest() {
System.out.println("Starting viewDemoViewAllTrainingTest");

//Create driver
System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
WebDriver driver = new ChromeDriver();

//sleep for 3 seconds
sleep(3000);

//maximize browser window
driver.manage().window().maximize();

//open test page
driver.get("https://www.pmamhcm.com/");
System.out.println("Page is opened.");

//sleep for 2 seconds		
sleep(2000);

//enter username
driver.findElement(By.xpath("//div[@class='modal-header']//child::button")).click();
Actions action = new Actions(driver);
WebElement hoverLogin = driver.findElement(By.xpath("//div[@id='navbarDropdownLogin']"));
action.moveToElement(hoverLogin).build().perform();
driver.switchTo().frame(driver.findElement(By.id("frmLogin")));
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtUserName']"))).click()
		.sendKeys("sales.demo@pmam.com").build().perform();

//enter password
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtPassword']"))).click()
		.sendKeys("Dallas@2019").build().perform();

//click login button
action.moveToElement(driver.findElement(By.xpath("//input[@name='btnNewLogin']"))).click().build().perform();

//sleep for 2 seconds
sleep(2000);

//go to Training
driver.findElement(By.xpath("//a[contains(text(),'Training')]")).click();

//go to View All Training
driver.findElement(By.xpath("//a[contains(text(),'View All Training')]")).click();

//view demo
driver.findElement(By.xpath("//input[@id='imgViewDemo2']")).click();

//sleep for 2 seconds		
sleep(2000);

//Close browser
	driver.quit();

}

//End of test

//Beginning of test
//View Message Demo

@Test(priority = 40)
public void viewDemoViewMessageTest() {
System.out.println("Starting viewDemoViewMessageTest");

//Create driver
System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
WebDriver driver = new ChromeDriver();

//sleep for 3 seconds
sleep(3000);

//maximize browser window
driver.manage().window().maximize();

//open test page
driver.get("https://www.pmamhcm.com/");
System.out.println("Page is opened.");

//sleep for 2 seconds		
sleep(2000);

//enter username
driver.findElement(By.xpath("//div[@class='modal-header']//child::button")).click();
Actions action = new Actions(driver);
WebElement hoverLogin = driver.findElement(By.xpath("//div[@id='navbarDropdownLogin']"));
action.moveToElement(hoverLogin).build().perform();
driver.switchTo().frame(driver.findElement(By.id("frmLogin")));
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtUserName']"))).click()
		.sendKeys("sales.demo@pmam.com").build().perform();

//enter password
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtPassword']"))).click()
		.sendKeys("Dallas@2019").build().perform();

//click login button
action.moveToElement(driver.findElement(By.xpath("//input[@name='btnNewLogin']"))).click().build().perform();

//sleep for 2 seconds
sleep(2000);

//go to View Message
WebElement hoverDropdown=driver.findElement(By.xpath("//input[@id='HCM_Menu_imgSet']"));
action.moveToElement(hoverDropdown).build().perform();
sleep(5000);
driver.findElement(By.xpath("//a[contains(text(),'View Message')]")).click();

//sleep for 2 seconds		
sleep(2000);

//view demo
driver.findElement(By.xpath("//td[@class='topheader']//a//img")).click();

//sleep for 2 seconds		
sleep(2000);

//Close browser
	driver.quit();

}

//End of test

//Beginning of test
//View Message Demo

@Test(priority = 41)
public void viewDemoReportsAdditionalTrainingTest() {
System.out.println("Starting viewDemoReportsAdditionalTrainingTest");

//Create driver
System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
WebDriver driver = new ChromeDriver();

//sleep for 3 seconds
sleep(3000);

//maximize browser window
driver.manage().window().maximize();

//open test page
driver.get("https://www.pmamhcm.com/");
System.out.println("Page is opened.");

//sleep for 2 seconds		
sleep(2000);

//enter username
driver.findElement(By.xpath("//div[@class='modal-header']//child::button")).click();
Actions action = new Actions(driver);
WebElement hoverLogin = driver.findElement(By.xpath("//div[@id='navbarDropdownLogin']"));
action.moveToElement(hoverLogin).build().perform();
driver.switchTo().frame(driver.findElement(By.id("frmLogin")));
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtUserName']"))).click()
		.sendKeys("sales.demo@pmam.com").build().perform();

//enter password
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtPassword']"))).click()
		.sendKeys("Dallas@2019").build().perform();

//click login button
action.moveToElement(driver.findElement(By.xpath("//input[@name='btnNewLogin']"))).click().build().perform();

//sleep for 2 seconds
sleep(2000);

//go to Reports
driver.findElement(By.xpath("//a[contains(text(),'Reports')]")).click();

//sleep for 2 seconds
sleep(2000);

//go to Additional Training
driver.findElement(By.xpath("//a[contains(text(),'Additional Training')]")).click();

//sleep for 2 seconds		
sleep(2000);

//view demo
driver.findElement(By.xpath("//input[@id='imgViewDemo']")).click();

//sleep for 2 seconds		
sleep(2000);

//Close browser
	driver.quit();

}

//End of test

//Beginning of test
//View Message Demo

@Test(priority = 42)
public void viewDemoMyPagesSearchTest() {
System.out.println("Starting viewDemoMyPagesSearchTest");

//Create driver
System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
WebDriver driver = new ChromeDriver();

//sleep for 3 seconds
sleep(3000);

//maximize browser window
driver.manage().window().maximize();

//open test page
driver.get("https://www.pmamhcm.com/");
System.out.println("Page is opened.");

//sleep for 2 seconds		
sleep(2000);

//enter username
driver.findElement(By.xpath("//div[@class='modal-header']//child::button")).click();
Actions action = new Actions(driver);
WebElement hoverLogin = driver.findElement(By.xpath("//div[@id='navbarDropdownLogin']"));
action.moveToElement(hoverLogin).build().perform();
driver.switchTo().frame(driver.findElement(By.id("frmLogin")));
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtUserName']"))).click()
		.sendKeys("sales.demo@pmam.com").build().perform();

//enter password
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtPassword']"))).click()
		.sendKeys("Dallas@2019").build().perform();

//click login button
action.moveToElement(driver.findElement(By.xpath("//input[@name='btnNewLogin']"))).click().build().perform();

//sleep for 2 seconds
sleep(2000);

//go to My Pages
driver.findElement(By.xpath("//a[contains(text(),'My Pages')]")).click();

//sleep for 2 seconds
sleep(2000);

//go to Search
driver.findElement(By.xpath("//a[contains(text(),'Search')]")).click();

//sleep for 2 seconds		
sleep(2000);

//view demo
driver.findElement(By.xpath("//input[@id='imgViewDemo']")).click();

//sleep for 2 seconds		
sleep(2000);

//Close browser
	driver.quit();

}

//End of test

//Beginning of test
//View Message Demo

@Test(priority = 43)
public void viewDemoReportsCustomReportTest() {
System.out.println("Starting viewDemoReportsCustomReportTest");

//Create driver
System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
WebDriver driver = new ChromeDriver();

//sleep for 3 seconds
sleep(3000);

//maximize browser window
driver.manage().window().maximize();

//open test page
driver.get("https://www.pmamhcm.com/");
System.out.println("Page is opened.");

//sleep for 2 seconds		
sleep(2000);

//enter username
driver.findElement(By.xpath("//div[@class='modal-header']//child::button")).click();
Actions action = new Actions(driver);
WebElement hoverLogin = driver.findElement(By.xpath("//div[@id='navbarDropdownLogin']"));
action.moveToElement(hoverLogin).build().perform();
driver.switchTo().frame(driver.findElement(By.id("frmLogin")));
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtUserName']"))).click()
		.sendKeys("sales.demo@pmam.com").build().perform();

//enter password
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtPassword']"))).click()
		.sendKeys("Dallas@2019").build().perform();

//click login button
action.moveToElement(driver.findElement(By.xpath("//input[@name='btnNewLogin']"))).click().build().perform();

//sleep for 2 seconds
sleep(2000);

//go to Reports
driver.findElement(By.xpath("//a[contains(text(),'Reports')]")).click();

//sleep for 2 seconds
sleep(2000);

//go to Custom Report
driver.findElement(By.xpath("//a[contains(text(),'Custom Report')]")).click();

//sleep for 2 seconds		
sleep(2000);

//view demo
driver.findElement(By.xpath("//input[@id='imgViewDemo']")).click();

//sleep for 2 seconds		
sleep(2000);

//Close browser
	driver.quit();

}

//End of test

//Beginning of test
//View Message Demo

@Test(priority = 44)
public void viewDemoReportsEmployeewiseDetailedPolicyTest() {
System.out.println("Starting viewDemoReportsEmployeewiseDetailedPolicyTest");

//Create driver
System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
WebDriver driver = new ChromeDriver();

//sleep for 3 seconds
sleep(3000);

//maximize browser window
driver.manage().window().maximize();

//open test page
driver.get("https://www.pmamhcm.com/");
System.out.println("Page is opened.");

//sleep for 2 seconds		
sleep(2000);

//enter username
driver.findElement(By.xpath("//div[@class='modal-header']//child::button")).click();
Actions action = new Actions(driver);
WebElement hoverLogin = driver.findElement(By.xpath("//div[@id='navbarDropdownLogin']"));
action.moveToElement(hoverLogin).build().perform();
driver.switchTo().frame(driver.findElement(By.id("frmLogin")));
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtUserName']"))).click()
		.sendKeys("sales.demo@pmam.com").build().perform();

//enter password
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtPassword']"))).click()
		.sendKeys("Dallas@2019").build().perform();

//click login button
action.moveToElement(driver.findElement(By.xpath("//input[@name='btnNewLogin']"))).click().build().perform();

//sleep for 2 seconds
sleep(2000);

//go to Reports
driver.findElement(By.xpath("//a[contains(text(),'Reports')]")).click();

//sleep for 2 seconds
sleep(2000);

//go to Employee-wise Detailed Policy
driver.findElement(By.xpath("//a[contains(text(),'Employee-wise Detailed Policy')]")).click();

//sleep for 2 seconds		
sleep(2000);

//view demo
driver.findElement(By.xpath("//input[@id='imgViewDemo']")).click();

//sleep for 2 seconds		
sleep(2000);

//Close browser
	driver.quit();

}

//End of test

//Beginning of test
//View Message Demo

@Test(priority = 45)
public void viewDemoReportsEmployeewiseDetailedTrainingTest() {
System.out.println("Starting viewDemoReportsEmployeewiseDetailedTrainingTest");

//Create driver
System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
WebDriver driver = new ChromeDriver();

//sleep for 3 seconds
sleep(3000);

//maximize browser window
driver.manage().window().maximize();

//open test page
driver.get("https://www.pmamhcm.com/");
System.out.println("Page is opened.");

//sleep for 2 seconds		
sleep(2000);

//enter username
driver.findElement(By.xpath("//div[@class='modal-header']//child::button")).click();
Actions action = new Actions(driver);
WebElement hoverLogin = driver.findElement(By.xpath("//div[@id='navbarDropdownLogin']"));
action.moveToElement(hoverLogin).build().perform();
driver.switchTo().frame(driver.findElement(By.id("frmLogin")));
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtUserName']"))).click()
		.sendKeys("sales.demo@pmam.com").build().perform();

//enter password
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtPassword']"))).click()
		.sendKeys("Dallas@2019").build().perform();

//click login button
action.moveToElement(driver.findElement(By.xpath("//input[@name='btnNewLogin']"))).click().build().perform();

//sleep for 2 seconds
sleep(2000);

//go to Reports
driver.findElement(By.xpath("//a[contains(text(),'Reports')]")).click();

//sleep for 2 seconds
sleep(2000);

//go to Employee-wise Detailed Training
driver.findElement(By.xpath("//a[contains(text(),'Employee-wise Detailed Training')]")).click();

//sleep for 2 seconds		
sleep(2000);

//view demo
driver.findElement(By.xpath("//input[@id='imgViewDemo']")).click();

//sleep for 2 seconds		
sleep(2000);

//Close browser
	driver.quit();

}

//End of test

//Beginning of test
//View Message Demo

@Test(priority = 46)
public void viewDemoReportsExportDataTrainingTest() {
System.out.println("Starting viewDemoReportsExportDataTrainingTest");

//Create driver
System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
WebDriver driver = new ChromeDriver();

//sleep for 3 seconds
sleep(3000);

//maximize browser window
driver.manage().window().maximize();

//open test page
driver.get("https://www.pmamhcm.com/");
System.out.println("Page is opened.");

//sleep for 2 seconds		
sleep(2000);

//enter username
driver.findElement(By.xpath("//div[@class='modal-header']//child::button")).click();
Actions action = new Actions(driver);
WebElement hoverLogin = driver.findElement(By.xpath("//div[@id='navbarDropdownLogin']"));
action.moveToElement(hoverLogin).build().perform();
driver.switchTo().frame(driver.findElement(By.id("frmLogin")));
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtUserName']"))).click()
		.sendKeys("sales.demo@pmam.com").build().perform();

//enter password
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtPassword']"))).click()
		.sendKeys("Dallas@2019").build().perform();

//click login button
action.moveToElement(driver.findElement(By.xpath("//input[@name='btnNewLogin']"))).click().build().perform();

//sleep for 2 seconds
sleep(2000);

//go to Reports
driver.findElement(By.xpath("//a[contains(text(),'Reports')]")).click();

//sleep for 2 seconds
sleep(2000);

//go to Export Data Training
driver.findElement(By.xpath("//a[contains(text(),'Export Data - Training')]")).click();

//sleep for 2 seconds		
sleep(2000);

//view demo
driver.findElement(By.xpath("//input[@id='imgViewDemo']")).click();

//sleep for 2 seconds		
sleep(2000);

//Close browser
	driver.quit();

}

//End of test

//Beginning of test
//View Message Demo

@Test(priority = 47)
public void viewDemoReportsFeedbackAnalysisTest() {
System.out.println("Starting viewDemoReportsFeedbackAnalysisTest");

//Create driver
System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
WebDriver driver = new ChromeDriver();

//sleep for 3 seconds
sleep(3000);

//maximize browser window
driver.manage().window().maximize();

//open test page
driver.get("https://www.pmamhcm.com/");
System.out.println("Page is opened.");

//sleep for 2 seconds		
sleep(2000);

//enter username
driver.findElement(By.xpath("//div[@class='modal-header']//child::button")).click();
Actions action = new Actions(driver);
WebElement hoverLogin = driver.findElement(By.xpath("//div[@id='navbarDropdownLogin']"));
action.moveToElement(hoverLogin).build().perform();
driver.switchTo().frame(driver.findElement(By.id("frmLogin")));
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtUserName']"))).click()
		.sendKeys("sales.demo@pmam.com").build().perform();

//enter password
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtPassword']"))).click()
		.sendKeys("Dallas@2019").build().perform();

//click login button
action.moveToElement(driver.findElement(By.xpath("//input[@name='btnNewLogin']"))).click().build().perform();

//sleep for 2 seconds
sleep(2000);

//go to Reports
driver.findElement(By.xpath("//a[contains(text(),'Reports')]")).click();

//sleep for 2 seconds
sleep(2000);

//go to Feedback Analysis
driver.findElement(By.xpath("//a[contains(text(),'Feedback Analysis')]")).click();

//sleep for 2 seconds		
sleep(2000);

//view demo
driver.findElement(By.xpath("//input[@id='imgViewDemo']")).click();

//sleep for 2 seconds		
sleep(2000);

//Close browser
	driver.quit();

}

//End of test

//Beginning of test
//View Message Demo

@Test(priority = 48)
public void viewDemoReportsGoalVsTrainingTest() {
System.out.println("Starting viewDemoReportsGoalVsTrainingTest");

//Create driver
System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
WebDriver driver = new ChromeDriver();

//sleep for 3 seconds
sleep(3000);

//maximize browser window
driver.manage().window().maximize();

//open test page
driver.get("https://www.pmamhcm.com/");
System.out.println("Page is opened.");

//sleep for 2 seconds		
sleep(2000);

//enter username
driver.findElement(By.xpath("//div[@class='modal-header']//child::button")).click();
Actions action = new Actions(driver);
WebElement hoverLogin = driver.findElement(By.xpath("//div[@id='navbarDropdownLogin']"));
action.moveToElement(hoverLogin).build().perform();
driver.switchTo().frame(driver.findElement(By.id("frmLogin")));
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtUserName']"))).click()
		.sendKeys("sales.demo@pmam.com").build().perform();

//enter password
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtPassword']"))).click()
		.sendKeys("Dallas@2019").build().perform();

//click login button
action.moveToElement(driver.findElement(By.xpath("//input[@name='btnNewLogin']"))).click().build().perform();

//sleep for 2 seconds
sleep(2000);

//go to Reports
driver.findElement(By.xpath("//a[contains(text(),'Reports')]")).click();

//sleep for 2 seconds
sleep(2000);

//go to Goal Vs Training
driver.findElement(By.xpath("//a[contains(text(),'Goal Vs Training')]")).click();

//sleep for 2 seconds		
sleep(2000);

//view demo
driver.findElement(By.xpath("//input[@id='imgViewDemo']")).click();

//sleep for 2 seconds		
sleep(2000);

//Close browser
	driver.quit();

}

//End of test

//Beginning of test
//View Message Demo

@Test(priority = 49)
public void viewDemoReportsOrganizationChartTest() {
System.out.println("Starting viewDemoReportsOrganizationChartTest");

//Create driver
System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
WebDriver driver = new ChromeDriver();

//sleep for 3 seconds
sleep(3000);

//maximize browser window
driver.manage().window().maximize();

//open test page
driver.get("https://www.pmamhcm.com/");
System.out.println("Page is opened.");

//sleep for 2 seconds		
sleep(2000);

//enter username
driver.findElement(By.xpath("//div[@class='modal-header']//child::button")).click();
Actions action = new Actions(driver);
WebElement hoverLogin = driver.findElement(By.xpath("//div[@id='navbarDropdownLogin']"));
action.moveToElement(hoverLogin).build().perform();
driver.switchTo().frame(driver.findElement(By.id("frmLogin")));
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtUserName']"))).click()
		.sendKeys("sales.demo@pmam.com").build().perform();

//enter password
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtPassword']"))).click()
		.sendKeys("Dallas@2019").build().perform();

//click login button
action.moveToElement(driver.findElement(By.xpath("//input[@name='btnNewLogin']"))).click().build().perform();

//sleep for 2 seconds
sleep(2000);

//go to Reports
driver.findElement(By.xpath("//a[contains(text(),'Reports')]")).click();

//sleep for 2 seconds
sleep(2000);

//go to Organization Chart
driver.findElement(By.xpath("//a[contains(text(),'Organization Chart')]")).click();

//sleep for 2 seconds		
sleep(2000);

//view demo
driver.findElement(By.xpath("//input[@id='imgViewDemo']")).click();

//sleep for 2 seconds		
sleep(2000);

//Close browser
	driver.quit();

}

//End of test

//Beginning of test
//View Message Demo

@Test(priority = 50)
public void viewDemoReportsPolicyReportTest() {
System.out.println("Starting viewDemoReportsPolicyReportTest");

//Create driver
System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
WebDriver driver = new ChromeDriver();

//sleep for 3 seconds
sleep(3000);

//maximize browser window
driver.manage().window().maximize();

//open test page
driver.get("https://www.pmamhcm.com/");
System.out.println("Page is opened.");

//sleep for 2 seconds		
sleep(2000);

//enter username
driver.findElement(By.xpath("//div[@class='modal-header']//child::button")).click();
Actions action = new Actions(driver);
WebElement hoverLogin = driver.findElement(By.xpath("//div[@id='navbarDropdownLogin']"));
action.moveToElement(hoverLogin).build().perform();
driver.switchTo().frame(driver.findElement(By.id("frmLogin")));
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtUserName']"))).click()
		.sendKeys("sales.demo@pmam.com").build().perform();

//enter password
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtPassword']"))).click()
		.sendKeys("Dallas@2019").build().perform();

//click login button
action.moveToElement(driver.findElement(By.xpath("//input[@name='btnNewLogin']"))).click().build().perform();

//sleep for 2 seconds
sleep(2000);

//go to Reports
driver.findElement(By.xpath("//a[contains(text(),'Reports')]")).click();

//sleep for 2 seconds
sleep(2000);

//go to Policy Report
driver.findElement(By.xpath("//a[contains(text(),'Policy Report')]")).click();

//sleep for 2 seconds		
sleep(2000);

//view demo
driver.findElement(By.xpath("//input[@id='imgViewDemo']")).click();

//sleep for 2 seconds		
sleep(2000);

//Close browser
	driver.quit();

}

//End of test

//Beginning of test
//View Message Demo

@Test(priority = 51)
public void viewDemoReportsPolicyStatusTest() {
System.out.println("Starting viewDemoReportsPolicyStatusTest");

//Create driver
System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
WebDriver driver = new ChromeDriver();

//sleep for 3 seconds
sleep(3000);

//maximize browser window
driver.manage().window().maximize();

//open test page
driver.get("https://www.pmamhcm.com/");
System.out.println("Page is opened.");

//sleep for 2 seconds		
sleep(2000);

//enter username
driver.findElement(By.xpath("//div[@class='modal-header']//child::button")).click();
Actions action = new Actions(driver);
WebElement hoverLogin = driver.findElement(By.xpath("//div[@id='navbarDropdownLogin']"));
action.moveToElement(hoverLogin).build().perform();
driver.switchTo().frame(driver.findElement(By.id("frmLogin")));
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtUserName']"))).click()
		.sendKeys("sales.demo@pmam.com").build().perform();

//enter password
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtPassword']"))).click()
		.sendKeys("Dallas@2019").build().perform();

//click login button
action.moveToElement(driver.findElement(By.xpath("//input[@name='btnNewLogin']"))).click().build().perform();

//sleep for 2 seconds
sleep(2000);

//go to Reports
driver.findElement(By.xpath("//a[contains(text(),'Reports')]")).click();

//sleep for 2 seconds
sleep(2000);

//go to Policy Status
driver.findElement(By.xpath("//a[contains(text(),'Policy Status')]")).click();

//sleep for 2 seconds		
sleep(2000);

//view demo
driver.findElement(By.xpath("//input[@id='imgViewDemo']")).click();

//sleep for 2 seconds		
sleep(2000);

//Close browser
	driver.quit();

}

//End of test

//Beginning of test
//View Message Demo

@Test(priority = 52)
public void viewDemoReportsPolicyTest() {
System.out.println("Starting viewDemoReportsPolicyTest");

//Create driver
System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
WebDriver driver = new ChromeDriver();

//sleep for 3 seconds
sleep(3000);

//maximize browser window
driver.manage().window().maximize();

//open test page
driver.get("https://www.pmamhcm.com/");
System.out.println("Page is opened.");

//sleep for 2 seconds		
sleep(2000);

//enter username
driver.findElement(By.xpath("//div[@class='modal-header']//child::button")).click();
Actions action = new Actions(driver);
WebElement hoverLogin = driver.findElement(By.xpath("//div[@id='navbarDropdownLogin']"));
action.moveToElement(hoverLogin).build().perform();
driver.switchTo().frame(driver.findElement(By.id("frmLogin")));
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtUserName']"))).click()
		.sendKeys("sales.demo@pmam.com").build().perform();

//enter password
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtPassword']"))).click()
		.sendKeys("Dallas@2019").build().perform();

//click login button
action.moveToElement(driver.findElement(By.xpath("//input[@name='btnNewLogin']"))).click().build().perform();

//sleep for 2 seconds
sleep(2000);

//go to Reports
driver.findElement(By.xpath("//a[contains(text(),'Reports')]")).click();

//sleep for 2 seconds
sleep(2000);

//go to Policy Test
driver.findElement(By.xpath("//a[contains(text(),'Policy Test')]")).click();

//sleep for 2 seconds		
sleep(2000);

//view demo
driver.findElement(By.xpath("//input[@id='imgViewDemo']")).click();

//sleep for 2 seconds		
sleep(2000);

//Close browser
	driver.quit();

}

//End of test

//Beginning of test
//View Message Demo

@Test(priority = 53)
public void viewDemoReportsQuestionAnalysisTest() {
System.out.println("Starting viewDemoReportsQuestionAnalysisTest");

//Create driver
System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
WebDriver driver = new ChromeDriver();

//sleep for 3 seconds
sleep(3000);

//maximize browser window
driver.manage().window().maximize();

//open test page
driver.get("https://www.pmamhcm.com/");
System.out.println("Page is opened.");

//sleep for 2 seconds		
sleep(2000);

//enter username
driver.findElement(By.xpath("//div[@class='modal-header']//child::button")).click();
Actions action = new Actions(driver);
WebElement hoverLogin = driver.findElement(By.xpath("//div[@id='navbarDropdownLogin']"));
action.moveToElement(hoverLogin).build().perform();
driver.switchTo().frame(driver.findElement(By.id("frmLogin")));
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtUserName']"))).click()
		.sendKeys("sales.demo@pmam.com").build().perform();

//enter password
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtPassword']"))).click()
		.sendKeys("Dallas@2019").build().perform();

//click login button
action.moveToElement(driver.findElement(By.xpath("//input[@name='btnNewLogin']"))).click().build().perform();

//sleep for 2 seconds
sleep(2000);

//go to Reports
driver.findElement(By.xpath("//a[contains(text(),'Reports')]")).click();

//sleep for 2 seconds
sleep(2000);

//go to Question Analysis
driver.findElement(By.xpath("//a[contains(text(),'Question Analysis')]")).click();

//sleep for 2 seconds		
sleep(2000);

//view demo
driver.findElement(By.xpath("//input[@id='imgViewDemo']")).click();

//sleep for 2 seconds		
sleep(2000);

//Close browser
	driver.quit();

}

//End of test

//Beginning of test
//View Message Demo

@Test(priority = 54)
public void viewDemoReportsTrainingAnalysisTest() {
System.out.println("Starting viewDemoReportsTrainingAnalysisTest");

//Create driver
System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
WebDriver driver = new ChromeDriver();

//sleep for 3 seconds
sleep(3000);

//maximize browser window
driver.manage().window().maximize();

//open test page
driver.get("https://www.pmamhcm.com/");
System.out.println("Page is opened.");

//sleep for 2 seconds		
sleep(2000);

//enter username
driver.findElement(By.xpath("//div[@class='modal-header']//child::button")).click();
Actions action = new Actions(driver);
WebElement hoverLogin = driver.findElement(By.xpath("//div[@id='navbarDropdownLogin']"));
action.moveToElement(hoverLogin).build().perform();
driver.switchTo().frame(driver.findElement(By.id("frmLogin")));
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtUserName']"))).click()
		.sendKeys("sales.demo@pmam.com").build().perform();

//enter password
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtPassword']"))).click()
		.sendKeys("Dallas@2019").build().perform();

//click login button
action.moveToElement(driver.findElement(By.xpath("//input[@name='btnNewLogin']"))).click().build().perform();

//sleep for 2 seconds
sleep(2000);

//go to Reports
driver.findElement(By.xpath("//a[contains(text(),'Reports')]")).click();

//sleep for 2 seconds
sleep(2000);

//go to Training Analysis
driver.findElement(By.xpath("//a[contains(text(),'Training Analysis')]")).click();

//sleep for 2 seconds		
sleep(2000);

//view demo
driver.findElement(By.xpath("//input[@id='imgViewDemo']")).click();

//sleep for 2 seconds		
sleep(2000);

//Close browser
	driver.quit();

}

//End of test

//Beginning of test
//View Message Demo

@Test(priority = 55)
public void viewDemoReportsTrainingReportTest() {
System.out.println("Starting viewDemoReportsTrainingReportTest");

//Create driver
System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
WebDriver driver = new ChromeDriver();

//sleep for 3 seconds
sleep(3000);

//maximize browser window
driver.manage().window().maximize();

//open test page
driver.get("https://www.pmamhcm.com/");
System.out.println("Page is opened.");

//sleep for 2 seconds		
sleep(2000);

//enter username
driver.findElement(By.xpath("//div[@class='modal-header']//child::button")).click();
Actions action = new Actions(driver);
WebElement hoverLogin = driver.findElement(By.xpath("//div[@id='navbarDropdownLogin']"));
action.moveToElement(hoverLogin).build().perform();
driver.switchTo().frame(driver.findElement(By.id("frmLogin")));
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtUserName']"))).click()
		.sendKeys("sales.demo@pmam.com").build().perform();

//enter password
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtPassword']"))).click()
		.sendKeys("Dallas@2019").build().perform();

//click login button
action.moveToElement(driver.findElement(By.xpath("//input[@name='btnNewLogin']"))).click().build().perform();

//sleep for 2 seconds
sleep(2000);

//go to Reports
driver.findElement(By.xpath("//a[contains(text(),'Reports')]")).click();

//sleep for 2 seconds
sleep(2000);

//go to Training Report
driver.findElement(By.xpath("//a[contains(text(),'Training Report')]")).click();

//sleep for 2 seconds		
sleep(2000);

//view demo
driver.findElement(By.xpath("//input[@id='imgViewDemo']")).click();

//sleep for 2 seconds		
sleep(2000);

//Close browser
	driver.quit();

}

//End of test

//Beginning of test
//View Message Demo

@Test(priority = 56)
public void viewDemoReportsTrainingStatisticsTest() {
System.out.println("Starting viewDemoReportsTrainingStatisticsTest");

//Create driver
System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
WebDriver driver = new ChromeDriver();

//sleep for 3 seconds
sleep(3000);

//maximize browser window
driver.manage().window().maximize();

//open test page
driver.get("https://www.pmamhcm.com/");
System.out.println("Page is opened.");

//sleep for 2 seconds		
sleep(2000);

//enter username
driver.findElement(By.xpath("//div[@class='modal-header']//child::button")).click();
Actions action = new Actions(driver);
WebElement hoverLogin = driver.findElement(By.xpath("//div[@id='navbarDropdownLogin']"));
action.moveToElement(hoverLogin).build().perform();
driver.switchTo().frame(driver.findElement(By.id("frmLogin")));
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtUserName']"))).click()
		.sendKeys("sales.demo@pmam.com").build().perform();

//enter password
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtPassword']"))).click()
		.sendKeys("Dallas@2019").build().perform();

//click login button
action.moveToElement(driver.findElement(By.xpath("//input[@name='btnNewLogin']"))).click().build().perform();

//sleep for 2 seconds
sleep(2000);

//go to Reports
driver.findElement(By.xpath("//a[contains(text(),'Reports')]")).click();

//sleep for 2 seconds
sleep(2000);

//go to Training Statistics
driver.findElement(By.xpath("//a[contains(text(),'Training Statistics')]")).click();

//sleep for 2 seconds		
sleep(2000);

//view demo
driver.findElement(By.xpath("//input[@id='imgViewDemo']")).click();

//sleep for 2 seconds		
sleep(2000);

//Close browser
	driver.quit();

}

//End of test

//Beginning of test
//View Message Demo

@Test(priority = 57)
public void viewDemoReportsTrainingStatusTest() {
System.out.println("Starting viewDemoReportsTrainingStatusTest");

//Create driver
System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
WebDriver driver = new ChromeDriver();

//sleep for 3 seconds
sleep(3000);

//maximize browser window
driver.manage().window().maximize();

//open test page
driver.get("https://www.pmamhcm.com/");
System.out.println("Page is opened.");

//sleep for 2 seconds		
sleep(2000);

//enter username
driver.findElement(By.xpath("//div[@class='modal-header']//child::button")).click();
Actions action = new Actions(driver);
WebElement hoverLogin = driver.findElement(By.xpath("//div[@id='navbarDropdownLogin']"));
action.moveToElement(hoverLogin).build().perform();
driver.switchTo().frame(driver.findElement(By.id("frmLogin")));
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtUserName']"))).click()
		.sendKeys("sales.demo@pmam.com").build().perform();

//enter password
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtPassword']"))).click()
		.sendKeys("Dallas@2019").build().perform();

//click login button
action.moveToElement(driver.findElement(By.xpath("//input[@name='btnNewLogin']"))).click().build().perform();

//sleep for 2 seconds
sleep(2000);

//go to Reports
driver.findElement(By.xpath("//a[contains(text(),'Reports')]")).click();

//sleep for 2 seconds
sleep(2000);

//go to Training Status
driver.findElement(By.xpath("//a[contains(text(),'Training Status')]")).click();

//sleep for 2 seconds		
sleep(2000);

//view demo
driver.findElement(By.xpath("//input[@id='imgViewDemo']")).click();

//sleep for 2 seconds		
sleep(2000);

//Close browser
	driver.quit();

}

//End of test

//Beginning of test
//View Demo

@Test(priority = 58)
public void viewDemoMyPagesMyFeedbackTest() {
System.out.println("Starting viewDemoMyPagesMyFeedbackTest");

//Create driver
System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
WebDriver driver = new ChromeDriver();

//sleep for 3 seconds
sleep(3000);

//maximize browser window
driver.manage().window().maximize();

//open test page
driver.get("https://www.pmamhcm.com/");
System.out.println("Page is opened.");

//sleep for 2 seconds		
sleep(2000);

//enter username
driver.findElement(By.xpath("//div[@class='modal-header']//child::button")).click();
Actions action = new Actions(driver);
WebElement hoverLogin = driver.findElement(By.xpath("//div[@id='navbarDropdownLogin']"));
action.moveToElement(hoverLogin).build().perform();
driver.switchTo().frame(driver.findElement(By.id("frmLogin")));
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtUserName']"))).click()
		.sendKeys("sales.demo@pmam.com").build().perform();

//enter password
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtPassword']"))).click()
		.sendKeys("Dallas@2019").build().perform();

//click login button
action.moveToElement(driver.findElement(By.xpath("//input[@name='btnNewLogin']"))).click().build().perform();

//sleep for 2 seconds
sleep(2000);

//go to My Pages
driver.findElement(By.xpath("//a[contains(text(),'My Pages')]")).click();

//sleep for 2 seconds
sleep(2000);

//go to My Feedback
driver.findElement(By.xpath("//a[contains(text(),'My Feedback')]")).click();

//sleep for 2 seconds		
sleep(2000);

//view demo
driver.findElement(By.xpath("//input[@id='imgViewDemo']")).click();

//sleep for 2 seconds		
sleep(2000);

//Close browser
	driver.quit();

}

//End of test

//Beginning of test
//View Demo

@Test(priority = 59)
public void viewDemoMyPagesMyInfoTest() {
System.out.println("Starting viewDemoMyPagesMyInfoTest");

//Create driver
System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
WebDriver driver = new ChromeDriver();

//sleep for 3 seconds
sleep(3000);

//maximize browser window
driver.manage().window().maximize();

//open test page
driver.get("https://www.pmamhcm.com/");
System.out.println("Page is opened.");

//sleep for 2 seconds		
sleep(2000);

//enter username
driver.findElement(By.xpath("//div[@class='modal-header']//child::button")).click();
Actions action = new Actions(driver);
WebElement hoverLogin = driver.findElement(By.xpath("//div[@id='navbarDropdownLogin']"));
action.moveToElement(hoverLogin).build().perform();
driver.switchTo().frame(driver.findElement(By.id("frmLogin")));
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtUserName']"))).click()
		.sendKeys("sales.demo@pmam.com").build().perform();

//enter password
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtPassword']"))).click()
		.sendKeys("Dallas@2019").build().perform();

//click login button
action.moveToElement(driver.findElement(By.xpath("//input[@name='btnNewLogin']"))).click().build().perform();

//sleep for 2 seconds
sleep(2000);

//go to My Pages
driver.findElement(By.xpath("//a[contains(text(),'My Pages')]")).click();

//sleep for 2 seconds
sleep(2000);

//go to My Info
driver.findElement(By.xpath("//a[contains(text(),'My Info')]")).click();

//sleep for 2 seconds		
sleep(2000);

//view demo
driver.findElement(By.xpath("//input[@id='imgViewDemo']")).click();

//sleep for 2 seconds		
sleep(2000);

//Close browser
	driver.quit();

}

//End of test

//Beginning of test
//View Demo

@Test(priority = 60)
public void viewDemoMyPagesMySkillsTest() {
System.out.println("Starting viewDemoMyPagesMySkillsTest");

//Create driver
System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
WebDriver driver = new ChromeDriver();

//sleep for 3 seconds
sleep(3000);

//maximize browser window
driver.manage().window().maximize();

//open test page
driver.get("https://www.pmamhcm.com/");
System.out.println("Page is opened.");

//sleep for 2 seconds		
sleep(2000);

//enter username
driver.findElement(By.xpath("//div[@class='modal-header']//child::button")).click();
Actions action = new Actions(driver);
WebElement hoverLogin = driver.findElement(By.xpath("//div[@id='navbarDropdownLogin']"));
action.moveToElement(hoverLogin).build().perform();
driver.switchTo().frame(driver.findElement(By.id("frmLogin")));
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtUserName']"))).click()
		.sendKeys("sales.demo@pmam.com").build().perform();

//enter password
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtPassword']"))).click()
		.sendKeys("Dallas@2019").build().perform();

//click login button
action.moveToElement(driver.findElement(By.xpath("//input[@name='btnNewLogin']"))).click().build().perform();

//sleep for 2 seconds
sleep(2000);

//go to My Pages
driver.findElement(By.xpath("//a[contains(text(),'My Pages')]")).click();

//sleep for 2 seconds
sleep(2000);

//go to My Skills
driver.findElement(By.xpath("//a[contains(text(),'My Skills')]")).click();

//sleep for 2 seconds		
sleep(2000);

//view demo
driver.findElement(By.xpath("//input[@id='ImageButton2']")).click();

//sleep for 2 seconds		
sleep(2000);

//Close browser
	driver.quit();

}

//End of test

//Beginning of test
//View Demo

@Test(priority = 61)
public void viewDemoMyPagesMyTestTest() {
System.out.println("Starting viewDemoMyPagesMyTestTest");

//Create driver
System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
WebDriver driver = new ChromeDriver();

//sleep for 3 seconds
sleep(3000);

//maximize browser window
driver.manage().window().maximize();

//open test page
driver.get("https://www.pmamhcm.com/");
System.out.println("Page is opened.");

//sleep for 2 seconds		
sleep(2000);

//enter username
driver.findElement(By.xpath("//div[@class='modal-header']//child::button")).click();
Actions action = new Actions(driver);
WebElement hoverLogin = driver.findElement(By.xpath("//div[@id='navbarDropdownLogin']"));
action.moveToElement(hoverLogin).build().perform();
driver.switchTo().frame(driver.findElement(By.id("frmLogin")));
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtUserName']"))).click()
		.sendKeys("sales.demo@pmam.com").build().perform();

//enter password
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtPassword']"))).click()
		.sendKeys("Dallas@2019").build().perform();

//click login button
action.moveToElement(driver.findElement(By.xpath("//input[@name='btnNewLogin']"))).click().build().perform();

//sleep for 2 seconds
sleep(2000);

//go to My Pages
driver.findElement(By.xpath("//a[contains(text(),'My Pages')]")).click();

//sleep for 2 seconds
sleep(2000);

//go to My Test
driver.findElement(By.xpath("//a[contains(text(),'My Test')]")).click();

//sleep for 2 seconds		
sleep(2000);

//view demo
driver.findElement(By.xpath("//input[@id='imgViewDemo']")).click();

//sleep for 2 seconds		
sleep(2000);

//Close browser
	driver.quit();

}

//End of test

//Beginning of test
//View Demo

@Test(priority = 62)
public void viewDemoMyPagesMyTrainingTest() {
System.out.println("Starting viewDemoMyPagesMyTrainingTest");

//Create driver
System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
WebDriver driver = new ChromeDriver();

//sleep for 3 seconds
sleep(3000);

//maximize browser window
driver.manage().window().maximize();

//open test page
driver.get("https://www.pmamhcm.com/");
System.out.println("Page is opened.");

//sleep for 2 seconds		
sleep(2000);

//enter username
driver.findElement(By.xpath("//div[@class='modal-header']//child::button")).click();
Actions action = new Actions(driver);
WebElement hoverLogin = driver.findElement(By.xpath("//div[@id='navbarDropdownLogin']"));
action.moveToElement(hoverLogin).build().perform();
driver.switchTo().frame(driver.findElement(By.id("frmLogin")));
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtUserName']"))).click()
		.sendKeys("sales.demo@pmam.com").build().perform();

//enter password
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtPassword']"))).click()
		.sendKeys("Dallas@2019").build().perform();

//click login button
action.moveToElement(driver.findElement(By.xpath("//input[@name='btnNewLogin']"))).click().build().perform();

//sleep for 2 seconds
sleep(2000);

//go to My Pages
driver.findElement(By.xpath("//a[contains(text(),'My Pages')]")).click();

//sleep for 2 seconds
sleep(2000);

//go to My Training
driver.findElement(By.xpath("//a[contains(text(),'My Training')]")).click();

//sleep for 2 seconds		
sleep(2000);

//view demo
driver.findElement(By.xpath("//input[@id='imgViewDemo']")).click();

//sleep for 2 seconds		
sleep(2000);

//Close browser
	driver.quit();

}

//End of test

//Beginning of test
//View Demo

@Test(priority = 63)
public void viewDemoMyPagesRequestAdditionalTrainingTest() {
System.out.println("Starting viewDemoMyPagesRequestAdditionalTrainingTest");

//Create driver
System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
WebDriver driver = new ChromeDriver();

//sleep for 3 seconds
sleep(3000);

//maximize browser window
driver.manage().window().maximize();

//open test page
driver.get("https://www.pmamhcm.com/");
System.out.println("Page is opened.");

//sleep for 2 seconds		
sleep(2000);

//enter username
driver.findElement(By.xpath("//div[@class='modal-header']//child::button")).click();
Actions action = new Actions(driver);
WebElement hoverLogin = driver.findElement(By.xpath("//div[@id='navbarDropdownLogin']"));
action.moveToElement(hoverLogin).build().perform();
driver.switchTo().frame(driver.findElement(By.id("frmLogin")));
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtUserName']"))).click()
		.sendKeys("sales.demo@pmam.com").build().perform();

//enter password
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtPassword']"))).click()
		.sendKeys("Dallas@2019").build().perform();

//click login button
action.moveToElement(driver.findElement(By.xpath("//input[@name='btnNewLogin']"))).click().build().perform();

//sleep for 2 seconds
sleep(2000);

//go to My Pages
driver.findElement(By.xpath("//a[contains(text(),'My Pages')]")).click();

//sleep for 2 seconds
sleep(2000);

//go to Request Additional Training
driver.findElement(By.xpath("//a[contains(text(),'Request Additional Training')]")).click();

//sleep for 2 seconds		
sleep(2000);

//view demo
driver.findElement(By.xpath("//input[@id='imgViewDemo']")).click();

//sleep for 2 seconds		
sleep(2000);

//Close browser
	driver.quit();

}

//End of test

//Beginning of test
//View Demo

@Test(priority = 64)
public void viewDemoMyPagesSelectSelfAssignableTrainingTest() {
System.out.println("Starting viewDemoMyPagesSelectSelfAssignableTrainingTest");

//Create driver
System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
WebDriver driver = new ChromeDriver();

//sleep for 3 seconds
sleep(3000);

//maximize browser window
driver.manage().window().maximize();

//open test page
driver.get("https://www.pmamhcm.com/");
System.out.println("Page is opened.");

//sleep for 2 seconds		
sleep(2000);

//enter username
driver.findElement(By.xpath("//div[@class='modal-header']//child::button")).click();
Actions action = new Actions(driver);
WebElement hoverLogin = driver.findElement(By.xpath("//div[@id='navbarDropdownLogin']"));
action.moveToElement(hoverLogin).build().perform();
driver.switchTo().frame(driver.findElement(By.id("frmLogin")));
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtUserName']"))).click()
		.sendKeys("sales.demo@pmam.com").build().perform();

//enter password
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtPassword']"))).click()
		.sendKeys("Dallas@2019").build().perform();

//click login button
action.moveToElement(driver.findElement(By.xpath("//input[@name='btnNewLogin']"))).click().build().perform();

//sleep for 2 seconds
sleep(2000);

//go to My Pages
driver.findElement(By.xpath("//a[contains(text(),'My Pages')]")).click();

//sleep for 2 seconds
sleep(2000);

//go to Select Self Assignable Training
driver.findElement(By.xpath("//a[contains(text(),'Select Self Assignable Training')]")).click();

//sleep for 2 seconds		
sleep(2000);

//view demo
driver.findElement(By.xpath("//input[@id='imgViewDemo']")).click();

//sleep for 2 seconds		
sleep(2000);

//Close browser
	driver.quit();

}

//End of test

//Beginning of test
//View Demo

@Test(priority = 65)
public void viewDemoMyPagesTrainingCalendarTest() {
System.out.println("Starting viewDemoMyPagesTrainingCalendarTest");

//Create driver
System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
WebDriver driver = new ChromeDriver();

//sleep for 3 seconds
sleep(3000);

//maximize browser window
driver.manage().window().maximize();

//open test page
driver.get("https://www.pmamhcm.com/");
System.out.println("Page is opened.");

//sleep for 2 seconds		
sleep(2000);

//enter username
driver.findElement(By.xpath("//div[@class='modal-header']//child::button")).click();
Actions action = new Actions(driver);
WebElement hoverLogin = driver.findElement(By.xpath("//div[@id='navbarDropdownLogin']"));
action.moveToElement(hoverLogin).build().perform();
driver.switchTo().frame(driver.findElement(By.id("frmLogin")));
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtUserName']"))).click()
		.sendKeys("sales.demo@pmam.com").build().perform();

//enter password
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtPassword']"))).click()
		.sendKeys("Dallas@2019").build().perform();

//click login button
action.moveToElement(driver.findElement(By.xpath("//input[@name='btnNewLogin']"))).click().build().perform();

//sleep for 2 seconds
sleep(2000);

//go to My Pages
driver.findElement(By.xpath("//a[contains(text(),'My Pages')]")).click();

//sleep for 2 seconds
sleep(2000);

//go to Training Calendar
driver.findElement(By.xpath("//li[8]//ul[1]//li[15]//a[1]")).click();

//sleep for 2 seconds		
sleep(2000);

//view demo
driver.findElement(By.xpath("//input[@id='imgViewDemo']")).click();

//sleep for 2 seconds		
sleep(2000);

//Close browser
	driver.quit();

}

//End of test

//Beginning of test
//View Demo

@Test(priority = 66)
public void viewDemoMyPagesViewAllPoliciesTest() {
System.out.println("Starting viewDemoMyPagesViewAllPoliciesTest");

//Create driver
System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
WebDriver driver = new ChromeDriver();

//sleep for 3 seconds
sleep(3000);

//maximize browser window
driver.manage().window().maximize();

//open test page
driver.get("https://www.pmamhcm.com/");
System.out.println("Page is opened.");

//sleep for 2 seconds		
sleep(2000);

//enter username
driver.findElement(By.xpath("//div[@class='modal-header']//child::button")).click();
Actions action = new Actions(driver);
WebElement hoverLogin = driver.findElement(By.xpath("//div[@id='navbarDropdownLogin']"));
action.moveToElement(hoverLogin).build().perform();
driver.switchTo().frame(driver.findElement(By.id("frmLogin")));
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtUserName']"))).click()
		.sendKeys("sales.demo@pmam.com").build().perform();

//enter password
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtPassword']"))).click()
		.sendKeys("Dallas@2019").build().perform();

//click login button
action.moveToElement(driver.findElement(By.xpath("//input[@name='btnNewLogin']"))).click().build().perform();

//sleep for 2 seconds
sleep(2000);

//go to My Pages
driver.findElement(By.xpath("//a[contains(text(),'My Pages')]")).click();

//sleep for 2 seconds
sleep(2000);

//go to View All Policies
driver.findElement(By.xpath("//a[contains(text(),'View All Policies')]")).click();

//sleep for 2 seconds		
sleep(2000);

//view demo
driver.findElement(By.xpath("//input[@id='imgViewDemo']")).click();

//sleep for 2 seconds		
sleep(2000);

//Close browser
	driver.quit();

}

//End of test

//Beginning of test
//View Demo

@Test(priority = 67)
public void viewDemoMyPagesViewOrganizationChartTest() {
System.out.println("Starting viewDemoMyPagesViewOrganizationChartTest");

//Create driver
System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
WebDriver driver = new ChromeDriver();

//sleep for 3 seconds
sleep(3000);

//maximize browser window
driver.manage().window().maximize();

//open test page
driver.get("https://www.pmamhcm.com/");
System.out.println("Page is opened.");

//sleep for 2 seconds		
sleep(2000);

//enter username
driver.findElement(By.xpath("//div[@class='modal-header']//child::button")).click();
Actions action = new Actions(driver);
WebElement hoverLogin = driver.findElement(By.xpath("//div[@id='navbarDropdownLogin']"));
action.moveToElement(hoverLogin).build().perform();
driver.switchTo().frame(driver.findElement(By.id("frmLogin")));
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtUserName']"))).click()
		.sendKeys("sales.demo@pmam.com").build().perform();

//enter password
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtPassword']"))).click()
		.sendKeys("Dallas@2019").build().perform();

//click login button
action.moveToElement(driver.findElement(By.xpath("//input[@name='btnNewLogin']"))).click().build().perform();

//sleep for 2 seconds
sleep(2000);

//go to My Pages
driver.findElement(By.xpath("//a[contains(text(),'My Pages')]")).click();

//sleep for 2 seconds
sleep(2000);

//go to View Organization Chart
driver.findElement(By.xpath("//a[contains(text(),'View Organization Chart')]")).click();

//sleep for 2 seconds		
sleep(2000);

//view demo
driver.findElement(By.xpath("//input[@id='imgViewDemo']")).click();

//sleep for 2 seconds		
sleep(2000);

//Close browser
	driver.quit();

}

//End of test

//Beginning of test
//View Demo

@Test(priority = 68)
public void viewDemoMyPagesChangePasswordTest() {
System.out.println("Starting viewDemoMyPagesChangePasswordTest");

//Create driver
System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
WebDriver driver = new ChromeDriver();

//sleep for 3 seconds
sleep(3000);

//maximize browser window
driver.manage().window().maximize();

//open test page
driver.get("https://www.pmamhcm.com/");
System.out.println("Page is opened.");

//sleep for 2 seconds		
sleep(2000);

//enter username
driver.findElement(By.xpath("//div[@class='modal-header']//child::button")).click();
Actions action = new Actions(driver);
WebElement hoverLogin = driver.findElement(By.xpath("//div[@id='navbarDropdownLogin']"));
action.moveToElement(hoverLogin).build().perform();
driver.switchTo().frame(driver.findElement(By.id("frmLogin")));
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtUserName']"))).click()
		.sendKeys("sales.demo@pmam.com").build().perform();

//enter password
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtPassword']"))).click()
		.sendKeys("Dallas@2019").build().perform();

//click login button
action.moveToElement(driver.findElement(By.xpath("//input[@name='btnNewLogin']"))).click().build().perform();

//sleep for 2 seconds
sleep(2000);

//go to My Pages
driver.findElement(By.xpath("//a[contains(text(),'My Pages')]")).click();

//sleep for 2 seconds
sleep(2000);

//go to Change Password
driver.findElement(By.xpath("//a[contains(text(),'Change Password')]")).click();

//sleep for 2 seconds		
sleep(2000);

//view demo
driver.findElement(By.xpath("//input[@id='imgViewDemo']")).click();

//sleep for 2 seconds		
sleep(2000);

//Close browser
	driver.quit();

}

//End of test

//Beginning of test
//View Demo

@Test(priority = 69)
public void viewDemoMyPagesMyPoliciesTest() {
System.out.println("Starting viewDemoMyPagesMyPoliciesTest");

//Create driver
System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
WebDriver driver = new ChromeDriver();

//sleep for 3 seconds
sleep(3000);

//maximize browser window
driver.manage().window().maximize();

//open test page
driver.get("https://www.pmamhcm.com/");
System.out.println("Page is opened.");

//sleep for 2 seconds		
sleep(2000);

//enter username
driver.findElement(By.xpath("//div[@class='modal-header']//child::button")).click();
Actions action = new Actions(driver);
WebElement hoverLogin = driver.findElement(By.xpath("//div[@id='navbarDropdownLogin']"));
action.moveToElement(hoverLogin).build().perform();
driver.switchTo().frame(driver.findElement(By.id("frmLogin")));
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtUserName']"))).click()
		.sendKeys("sales.demo@pmam.com").build().perform();

//enter password
action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtPassword']"))).click()
		.sendKeys("Dallas@2019").build().perform();

//click login button
action.moveToElement(driver.findElement(By.xpath("//input[@name='btnNewLogin']"))).click().build().perform();

//sleep for 2 seconds
sleep(2000);

//go to My Pages
driver.findElement(By.xpath("//a[contains(text(),'My Pages')]")).click();

//sleep for 2 seconds
sleep(2000);

//go to My Policies
driver.findElement(By.xpath("//a[contains(text(),'My Policies')]")).click();

//sleep for 2 seconds		
sleep(2000);

//view demo
driver.findElement(By.xpath("//input[@id='imgViewDemo']")).click();

//sleep for 2 seconds		
sleep(2000);

//Close browser
	driver.quit();

}

//End of test

	private void sleep(long m) {
		try {
			Thread.sleep(m);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
