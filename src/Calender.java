import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ("C:\\Users\\hemant\\Desktop\\Mini Desktop\\Automation Testing\\chromedriver.exe"));
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
        driver.manage().window().maximize();

        driver.get("https://www.path2usa.com/travel-companions");
        driver.findElement(By.xpath("//*[@id=\"travel_date\"]")).click();
        
        //Selecting Month
        while(!driver.findElement(By.cssSelector("[class = 'datepicker-days'][class='datepicker-switch']")).getText().contains("April")) 
        {
        	driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
        	
        }
        //selecting date
        List<WebElement> dates = driver.findElements(By.className("day"));
        
        int count = driver.findElements(By.className("day")).size();
        for(int i=0;i<count;i++) {
        	String text = driver.findElements(By.className("day")).get(i).getText();
        	if(text.equalsIgnoreCase("23")) {
        		driver.findElements(By.className("day")).get(i).click();
        		break;
        	}
        }
        
        
	}

}
