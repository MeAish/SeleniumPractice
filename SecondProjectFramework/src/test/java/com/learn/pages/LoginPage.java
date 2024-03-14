package com.learn.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver Driver)
	{
		this.driver=Driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@id='loginlabel']") WebElement loginclick;
	
	@FindBy(xpath="//input[@id='user_login']") WebElement uname;
	
	@FindBy(xpath="//input[@id='user_pass']") WebElement pass;
	
	@FindBy(xpath="//input[@id='wp-submit']") WebElement loginButton;
	
	@FindBy(xpath="//a[@id='gk-login-toggle']") WebElement logoutimage;
	
	@FindBy(xpath="//*[@id=\"login_drop_panel\"]/div/ul/li[3]/a") WebElement logoutclick;

	public void loginPortal(String username,String password)
	{
		loginclick.click();
		uname.sendKeys(username);
		pass.sendKeys(password);
		loginButton.click();
	}
	
	public void logout()
	{
		logoutimage.click();
		logoutclick.click();
	}
	
}
