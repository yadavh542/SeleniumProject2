import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", ("C:\\Users\\hemant\\Desktop\\Mini Desktop\\Automation Testing\\chromedriver.exe"));
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
        driver.manage().window().maximize();
        
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		//String url = driver.findElement(By.cssSelector("a[href*='soapui']")).getAttribute("href");
		
		//Open connection method to identify status code of the links
		/*
		HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
		conn.setRequestMethod("HEAD");
		conn.connect();
		int respCode = conn.getResponseCode();
		System.out.println(respCode);
		*/
		// Iterate over all links
		List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li']"));
		
		SoftAssert a = new SoftAssert();
		
		for(WebElement link : links) {
			String url = link.getAttribute("href");
			HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respCode = conn.getResponseCode();
			System.out.println(respCode);
			a.assertTrue(respCode<400,"The link with text"+link.getText()+"is broken with code"+respCode);
			/*
			if(respCode>400) {
				System.out.println("The link with text"+link.getText()+"is broken with code"+respCode);
				
				Assert.assertTrue(false);
				
			} */
			
			
			
		}
		a.assertAll();
	}

}
