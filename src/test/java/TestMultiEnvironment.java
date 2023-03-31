import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestMultiEnvironment {
    WebDriver driver;


    @BeforeClass
    public void beforeClass(){
        driver = new ChromeDriver();
    }

    @Test
    public void TC_01(){
        driver.findElement(By.xpath(""));
    }
}
