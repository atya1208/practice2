package selrnium_raja;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day4_draganddrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		Actions act=new Actions(driver);
		
		WebElement rome=driver.findElement(By.id("box6"));
		//act.contextClick(rome).build().perform();// for right click
		WebElement washi=driver.findElement(By.id("box3"));
		//act.contextClick(washi).build().perform();
		WebElement oslo=driver.findElement(By.id("box1"));
		//act.contextClick(oslo).build().perform();
		WebElement sheol=driver.findElement(By.id("box5"));
		//act.contextClick(sheol).build().perform();
		WebElement stk=driver.findElement(By.id("box2"));
		//act.contextClick(stk).build().perform();
		WebElement madrid=driver.findElement(By.id("box7"));
		//act.contextClick(madrid).build().perform();
		WebElement copi=driver.findElement(By.id("box4"));
		//act.contextClick(copi).build().perform();
		
		
		WebElement itly=driver.findElement(By.id("box106"));
		act.dragAndDrop(rome, itly).build().perform();//drag and drop
		WebElement spain=driver.findElement(By.id("box107"));
		act.dragAndDrop(madrid, spain).build().perform();
		WebElement norway=driver.findElement(By.id("box101"));
		act.dragAndDrop(oslo, norway).build().perform();
		WebElement denmark=driver.findElement(By.id("box104"));
		act.dragAndDrop(copi, denmark).build().perform();
		WebElement sk=driver.findElement(By.id("box105"));
		act.dragAndDrop(sheol, sk).build().perform();
		WebElement sweden=driver.findElement(By.id("box102"));
		act.dragAndDrop(stk, sweden).build().perform();
		WebElement usa=driver.findElement(By.id("box103"));
		act.dragAndDrop(washi, usa).build().perform();
		Thread.sleep(5000);
		
		driver.quit();
		
	}

}
