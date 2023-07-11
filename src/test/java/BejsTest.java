import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BejsTest {

    ChromeDriver driver;

    public  ChromeDriver openBroswar(){
        driver.navigate().to("https://www.demoblaze.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return  driver;
    }
}
