import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class ChromeTest {


    public ChromeTest() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Zuzana Protivňaková\\Desktop\\Automatization\\Webdrivers\\chromedriver 2.43.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.sk/");


    }
}
//halabala