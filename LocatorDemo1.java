package locators;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class LocatorDemo1 {

	public static void main(String[] args) {


		String baseUrl = "http://automationpractice.pl/index.php";
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\HP\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();

		driver.get(baseUrl);
		
		// id and name locators
		WebElement searchbox=driver.findElement(By.id("search_query_top"));
		searchbox.sendKeys("T.shirts");
		
		driver.findElement(By.name("submit_search")).click();
		
		// LinkText/PartialLinkText
		//driver.findElement(By.linkText("Printed Chiffon Dress")).click();
		
		driver.findElement(By.partialLinkText("Chiffon Dress")).click();
		
               
                
		
		
		
		
		
		
		
		
		
	

	}

}
