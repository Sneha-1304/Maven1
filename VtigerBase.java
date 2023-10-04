package BaseClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import VtigerPOM.VAddCampaings;
import VtigerPOM.VAddDetails;
import VtigerPOM.VLoginPage;
import VtigerPOM.VMarketingPage;

public class VtigerBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		WebDriver driver = new ChromeDriver();   
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.vtiger.com/vtigercrm/");
		
		VLoginPage lp = new VLoginPage();
		PageFactory.initElements(driver, lp);
		lp.getSignin().click();
		
		VMarketingPage vp = new VMarketingPage();
		PageFactory.initElements(driver, vp);
		vp.getThreedot().click();
		vp.getClickonmarketing().click();
		vp.getCampaings().click();
		
		VAddCampaings ac = new VAddCampaings();
		PageFactory.initElements(driver, ac);
		ac.getAddcamp().click();
		
		VAddDetails add = new VAddDetails();
		PageFactory.initElements(driver, add);
		add.getFname().sendKeys("Google");
		add.getProduct().sendKeys("Iphone");
		//add.getDate().sendKeys("08-30-2023");
		add.getAudiance().sendKeys("Good morning");
		add.getSize().sendKeys("100");
		add.getSponcer().sendKeys("Ambani");
		add.getNum().sendKeys("10");
		//add.getAcost().sendKeys("ABC");
		add.getBudget().sendKeys("10000");
		add.getSave().click();
		
		
		
		
		
		
		
		
		
		
		
		
		
				
		
	}

}
