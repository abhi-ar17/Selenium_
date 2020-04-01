package com.mmt.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.mmt.base.TestBase;
import com.mmt.pages.FlightSelect;
import com.mmt.pages.PassengerSelect;
import com.mmt.pages.PaymentPage;
import com.mmt.pages.SearchPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StepDefinitions {

	WebDriver driver;
	SearchPage sp;
	FlightSelect fs;
	PaymentPage pp;
	PassengerSelect ps;
	
	@Given("User launches the Make My Trip website")
	public void launchBrowser()
	{
		TestBase.launchBrowser("ch");
		this.driver=TestBase.driver;
	}
	
	@Then("User select from_location as {string} and to_location as {string} and day as {string} year as {string} and search")
	public void searchFlight(String from,String to,String day,String monthYear) throws InterruptedException
	{
		sp=PageFactory.initElements(driver, SearchPage.class);
		sp.sourceAndDest(from, to);
		sp.pickDate(day, monthYear);
		sp.clickSearch();
	}
	
	@Then("List of flights should be displayed and first one is selected")
	public void selectFlight()
	{
		fs=PageFactory.initElements(driver, FlightSelect.class);
		fs.selectFlght();
	}
	
	@Then("User enters Firstname as {string} and lastname as {string} and gender as {string} and mobilnum as {string} and mailid as {string}")
	public void passDetails(String fname,String lname,String gendeR,String phNum,String Email)
	{
		ps=PageFactory.initElements(driver, PassengerSelect.class);
		ps.switchWindow();
		ps.selectPassenger();
		ps.enterPassDetils(fname, lname, gendeR, phNum, Email);
	}
	
	@Then("User enters the payment details card number as {string} and name as {string} and expirty month as {string} and expiry year as {string} and cvv as {string}")
	public void paymentDetails(String cc,String name,String month,String year,String cvv)
	{
		pp=PageFactory.initElements(driver, PaymentPage.class);
		pp.paymentDetails(cc, name, month, year, cvv);
	}
}
