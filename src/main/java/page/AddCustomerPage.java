package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AddCustomerPage extends BasePage {
	

	WebDriver driver;
	
	
	public AddCustomerPage(WebDriver driver) {
		this.driver=driver;
	}
	//*[@id="general_compnay"]/div[8]/div[1]/select
	

	@FindBy(how=How.XPATH,using="/html/body/div[1]/section/div/div[2]/div/div[1]/div[1]/div/div/header/div")WebElement NEW_CUSTOMER_HEADER;
	@FindBy(how=How.XPATH,using="//*[@id=\"general_compnay\"]/div[1]/div/input")WebElement FULLNAME_ELEMENT;
	@FindBy(how=How.XPATH,using="//*[@id=\"general_compnay\"]/div[2]/div/select")WebElement COMPANY_DROPDOWN_ELEMENT;
	@FindBy(how=How.XPATH,using="//*[@id=\"general_compnay\"]/div[3]/div/input")WebElement EMAIL_ELEMENT;
	@FindBy(how=How.XPATH,using="//*[@id=\"phone\"]")WebElement PHONE_NUMBER_ELEMENT;
	@FindBy(how=How.XPATH,using="//*[@id=\"general_compnay\"]/div[5]/div/input")WebElement ADDRESS_ELEMENT;
	@FindBy(how=How.XPATH,using="//*[@id=\"general_compnay\"]/div[6]/div/input")WebElement CITY_ELEMENT;
	@FindBy(how=How.XPATH,using="//*[@id=\"port\"]")WebElement ZIP_ELEMENT;
	@FindBy(how=How.XPATH,using="//*[@id=\"general_compnay\"]/div[8]/div[1]/select")WebElement COUNTRY_DROPDOWN_ELEMENT;
	@FindBy(how=How.XPATH,using="//*[@id=\"customer_group\"]")WebElement GROUP_BUTTON_ELEMENT;
	@FindBy(how=How.XPATH,using="//*[@id=\"save_btn\"]")WebElement SAVE_BUTTON_ELEMENT;
	
	
	public void validateAddContactPage(String newCustomerHeader) {
		Assert.assertEquals(NEW_CUSTOMER_HEADER.getText(),newCustomerHeader, "New Customer Page is not available");
	}
	
	public void insertFullName(String fullName) {
		int genNum=generateRandomNo(999);
		FULLNAME_ELEMENT.sendKeys(fullName+genNum);
		
	}
	public void selectCompany(String company) {
//		SelectFromDropdown(COMPANY_DROPDOWN_ELEMENT, company);	
		SelectFromDropdown(COMPANY_DROPDOWN_ELEMENT, company);	
	}
	
	public void insertEmail(String email) {
		EMAIL_ELEMENT.sendKeys(generateRandomNo(9999)+email);
		
	}
	public void insertPhoneNum(String phoneNo) {
		PHONE_NUMBER_ELEMENT.sendKeys(phoneNo);
		
	}
	
	public void insertAddress(String address) {
		ADDRESS_ELEMENT.sendKeys(address);
		
	}
	public void insertCity(String city) {
		CITY_ELEMENT.sendKeys(city);
		
	}
	public void insertZip(String zip) {
		ZIP_ELEMENT.sendKeys(zip);
		
	}
	public void selectCountry(String country) throws InterruptedException {
//		SelectFromDropdown(COUNTRY_DROPDOWN_ELEMENT,country);
		Thread.sleep(2000);
		SelectFromDropdown(COUNTRY_DROPDOWN_ELEMENT, country);
		
	}
	
	public void selectGroup(String group) {
		SelectFromDropdown(GROUP_BUTTON_ELEMENT, group);
		
	}		
	public void clickSaveButton() {
		SAVE_BUTTON_ELEMENT.click();
		
	}
	


	

}
