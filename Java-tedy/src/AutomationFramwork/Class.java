package AutomationFramwork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Class {
	public static WebDriver driver = new FirefoxDriver();
	public static String baseURL = "google.com" ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver.get(baseURL);
		driver.get("http://lab.enginethemes.com/fre");
	}

}
