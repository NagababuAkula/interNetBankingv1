package test_Cases;

import org.junit.Assert;
import org.testng.annotations.Test;

import page_Objects.LoginPageObjects;

public class LoginTest_00001 extends BaseClass {

	@Test
	public void loginTest()
	{
		LoginPageObjects logpageObj = new LoginPageObjects(driver);
		driver.get(baseUrl);
		logger.info("Url lanched");
		logpageObj.setUserName(username);
		logpageObj.setPassword(password);
		logpageObj.clickLoginButton();
        logger.info("submit button entered");
        logger.error("This is an error");
        logger.fatal("This is fatal message");
        logger.warn("This is warn message");
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{

          Assert.assertTrue(true);
	      logger.info("Titile  matched");

		}
		else
		{
			Assert.assertTrue(false);
	        logger.info("Titile not matched");

		}
	}

	
		
	}

	


