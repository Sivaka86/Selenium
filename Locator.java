import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Locator {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys("Hello!");
		driver.findElement(By.name("user-name")).clear();
		driver.findElement(By.className("btn_action")).click();
		driver.findElement(By.tagName("title")).getText();
		driver.findElement(By.name("password")).sendKeys("Java");
		driver.findElement(By.id("login-button")).click();
		driver.findElement(By.cssSelector("input#user-name")); // 1. tagname#id
		driver.findElement(By.cssSelector("input.btn_action")).click();    // 1. tagname.className
		driver.findElement(By.xpath("//input[@type='submit']"));  //tagname[@attributeName = 'value']-Relative xpath
		String s = driver.findElement(By.xpath("//h4[text()='Accepted usernames are:']")).getText();
		System.out.println(s);
		driver.get("https://demoqa.com/links");
		driver.findElement(By.linkText("Home")).click();
		driver.findElement(By.partialLinkText("Hom")).click();//
		Thread.sleep(5000);
		driver.quit();	//input[@id='user-name']	
	}
}
