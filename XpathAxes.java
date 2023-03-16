package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class XpathAxes {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\HP\\Downloads\\edgedriver_win64\\msedgedriver.exe");

		WebDriver driver=new EdgeDriver();
		
		driver.get("http://money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().window().maximize();

		//Self
		String text=driver.findElement(By.xpath("//a[contains(text(),'India Tourism De')]/self;;a")).getText();
		System.out.println(text);
		
	}

}
