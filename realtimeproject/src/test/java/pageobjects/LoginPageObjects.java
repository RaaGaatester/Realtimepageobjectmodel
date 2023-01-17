package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {

	
	public static WebElement emailID(WebDriver driver) {
		return driver.findElement(By.name("email"));
	}


    public static WebElement password(WebDriver driver) {
    	return driver.findElement(By.name("password"));
 }
 
    public static WebElement submitbutton(WebDriver driver) {
    	return driver.findElement(By.xpath("//button[@type='submit'][@class='btn btn-default btn-lg btn-block effect ladda-button waves-effect']"));
 }
 }

