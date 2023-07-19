package selrnium_raja;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day_5screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bing.com/news/search?q=India+Prime+Minister&qpvt=india+prime+minister&FORM=EWRE");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@href=\"/images/search?q=India+Prime+Minister&FORM=HDRSC3\"]")).click();
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(srcFile, new File("D:\\eclipse\\eclipse workspace\\modi2.png"));
		
		System.out.println("screenshot captured");
		Thread.sleep(5000);
		driver.quit();

	}

}
