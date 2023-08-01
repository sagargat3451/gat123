package UtilsLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BaseLayer.BaseClass;

public class HandleDropDown extends BaseClass {

	public static void selectByVisibleText(WebElement wb, String value) {

		Select sel = new Select(wb);
		sel.selectByVisibleText(value);

	}
	
	public static void findElements(List<WebElement> wb, String value) {
		
		for(WebElement abc : wb) {
			if(abc.getAttribute(value).equalsIgnoreCase(value)) {
				abc.click();
				break;
			}
		}
		
	}
}
