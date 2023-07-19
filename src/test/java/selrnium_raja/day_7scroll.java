package selrnium_raja;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day_7scroll {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/?gclid=EAIaIQobChMI1ODMhuiJgAMVDGwPAh1DRg0rEAAYASAAEgLMXfD_BwE");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		JavascriptExecutor jsx=(JavascriptExecutor) driver;
		jsx.executeScript("window.scrollBy(0,1500)");
		Thread.sleep(5000);
		
		jsx.executeScript("window.scrollBy(0,-1500)");
		Thread.sleep(5000);
		
		jsx.executeScript("window.scrollTo(0,2000)");
		Thread.sleep(5000);
		

	}

}
