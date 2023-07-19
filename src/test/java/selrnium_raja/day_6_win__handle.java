package selrnium_raja;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day_6_win__handle {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/multiplewindows/");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
		
		String parent=driver.getWindowHandle();
		System.out.println("parent window-"+parent);
		
		driver.findElement(By.xpath("//*[@onclick=\"NewTab()\"]")).click();
		Set<String> child=driver.getWindowHandles();
		System.out.println("child window-"+child);
		for(String i:child) {
			if (!i.equals(parent)) {
				driver.switchTo().window(i);
				driver.findElement(By.xpath("//*[@class='fab fa-whatsapp']")).click();
				Thread.sleep(5000);
				driver.close();
				Thread.sleep(5000);
			}
			
		}
		
driver.quit();
	}

}
