import com.example.Feline;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {


    @Test
    public void getFamilyCorrectValue() {
        Feline feline = new Feline();
        String expectedValue = "Кошачьи";
        String actualValue = feline.getFamily();
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void getKittensWithParameterCorrectValue() {
        Feline feline = new Feline();
        int expectedValue = 5;
        int actualValue = feline.getKittens(expectedValue);
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void getKittensWithoutParameterCorrectValue() {
        Feline feline = new Feline();
        int expectedValue = 1;
        int actualValue = feline.getKittens();
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void eatMeat() throws Exception {
        List<String> expectedValue = List.of("Животные", "Птицы", "Рыба");
        Feline feline = new Feline();
        List<String> actualValue = feline.eatMeat();
        assertEquals(expectedValue, actualValue);
    }

}
