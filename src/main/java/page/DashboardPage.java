package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;


public class DashboardPage {
	
	WebDriver driver;
	public DashboardPage(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/section/div/div[2]/div/div/header/div/strong")WebElement DASHBOARD_HEADER_ELEMENT;
	@FindBy(how=How.XPATH,using="/html/body/div[1]/aside[1]/div/nav/ul[2]/li[2]/a")WebElement CUSTOMERS_MENU_ELEMENT;
	@FindBy(how=How.XPATH,using="//*[@id=\"customers\"]/li[2]/a")WebElement ADDCUSTOMER_MENU_ELEMENT;
	
	
	public void validateDashboardPage(String dashboard) {
	
		Assert.assertEquals(DASHBOARD_HEADER_ELEMENT.getText(),dashboard,"Dashboard page is not available");

	}
	public void clickCustomersMenuElement() {
		CUSTOMERS_MENU_ELEMENT.click();
		
	}
	public void clickAddcustomerMenuElement() {
		ADDCUSTOMER_MENU_ELEMENT.click();
	}


}
