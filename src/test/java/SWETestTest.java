// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import java.util.*;

public class SWETestTest {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;
    @Before
    public void setUp() {
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }
    @After
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void sWETest() {
        driver.get("https://www.naver.com/");
        driver.manage().window().setSize(new Dimension(1466, 856));
        js.executeScript("window.scrollTo(0,129.5)");
        js.executeScript("window.scrollTo(0,248)");
        js.executeScript("window.scrollTo(0,1718.5)");
        js.executeScript("window.scrollTo(0,1211.5)");
        js.executeScript("window.scrollTo(0,740.5)");
        driver.findElement(By.linkText("경제")).click();
        driver.findElement(By.linkText("스포츠")).click();
        driver.findElement(By.linkText("엔터")).click();
        js.executeScript("window.scrollTo(0,49.5)");
        driver.findElement(By.id("query")).click();
        driver.findElement(By.id("query")).sendKeys("홍익대학교");
        driver.findElement(By.id("query")).sendKeys(Keys.ENTER);

        driver.get("https://www.hongik.ac.kr/index.do");
        driver.manage().window().setSize(new Dimension(1466, 856));
        driver.findElement(By.linkText("교직원")).click();
        driver.findElement(By.linkText("주요서비스")).click();
        driver.findElement(By.linkText("일반")).click();
        driver.findElement(By.linkText("학생")).click();
    }
}
