package page_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjects {

	WebDriver ldriver;
	public LoginPageObjects(WebDriver rdriver)
	{
		this.ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(name="uid")
	@CacheLookup
	WebElement UserName;

	@FindBy(name="password")
	WebElement Password;

	@FindBy(name="btnLogin")
	WebElement LoginButton;


	public void setUserName(String userName)
	{
		UserName.sendKeys(userName);
	}

	public void setPassword(String password)
	{
		Password.sendKeys(password);
	}
	public void clickLoginButton()
	{
		LoginButton.click();

	}

}
