import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question8 {
public static void main(String[] args) throws InterruptedException,NoSuchElementException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Madhusagar\\Desktop\\SeleniumClass\\SeleniumDay4\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.google.com/");
	Actions act=new Actions(driver);
	Thread.sleep(3000);
	WebElement clickApps = driver.findElement(By.xpath("//a[@title='Google apps']"));
	
	clickApps.click();
	Thread.sleep(3000);
	
	WebElement clickGmail= driver.findElement(By.xpath("//span[text()='Gmail']"));
	act.moveToElement(clickGmail).perform();
	clickGmail.click();
	
	
}
}
