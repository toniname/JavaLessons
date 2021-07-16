package mockito;

import com.homeworks.lessons4.NewСalculator;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;

public class NewCalculatorMockito {

    @Test
    public void shouldReturnCalculatorValue() {
        NewСalculator mock = Mockito.mock(NewСalculator.class);

       // NewСalculator newСalculator = new NewСalculator();

        Mockito.when(mock.getRandomOne()).thenReturn(20);
        Mockito.when(mock.getRandomTwo()).thenReturn(10);

        Mockito.when(mock.minus()).thenCallRealMethod();
        Assert.assertEquals(10, mock.minus());

        Mockito.when(mock.getRandomOne()).thenReturn(30);
        Mockito.when(mock.getRandomTwo()).thenReturn(10);

        Mockito.when(mock.plus()).thenCallRealMethod();
        Assert.assertEquals(40, mock.plus());

        Mockito.when(mock.getRandomOne()).thenReturn(40);
        Mockito.when(mock.getRandomTwo()).thenReturn(20);

        Mockito.when(mock.division()).thenCallRealMethod();
        Assert.assertEquals(2, mock.division());

        Mockito.when(mock.getRandomOne()).thenReturn(10);
        Mockito.when(mock.getRandomTwo()).thenReturn(10);

        Mockito.when(mock.subtraction()).thenCallRealMethod();
        Assert.assertEquals(100, mock.subtraction());

    }

}
