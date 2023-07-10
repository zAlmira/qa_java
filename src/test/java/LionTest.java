import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void getFood() throws Exception {
        List<String> expectedValue = List.of("Животные", "Птицы", "Рыба");
        Lion lion = new Lion("Самка", feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actualValue = lion.getFood();
        assertEquals(expectedValue, actualValue);
    }

    @Test (expected = Exception.class)
    public void getFoodException() throws Exception {
        List<String> expectedValue = List.of("Животные", "Птицы", "Рыба");
        Lion lion = new Lion("hbhbh", feline);
        assertEquals(expectedValue, Exception.class);
    }

    @Test
    public void getKittens() throws Exception {
        int expectedValue = 1;
        Lion lion = new Lion("Самка", feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        int actualValue = lion.getKittens();
        assertEquals(expectedValue, actualValue);
    }
}
