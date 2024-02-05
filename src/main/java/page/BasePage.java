package page;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage {

	public int generateRandomNo(int boundNo) {
		Random rad = new Random();
		int generatedNo = rad.nextInt(boundNo);
		return generatedNo;

	}

	public void SelectFromDropdown(WebElement element, String visibleText) {
		Select sel = new Select(element);
		sel.selectByVisibleText(visibleText);

	}
	

}
