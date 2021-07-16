package powermockito;

import com.for_test.Calculator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.api.support.membermodification.MemberMatcher;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest(Calculator.class)
public class CalculatorPowerMockito {

    @Test
    public void shouldMockStaticMethod() {
        PowerMockito.mockStatic(Calculator.class);

        PowerMockito.when(Calculator.getRandomStatic()).thenReturn(6);

        Calculator calculator = new Calculator();

        Assert.assertEquals(calculator.sumRandomStatic(5), 11);
    }

    @Test
    public void shouldMockPrivateMethodWithoutParams() throws Exception {

        Calculator calculator = new Calculator();

        Calculator spy = PowerMockito.spy(calculator);

        PowerMockito.doReturn(9).when(spy, "getRandomPrivate");

        Assert.assertEquals(spy.sumRandomPrivate(5), 14);
    }

    @Test
    public void shouldMockPrivateMethodWithParams() throws Exception {

        Calculator calculator = new Calculator();

        Calculator spy = PowerMockito.spy(calculator);

        PowerMockito.when(spy, MemberMatcher.method(Calculator.class, "getRandomPrivateWithParam", int.class))
                .withArguments(6)
                .thenReturn(3);

        Assert.assertEquals(spy.sumRandomPrivateWithParam(5), 8);
    }

}
