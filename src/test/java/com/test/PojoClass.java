package com.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class PojoClass extends BascClass {
	
		
		public  PojoClass() {
			 PageFactory.initElements(driver, this);

		}
		
		@FindBy(name ="email")
		private WebElement emailtxt;
			
		@FindBy(id="pass")
		private WebElement Passaward;
		
		@FindBy(name="loginbutton")
		private WebElement login;
	//login
		@FindBys({
		@FindBy(xpath="//button[contains(text(),'In')]"),
		@FindBy(xpath="//button[text()='Log In']"),
		@FindBy(xpath="//button[@id='loginbutton']")
			
		})
		
	private WebElement log;	
		
		@FindAll({
			@FindBy(xpath="//button[contains(text(),'In')]"),
			@FindBy(xpath="//button[text()='Log In']"),
			@FindBy(xpath="//button[@id='loginbutton']")	
		})
		
		private WebElement click;
	// shopBop		
		
		
		@FindAll({
			
		@FindBy(xpath="//input[@type='email']")	
	
		})
		
	private WebElement shop;	
		
		@FindBy(xpath="//input[@type='password']")
		private WebElement shoppass;
		
		@FindAll({
			@FindBy(xpath="//input[@id='signInSubmit']"),
			@FindBy(xpath="//input[@class='a-button-input']"),
		})   
		private WebElement logshop;
		
		
		
//Getters
		
		public WebElement getLog() {
			return log;
		}

		public WebElement getLogin() {
			return login;
		}


		public WebElement getPassaward() {
			return Passaward;
		}

	

		public WebElement getEmailtxt() {
			return emailtxt;
		}



		public WebElement getClick() {
			return click;
		}
		
		public WebElement getBtuClick() {
			return getBtuClick();
		}

		public WebElement getShop() {
			return shop;
		}

		public WebElement getShoppass() {
			return shoppass;
		}

		public WebElement getLogshop() {
			return logshop;
		}
			
		
		
		
		
		
		
		
	

}
