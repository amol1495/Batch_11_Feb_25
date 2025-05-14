package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatorExample {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();

        // Id locator
     /*   WebElement userNameTextBox = driver.findElement(By.id("login1"));
        userNameTextBox.sendKeys("amol.shinde1495@gmail.com"); */

        // className locator
    /*    WebElement userNameTextBox = driver.findElement(By.className("email-input"));
        userNameTextBox.sendKeys("amol.shinde1495@gmail.com"); */

    /*    // name locator
        WebElement userNameTextBox = driver.findElement(By.name("login"));
        userNameTextBox.sendKeys("amol.shinde1495@gmail.com");  */

        // linkText Locator
    /*    WebElement element = driver.findElement(By.linkText("Get a new Rediffmail ID"));
        element.click();    */

    /*    // partialLinkText Locator
        WebElement element = driver.findElement(By.partialLinkText("Rediffmail ID"));
        element.click();*/

        //tagName Locator
    /*    List<WebElement> element = driver.findElements(By.tagName("input"));
        System.out.println(element.size()); */

        // css selector locator
        //driver.findElement(By.cssSelector("input[id='login1']")).sendKeys("amol.shinde1495");
        //driver.findElement(By.cssSelector("input#login1")).sendKeys("amol.shinde1495");       //Id replace by '#'

        // css selector with class attribute
        //driver.findElement(By.cssSelector("input[class='form-control']")).sendKeys("qwerty");
        //driver.findElement(By.cssSelector("input.form-control")).sendKeys("qwerty");    //class replace by '.'

        //Absolute Xpath
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/div[2]/form/div[2]/div/input")).sendKeys("Absolute Xpath");

        //Relative Xpath
        //driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("Relative Xpath");

        Thread.sleep(3000);
        driver.close();
    }
}
