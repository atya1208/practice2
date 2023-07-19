package selrnium_raja;

import org.openqa.selenium.chrome.ChromeDriver;

public class introduction {

	public static void main(String[] args) throws InterruptedException {
		//launch browser
		System.setProperty("webdriver.chrome.driver","D:\\driver\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scores");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.quit();
		

	}

}
