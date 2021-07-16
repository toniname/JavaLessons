package mockito;

import com.homeworks.lessons4.NewСalculator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class NewCalculatorSpy {
    @Spy
    private NewСalculator spy;

    @Test
    public void shouldReturnCalculatorValueWithSpy(){
        Mockito.when(spy.getRandomOne()).thenReturn(30);
        Mockito.when(spy.getRandomTwo()).thenReturn(10);
        Assert.assertEquals(20, spy.minus());

        Assert.assertEquals(40, spy.plus());

        Assert.assertEquals(300, spy.subtraction());

        Assert.assertEquals(3, spy.division());

        Assert.assertEquals(0, spy.modulDivision());

        Mockito.verify(spy, Mockito.times(5)).getRandomOne();
        Mockito.verify(spy, Mockito.times(5)).getRandomTwo();
        Mockito.verify(spy, Mockito.times(1)).minus();
        Mockito.verify(spy, Mockito.times(1)).plus();
        Mockito.verify(spy, Mockito.times(1)).division();
        Mockito.verify(spy, Mockito.times(1)).modulDivision();
        Mockito.verify(spy, Mockito.times(1)).subtraction();
        Mockito.verifyNoMoreInteractions(spy);


    }
}
