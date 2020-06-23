import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class App2Test {
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
        Thread.currentThread().sleep(1000);
        Assert.assertEquals(a + b, result);
    }
    @After
    public void tearDown() throws Exception {
    }

}
