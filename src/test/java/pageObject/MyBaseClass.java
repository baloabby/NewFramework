package pageObject;

import org.openqa.selenium.WebDriver;

public abstract class MyBaseClass {
	
	public static WebDriver driver;
	
	public MyBaseClass(WebDriver driver){
		MyBaseClass.driver = driver;
	

	


    }
}
