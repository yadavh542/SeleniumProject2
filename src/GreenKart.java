import java.time.Duration;
import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GreenKart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ("C:\\Users\\hemant\\Desktop\\Mini Desktop\\Automation Testing\\chromedriver.exe"));
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        
        //Array of vegetable
        String[] itemsNeeded = {"Brocolli","Cucumber","Brinjal","Beans"};
        
        addToCart(driver, itemsNeeded);
    	
       
        
        driver.findElement(By.xpath("//img[@alt='Cart']")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div/div[3]/div[2]/div[2]/button")).click();
        //apply promo code
        driver.findElement(By.xpath("//input[@placeholder='Enter promo code']")).sendKeys("rahulshettyacademy");
        //click appy code
        driver.findElement(By.xpath("//button[text()='Apply']")).click();
        
        //Thread.sleep(5000);
        
        //Explicitly Wait 
        /*
        WebDriverWait w = new WebDriverWait(driver,5);
        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
        */
        
        //Fluent Wait
        /*
         * Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
         * 
         * WebElement foo = wait.until(new Function<WebDriver, WebElement>(){
         * public WebElement apply(WebDriver driver){
         * if(driver.findElement(By.cssSelector("[id='finish'] h4")).isDisplayed())
         * {
         *     return driver.findElement(By.cssSelector("[id='finish'] h4"));
         *  }
         *  else
         *    return null;
         * }
         * }
         * );
         */
        
        
        System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
        
        //place order
        driver.findElement(By.xpath("//button[text()='Place Order']")).click();
        //country select
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/select")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/select/option[89]")).click();
        
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div")).click();
        //checkbox
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        
        driver.findElement(By.xpath("//button[text()='Proceed']")).click();
        
        

	}
	
	public static void addToCart(WebDriver driver, String[] itemsNeeded) {
		 //list of all vegetable
        List<WebElement> products= driver.findElements(By.cssSelector("h4.product-name"));
        for(int i=0;i<products.size();i++)
        {
        	String[] name = products.get(i).getText().split("-");
        	String formattedName = name[0].trim();
        	//converting array into array list
        	List itemsNeededList = Arrays.asList(itemsNeeded);
        	int j=0;
        	if(itemsNeededList.contains(formattedName)) {
        		j++;
        		driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
        		if(j==itemsNeeded.length)
        			break;
        	}
        }
	}

}
