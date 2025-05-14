package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicOfSelenium {

    public static void main(String[] args) {

        // WebDriver           : Interface
        // driver              : Object
        // new ChromeDriver()  : Class Constructor

        WebDriver driver = new ChromeDriver();      // upcasting

        driver.get("https://www.flipkart.com");
        driver.close();

    }

}
