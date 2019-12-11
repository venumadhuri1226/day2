import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question9 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Madhusagar\\Desktop\\SeleniumClass\\SeleniumDay4\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.gmail.com");
	
	WebElement txtUserName = driver.findElement(By.id("identifierId"));
	txtUserName.sendKeys("k.venumadhuri1227@gmail.com");

	WebElement btnNext = driver.findElement(By.xpath("//span[text()='Next']"));
	btnNext.click();
	Thread.sleep(3000);
	WebElement txtPass = driver.findElement(By.name("password"));
	txtPass.sendKeys("madhu");
	
	
}
}
