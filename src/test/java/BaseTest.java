import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.rules.TestName;

import java.util.Date;


public abstract class BaseTest {
    private static long startTime;

    @Rule
    public TestName testName = new TestName();

    @BeforeClass
    public static void beforeAllTests(){
        System.out.println("Tests started...");
        startTime= new Date().getTime();

    }
    @AfterClass
    public static void afterAllTests(){
        System.out.println("Tests evaluation is done.");
        System.out.println("Duration time is " + (new Date().getTime() - startTime) + "ms");
    }
}
