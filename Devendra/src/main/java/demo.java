import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class demo {

	@Test
	public void funA() {
		System.out.println("done");
		WebDriver driver = new  ChromeDriver();
		System.out.println("start");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://mail.google.com/mail/u/0/?tab=rm&ogbl#inbox/FMfcgzGsltTqbRhcLXDWcmqgjDJJsgzq");
		WebElement element=  driver.findElement(By.xpath("//div[text()='Not your computer? Use Guest mode to sign in privately. ']"));
		String data= element.getText();
		System.out.println(data);                                                                                           
		driver.quit();
	}
}
