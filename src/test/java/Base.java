import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Base {
    public static WebDriver webDriver() {
        System.setProperty("webdriver.chrome.driver", "chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.lcwaikiki.com/");
        driver.manage().window().maximize();
        return driver;
    }
    public static WebDriver driver = webDriver();//Ayağa kaldırma

    WebDriverWait wait = new WebDriverWait(driver,20,2000);

    public Logger log = LogManager.getLogger(getClass().getName());

    WebElement findElement(By by){
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public void closeApp(){
        driver.quit();
        log.info("Uygulama Kapatıldı.");
    }
}
