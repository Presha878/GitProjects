import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://uitestpractice.com/Students/Switchto");
		
	
		//find the alert button and perform click action
		//driver.findElement(By.xpath("//button[@id='alert']")).click();
		
		//switch to alert window and accept the alert
		//driver.switchTo().alert().accept();//ok button is clicked
		
		//driver.findElement(By.xpath("//button[@id='confirm']")).click();
		//driver.switchTo().alert().dismiss();//cancel button is clicked
			
		
		
		//find prompt button and perform click action
		
		driver.findElement(By.xpath("//button[@id='prompt']")).click();
		//switch to alert window and enter name
		driver.switchTo().alert().sendKeys("Presha");
		
		//acccept alert
		driver.switchTo().alert().accept();//to ok alert
	}

}
