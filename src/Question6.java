import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question6 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Madhusagar\\Desktop\\SeleniumClass\\SeleniumDay4\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement txtuser = driver.findElement(By.xpath("//input[@id='email']"));
	txtuser.sendKeys("madhu");
	WebElement txtPass = driver.findElement(By.xpath("//input[@id='pass']"));
	txtPass.sendKeys("madhu");
String attribute = txtPass.getAttribute("id");
	System.out.println(attribute);
}
}
