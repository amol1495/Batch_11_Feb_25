package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.time.Duration;
import java.util.List;

public class NeedOfIframe {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/frames");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


/*        List<WebElement> allElements = driver.findElements(By.tagName("iframe"));
        System.out.println(allElements.size());*/

        // by id
  //      driver.switchTo().frame("frame1");

        // by webElement
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='frame1']")));

        WebElement element = driver.findElement(By.xpath("//h1[text()='This is a sample page']"));
        System.out.println(element.getText());

        driver.switchTo().parentFrame();

        WebElement frameElement = driver.findElement(By.xpath("//h1[text()='Frames']"));
        System.out.println(frameElement.getText());

        driver.close();
    }
}
