import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteCookie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ("C:\\Users\\hemant\\Desktop\\Mini Desktop\\Automation Testing\\chromedriver.exe"));
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
        driver.manage().window().maximize();
        
        driver.manage().deleteAllCookies();
        driver.manage().deleteCookieNamed("asdf");
        
        //click on any link
        //login page verify login url
        
        driver.get("https://www.google.com/");
        
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File("C:\\Users\\hemant\\screenshot.png"));

	}

}
