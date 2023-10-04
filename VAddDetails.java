package VtigerPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VAddDetails {
  
	@FindBy(id="Campaigns_editView_fieldName_campaignname")
	private WebElement fname ;
	
	@FindBy(id="product_id_display")
	private WebElement product;
	
	@FindBy(id="Campaigns_editView_fieldName_targetaudience")
	private WebElement audiance ;
	
	
	@FindBy(id="Campaigns_editView_fieldName_sponsor")
	private WebElement sponcer;
	
	@FindBy(id="Campaigns_editView_fieldName_targetsize")
	private WebElement  size;
	
	@FindBy(id="Campaigns_editView_fieldName_numsent")
	private WebElement num;
	
	@FindBy(id="Campaigns_editView_fieldName_budgetcost")
	private WebElement  budget;
	
	//@FindBy(id="Campaigns_editView_fieldName_actualcost")
	//private WebElement acost;
	
	@FindBy(id="Campaigns_editView_fieldName_expectedsalescount")
	private WebElement expectedaccount;
	
	@FindBy(xpath="//button[text()='Save']")
	private WebElement save;

	public WebElement getFname() {
		return fname;
	}

	public WebElement getProduct() {
		return product;
	}

	public WebElement getAudiance() {
		return audiance;
	}

	

	public WebElement getSponcer() {
		return sponcer;
	}

	public WebElement getSize() {
		return size;
	}

	public WebElement getNum() {
		return num;
	}

	public WebElement getBudget() {
		return budget;
	}

	

	public WebElement getSave() {
		return save;
	}
	
	
	
	
}
