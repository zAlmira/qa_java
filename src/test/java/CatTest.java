import com.example.Cat;
import com.example.Feline;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class CatTest {

    @Test
    public void getSoundReturnCorrectValue() {
       Feline feline = new Feline();
        Cat cat = new Cat(feline);
        String expectedValue = "Мяу";
        String actualValue = cat.getSound();
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void getFood() throws Exception {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        List<String> expectedValue = List.of("Животные", "Птицы", "Рыба");
        List<String> actualValue = cat.getFood();
        assertEquals(expectedValue, actualValue);
    }

}


