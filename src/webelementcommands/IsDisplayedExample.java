package webelementcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedExample {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();

        WebElement displayedTextBox = driver.findElement(By.id("displayed-text"));
        WebElement hideBtn = driver.findElement(By.id("hide-textbox"));
        WebElement showBtn = driver.findElement(By.id("show-textbox"));

        System.out.println(displayedTextBox.isDisplayed());     // true
        hideBtn.click();
        System.out.println(displayedTextBox.isDisplayed());     // false
        showBtn.click();
        System.out.println(displayedTextBox.isDisplayed());     // true

        driver.close();
    }
}
