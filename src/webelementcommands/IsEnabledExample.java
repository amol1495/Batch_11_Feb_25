package webelementcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledExample {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();

        WebElement enabledTextBox = driver.findElement(By.id("enabled-example-input"));
        WebElement disabledBtn = driver.findElement(By.id("disabled-button"));
        WebElement enabledBtn = driver.findElement(By.id("enabled-button"));

        System.out.println(enabledTextBox.isEnabled());     // true
        disabledBtn.click();
        System.out.println(enabledTextBox.isEnabled());     // false
        enabledBtn.click();
        System.out.println(enabledTextBox.isEnabled());     // true

        driver.close();
    }
}
