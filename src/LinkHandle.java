import java.time.Duration;
import java.util.Iterator;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ("C:\\Users\\hemant\\Desktop\\Mini Desktop\\Automation Testing\\chromedriver.exe"));
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
        driver.manage().window().maximize();
        
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
        System.out.println(driver.findElements(By.tagName("a")).size());
        
        WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
        
        System.out.println(footerdriver.findElements(By.tagName("a")).size());
        
        //3
        WebElement columndriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
        System.out.println(columndriver.findElements(By.tagName("a")).size());
        
        //4
        
        for(int i=0; i<columndriver.findElements(By.tagName("a")).size();i++)
        {
        	String clickonlinktab = Keys.chord(Keys.CONTROL, Keys.ENTER);
        	columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinktab);
        	
        	Thread.sleep(3000L);
        	
        }
        //Iterating all windows and getting title
        	Set<String> abc = driver.getWindowHandles();
        	Iterator<String> it = abc.iterator();
        	
        	while(it.hasNext()) {
        		driver.switchTo().window(it.next());
        		System.out.println(driver.getTitle());
        		
        	}
        	
        	
        	
        
        
        
        
        
        
        
        
        
        

	}

}
