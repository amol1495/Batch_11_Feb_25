package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserCapability {

    public static void main(String[] args) throws InterruptedException {

        // Desired capability (depricated since selenium 4)
        // Options classes (used as alternative)

        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Users\\amols\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        Thread.sleep(3000);
        driver.close();

    }
}
