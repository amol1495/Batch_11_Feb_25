package uploadfile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFileExample {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/upload");
        driver.manage().window().maximize();

        WebElement fileUpload = driver.findElement(By.id("file-upload"));
        //fileUpload.sendKeys("D:\\Group F Test Cases on Naukri.xlsx");
        driver.findElement(By.id("file-submit")).click();

        Thread.sleep(3000);

        WebElement fileUploadedMessage = driver.findElement(By.xpath("//h3[text()='File Uploaded!']"));
        if(fileUploadedMessage.isDisplayed()){
            System.out.println("Yes, file is uploaded successfully");
        }else {
            System.out.println("No, file is not uploaded successfully");
        }

        Thread.sleep(3000);
        driver.close();
    }
}
