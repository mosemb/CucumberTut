package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver = null;
	
	By textb_username = By.id("name");
	By textb_password = By.id("password");
	By login_btn = By.id("login");
	By logoutBy = By.id("logout");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		
		if(driver.getTitle().equals("Test Project Demo")) {
			throw new IllegalStateException("This is no a login page "+"The current url is "
		+driver.getCurrentUrl());
			
		}
	}
	
	public void enter_user_name (String username) {
		driver.findElement(textb_username).sendKeys(username);
	}
	
	public void enter_password(String password) {
		driver.findElement(textb_password).sendKeys(password);
	}
	
	public void login() {
		driver.findElement(login_btn).click();
	}
	
	public void validUserLogin(String username, String password) {
		driver.findElement(textb_username).sendKeys(username);
		driver.findElement(textb_password).sendKeys(password);
		driver.findElement(login_btn).click();
		
	}
	
	public void findLogOutButton() {
		driver.findElement(logoutBy).isDisplayed();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(logoutBy).click();
		driver.close();
		driver.quit();
	}
	
	
	
	

}
