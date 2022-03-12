import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", ("C:\\Users\\hemant\\Desktop\\Mini Desktop\\Automation Testing\\chromedriver.exe"));
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
        driver.manage().window().maximize();
        
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        //click on dropdown
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000L);
        //selecting adult number
        for(int i=0;i<5;i++) {
        driver.findElement(By.id("hrefIncAdt")).click();
        }
        //clicking done button
        driver.findElement(By.id("btnclosepaxoption")).click();
        System.out.println( driver.findElement(By.id("divpaxinfo")).getText());
	}

}
