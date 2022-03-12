import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CleartripAssignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				("C:\\Users\\hemant\\Desktop\\Mini Desktop\\Automation Testing\\chromedriver.exe"));
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		driver.manage().window().maximize();

		driver.get("https://www.cleartrip.com/");
		// driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[3]/div[3]/div/div/div/div/button")).click();
		// driver.findElement(By.cssSelector(".Day-grid.flex
		// flex-middle.flex-column.flex-top")).click();

	}

}
