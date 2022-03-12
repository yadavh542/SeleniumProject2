import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.jodah.failsafe.internal.util.Assert;

public class AutosuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ("C:\\Users\\hemant\\Desktop\\Mini Desktop\\Automation Testing\\chromedriver.exe"));
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
        driver.manage().window().maximize();
        
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        
        //entering value
        driver.findElement(By.id("autosuggest")).sendKeys("ind");
        
        Thread.sleep(2000);
        //selecting values
        
        List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

        for(WebElement option: options)
        {
        	if (option.getText().equalsIgnoreCase("India"))
        	{
        		option.click();
        		break;
        	}
        }
        	
        //Checkboxes	
        System.out.println("Is checkbox selected ? "+driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
        //Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
        driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
        System.out.println("Is checkbox selected ? "+driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
        //Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());	
        //count the no. of all checkboxes
        System.out.println("Total No. of Checkboxes are "+driver.findElements(By.cssSelector("input[type='checkbox']")).size());
        
        //Assert.assertEquals(driver.findElements(By.cssSelector("input[type='checkbox']")).size());	
	
        //date picker
        driver.findElement(By.cssSelector(".ui-datepicker-trigger")).click();
        //select current date
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-hover")).click();
    
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
        if( driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
        {
        	System.out.println("Its enabled");
        	//Assert.assertTrue(true);
        }
        else
        {
        	System.out.println("Its disabled");
        	//Assert.assertTrue(false);
        }
        
	
	
	
	}

}
