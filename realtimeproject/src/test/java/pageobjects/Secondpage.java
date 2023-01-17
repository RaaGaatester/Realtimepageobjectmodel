package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Secondpage {

	
	public static WebElement flight(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@title='flights']"));
	}
	
	public static WebElement start(WebDriver driver) {
		return driver.findElement(By.id("autocomplete"));
	}
	public static WebElement ends(WebDriver driver) {
		 return driver.findElement(By.id("autocomplete2"));
	}
	public static WebElement depature(WebDriver driver) {
	  return driver.findElement(By.id("departure"));
	}
	public static WebElement count(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@data-toggle='dropdown']"));
	}
	public static WebElement age(WebDriver driver) {
		return driver.findElement(By.id("fadults"));
		
	}
	public static WebElement confirm(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"onereturn\"]/div[3]/div/div/div/div/div[1]/div/div/div[2]/i"));
		
	}
	public static WebElement search(WebDriver driver) {
		return driver.findElement(By.id("flights-search"));
		
	}
}
