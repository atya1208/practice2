package selrnium_raja;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day4_action {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(4000);
		driver.manage().window().maximize();
		Actions act= new Actions(driver);
		
	
    driver.findElement(By.xpath("//*[@alt='Appliances']"));
	WebElement srch	=driver.findElement(By.name("q"));
	
	act.sendKeys(srch, "cotton shirt").build().perform();
	act.click(srch).build().perform();
	Thread.sleep(5000);
	driver.quit();
     
	

	}

}
