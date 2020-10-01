import net.bytebuddy.asm.Advice;
import org.apache.bcel.generic.NEW;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Form {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "c:/Users/szsz2/AppData/Local/Temp/chromedriver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        driver.findElement(By.id("first-name")).sendKeys("Firstszsz");
        driver.findElement(By.id("last-name")).sendKeys("Lastszsz");
        driver.findElement(By.id("job-title")).sendKeys("Sr. QA Engineer");

        driver.findElement(By.id("radio-button-2")).click();
        driver.findElement(By.id("checkbox-1")).click();

        driver.findElement(By.cssSelector("option[value='4']")).click();

        WebElement datePicker = driver.findElement(By.id("datepicker"));
        datePicker.sendKeys("01-01-2021");
        datePicker.sendKeys(Keys.RETURN);

        Thread.sleep(2000);

        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();

        Thread.sleep(2000);

        driver.quit();
    }
}
