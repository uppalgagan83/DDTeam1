package com.dollardays.testcases;

import org.testng.annotations.Test;

import com.dollardays.pages.HomePage1;

public class MyHomepage extends BaseTest {
@Test
public void homepage() throws InterruptedException {
	HomePage1 hp = new HomePage1(driver);
	hp.clickReccForUimg1();

	hp.clickReccForUtxt1();
	hp.checkimgandtxt();

}
}
