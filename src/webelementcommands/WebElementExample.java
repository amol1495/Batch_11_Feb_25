package webelementcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementExample {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();

//        WebElement userNameTextBox = driver.findElement(By.id("login1"));

        // sendKeys()
/*        userNameTextBox.sendKeys("amol@1495");
          Thread.sleep(2000);   */

        // clear()
/*        userNameTextBox.clear();
        Thread.sleep(2000);     */

        // getTagName()
//        System.out.println(userNameTextBox.getTagName());

        // getDomAttribute()
//        System.out.println(userNameTextBox.getDomAttribute("id"));

        //submit()      it is same ass click()
        WebElement loginBtn = driver.findElement(By.name("proceed"));
        loginBtn.submit();


        driver.close();

    }
}
