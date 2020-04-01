package com.mmt.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class PaymentPage {
	
	WebDriver driver;
	public PaymentPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	
	@FindBy(xpath="//*[@id=\"CC\"]/span[2]")
	WebElement paymentMode;
	
	@FindBy(xpath="//*[@id=\"PAYMENT_cardNumber\"]")
	WebElement cardNumber;
	
	@FindBy(xpath="//*[@id=\"PAYMENT_nameOnCard\"]")
	WebElement nameOnCard;
	
	@FindBy(xpath="//*[@id=\"PAYMENT_expiryMonth\"]")
	WebElement cardExpMonth;
	
	@FindBy(xpath="//*[@id=\"PAYMENT_expiryYear\"]")
	WebElement cardExpYear;
	
	@FindBy(xpath="//*[@id=\"PAYMENT_cvv\"]")
	WebElement cardCvv;
	
	

	public void paymentDetails(String cc,String name,String month,String year,String cvv)
	{
		paymentMode.click();
		  cardNumber.sendKeys(cc);
		  nameOnCard.sendKeys(name);
		  //Dropdown
		  Select s = new Select(cardExpMonth);
			 s.selectByVisibleText(month);
			 
			 Select sa = new Select(cardExpYear);
			 sa.selectByVisibleText(year);
			 
			 cardCvv.sendKeys(cvv);
	}

}
