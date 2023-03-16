package handingPopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HandlingPopups {

	public static void main(String[] args) throws InterruptedException {
	
		String baseUrl = "http://automationpractice.pl/index.php";

		System.setProperty("webdriver.edge.driver","C:\\Users\\HP\\Downloads\\edgedriver_win64\\msedgedriver.exe");

		WebDriver driver=new EdgeDriver();

		driver.manage().window().maximize();

		driver.get(baseUrl);
		driver.findElement(By.id("search_query_top!")).click();
		Thread.sleep(1000);
		String Mesg= driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		driver.quit();

	}

}
