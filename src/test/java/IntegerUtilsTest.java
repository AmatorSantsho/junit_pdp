import org.junit.*;
import org.junit.rules.Stopwatch;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

import java.io.IOException;

import static org.junit.Assert.*;

public class IntegerUtilsTest extends BaseTest{
private IntegerUtils integerUtils;
private final int a = 6;
private final int b = 2;
private final int expectedSum = 8;
private final int expectedDevide = 3;
private final int expectedMultiple = 12;

    @Before
    public void setUp() throws Exception {
        System.out.println("Before method " + testName.getMethodName());
        integerUtils = new IntegerUtils();
    }

    @After
    public void cleanUp() throws Exception {
        System.out.println("After method " + testName.getMethodName());
        integerUtils =null;
    }

    @Rule
    public final Stopwatch stopwatch = new Stopwatch() {
        @Override
        protected void finished(long nanos, Description description) {
            if ("sum".equals(description.getMethodName())){
                afterSpecificMethod();
            }
        }

        @Override
        protected void failed(long nanos, Throwable e, Description description) {
            System.out.println("Test method " + description.getMethodName() + " is failed.");
            e.printStackTrace();
        }
    };

    @Test
    public void sum() {
        Assert.assertEquals(expectedSum, integerUtils.sum(a,b));
    }

    @Test
    public void divide() {
        int s = 5/0;
        Assert.assertEquals(expectedDevide, integerUtils.divide(a,b));
            }

    @Test
    public void multiple() {
        Assert.assertEquals(expectedMultiple, integerUtils.multiple(a,b));
    }

    private void afterSpecificMethod(){
        System.out.println("After specific method");
    }
}