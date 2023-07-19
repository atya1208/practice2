package selrnium_raja;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day_3_locator {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.facebook.com/signup");
		
		dr.findElement(By.name("firstname")).sendKeys("Dhananjay");
		Thread.sleep(2000);
		dr.findElement(By.name("lastname")).sendKeys("kumar");
		Thread.sleep(2000);
		dr.findElement(By.name("reg_email__")).sendKeys("dhanu785980@gmail.com");
		Thread.sleep(2000);
		dr.findElement(By.xpath("//*[@name=\"reg_email_confirmation__\"]")).sendKeys("dhanu785980@gmail.com");
		Thread.sleep(2000);
		dr.findElement(By.name("reg_passwd__")).sendKeys("don@don");
		Thread.sleep(2000);
		
		WebElement day =dr.findElement(By.id("day"));
		Select obj= new Select(day);
		obj.selectByValue("12");
		Thread.sleep(4000);
		
		WebElement month =dr.findElement(By.id("month"));
		Select obj1= new Select(month);
		obj1.selectByIndex(7);
		Thread.sleep(4000);
		
		WebElement year =dr.findElement(By.id("year"));
		Select obj2= new Select(year);
		obj2.selectByValue("1992");
		Thread.sleep(4000);
		
		dr.findElement(By.xpath("//*[text()='Male']")).click();
		Thread.sleep(3000);
		
		dr.findElement(By.xpath("//*[@name=\"websubmit\"]")).click();
		
		
		
	}

}
