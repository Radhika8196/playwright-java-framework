package javapkg;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class testApple {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
	
		driver.get("httsp://apple.com");
		
		driver.manage().window().maximize();
		
		WebElement store = driver.findElement(By.xpath("//ul[@id='globalnav-list']//a[@href='/store']"));
		
		Actions actions = new Actions(driver);
		actions.moveToElement(store).perform();

		WebElement store_menu = driver.findElement(By.xpath("//*[@id='globalnav-submenu-link-store']/div/div/div[1]/ul/li[4]/a"));
		
		store_menu.click();
		
		WebElement accessory = driver.findElement(By.className("rs-cardsshelf rs-cardsshelf-mzone"));
		
		//JavascriptExecutor js = (JavascriptExecutor) driver;

		//js.executeScript("arguments[0].scrollIntoView(true);", accessory); 

	
		driver.findElement(By.xpath("//div[@class='rf-cards-scroller']/div[2]/button[2]/span[text()='Next - All models. ']")).click();
		
		driver.findElement(By.xpath("//div[@class='rf-cards-scroller-itemview']/div/div/div/h3[contains(text(),'iPhone 16 &')]")).click();

		
		
		
	}

}
