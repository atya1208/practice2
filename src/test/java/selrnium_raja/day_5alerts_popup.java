package selrnium_raja;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day_5alerts_popup {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.id("alertBox")).click();
		Thread.sleep(4000);
		Alert alert1=driver.switchTo().alert();
		System.out.println(alert1.getText());
		alert1.accept();
		Thread.sleep(4000);
		
		driver.findElement(By.id("confirmBox")).click();
		Thread.sleep(4000);
		Alert alert2=driver.switchTo().alert();
		//alert2.dismiss();
		alert2.accept();
		
		driver.quit();
	}

}
