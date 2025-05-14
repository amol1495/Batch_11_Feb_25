package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActionMethod {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com");
        driver.manage().window().maximize();

        WebElement searchTextBox = driver.findElement(By.name("q"));

        Actions a = new Actions(driver);
        a.moveToElement(searchTextBox)
                .click(searchTextBox)
                .keyDown(Keys.SHIFT)
                .sendKeys("t shirt")
                .keyUp(Keys.SHIFT)
                .pause(3000)
                .sendKeys(Keys.ENTER)
                .build()
                .perform();

        Thread.sleep(3000);
        driver.close();
    }
}
