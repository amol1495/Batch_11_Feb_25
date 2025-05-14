package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverExample {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com");
        driver.manage().window().maximize();

        WebElement loginElement = driver.findElement(By.xpath("//span[text()='Login']"));

        Actions a = new Actions(driver);
        a.moveToElement(loginElement).pause(3000).perform();

        Thread.sleep(3000);
        driver.close();
    }
}
