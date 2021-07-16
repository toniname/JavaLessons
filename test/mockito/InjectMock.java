package mockito;

import com.for_test.Car;
import com.for_test.Engine;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class InjectMock {

    @Mock
    private Engine engine;

    @InjectMocks
    private Car car;

    @Test
    public void shouldMockMethodInnerField() {
        Mockito.when(engine.getPower()).thenReturn(15);

        int power = car.getEngine().getPower();

        Assert.assertEquals(15, power);
    }
}
