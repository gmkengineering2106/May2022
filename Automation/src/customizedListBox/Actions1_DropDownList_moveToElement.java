package customizedListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions1_DropDownList_moveToElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/ganesh/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click(); //to close the pop up.
		Thread.sleep(2000);
		
		WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
		Actions act = new Actions(driver);
		act.moveToElement(login).perform();
		
		
		
		Thread.sleep(10000);
		driver.quit();

	}

}
