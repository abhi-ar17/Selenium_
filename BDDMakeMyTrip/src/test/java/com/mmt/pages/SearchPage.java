package com.mmt.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class SearchPage {
	
	WebDriver driver;
	public SearchPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[1]")
	WebElement abc;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input")
	WebElement fromLocator;
	
	@FindBy(xpath="//*[@id=\"react-autowhatever-1-section-0-item-0\"]/div/div[1]/p[1]")
	WebElement fromList;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[2]/label/span")
	WebElement bc;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/div/div/div/input")
	WebElement toLocator;
	
	@FindBy(xpath="//*[@id=\"react-autowhatever-1\"]")
	WebElement arc;
	
	@FindBy(xpath="//*[@id='react-autowhatever-1-section-0-item-0']/div/div[1]/p[1]")
	WebElement toList;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]")
	WebElement dateClick;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[1]/div")
	WebElement month;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[1]/span[2]")
	WebElement tre;
	
	@FindBy(xpath=".//*[@class='DayPicker-Day']//*[@class=\"dateInnerCell\"]//p[1]")
	List <WebElement> dates;
	
	@FindBy(xpath="//*[@id='root']/div/div[2]/div/div/div[2]/p/a")
	WebElement searchLocator;
	
	public void sourceAndDest(String from,String to) throws InterruptedException
	{
		 Actions act = new Actions(driver);
		 Action seriesOfActions = act
				 .moveToElement(abc)
				 .click()
				 .build();
		 seriesOfActions.perform();
		  driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);		  
		  fromLocator.sendKeys(from);
		  Thread.sleep(3000l);
		 fromList.click();
	        
			 Action seri = act
					 .moveToElement(bc)
					 .click()
					 .build();
			 seri.perform();
			 toLocator.sendKeys(to);
			 Thread.sleep(2500l);
			 toList.click();
	}
	
	public void pickDate(String day,String monthYear)
	{
		  dateClick.click();
		  while(!month.getText().contains(monthYear))
		  {
			  Actions act = new Actions(driver);
			  Action seria = act
						 .moveToElement(tre)
						 .click()
						 .build();
				 seria.perform();
		  }
		  int count = dates.size();
		  for(int i=0;i<count;i++)
		  {
			  String text = dates.get(i).getText();
			  if(text.equalsIgnoreCase(day))
			  {
				  dates.get(i).click();
				  break;  
			  }
		  }
	}
	
	public void clickSearch()
	{
		searchLocator.click();

	}

}
