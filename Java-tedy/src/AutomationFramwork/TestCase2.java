package AutomationFramwork;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class TestCase2 {
	public WebDriver driver = new FirefoxDriver();

	
	@BeforeMethod
	public void beforeMethod() {
	
		driver.get("http://lab.enginethemes.com/fre");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
  public void f() {
	  driver.findElement(By.linkText("Post a Project (New Test)")).click();
	  driver.findElement(By.cssSelector("#step-plan > div > ul > li:nth-child(1) > a")).click();
	  driver.findElement(By.id("post_title")).click();
	  driver.findElement(By.id("et_budget")).click();
	  driver.findElement(By.id("skill")).click();
	  driver.findElement(By.cssSelector("#project_category_chosen > ul > li > input")).click();
	  driver.findElement(By.cssSelector("#project_category_chosen > ul > li > input")).sendKeys("D");
	  driver.findElement(By.cssSelector("#project_category_chosen > ul > li > input")).sendKeys(Keys.ENTER);
	  ((JavascriptExecutor) driver).executeScript("return tinyMCE.activeEditor.setContent('Good field')");
	  driver.findElement(By.cssSelector("#step-post > div > form > div:nth-child(8) > div > div.col-sm-8 > button")).click();
	
  }

	

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
