/*
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import com.microsoft.appcenter.appium.Factory;
import com.microsoft.appcenter.appium.EnhancedAndroidDriver;
import org.junit.rules.TestWatcher;

public class CalculatorTest {
    @Rule
    public TestWatcher watcher = Factory.createWatcher();

    private Calculator calculator;
//    AndroidDriver driver;
    private static EnhancedAndroidDriver<MobileElement> driver;
    public CalculatorTest() throws MalformedURLException {
    }

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() throws InterruptedException, MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Android Emulator");
        capabilities.setCapability("automationName", "Appium");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "6.0");
        capabilities.setCapability("appPackage", "com.android.calculator2");
        capabilities.setCapability("appActivity", ".Calculator");
//        driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
//        driver = Factory.createAndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver = Factory.createAndroidDriver(new URL("http://localhost:4723/wd/hub"), capabilities);
        driver.findElement(By.name("1")).click();
        driver.findElement(By.name("5")).click();
        driver.findElement(By.name("9")).click();
        driver.findElement(By.name("delete")).click();
        driver.findElement(By.name("+")).click();
        driver.findElement(By.name("6")).click();
        driver.findElement(By.name("=")).click();


        String result = driver.findElement(By.id("com.android.calculator2:id/formula")).getText();
        Assert.assertEquals(21, Integer.parseInt(result));
        System.out.println("add_result:"+result);
    }

    @After
    public void TearDown(){
        driver.quit();
    }
}
*/
