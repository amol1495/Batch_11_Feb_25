package waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitWaitExample {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/dynamic.html");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.findElement(By.id("reveal")).click();
        driver.findElement(By.id("revealed")).sendKeys("Amol Shinde");

        Thread.sleep(2000);
        driver.close();
    }
}
