package com.dollardays.pages;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.Status;
import com.dollardays.listners.ExtentTestManager;

public  class HomePage1 {
WebDriver driver;
 WebDriverWait wait;

public HomePage1 (WebDriver driver){
	this.driver = driver;
	PageFactory.initElements(driver, this);
wait = new WebDriverWait(driver,(20));
}

public void waitVisibility(WebElement element) {
//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("\"//body/div[@id='modal-nonregoffer']/div[1]/div[1]/div[1]/div[2]/div[1]")));
	wait.until(ExpectedConditions.visibilityOf(element));

}
//Finding elements
@FindBy(xpath = "//img[@title='PPE Gear, Masks, & Sanitizer']")
 WebElement ReccForUimg1;

@FindBy(xpath = "//*[@id=\"aspnetForm\"]/div[5]/div[2]/div[2]/div/div[3]/div[2]/div[1]/a/h4")
WebElement ReccForUtxt1;

@FindBy(xpath = "//img[@title='Homeless Care Kits']")
 WebElement ReccForUimg2;

@FindBy(xpath = "//h4[normalize-space()='Homeless Care Kits']")
WebElement ReccForUtxt2;

@FindBy(xpath = "//img[@title='At-Home Activities']")
 WebElement ReccForUimg3;

@FindBy(xpath = "//h4[normalize-space()='At-Home Activities']")
WebElement ReccForUtxt3;

@FindBy(xpath = "//img[@title='Going to School Safely']")
 WebElement ReccForUimg4;

@FindBy(xpath = "//h4[normalize-space()='Going to School Safely']")
WebElement ReccForUtxt4;

@FindBy(xpath = "//img[@data-original='//dollardays.imgix.net/icons/landingpage/images/winter_shop/wishlist.jpg?auto=compress,format']")
WebElement WishlistBanner;

@FindBy(xpath = "//div[@class='mid-section']//div[@class='container-fluid']//div[1]//div[1]//figure[1]//a[1]//img[1]")
WebElement ExploreBlogimg1;

@FindBy(xpath = "//div[@class='row']//div[2]//div[1]//figure[1]//a[1]//img[1]")
WebElement ExploreBlogimg2;

@FindBy(xpath = "//img[@data-original='//dollardays.imgix.net/icons/landingpage/images/winter_shop/explore-our-introducing.jpg?auto=compress,format']")
WebElement ExploreBlogimg3;

@FindBy(xpath = "//a[normalize-space()='disaster-relief supplies']")
WebElement DisasterRelief;

@FindBy(xpath = "//a[normalize-space()='toys and games']")
WebElement ToysGames;

@FindBy(xpath = "//a[normalize-space()='hygiene kits']")
WebElement HygieneKits;

@FindBy(xpath = "//a[normalize-space()='backpacks']")
WebElement Backpacks;

@FindBy(xpath = "//a[normalize-space()='school supplies']")
WebElement SchoolSupplies;

@FindBy(xpath = "//img[@alt='DollarDays']")
WebElement Title;
//Footer

@FindBy(xpath = "//a[normalize-space()='Blog']")
WebElement Blog;

@FindBy(xpath = "//a[normalize-space()='About Us']")
WebElement AboutUs;

@FindBy(xpath = "//a[normalize-space()='Careers']")
WebElement Careers;

@FindBy(xpath = "//a[normalize-space()='Partner with Us']")
WebElement PartnerWithUs;

@FindBy(xpath = "//a[normalize-space()='Wishlist Program']")
WebElement WishlistProgram;

@FindBy(xpath = "//a[normalize-space()='Business Benefits']")
WebElement BusinessBenefits;

@FindBy(xpath = "//a[normalize-space()='Educator Benefits']")
WebElement EducatorBenefits;

@FindBy(xpath = "//a[normalize-space()='Nonprofit Benefits']")
WebElement NonprofitBenefits;

@FindBy(xpath = "//ul[@class='customer-item']//a[normalize-space()='Contact Us']")
WebElement ContactUs;

@FindBy(xpath = "//ul[@class='customer-item']//a[normalize-space()='FAQs']")
WebElement FAQs;

@FindBy(xpath = "//ul[@class='customer-item']//a[normalize-space()='Privacy Policy']")
WebElement PrivacyPolicy;

@FindBy(xpath = "//ul[@class='customer-item']//a[normalize-space()='Return Policy']")
WebElement ReturnPolicy;

@FindBy(xpath = "//ul[@class='customer-item']//a[normalize-space()='Shipping Policy']")
WebElement ShippingPolicy;

@FindBy(xpath = "//a[normalize-space()='Terms & Conditions']")
WebElement TermsandConditions;

@FindBy(xpath = "//a[normalize-space()='(877) 837-9569']")
WebElement ContactNumber;

@FindBy(xpath = "//body/form[@id='aspnetForm']/footer[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/ul[1]/li[2]")
WebElement HoursofOperation;

@FindBy(xpath = "//i[@class='fa fa-facebook']")
WebElement Facebook;

@FindBy(xpath = "//i[@class='fa fa-twitter']")
WebElement Twitter;

@FindBy(xpath = "//i[@class='fa fa-linkedin']")
WebElement Linkedin;

@FindBy(xpath = "//i[@class='fa fa-instagram']")
WebElement Instagram;

@FindBy(xpath = "//i[@class='fa fa-pinterest-p']")
WebElement Pinterest;

@FindBy(xpath = "//i[@class='fa fa-envelope']")
WebElement Envelope;

@//FindBy(xpath = "*[@id=\"modal-onregoffer\"]/div/div/div/div[2]/div")
FindBy(xpath = "//*[@id=\"modal-nonregoffer\"]/div/div/div")

WebElement popupWindow;

//@FindBy(xpath = "//*[@id=\"close2\"]/span")
@FindBy (xpath = "//*[@id=\"close2\"]/span")
WebElement popClose;

@FindBy(xpath = "/html/body/form/footer/div[2]/div")  
WebElement Cookiespopup;

@FindBy(xpath = "/html/body/form/footer/div[2]/div/p/input")  
WebElement CookiesOkaybutton;

public void FindCookiepopup() {
	try {
		 waitVisibility(Cookiespopup);
		  CookiesOkaybutton.click();
		System.out.println("Cookiespopup Closed");
			}
	catch (Exception e) {
		System.out.println("No popup found"+e);
	}
}


//Methods to perform action
public void findPopup() {
	try {
		waitVisibility(popupWindow);
		popClose.click();
		System.out.println("Popup closed");
			
	}catch (Exception e) {
		System.out.println("No popup found : " + e);

	}
}
public void clickReccForUimg1() {
	ReccForUimg1.click();
}

public void clickReccForUimg2() {
	ReccForUimg2.click();
}
public void clickReccForUimg3() {
	ReccForUimg3.click();
}
public void clickReccForUimg4() {
	ReccForUimg4.click();
	}
public void clickReccForUtxt1() {
	ReccForUtxt1.click();
}
public void clickReccForUtxt2() {
	ReccForUtxt2.click();
}
public void clickReccForUtxt3() {
	ReccForUtxt3.click();
}
public void clickReccForUtxt4() {
	ReccForUtxt4.click();
}
public void clickWishlistBanner() {
	WishlistBanner.click();
}
public void clickExploreBlogimg1() {
	ExploreBlogimg1.click();
}
public void clickExploreBlogimg2() {
	ExploreBlogimg2.click();
}
public void clickExploreBlogimg3() {
	ExploreBlogimg3.click();
}
public void clickDisasterRelief() {
	DisasterRelief.click();
}
public void clickToysGames() {
	ToysGames.click();
}
public void clickHygieneKits() {
	HygieneKits.click();
}
public void clickBackpacks() {
	Backpacks.click();
}
public void clickSchoolSupplies() {
	SchoolSupplies.click();
}
public void clickTitle() {
	Title.click();
}

			
public boolean comparingTitles(String ActualTitle) {
String CurrentTitle = driver.getTitle();
if (CurrentTitle.equals(ActualTitle)) {
	 System.out.println("Actual and Expected titles are same.");
	 return true;
}else
	 System.out.println("Both the titles are different.");
return false;

}

public boolean displayWishlistBanner() {
	boolean image = WishlistBanner.isDisplayed();
	return image;
	
}

public boolean image1Display() {
	boolean img1 = ReccForUimg1.isDisplayed();
	return img1;	
}
public boolean image2Display() {
	boolean img2 = ReccForUimg2.isDisplayed();
	return img2;
}
public boolean image3Display() {
	boolean img3 = ReccForUimg3.isDisplayed();
	return img3;
}
public boolean image4Display() {
	boolean img4 = ReccForUimg4.isDisplayed();
	return img4;
}
public void scrollDown() throws InterruptedException {
	JavascriptExecutor	jse = (JavascriptExecutor) driver;
	jse.executeScript("window.scrollBy(0,1500)");
	Thread.sleep(2000);
}
public void Scrolldown1() throws InterruptedException {
	JavascriptExecutor	jse1 = (JavascriptExecutor) driver;
	jse1.executeScript("window.scrollBy(0,2000)");
	Thread.sleep(2000);

}
public void ScrollDown2() throws InterruptedException {
	JavascriptExecutor	jse2 = (JavascriptExecutor) driver;
	jse2.executeScript("window.scrollBy(0,1800)");
	Thread.sleep(2000);

}


public void clickBlog() {
	Blog.click();
}
public void clickAboutUs() {
	AboutUs.click();
}

public void clickCareers() {
	Careers.click();
}
public void clickPartnerWithUs() {
	PartnerWithUs.click();
}
public void clickWishlistProgram() {
	WishlistProgram.click();
}
public void clickBusinessBenefits() {
	BusinessBenefits.click();
}
public void clickEducatorBenefits() {
	EducatorBenefits.click();
}
public void clickNonprofitBenefits() {
	NonprofitBenefits.click();
}
public void clickContactUs() {
	ContactUs.click();
}
public void clickFAQs() {
	FAQs.click();
}
public void clickPrivacyPolicy() {
	PrivacyPolicy.click();
}
public void clickReturnPolicy() {
	ReturnPolicy.click();
}
public void clickShippingPolicy() {
	ShippingPolicy.click();
}
public void clickTermsandConditions() {
	TermsandConditions.click();
}
public WebElement getContactNumber() {
return ContactNumber;
}
//public void getHours() {
//	Hours.getText();
//	 System.out.println("The hours are:  " + Hours);

//}

public WebElement getHoursofOperation() {
	return HoursofOperation;
			
}
public void windowHandling() throws InterruptedException {
	Thread.sleep(3000);
	String parentWindow= driver.getWindowHandle();
	driver.switchTo().window(parentWindow);
	Thread.sleep(3000);
String childWindow;
childWindow = driver.getWindowHandles().toArray()[1].toString();
driver.switchTo().window(childWindow);
driver.getTitle();
System.out.println("The title is  " + driver.getTitle());

driver.switchTo().window(parentWindow);
}
public void switchToOldWindow(WebDriver driver) {
	String parenWindow = driver.getWindowHandle();
	Set<String> childWindows = driver.getWindowHandles();
	for(String childWindow : childWindows) {
		if (!parenWindow.equalsIgnoreCase(childWindow)) {
			driver.switchTo().window(childWindow);
		System.out.println("title of child current window -->"+ driver.getTitle());

			driver.close();
		}	
	}
	driver.switchTo().window(parenWindow);
	System.out.println("The title of current window is: "+ driver.getTitle());
}


public void clickimgFacebook() {
	Facebook.click();
}
public void clickimgTwitter() {
	Twitter.click();
}
public void clickimgLinkedin() {
	Linkedin.click();
}
public void clickimgInstagram() {
	Instagram.click();
}
public void clickimgPinterest() {
	Pinterest.click();
}
public void clickimgEnvelope() {
	Envelope.click();

}
public void checkimgandtxt() throws InterruptedException {
	String title1 = driver.getTitle();
	Thread.sleep(3000);
	System.out.println("The title of the page from img is " + title1);
ExtentTestManager.getTest().log(Status.PASS, "Step1: img1 got clicked under Reccomeded for You");

String title2 = driver.getTitle();
Thread.sleep(3000);
System.out.println("The title of the page from txt is " + title1);
ExtentTestManager.getTest().log(Status.PASS, "Step1: img1 got clicked under Reccomeded for You");


if(title1.equals(title2)) {
	Assert.assertTrue(true);
ExtentTestManager.getTest().log(Status.PASS, "Clicking img and txt navigates to same page");
}

else {
	//screenshot
	Assert.assertTrue(false);
	ExtentTestManager.getTest().log(Status.PASS, "Clicking img and txt does not navigates to same page");

}
}



}