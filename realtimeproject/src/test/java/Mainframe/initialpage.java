package Mainframe;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageobjects.LoginPageObjects;
import pageobjects.Secondpage;

public class initialpage {
	
	
	@Test
	public void baseclass() {
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://phptravels.net/login");
		driver.manage().window().maximize();
		
		
		LoginPageObjects.emailID(driver).sendKeys("aadhy321@gmail.com");
		LoginPageObjects.password(driver).sendKeys("Aadhy@123");
		LoginPageObjects.submitbutton(driver).click();
		
		Secondpage.flight(driver).click();
		Secondpage.start(driver).sendKeys("MAA");
		Secondpage.start(driver).sendKeys(Keys.TAB);
		Secondpage.ends(driver).sendKeys("CIC");
		Secondpage.depature(driver).clear();
		Secondpage.depature(driver).sendKeys("21-01-2023");
		Secondpage.count(driver).click();
		Secondpage.age(driver).sendKeys("8");
		Secondpage.confirm(driver).click();
		Secondpage.search(driver).click();
		driver.navigate().back();
		Actions actions = new Actions(driver);
		actions.contextClick(driver.findElement(By.id("flights-search"))).perform();
		driver.findElement(By.id("flights-search")).click();
		
		
		
		
		
		
		
		
		
		//*WebElement email = driver.findElement(By.name("email"));
		//*email.sendKeys("aadhy321@gmail.com");
		//*email.sendKeys(Keys.TAB);
		//*WebElement password =driver.findElement(By.name("password"));
		//*password.sendKeys("Aadhy@123");
		//* driver.findElement(By.xpath("//button[@type='submit'][@class='btn btn-default btn-lg btn-block effect ladda-button waves-effect']")).click();
       
	}
}
