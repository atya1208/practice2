package selrnium_raja;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day_5alert_poup {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.name("prompt")).click();
		Alert a1=driver.switchTo().alert();
		Thread.sleep(5000);
		a1.sendKeys("raja");
		Thread.sleep(5000);
		a1.accept();
		Thread.sleep(5000);
	driver.quit();
		
		
	}

}
