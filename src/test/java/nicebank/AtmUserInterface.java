package nicebank;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import implementation.Account;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AtmUserInterface implements Teller {

    private WebDriver driver;

    @BeforeClass
    public static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @Before
    public void setupTest() {
        driver = new ChromeDriver();
    }

    @After
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

    public void withdrawFrom(Account account, int dollars) {
        try {
            driver.get("http://localhost:9988");
            driver.findElement(By.id("Amount"))
                    .sendKeys(String.valueOf(dollars));
            driver.findElement(By.id("Withdraw")).click();
        }
        finally {
            driver.close();
        }
    }
}
