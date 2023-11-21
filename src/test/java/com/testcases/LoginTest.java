package com.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.PageObjects.Login_functionality;
import com.base.Testbase;

public class LoginTest extends Testbase {

	Login_functionality lf;

	public LoginTest() throws Throwable {
		super();
	}

	@BeforeMethod

	public void setup() throws Throwable {

		Initialization();

		lf = new Login_functionality(driver);

	}

	@Test

	public void Verifylogin() throws Throwable {

		lf.Dologin();

		String url = driver.getCurrentUrl();

		Assert.assertEquals("http://empirehome.myprojectsonline.co.in/EmpireHome/", url);

	}

	@AfterMethod

	public void teardown() {

		//driver.close();

	}

}
