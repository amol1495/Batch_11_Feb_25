package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHoldExample {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
        driver.manage().window().maximize();

        WebElement elementA = driver.findElement(By.xpath("//li[text()='A']"));

        Actions a = new Actions(driver);
        a.clickAndHold(elementA)
                .pause(3000)
                .release(elementA)
                .pause(3000)
                .build()
                .perform();

        Thread.sleep(3000);

        driver.close();
    }
}
