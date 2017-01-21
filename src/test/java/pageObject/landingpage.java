package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class landingpage extends MyBaseClass {
	public landingpage(WebDriver driver){
		super(driver);
	}

	
	
	@FindBy(how=How.LINK_TEXT, using="cart_content")
	public static WebElement cart_content;
	
	@FindBy(how=How.LINK_TEXT, using="Checkout")
	public static WebElement checkout;
	
	@FindBy(how=How.LINK_TEXT, using="My Account")
	public static WebElement my_account;
	
	@FindBy(how=How.NAME, using="keywords")
	public static WebElement quickSearch;
	
	@FindBy(how=How.XPATH, using="//*[@id='columnLeft']/div[3]/div[2]/form/input[3]")
	public static WebElement SearchIcon;
	
	public void click_cart_content(){
		cart_content.click();
	}
		
		public void click_Checkout(){
			checkout.click();
	}
		
		public void click_my_account(){
			my_account.click();
			
		}
			public void type_into_quickSearch(String product){
				quickSearch.sendKeys(product);
			}
			public void click_searchicon(){
				SearchIcon.click();
				
			}
}
		

