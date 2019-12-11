import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question10 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Madhusagar\\Desktop\\SeleniumClass\\SeleniumDay4\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.adactin.com/HotelApp/");
	WebElement txtUser = driver.findElement(By.id("username"));
	txtUser.sendKeys("sdgtrty@gmail.com");
	String text = txtUser.getAttribute("value");
	System.out.println(text);
	WebElement txtPass = driver.findElement(By.id("password"));
	txtPass.sendKeys("madhu");
	String text1 = txtPass.getAttribute("value");
	System.out.println(text1);
	
}
}
