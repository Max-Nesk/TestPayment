import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.junit.Assert.fail;

/**
 * Created by Admin on 01.07.2014.
 */
public class EasyPay_Payment {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseUrl = "http://www.pokoopka.com/";
        driver.manage().timeouts().implicitlyWait(30, SECONDS);
    }

    @Test
    public void test_UserPayment() throws Exception {
        driver.get(baseUrl);
        driver.findElement(By.linkText("Войти")).click();
        driver.findElement(By.linkText("Войти")).click();
        driver.findElement(By.id("login")).clear();
        driver.findElement(By.id("login")).sendKeys("Selenium");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("123456");
        driver.findElement(By.xpath("//*[@id='form']/a[1]")).click();
        driver.findElement(By.linkText("Пополнить счёт")).click();
        driver.findElement(By.id("amount")).clear();
        driver.findElement(By.id("amount")).sendKeys("14");
        driver.findElement(By.linkText("Электронные деньги")).click();
        driver.findElement(By.id("mode_type_15")).click();
        driver.findElement(By.id("send_message")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        Assert.assertTrue(isElementPresent(By.xpath("/html/body/div/div[2]/form/input[7]")));


    }

    @After
    public void tearDown() throws Exception {


        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }


    /**
     * Created by Admin on 01.07.2014.
     */
    public static class MoneyXy_Payment {
        private WebDriver driver;
        private String baseUrl;
        private boolean acceptNextAlert = true;
        private StringBuffer verificationErrors = new StringBuffer();

        @Before
        public void setUp() throws Exception {
            driver = new FirefoxDriver();
            baseUrl = "http://www.pokoopka.com/";
            driver.manage().timeouts().implicitlyWait(30, SECONDS);
        }

        @Test
        public void test_UserPayment() throws Exception {
            driver.get(baseUrl);
            driver.findElement(By.linkText("Войти")).click();
            driver.findElement(By.linkText("Войти")).click();
            driver.findElement(By.id("login")).clear();
            driver.findElement(By.id("login")).sendKeys("Selenium");
            driver.findElement(By.id("password")).clear();
            driver.findElement(By.id("password")).sendKeys("123456");
            driver.findElement(By.xpath("//*[@id='form']/a[1]")).click();
            driver.findElement(By.linkText("Пополнить счёт")).click();
            driver.findElement(By.id("amount")).clear();
            driver.findElement(By.id("amount")).sendKeys("14");
            driver.findElement(By.linkText("Электронные деньги")).click();
            driver.findElement(By.id("mode_type_16")).click();
            driver.findElement(By.id("send_message")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            Assert.assertFalse(isElementPresent(By.xpath("/html/body/div/div[2]/p[1]")));


        }

        @After
        public void tearDown() throws Exception {


            driver.quit();
            String verificationErrorString = verificationErrors.toString();
            if (!"".equals(verificationErrorString)) {
                fail(verificationErrorString);
            }
        }

        private boolean isElementPresent(By by) {
            try {
                driver.findElement(by);
                return true;
            } catch (NoSuchElementException e) {
                return false;
            }
        }



    }

    /**
     * Created by Admin on 01.07.2014.
     */
    public static class QIWI_Payment {
        private WebDriver driver;
        private String baseUrl;
        private boolean acceptNextAlert = true;
        private StringBuffer verificationErrors = new StringBuffer();

        @Before
        public void setUp() throws Exception {
            driver = new FirefoxDriver();
            baseUrl = "http://www.pokoopka.com/";
            driver.manage().timeouts().implicitlyWait(30, SECONDS);
        }

        @Test
        public void test_UserPayment() throws Exception {
            driver.get(baseUrl);
            driver.findElement(By.linkText("Войти")).click();
            driver.findElement(By.linkText("Войти")).click();
            driver.findElement(By.id("login")).clear();
            driver.findElement(By.id("login")).sendKeys("Selenium");
            driver.findElement(By.id("password")).clear();
            driver.findElement(By.id("password")).sendKeys("123456");
            driver.findElement(By.xpath("//*[@id='form']/a[1]")).click();
            driver.findElement(By.linkText("Пополнить счёт")).click();
            driver.findElement(By.id("amount")).clear();
            driver.findElement(By.id("amount")).sendKeys("10");
            driver.findElement(By.linkText("Электронные деньги")).click();
            driver.findElement(By.id("mode_type_5")).click();
            driver.findElement(By.id("send_message")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

           Assert.assertTrue(isElementPresent(By.id("field_phone")));


        }

        @After
        public void tearDown() throws Exception {


            driver.quit();
            String verificationErrorString = verificationErrors.toString();
            if (!"".equals(verificationErrorString)) {
                fail(verificationErrorString);
            }
        }

        private boolean isElementPresent(By by) {
            try {
                driver.findElement(by);
                return true;
            } catch (NoSuchElementException e) {
                return false;
            }
        }


    }
}
