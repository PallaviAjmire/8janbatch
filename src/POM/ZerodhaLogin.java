package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaLogin {
	 @FindBy(xpath ="//input[@id=\"userid\"]" )private WebElement username;
	  @FindBy(xpath= "//input[@id=\"password\"]")private WebElement pass;
	   @FindBy(xpath = "//button[@type=\"submit\"]")private WebElement login;
	@FindBy(xpath = "//a[text() = \"Forgot user ID or password?\"]")private WebElement forgot;
	   @FindBy(xpath = "//a[@class=\"text-light\"]")private WebElement account;
	   @FindBy(xpath = "//input[@id=\"pin\"]")private WebElement pin;
	   @FindBy(xpath="//button[@type=\"submit\"]")private WebElement cont;
	   
	   public ZerodhaLogin(WebDriver driver) {
		   PageFactory.initElements(driver,this);
		    }
	   public void UserName(String user) {
		   username.sendKeys(user);
		    }
	   public void password(String user) {
		   pass.sendKeys(user);
	   }
	   
	   public void Login() {
		   login.click();
	   }
	   
	   public void Forgotpasswored() {
		   forgot.click();
	   }
	   
	   public void Account() {
		   account.click();
	   }
	   public void Enterpin(String pinn) {
		   pin.sendKeys(pinn);
	   } 
	   public void Cont() {
		   cont.click();
	   }
}
