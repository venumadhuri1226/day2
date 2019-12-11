import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class question1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Madhusagar\\Desktop\\SeleniumClass\\SeleniumDay4\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://www.greenstechnologys.com");
WebElement find = driver.findElement(By.xpath("//h2[contains(text(),'Reviews')]"));
String text = find.getText();
System.out.println(text);
}
}
