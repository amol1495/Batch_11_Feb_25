package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();

        driver.findElement(By.id("confirmbtn")).click();
        Thread.sleep(3000);

        Alert al = driver.switchTo().alert();
        System.out.println(al.getText());
        al.dismiss();

        Thread.sleep(3000);
        driver.close();
    }
}
