package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementsExample {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();

        List<WebElement> allElements = driver.findElements(By.tagName("input"));

        System.out.println(allElements.size());

        for (WebElement e : allElements){
            System.out.println(e);
        }

        Thread.sleep(3000);
        driver.close();
    }
}
