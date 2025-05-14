package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementExample {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();

        WebElement userNameTextBox = driver.findElement(By.id("login1"));
        userNameTextBox.sendKeys("amol.shinde1495@gmail.com");

        Thread.sleep(3000);
        driver.close();
    }
}
