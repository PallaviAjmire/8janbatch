package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POM.ZerodhaLogin;
import Utility.Browser;
import Utility.Excel;
import Utility.Screenshot;
import io.opentelemetry.sdk.metrics.data.ExemplarData;

public class LoginTest {
	WebDriver driver;
	@BeforeTest
	public void test() {
		System.out.println("Welcom zerodhalogin");
	}
	@BeforeClass
		public void test2() {
		System.out.println("positive testcase");
	}
	@BeforeMethod
	public void launchbrowser(){
	driver =Browser.OpenBrowser("https://kite.zerodha.com/");
	}
	@Test(priority=-1)
 public void LoginWithSheet() throws InterruptedException, EncryptedDocumentException, IOException {
ZerodhaLogin obj = new ZerodhaLogin(driver);
obj.UserName(Excel.getTestdata("Sheet1",0,1));
obj.password(Excel.getTestdata("Sheet1", 1, 1));
obj.Login();
  }
	@Test
	public void clickpin() throws EncryptedDocumentException, IOException, InterruptedException {
		ZerodhaLogin obj = new ZerodhaLogin(driver);

		obj.UserName(Excel.getTestdata("Sheet1",0,1));
		obj.password(Excel.getTestdata("Sheet1", 1, 1));
		obj.Login();
		Thread.sleep(2000);
		  
       obj.Enterpin(Excel.getTestdata("Sheet1", 2, 1));
   obj.Cont();
	}

//@Test
//public void clickforgot() {
//ZerodhaLogin obj = new ZerodhaLogin(driver);
// obj.Forgotpasswored();
// }
//@Test
//public void createNewacc() {
//ZerodhaLogin obj = new ZerodhaLogin(driver);
 //obj.Account();
 //}
	
@AfterMethod
public void test1() throws IOException, InterruptedException {
	Thread.sleep(2000);
	   Screenshot.Screenshot(driver, "shot");

}
		  
		 
}