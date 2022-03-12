import java.util.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\hemant\\\\Desktop\\\\Mini Desktop\\\\Automation Testing\\\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.youtube.com/");
//        System.out.println(driver.getTitle());
//        
//        int[] arr = new int[3];
//        
//        arr[0] =453;
//        arr[1] =234;
//        arr[2] =543;
//        System.out.println(arr[2]);
        
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(5);
        arr.add(43);
        arr.add(32);
        arr.add(54);
        
        System.out.println(arr.get(3));
        
        
        
	}

}
