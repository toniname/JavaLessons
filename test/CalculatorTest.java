import com.for_test.Calculator;
import org.junit.*;

public class CalculatorTest {

    @Before
    public void beforeEachTest() {
        System.out.println("Before each test");
    }

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("Before all tests");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("After all tests");
    }

    @After
    public void afterEachTest() {
        System.out.println("After each test");
    }

    @Test
    public void shouldReturnSumValues() {
        Calculator calculator = new Calculator();

        int sum = calculator.sum(4, 5);

        Assert.assertEquals("Should return 9", 9, sum);

//        Assert.assertTrue(true);
    }

    @Test
    public void shouldReturnSumValues1() {
        Calculator calculator = new Calculator();

        int sum = calculator.sum(4, 5);

        Assert.assertEquals("Should return 9", 9, sum);

//        Assert.assertTrue(true);
    }
}
