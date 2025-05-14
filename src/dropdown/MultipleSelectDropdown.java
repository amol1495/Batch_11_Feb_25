package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelectDropdown {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();

        WebElement dpDown = driver.findElement(By.id("multiple-select-example"));

        Select s = new Select(dpDown);

        // select dropdown by Index
        s.selectByIndex(2);
        Thread.sleep(2000);

        // select dropdown by value
        s.selectByValue("orange");
        Thread.sleep(2000);

        // select dropdown by text
        s.selectByVisibleText("Apple");
        Thread.sleep(2000);

        // ---------------------------------------------------------------
/*
        // deselect dropdown by Index
        s.deselectByIndex(2);
        Thread.sleep(2000);

        // deselect dropdown by value
        s.deselectByValue("orange");
        Thread.sleep(2000);

        // deselect dropdown by text
        s.deselectByVisibleText("Apple");
        Thread.sleep(2000);
*/
        s.deselectAll();
        Thread.sleep(2000);

        driver.close();
    }
}
