package windowhandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class HowToHandleWindow {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();

        String parentWindowId = driver.getWindowHandle();

        driver.findElement(By.id("openwindow")).click();

        Set<String> windowsId = driver.getWindowHandles();

        for (String s : windowsId){
            if(!s.equals(parentWindowId)){
                driver.switchTo().window(s);
                Thread.sleep(3000);
                driver.findElement(By.linkText("INTERVIEW")).click();
                System.out.println(driver.getTitle());
                Thread.sleep(3000);
                driver.close();
            }
        }
        driver.switchTo().window(parentWindowId);
        System.out.println(driver.getTitle());
        Thread.sleep(3000);

        driver.quit();
    }
}
