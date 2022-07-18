package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Youtubeplay {

	public static void main(String[] args) {
		//setup
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//url
		driver.get("https://www.youtube.com/");
		//current title
		String title = driver.getTitle();
		System.out.println(title);
		//maximize
		driver.manage().window().maximize();
		//implicitwait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//search
		driver.findElement(By.xpath("//input[@id='search']")).click();
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Browser, Element Verification Using Selenium");
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		driver.findElement(By.xpath("(//yt-formatted-string[contains(text(),'Browser')])[1]")).click();
		//skip add
		driver.findElement(By.xpath("//div[text()='Skip Ads']")).click();
		//skip trial
		driver.findElement(By.xpath("//yt-formatted-string[text()='Skip trial']")).click();
		//fullscreen view
		driver.findElement(By.xpath("//button[@class = 'ytp-fullscreen-button ytp-button']")).click();
		//title2
		String title1 = driver.getTitle();
		System.out.println(title1);
		if(title.equals(title1)) {
			System.out.println("Same Title");
		}
		else {
			System.out.println("Not a Same Title");
		}
	
	}

}
