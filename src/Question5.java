import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question5 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Madhusagar\\Desktop\\SeleniumClass\\SeleniumDay4\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.greenstechnologys.com/index.html");
	WebElement findElement = driver.findElement(By.xpath("//span[contains(text(),'OMR')]"));
	String text = findElement.getText();
	System.out.println(text);
	WebElement findElement1 = driver.findElement(By.xpath("//strong[contains(text(),'Garden')]"));
	String text1 = findElement1.getText();
	System.out.println(text1);
	WebElement findElement2 = driver.findElement(By.xpath("(//strong[contains(text(),'Thoraipakkam, Jain college bus stop, ')])[1]"));
	String text2 = findElement2.getText();
	System.out.println(text2);
	WebElement findElement3 = driver.findElement(By.xpath("//strong[contains(text(),'oppt')]"));
	String text3 = findElement3.getText();
	System.out.println(text3);
	Thread.sleep(2000);
	WebElement findElement7 = driver.findElement(By.xpath("(//strong[contains(text(),'Thoraipakkam, Jain college bus stop, ')])[2]"));
	String text7 = findElement7.getText();
	System.out.println(text7);
	WebElement findElement6 = driver.findElement(By.xpath("//strong[contains(text(),'Tel: ')]"));
	String text6 = findElement6.getText();
	System.out.println(text6);
	
}
}
