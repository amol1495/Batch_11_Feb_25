package waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaitExample {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/dynamic.html");
        driver.manage().window().maximize();

        driver.findElement(By.id("reveal")).click();

        WebDriverWait wt = new WebDriverWait(driver,Duration.ofSeconds(20));
    //  wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("revealed"))));
        wt.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("revealed"))));

        driver.findElement(By.id("revealed")).sendKeys("Amol Shinde");

        Thread.sleep(2000);
        driver.close();

    }

}
