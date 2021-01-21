package com.dollardays.testcases;

import java.awt.AWTException;
import java.awt.event.KeyEvent;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.dollardays.listners.ExtentTestManager;
import com.dollardays.pages.HomePage1;

public class TC_Homepage1 extends BaseTest{
	
	
		
	@Test(priority = 0)
	public void homepage1() throws InterruptedException, Throwable {
		
		HomePage1 hp = new HomePage1(driver);
		driver.manage().deleteAllCookies();
		driver.manage().maximize();
		//image 1 start
		
		hp.scrollDown();
		hp.findPopup();
		boolean img1 = hp.image1Display();
		Thread.sleep(1000);
		System.out.println("The image1 under Reccomended For You got captured successfully");
		ExtentTestManager.getTest().log(Status.PASS, "Step1: The image1 under Reccomended For You got captured successfully.");
		try {Assert.assertTrue(img1);
		ExtentTestManager.getTest().log(Status.FAIL, "Step1: The image1 under Reccomended For You didn't got captured.");
		System.out.println("The image1 under Reccomended For You got captured successfully");
		}catch (Exception e) {
			System.out.println("The image1 under Reccomended For You got is not there");
		}
		
		hp.findPopup();
		hp.clickReccForUimg1();	
		hp.findPopup();

		String title1 = driver.getTitle();
		Thread.sleep(1000);
		System.out.println("The title of the page from img1 is " + title1);
		ExtentTestManager.getTest().log(Status.PASS, "Step2: The img1 got clicked under Reccomended for You");
		
		
		hp.clickTitle();
		hp.scrollDown();
		
		hp.clickReccForUtxt1();

		String title2 = driver.getTitle();
		Thread.sleep(1000);
		System.out.println("The title of the page from txt1 is " + title2);
		ExtentTestManager.getTest().log(Status.PASS, "Step3: txt1 got clicked under Reccomended for You");
			
			if(title1.equals(title2)) {
			Assert.assertTrue(true);
			ExtentTestManager.getTest().log(Status.PASS, "Step4: Clicking img1 and txt1 navigates to same page");
		}
			else {
				//screenshot
				Assert.assertTrue(false);
				ExtentTestManager.getTest().log(Status.FAIL, "Step4: Clicking img1 and txt1 does not navigates to same page");
			}
		//image 2 start
			hp.clickTitle();
			hp.scrollDown();
			boolean img2 = hp.image2Display();
			Thread.sleep(2000);
			System.out.println("The image2 under Reccomended For You got captured successfully");
			ExtentTestManager.getTest().log(Status.PASS, "Step5: The image2 under Reccomended For You got captured successfully.");
			try {Assert.assertTrue(img2);
			ExtentTestManager.getTest().log(Status.FAIL, "Step5: The image2 under Reccomended For You didn't got captured.");
			}catch (Exception e) {
				System.out.println("The image2 under Reccomended For You got is not there");

			}
		
				
		hp.findPopup();

		hp.clickReccForUimg2();
		hp.findPopup();
		Thread.sleep(1000);
		String title3 = driver.getTitle();
		System.out.println("The title of the page from img2 is " + title3);
		ExtentTestManager.getTest().log(Status.PASS, "Step6: img2 got clicked under Reccomeded for You");
		
		hp.findPopup();

		Thread.sleep(1000);
		hp.scrollDown();	

		hp.clickTitle();
		hp.scrollDown();
		hp.clickReccForUtxt2();
		String title4 = driver.getTitle();
		Thread.sleep(2000);
		System.out.println("The title of the page from txt2 is " + title4);
		ExtentTestManager.getTest().log(Status.PASS, "Step7: txt2 got clicked under Reccomeded for You");

		if(title3.equals(title4)) {
			Assert.assertTrue(true);
			ExtentTestManager.getTest().log(Status.PASS, "Step8: Clicking img2 and txt2 navigates to same page");
			}

		else {
			//screenshot
			Assert.assertTrue(false);
			ExtentTestManager.getTest().log(Status.FAIL, "Step8: Clicking img2 and txt2 does not navigates to same page");

		}
		//image 3 start
		hp.clickTitle();
		hp.scrollDown();
		
		boolean img3 = hp.image3Display();
		Thread.sleep(1000);
		System.out.println("The image3 under Reccomended For You got captured successfully");
		ExtentTestManager.getTest().log(Status.PASS, "Step9: The image3 under Reccomended For You got captured successfully.");
		try {Assert.assertTrue(img3);
		ExtentTestManager.getTest().log(Status.FAIL, "Step9: The image3 under Reccomended For You didn't got captured.");
		}catch (Exception e) {
			System.out.println("The image3 under Reccomended For You got captured successfully");
		}
		
		
		
		hp.clickTitle();
		hp.scrollDown();

		hp.clickReccForUimg3();
		String title5 = driver.getTitle();
		Thread.sleep(2000);
			System.out.println("The title of the page from img3 is " + title5);
			ExtentTestManager.getTest().log(Status.PASS, "Step10: img3 got clicked under Reccomeded for You");

			hp.clickTitle();
			hp.scrollDown();

			hp.clickReccForUtxt3();
			String title6 = driver.getTitle();
			Thread.sleep(2000);
			System.out.println("The title of the page from txt3 is " + title6);
			ExtentTestManager.getTest().log(Status.PASS, "Step11: txt3 got clicked under Reccomeded for You");

		if(title5.equals(title6)) {
			Assert.assertTrue(true);
		ExtentTestManager.getTest().log(Status.PASS, "Step12: Clicking img3 and txt3 navigates to same page");
		}
		
		else {
			//screenshot
			Assert.assertTrue(false);
			ExtentTestManager.getTest().log(Status.FAIL, "Step12: Clicking img3 and txt3 does not navigates to same page");
		
		}

		//image 4 start
		hp.clickTitle();
		hp.scrollDown();
		boolean img4 = hp.image4Display();
		Thread.sleep(1000);
		System.out.println("The image4 under Reccomended For You got captured successfully");
		ExtentTestManager.getTest().log(Status.PASS, "Step13: The image4 under Reccomended For You got captured successfully.");
		try {Assert.assertTrue(img4);
		ExtentTestManager.getTest().log(Status.FAIL, "Step13: The image4 under Reccomended For You didn't got captured.");
		}catch (Exception e) {
			System.out.println("The image4 under Reccomended For You got captured successfully");

		}
		
		
		hp.clickTitle();
		hp.scrollDown();
		hp.clickReccForUimg4();
		String title21 = driver.getTitle();
		Thread.sleep(1000);
		System.out.println("The title of the page from img4 is " + title21);
		ExtentTestManager.getTest().log(Status.PASS, "Step14: img4 got clicked under Reccomeded for You");

		hp.clickTitle();
		Thread.sleep(1000);
		hp.clickReccForUtxt4();
		String title22 = driver.getTitle();
		Thread.sleep(1000);
		System.out.println("The title of the page from txt4 is " + title22);
		ExtentTestManager.getTest().log(Status.PASS, "Step15: txt4 got clicked under Reccomeded for You");
	

		
		if(title21.equals(title22)) {
				ExtentTestManager.getTest().log(Status.PASS, "Step16: Clicking img4 and txt4 navigates to same page");
					System.out.println("Both titles are same");

		}
		else {
			System.out.println("Both titles are same");

		}
	}
	//	try {
		//	Assert.assertEquals(title21, title22);
		//	ExtentTestManager.getTest().log(Status.PASS, "Step16: Clicking img4 and txt4 navigates to same page");
		//	}catch (Exception e) {
		//		System.out.println("The error is  " + e);

		//		ExtentTestManager.getTest().log(Status.PASS, "Step16: Clicking img4 and txt4 does not navigates to same page");

		//	}
	//}
			//else {
			
			//Assert.assertTrue(false);
			//ExtentTestManager.getTest().log(Status.FAIL, "Step16: Clicking img4 and txt4 does not navigates to same page");
		//	}}catch(Exception e) {
		//		ExtentTestManager.getTest().log(Status.PASS, "Step16: Clicking img4 and txt4 does not navigates to same page");
		//		System.out.println("Step16: Clicking img4 and txt4 does not navigates to same page");

		//	}
		
//	}
		

	
	
	@Test (priority = 1)
public void homepage2() throws InterruptedException, Throwable {
		
		HomePage1 hp = new HomePage1(driver);
		hp.clickTitle();
		hp.scrollDown();

	//	boolean image5 = hp.displayWishlistBanner();
	//	Thread.sleep(3000);
	//	System.out.println("The Wishlist Banner is displayed successfully");
	//	ExtentTestManager.getTest().log(Status.PASS, "Step17: The wishlist banner got captured successfully");
	//	try {Assert.assertFalse(image5);
	//	ExtentTestManager.getTest().log(Status.FAIL, "Step17: The wishlist banner didn't got captured.");
	//	}catch (Exception e) {
	//		System.out.println("The Wishlist banner didn't got captured.");
	//}

		hp.clickWishlistBanner();
		Thread.sleep(2000);
		ExtentTestManager.getTest().log(Status.PASS, "Step1: The Wishlist Banner is displayed and navigates to Wishlist page");
		System.out.println("The Wishlist Banner is displayed and navigates to Wishlist page");

			
	
		hp.clickTitle();
		hp.ScrollDown2();
		hp.findPopup();
		try {
		hp.clickExploreBlogimg1();
		hp.findPopup();
	    String title7 = driver.getTitle();
		Thread.sleep(3000);
	    System.out.println("The img1 under Explore Our Blog is navigated to " + title7);
	    ExtentTestManager.getTest().log(Status.PASS, "Step2: The img1 under Explore Our Blog is clickable and navigates to another page.");
		}catch(Exception e) {
		System.out.println("The link to img1 under Explore Our Blog is not working " + e);
		ExtentTestManager.getTest().log(Status.FAIL, "Step2: The link to img1 under Explore Our Blog is not working");
		}
		
		driver.navigate().back();
	
		hp.clickTitle();
		hp.ScrollDown2();
		try {
		hp.clickExploreBlogimg2();
		String title20 = driver.getTitle();
		Thread.sleep(3000);
		System.out.println("The img2 under Explore Our Blog is navigated to " + title20);
		ExtentTestManager.getTest().log(Status.PASS, "Step3: The img2 under Explore Our Blog is clickable and navigates to another page");
		}catch(Exception e) {
		System.out.println("The link to img2 under Explore Our Blog is not working " + e);
		ExtentTestManager.getTest().log(Status.FAIL, "Step3: The link to img2 under Explore Our Blog is not working");
		}
		
		driver.navigate().back();

	
		hp.clickTitle();
		hp.ScrollDown2();
		try {
		hp.clickExploreBlogimg3();
		String title8 = driver.getTitle();
		Thread.sleep(2000);
		System.out.println("The img3 under Explore Our Blog is navigated to " + title8);
		ExtentTestManager.getTest().log(Status.PASS, "Step4: The img3 under Explore Our Blog is clickable and navigates to another page.");
		}catch (Exception e) {
		System.out.println("The link to img3 under Explore Our Blog is not working " + e);
		ExtentTestManager.getTest().log(Status.FAIL, "Step4: The link to img3 under Explore Our Blog is not working");
		}
	
		driver.navigate().back();

	
		hp.clickTitle();
		hp.Scrolldown1();
	
		hp.clickDisasterRelief();
		Thread.sleep(2000);

		ExtentTestManager.getTest().log(Status.PASS, "Step22: The link for Disaster relief is clickable and navigates to another page.");
		boolean title9 = hp.comparingTitles("DollarDays | Disaster-relief Goods | Emergency Supplies | Bulk Disaster Supplies");
		try{
			Assert.assertTrue(title9);
			ExtentTestManager.getTest().log(Status.PASS, "Step5: The link for Disaster relief is clickable and navigates to another page.");
			ExtentTestManager.getTest().log(Status.PASS, "Step6: The actual and expected titles match.");
		}catch (Exception e) {
			ExtentTestManager.getTest().log(Status.PASS, "Step6: The actual and expected titles don't match.");

		}


		hp.clickTitle();
		hp.Scrolldown1();
		hp.clickToysGames();
		Thread.sleep(2000);
		boolean title10 = hp.comparingTitles("DollarDays | Wholesale Toys, Games & Puzzles | Bulk Dolls, Action Figures & Stuffed Animals - DollarDays");
		try{
			Assert.assertTrue(title10);
			ExtentTestManager.getTest().log(Status.PASS, "Step7: The link for Toys and Games is clickable and navigates to another page.");
			ExtentTestManager.getTest().log(Status.PASS, "Step8: The actual and expected titles match.");
		}catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Step8: The actual and expected titles don't match.");

		}

		hp.clickTitle();

		hp.Scrolldown1();
		hp.clickHygieneKits();
		Thread.sleep(2000);
		boolean title11 = hp.comparingTitles("DollarDays | Wholesale Hygiene Kits | Bulk Dental Supplies | Discount Toothpaste - DollarDays");
		try{
			Assert.assertTrue(title11);
			ExtentTestManager.getTest().log(Status.PASS, "Step9: The link for Hygiene kits is clickable and navigates to another page.");
			ExtentTestManager.getTest().log(Status.PASS, "Step10: The actual and expected titles match.");

		}catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Step10: The actual and expected titles don't match.");

		}

		hp.clickTitle();
		hp.Scrolldown1();
		hp.clickBackpacks();
		Thread.sleep(2000);
		boolean title12 = hp.comparingTitles("Wholesale Backpacks, Bulk Backpacks – DollarDays - DollarDays");
		try{
			Assert.assertTrue(title12);
			ExtentTestManager.getTest().log(Status.PASS, "Step11: The link for Backpacks is clickable and navigates to another page.");
			ExtentTestManager.getTest().log(Status.PASS, "Step12: The actual and expected titles match.");

		}catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Step12: The actual and expected titles don't match.");

		}


		hp.clickTitle();
		hp.Scrolldown1();
		hp.clickSchoolSupplies();
		Thread.sleep(2000);
		boolean title13 = hp.comparingTitles("Wholesale School & Office Supplies – Bulk School Supplies - DollarDays");
		try{
			Assert.assertTrue(title13);
			ExtentTestManager.getTest().log(Status.PASS, "Step13: The link for School supplies is clickable and navigates to another page.");
			ExtentTestManager.getTest().log(Status.PASS, "Step14: The actual and expected titles match.");

		}catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Step14: The actual and expected titles don't match.");

		}

	}

	@Test(priority = 2)
	
	
	public void footer() throws InterruptedException {
		HomePage1 ft = new HomePage1(driver);
		
		
	ft.Scrolldown1();

	try	
	{ft.clickBlog();
	Thread.sleep(3000);
	ExtentTestManager.getTest().log(Status.PASS, "Step1: This Blog link is  working now.");
	}catch(Exception e) {
			System.out.println("This Blog link is not working.");
			ExtentTestManager.getTest().log(Status.FAIL, "Step1: This Blog link is not working");
	}
		
	driver.navigate().back();
	

		ft.Scrolldown1();
		ft.clickAboutUs();
		boolean value = ft.comparingTitles("About Us - DollarDays");
		try{
			Assert.assertTrue(value);
			ExtentTestManager.getTest().log(Status.PASS, "Step2: The link for About Us is clicked");
			ExtentTestManager.getTest().log(Status.PASS, "Step3: The titles for About Us link are compared.");

		}catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Step3: The titles for About Us link are not same.");

		}
		
		ft.clickTitle();
		ft.Scrolldown1();
		ft.clickCareers();
		
		ft.findPopup();
		
		boolean value1 = ft.comparingTitles("DollarDays Career Page");
		try{
			Assert.assertTrue(value1);
			ExtentTestManager.getTest().log(Status.PASS, "Step4: The link for Careers is clicked");
			ExtentTestManager.getTest().log(Status.PASS, "Step5: The title for Careers link are compared.");

		}catch (Exception e){
			ExtentTestManager.getTest().log(Status.FAIL, "Step5: The titles for About Us link are not same.");

		}

		ft.findPopup();
		ft.clickTitle();
		
		ft.findPopup();
		
		Thread.sleep(2000);

		ft.Scrolldown1();
		ft.clickPartnerWithUs();
		boolean value2 = ft.comparingTitles("Partner Programs");
		try{
			Assert.assertTrue(value2);
			ExtentTestManager.getTest().log(Status.PASS, "Step6: The link for Partner with Us is clicked");
			ExtentTestManager.getTest().log(Status.PASS, "Step7: The title for Partner With Us are compared");

		}catch (Exception e) {
			ExtentTestManager.getTest().log(Status.FAIL, "Step7: The titles for About Us link are not same.");

		}

		ft.findPopup();
		
		ft.clickTitle();
		ft.Scrolldown1();
		ft.clickWishlistProgram();

		ft.findPopup();

		ExtentTestManager.getTest().log(Status.PASS, "Step8: The link for Wishlist Program is clicked");
		boolean value3 = ft.comparingTitles("Wishlist");
		Assert.assertTrue(value3);
		ExtentTestManager.getTest().log(Status.PASS, "Step9: The title for Wishlist Program are compared.");

		ft.clickTitle();
		ft.Scrolldown1();
		ft.clickBusinessBenefits();
		ExtentTestManager.getTest().log(Status.PASS, "Step10: The link for Business Benefits is clicked");
		boolean value4 = ft.comparingTitles("DollarDays | Boost Your Spending Power with High-value Wholesale Business Products");
		Assert.assertTrue(value4);
		ExtentTestManager.getTest().log(Status.PASS, "Step11: The title for Business Benefits are compared");

		ft.clickTitle();
		ft.Scrolldown1();
		ft.clickEducatorBenefits();
		ExtentTestManager.getTest().log(Status.PASS, "Step12: The link for Educator benefits is clicked");
		boolean value5 = ft.comparingTitles("DollarDays | Go Beyond Back to School with Budget-friendly Bulk Supplies");
		Assert.assertTrue(value5);
		ExtentTestManager.getTest().log(Status.PASS, "Step13: The title for Educator Benefits is compared");

		ft.clickTitle();
		ft.Scrolldown1();
		ft.clickNonprofitBenefits();
		ExtentTestManager.getTest().log(Status.PASS, "Step14: The link for Non Profit Benefits is clicked");
		boolean value6 = ft.comparingTitles("DollarDays | Empower Your Nonprofit's Service Projects & Outreach Efforts");
		Assert.assertTrue(value6);
		ExtentTestManager.getTest().log(Status.PASS, "Step15: The title for Non profit Benefits is compared");

		ft.clickTitle();
		ft.Scrolldown1();
		ft.clickContactUs();
		ExtentTestManager.getTest().log(Status.PASS, "Step16: The link for Contact Us is clicked");
		boolean value7 = ft.comparingTitles("Contact Us - DollarDays");
		Assert.assertTrue(value7);
		ExtentTestManager.getTest().log(Status.PASS, "Step17: The title for Contact Us is compared.");

		ft.clickTitle();
		ft.Scrolldown1();
		ft.clickFAQs();
		ExtentTestManager.getTest().log(Status.PASS, "Step18: The link for FAQs is clicked");
		boolean value8 = ft.comparingTitles("FAQs - DollarDays");
		Assert.assertTrue(value8);
		ExtentTestManager.getTest().log(Status.PASS, "Step19: The title for FAQs is compared");

		ft.clickTitle();
		ft.Scrolldown1();
		ft.clickPrivacyPolicy();
		ExtentTestManager.getTest().log(Status.PASS, "Step20: The link for Privacy Policy is clicked");
		boolean value9 = ft.comparingTitles("Privacy Policy - DollarDays");
		Assert.assertTrue(value9);
		ExtentTestManager.getTest().log(Status.PASS, "Step21: The title for Privacy Policy is compared");
	
		ft.clickTitle();
		ft.Scrolldown1();
		ft.clickReturnPolicy();

		ft.findPopup();

		ExtentTestManager.getTest().log(Status.PASS, "Step22: The link for Return Policy is clicked");
		boolean value10 = ft.comparingTitles("Policies - DollarDays");
		ExtentTestManager.getTest().log(Status.PASS, "Step23: The title for Return Policy is compared.");
		Assert.assertTrue(value10);
		ft.findPopup();

		ft.clickTitle();
		ft.Scrolldown1();
		ft.clickShippingPolicy();
		ExtentTestManager.getTest().log(Status.PASS, "Step24: The link for Shipping Policy is clicked");
		boolean value11 = ft.comparingTitles("Shipping Policy - DollarDays");
		Assert.assertTrue(value11);
		ExtentTestManager.getTest().log(Status.PASS, "Step25: The title for Shipping Policy is compared.");

		ft.findPopup();


		ft.clickTitle();
		ft.Scrolldown1();
		ft.clickTermsandConditions();
		ExtentTestManager.getTest().log(Status.PASS, "Step26: The link for Terms and conditions is clicked");
		boolean value12 = ft.comparingTitles("Policies - DollarDays");
		Assert.assertTrue(value12);
		ExtentTestManager.getTest().log(Status.PASS, "Step27: The title for Terma and conditions is compared");
	
		ft.clickTitle();

		ft.Scrolldown1();
		ft.FindCookiepopup();

	    String contactnum = ft.getContactNumber().getText();
		
		String actual = "(877) 837-9569";

		ExtentTestManager.getTest().log(Status.PASS, "Step28:The contact number is displayed.");
		System.out.println("The contact number is: " + contactnum);
		Assert.assertEquals(contactnum, actual);	
		ExtentTestManager.getTest().log(Status.PASS, "Step29: The contact number is compared.");


		ft.FindCookiepopup();

		ft.clickTitle();
		ft.Scrolldown1();
		String hours = ft.getHoursofOperation().getText();
		System.out.println("The hours of operation are: " + hours);
		ExtentTestManager.getTest().log(Status.PASS, "Step30: The hours are displayed.");

		ft.clickTitle();
		Thread.sleep(3000);

		ft.Scrolldown1();
		Thread.sleep(3000);
		ft.switchToOldWindow(driver);
		Thread.sleep(3000);
		ft.clickimgFacebook();
		Thread.sleep(3000);
		ExtentTestManager.getTest().log(Status.PASS, "Step31: Facebook link is clicked");
		ExtentTestManager.getTest().log(Status.PASS, "Step32: Facebook title is captured.");

		ft.Scrolldown1();
		ft.clickimgTwitter();
		Thread.sleep(3000);
		ExtentTestManager.getTest().log(Status.PASS, " Step33: Twitter link is clicked.");
		ft.switchToOldWindow(driver);
		Thread.sleep(3000);
		ExtentTestManager.getTest().log(Status.PASS, "Step34: Twitter title is captured.");

		ft.clickimgLinkedin();
		Thread.sleep(3000);
		ExtentTestManager.getTest().log(Status.PASS, " Step35: Linkedin link is clicked.");
		ft.switchToOldWindow(driver);
		Thread.sleep(3000);
		ExtentTestManager.getTest().log(Status.PASS, "Step36: Linkedin title is captured");

		ft.Scrolldown1();
		Thread.sleep(3000);
		ft.clickimgInstagram();
		ExtentTestManager.getTest().log(Status.PASS, "Step37: Instagram link is clicked.");
		Thread.sleep(3000);
		ft.switchToOldWindow(driver);
		Thread.sleep(3000);
		ExtentTestManager.getTest().log(Status.PASS, "Step38: Instagram title is captured.");

		ft.Scrolldown1();
		ft.clickimgPinterest();
		Thread.sleep(3000);
		ExtentTestManager.getTest().log(Status.PASS, " Step39: Pinterest link is clicked.");
		ft.switchToOldWindow(driver);
		Thread.sleep(3000);
		ExtentTestManager.getTest().log(Status.PASS, "Step40: Pinterest title is captured.");

		ft.clickimgEnvelope();
		Thread.sleep(2000);
		ExtentTestManager.getTest().log(Status.PASS, "Step41: Envelope link is clicked.");
		ft.switchToOldWindow(driver);
		Thread.sleep(2000);
		ExtentTestManager.getTest().log(Status.PASS, "Step42: Envelope title is captured");

		}
	}


		
	


