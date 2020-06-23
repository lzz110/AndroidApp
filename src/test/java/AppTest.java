import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import com.microsoft.appcenter.appium.Factory;
import com.microsoft.appcenter.appium.EnhancedAndroidDriver;
import org.junit.rules.TestWatcher;
import org.junit.Rule;

public class AppTest {
    private static EnhancedAndroidDriver<MobileElement> driver;

    private App app;
    @Before
    public void setUp() {
        app = new App();
    }
    @Test
    public void testAdd() throws InterruptedException {
        int a = 1;
        int b = 2;
        int result = app.add(a, b);
        Assert.assertEquals(a + b, result);
        System.out.println("add_result:"+result);
    }
    @Test
    public void testSubtract() throws InterruptedException {
        int a = 1;
        int b = 2;
        int result = app.subtract(a, b);
        Assert.assertEquals(a - b, result);
        System.out.println("sub_result:"+result);
    }
    @After
    public void tearDown() throws Exception {
    }
//    @After
//    public void TearDown(){
//        driver.label("Stopping App");
//        driver.quit();
//    }
    @Rule
    public TestWatcher watcher = Factory.createWatcher();
}
