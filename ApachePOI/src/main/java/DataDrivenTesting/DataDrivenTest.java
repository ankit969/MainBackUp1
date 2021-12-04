package DataDrivenTesting;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTest {
	WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@Test(dataProvider = "loginData")
	public void loginTest(String user, String pwd, String exp) {
		driver.get("https://admin-demo.nopcommerce.com/login");
		
		WebElement txtEmail = driver.findElement(By.xpath("//input[@id='Email']"));
		txtEmail.clear();
		txtEmail.sendKeys(user);
		
		WebElement txtPassword = driver.findElement(By.xpath("//input[@id='Password']"));
		txtPassword.clear();
		txtPassword.sendKeys(pwd);
		
		driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();//Login btn
		
		String exp_title = "Dashboard / nopCommerce administration";
		String act_title = driver.getTitle();
		
		if(exp.equals("Valid")) {
			if(exp_title.equals(act_title)) {
				driver.findElement(By.linkText("Logout")).click();
				Assert.assertTrue(true);
			}
			else {
				Assert.assertTrue(false);
			}
		}
		else if(exp.equals("Invalid")) {
			if(exp_title.equals(act_title)) {
				driver.findElement(By.linkText("Logout")).click();
				Assert.assertTrue(false);
			}
			else {
				Assert.assertTrue(true);
			}
		}
	}
	@DataProvider(name="loginData")
	public String[][] getData() throws IOException {
		/*String loginData[][] = {
				{"admin@yourstore.com","admin","Valid"},
				{"Itachi@gmaill.com","ad","Invalid"},
				{"Itachi@gm.com","admin","Invalid"},
				{"Itachi@gmai.com","ad","Invalid"}
		};*/
		
		//get the data from excel:
		String path = ".\\dataFile\\dataDrivenTest1.xlsx";
		XLUtility xlutil = new XLUtility(path);
		int totalRows = xlutil.getRowCount("LoginPageData");
		int totalCols = xlutil.getCellCount("LoginPageData", 1);//we will start from 1st row bcs 0th row is a header
		
		String loginData[][] = new String[totalRows][totalCols];//will store the data in 2d array
		
		for(int i=1; i<=totalRows; i++) {//we are staring from 1st row bcs 0th row is containing header
			for(int j=0; j<totalCols; j++) {
				loginData[i-1][j] =  xlutil.getCellData("LoginPageData", i, j);//"i-1" bcs we are storing the data in array and it will satrt from 0th row
			}
		}
	return loginData;	
	
	}
	@AfterClass
	public void tearDown() {
		driver.close();
	}
}
