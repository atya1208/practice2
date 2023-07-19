package selrnium_raja;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day_5navigation {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("anglina jolie");
		Thread.sleep(5000);
		
		driver.findElement(By.name("btnK")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
		
		//navigation commands
		driver.navigate().to("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569885%7Cb%7Cfb%20sign%20up%7C&placement=&creative=589460569885&keyword=fb%20sign%20up&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221832%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-294779041346%26loc_physical_ms%3D9061689%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMIqOykxvmEgAMVZ85MAh11XgnvEAAYASAAEgLGRfD_BwE");
		driver.findElement(By.name("firstname")).sendKeys("raja ka vivaah ho rha h");
		Thread.sleep(5000);
		
		driver.navigate().refresh();
		Thread.sleep(4000);
		
		driver.navigate().back();
		Thread.sleep(4000);
		
		driver.navigate().forward();
		Thread.sleep(4000);
		
		driver.quit();
		
		
		
	}

}
