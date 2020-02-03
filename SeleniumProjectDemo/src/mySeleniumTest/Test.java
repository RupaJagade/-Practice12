package mySeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {

		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "F:\\SeleniumSetup\\chromedriver_win32 (1)\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/");
		
		WebElement informlink = driver.findElement(By.linkText("Input Forms"));
		informlink.click();

		WebElement simpleformlink = driver.findElement(By.linkText("Simple Form Demo"));
		simpleformlink.click();
		
		WebElement msgtextbox=driver.findElement(By.id("user-message"));
		msgtextbox.sendKeys("Rupali");
		
		WebElement showmsgbutton=driver.findElement(By.xpath("//button[text()='Show Message']"));
		showmsgbutton.click();
		
		WebElement actualmsg=driver.findElement(By.id("display"));
		
		System.out.println(actualmsg.getText());
		
		if(actualmsg.getText().equals("Rupali")) {
			System.out.println("Test is passed");
		} else{
			System.out.println("Test is not passes");
		}
		

	}

}
