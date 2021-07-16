import com.for_test.Calculator;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

public class CalculatorRule {

    @Rule //тестит консоль
    public SystemOutRule outRule = new SystemOutRule().enableLog(); //созд обьект и следит за консолью

    @Test
    public void shouldPrintInConsole() {
        Calculator calculator = new Calculator();

        calculator.print();

        String log = outRule.getLog(); //то что выведено в консоль будет содержаться в этой строке

       // Assert.assertEquals("Hello world\r\n", log);
        Assert.assertTrue(log.contains("Hello world"));
    }

}
