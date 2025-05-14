package cookies;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class GetAllCookies {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tcs.com/");
        driver.manage().window().maximize();

        Cookie ccc = new Cookie("company","Edso Servies");
        driver.manage().addCookie(ccc);

        System.out.println("before deletion of cookies");
        Set<Cookie> allCookies =  driver.manage().getCookies();
        for (Cookie c : allCookies){
            System.out.println(c);
        }

        // get cookie by name
        System.out.println(driver.manage().getCookieNamed("company"));

        System.out.println("after deletion of cookies");
//      driver.manage().deleteCookieNamed("company");

        driver.manage().deleteAllCookies();

        Set<Cookie> allCookies1 =  driver.manage().getCookies();
        for (Cookie c : allCookies1){
            System.out.println(c);
        }


        driver.close();
    }
}
