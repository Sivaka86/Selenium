import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class First_Class {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();// Open the browser
		driver.manage().window().maximize();
		driver.get("https://google.com");
		driver.get("https://amazon.com");
		driver.navigate().to("https://emirates.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
	}

}
