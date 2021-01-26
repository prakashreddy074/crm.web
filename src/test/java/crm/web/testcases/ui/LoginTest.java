package crm.web.testcases.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		
		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\webDriverBinaries\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//driver.findElement(By.xpath("//input[@id='email']"));
		String act=driver.getTitle();
		String expt= "Facebook – log iqn or sign up";
		if(expt.equals(act))
		{
		System.out.println("titlr as expected");
		}
		else {
			System.out.println(String.format("title is not matching --- expected is: %s but actual result is: %s",expt,act));
		}
		driver.quit();
	}

}
