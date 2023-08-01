package PageLayer;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static UtilsLayer.UtilsClass.*;
import static UtilsLayer.HandleDropDown.*;

import BaseLayer.BaseClass;

public class RegisterPage extends BaseClass {

	@FindBy(name = "ctl00$ContentPlaceHolder1$ddlTitle")
	private WebElement title;

	@FindBy(name = "ctl00$ContentPlaceHolder1$txtFName")
	private WebElement name;

	@FindBy(name = "ctl00$ContentPlaceHolder1$txtLName")
	private WebElement lastname;

	@FindBy(name = "ctl00$ContentPlaceHolder1$txtAddress")
	private WebElement address1;

	@FindBy(name = "ctl00$ContentPlaceHolder1$txtAddress2")
	private WebElement address2;

	@FindBy(name = "ctl00$ContentPlaceHolder1$txtCity")
	private WebElement city;

	@FindBy(xpath = "//select[@name='ctl00$ContentPlaceHolder1$ddlCountry']")
	private WebElement country;

	@FindBy(name = "//select[@name='ctl00$ContentPlaceHolder1$ddlState']")
	private WebElement state;

	/*
	 * @FindBy(name = "//select[@name='ctl00$ContentPlaceHolder1$ddlDistrict']")
	 * private WebElement district;
	 */

	@FindBy(name = "ctl00$ContentPlaceHolder1$txtNationality")
	private WebElement nationality;

	@FindBy(name = "ctl00$ContentPlaceHolder1$txtPinCode")
	private WebElement pincode;

	@FindBy(name = "ctl00$ContentPlaceHolder1$txtEmail")
	private WebElement email;

	@FindBy(name = "ctl00$ContentPlaceHolder1$txtPhoneNumber")
	private WebElement phone;

	@FindBy(name = "ctl00$ContentPlaceHolder1$txtMobileNum")
	private WebElement mobile;

	@FindBy(name = "ctl00$ContentPlaceHolder1$ddlQuestions")
	private WebElement questions;

	@FindBy(name = "ctl00$ContentPlaceHolder1$txtAnswer")
	private WebElement answer;

	@FindBy(xpath = "//input[@name='ctl00$ContentPlaceHolder1$UserType']")
	private List<WebElement> usertype;

	@FindBy(name = "ctl00$ContentPlaceHolder1$txtUserId")
	private WebElement username;

	@FindBy(name = "ctl00$ContentPlaceHolder1$txtPassword")
	private WebElement password;

	@FindBy(name = "ctl00$ContentPlaceHolder1$txtConfirmPwd")
	private WebElement cpassword;

	public RegisterPage() {
		PageFactory.initElements(driver, this);
	}

	public void generalDetailFunctionality(String Titile, String Name, String Lastname, String Add1, String Add2,
			String City, String Country, /* String State, String District, */ String Nationality, String Pincode,
			String Email, String Phone, String Mobile) throws InterruptedException {

		
		selectByVisibleText(title, Titile);
		sendKeys(name, Name);
		sendKeys(lastname, Lastname);
		sendKeys(address1, Add1);
		sendKeys(address2, Add2);
		sendKeys(city, City);
		selectByVisibleText(country, Country);
		
		sendKeys(nationality, Nationality);
		sendKeys(pincode, Pincode);
		sendKeys(email, Email);
		sendKeys(phone, Phone);
		sendKeys(mobile, Mobile);
		
		

	}

	

	public void chooseAnswerFunctionality(String Question, String Answer) {
		selectByVisibleText(questions, Question);
		sendKeys(answer, Answer);
	}

	public void chooseUserTypeFunctionality(String Usertype) {

		for (WebElement a : usertype) {
			if (a.getAttribute("Value").equalsIgnoreCase(Usertype)) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].click();", a);
				break;
			}
		}

	}

	public void chooseIdPasswordFunctionality(String id, String pswd, String cpswd) {
		sendKeys(username, id);
		sendKeys(password, pswd);
		sendKeys(cpassword, cpswd);
	}

}
