package selrnium_raja;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/login/");
driver.manage().window().maximize();
Thread.sleep(5000);
driver.findElement(By.xpath("//input[@name='email']")).sendKeys("dhanjay bhai ");
driver.findElement(By.name("pass")).sendKeys("420420420");
Thread.sleep(5000);
driver.quit();

	}

}
