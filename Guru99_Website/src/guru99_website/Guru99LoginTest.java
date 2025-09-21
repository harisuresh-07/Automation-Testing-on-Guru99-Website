package guru99_website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Guru99LoginTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","F:\\seleniumweb_driver\\FirefoxDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.demo.guru99.com/V4/");
		driver.findElement(By.name("uid")).sendKeys("mngr630313");
		driver.findElement(By.name("password")).sendKeys("bUguqUq");
		driver.findElement(By.name("btnLogin")).click();
		
		String expectedTitle = "Guru99 Bank Manager HomePage";
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Login Test Passed!");
        } else {
            System.out.println("Login Test Failed!");
        }
		
        driver.quit();
	}

}
