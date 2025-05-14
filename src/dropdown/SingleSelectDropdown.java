package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SingleSelectDropdown {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();

        WebElement dpDown = driver.findElement(By.id("carselect"));

        Select s = new Select(dpDown);

        //  get all options from dropdown
/*        List<WebElement> allOptions = s.getOptions();
        for(WebElement e : allOptions){
            System.out.println(e.getText());
        }*/

        // select dropdown by Index
        s.selectByIndex(2);
        Thread.sleep(2000);


        // select dropdown by value
        s.selectByValue("benz");
        Thread.sleep(2000);


        // select dropdown by text
        s.selectByVisibleText("BMW");
        Thread.sleep(2000);


        driver.close();
    }
}
