package powermockito;


import com.homeworks.lessons4.NewСalculator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.api.support.membermodification.MemberMatcher;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest(NewСalculator.class)

public class NewCalculatorPowerMockito {

    @Test
    public void newCalculatorMockStaticMethod() {
        PowerMockito.mockStatic(NewСalculator.class);

        PowerMockito.when(NewСalculator.getStaticRandomOne()).thenReturn(20);
        PowerMockito.when(NewСalculator.getStaticRandomTwo()).thenReturn(10);
        PowerMockito.when(NewСalculator.plusStatic()).thenCallRealMethod();
        PowerMockito.when(NewСalculator.minusStatic()).thenCallRealMethod();
        PowerMockito.when(NewСalculator.subtractionStatic()).thenCallRealMethod();
        PowerMockito.when(NewСalculator.divisionStatic()).thenCallRealMethod();
        PowerMockito.when(NewСalculator.modulDivisionStatic()).thenCallRealMethod();


        Assert.assertEquals(NewСalculator.plusStatic(), 30);
        Assert.assertEquals(NewСalculator.minusStatic(), 10);
        Assert.assertEquals(NewСalculator.subtractionStatic(), 200);
        Assert.assertEquals(NewСalculator.divisionStatic(), 0);
        Assert.assertEquals(NewСalculator.modulDivisionStatic(), 2);
    }

    @Test
    public void newCalculatorPrivateMethodWithoutParams() throws Exception {
        NewСalculator newСalculator = new NewСalculator();

        NewСalculator spy = PowerMockito.spy(newСalculator);

        PowerMockito.doReturn(20).when(spy, "getPrivateRandomOne");
        PowerMockito.doReturn(10).when(spy, "getPrivateRandomTwo");

        Assert.assertEquals(spy.minusPrivate(), 10);
        Assert.assertEquals(spy.plusPrivate(), 30);
        Assert.assertEquals(spy.subtractionPrivate(), 200);
        Assert.assertEquals(spy.divisionPrivate(), 2);
        Assert.assertEquals(spy.modulDivisionPrivate(), 0);

    }

    @Test
    public void newCalculatorPrivateMethodWithParams() throws Exception {

        NewСalculator newСalculator = new NewСalculator();

        NewСalculator spy = PowerMockito.spy(newСalculator);

        PowerMockito.when(spy, MemberMatcher.method(NewСalculator.class,
                "getPrivateRandomOneWithParam", int.class))
                .withArguments(50)
                .thenReturn(20);
        PowerMockito.when(spy, MemberMatcher.method(NewСalculator.class,
                "getPrivateRandomTwoWithParam", int.class))
                .withArguments(50)
                .thenReturn(10);

        Assert.assertEquals(spy.minusPrivateWithParam(50), 10);
        Assert.assertEquals(spy.plusPrivateWithParam(50), 30);
        Assert.assertEquals(spy.divisionPrivateWithParam(50), 2);
        Assert.assertEquals(spy.subtractionPrivateWithParam(50), 200);
        Assert.assertEquals(spy.modulDivisionPrivateWithParam(50), 0);
    }



}
