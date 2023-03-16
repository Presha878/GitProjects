package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LocatorsDemoXpath {

	public static void main(String[] args) {


		String baseUrl = "http://automationpractice.pl/index.php";

		System.setProperty("webdriver.edge.driver","C:\\Users\\HP\\Downloads\\edgedriver_win64\\msedgedriver.exe");

		WebDriver driver=new EdgeDriver();

		driver.manage().window().maximize();

		driver.get(baseUrl);

		//Absolute xPath
		//driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[3]/div/div/div[2]/form/input[4]")).sendKeys("Tshirt");
		//driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[3]/div/div/div[2]/form/button")).click();

		//Relative xPath
		//driver.findElement(By.xpath("//input[@id="search_query_top\"]")).sendKeys("T-shirt");
		//driver.findElement(By.xpath("//button[@name='submit_search']/button")).click();

		//xpath with 'or'
		//driver.findElement(By.xpath("//input[@id='search_query_top' or @name='search_queryX']")).sendKeys("T-shirt");
		//driver.findElement(By.xpath("//button[@name='submit_searchX' or @class='btn btn-default button-search']")).click();

		//xpath with 'and'
		//driver.findElement(By.xpath("//input[@id='search_query_top'and @name='search_query']")).sendKeys("T-shirt");
		//driver.findElement(By.xpath("//button[@name='submit_search' and @class='btn btn-default button-search']")).click();

		// xpath with 'contains'
		//driver.findElement(By.xpath("//input[contains(@id,'query_top')]")).sendKeys("T-shirt"); //id=search_query_top
		//driver.findElement(By.xpath("//button[contains(@name,'search')]")).click(); //name=submit
		
		//xpath with 'start-with'
		//driver.findElement(By.xpath("//input[start-with(@id,'search_query')]")).sendKeys("T-shirt");
		//driver.findElement(By.xpath("//button[start-with(@name,'submit_')]")).click();
		
		
		//xpath with test()
		//driver.findElement(By.xpath("//a[text()='Women']")).click();//women tab
		
		// changed xpath
		 
		driver.findElement(By.xpath("//form[@id='searchbox']//input[@id='search_query_top']")).sendKeys("T-shirts");
		driver.findElement(By.xpath("//form[@id='searchbox']//button[@name='submit_search']")).click();
						
	
		
	}


		
	
		
		
		
		



}
