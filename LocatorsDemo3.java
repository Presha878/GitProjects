package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LocatorsDemo3 {

	public static void main(String[] args) {
		String baseUrl = "https://www.facebook.com/";

		System.setProperty("webdriver.edge.driver","C:\\Users\\HP\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();

		driver.get(baseUrl);
		
		//Tag & id
		//driver.findElement(By.cssSelector("#email")).sendKeys("Presha");
		//driver.findElement(By.cssSelector("input#email")).sendKeys("Presha");
		
		//Tag & Class
		//driver.findElement(By.cssSelector("input.inputtext")).sendKeys("Priyanshi");
		 //driver.findElement(By.cssSelector(".inputtext")).sendKeys("Priyanshi");
		
		//Tag & attribute
		//driver.findElement(By.cssSelector("[name=email]")).sendKeys("Mishka");
		//driver.findElement(By.cssSelector("input[name=email]")).sendKeys("Mishka");
		
		//Tag class & attribute
		driver.findElement(By.cssSelector("input.inputtext[data-testid=royal_email]")).sendKeys("Ashish");
		driver.findElement(By.cssSelector("input.inputtext[data-testid=royal_pass]")).sendKeys("Sharma");
	}

}
