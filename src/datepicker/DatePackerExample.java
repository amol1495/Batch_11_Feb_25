package datepicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DatePackerExample {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.jqueryui.com/datepicker/");
        driver.manage().window().maximize();

        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

        driver.findElement(By.id("datepicker")).click();

        Thread.sleep(3000);

        String date = "14";

        List<WebElement> allElements = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//child::tbody/tr/td/a"));

        for (WebElement e : allElements){
            if(e.getText().equals(date)){
                e.click();
                break;
            }
        }

        Thread.sleep(3000);

        driver.close();

    }
}
