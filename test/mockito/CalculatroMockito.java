package mockito;

import com.for_test.Calculator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)

public class CalculatroMockito { // что б не использовать Calculator mock = Mockito.mock(Calculator.class); (24 строка)
    //запуск под капотом

    @Mock
    private Calculator mock;

    @Spy
    private Calculator spy;

    @Test
    public void shouldReturnSpecificValueWithMockito() {
//        Calculator mock = Mockito.mock(Calculator.class);

        Calculator calculator = new Calculator();

        Mockito.when(mock.getRandom()).thenReturn(10);

        Mockito.when(mock.sumRandom(ArgumentMatchers.anyInt())).thenCallRealMethod();

        Assert.assertEquals(17, mock.sumRandom(7));

    }

    @Test
    public void shouldReturnSpecificValueWithSpy() {

        Mockito.when(spy.getRandom()).thenReturn(10); //вызов и присвоение значения

        Assert.assertEquals(17, spy.sumRandom(7));

        Mockito.verify(spy, Mockito.times(1)).sumRandom(ArgumentMatchers.anyInt());
        Mockito.verify(spy, Mockito.times(1)).getRandom();
        Mockito.verifyNoMoreInteractions(spy);

    }
}
