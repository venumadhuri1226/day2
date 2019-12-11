import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question3 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Madhusagar\\Desktop\\SeleniumClass\\SeleniumDay4\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.greenstechnologies.in/selenium-training.php");
	WebElement txt=driver.findElement(By.xpath("//p[contains(text(),'Greens Technology, Rated As ')]"));
	String text = txt.getText();
	System.out.println(text);
	WebElement findElement = driver.findElement(By.xpath("//p[contains(text(),' Learn')]"));
	String text2 = findElement.getText();
	System.out.println(text2);
}
}
