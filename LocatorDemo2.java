package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LocatorDemo2 {

	public static void main(String[] args) {

		String baseUrl = "http://automationpractice.pl/index.php";
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\HP\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();

		driver.get(baseUrl);
		// className
		int sliders=driver.findElements(By.className("homeslider-container")).size();
		
		System.out.println(sliders);
		
		//TagName
		int links=driver.findElements(By.tagName("a")).size();
		System.out.println(links);
	}

}
