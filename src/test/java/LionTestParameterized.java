import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
@RunWith(Parameterized.class)
public class LionTestParameterized {
    @Mock
    static Feline feline;

    @Before
    public void setUpMocks() {
        MockitoAnnotations.openMocks(this);
    }
    private final String sex;
    private final boolean expectedValue;

    public LionTestParameterized(String sex, Feline feline, boolean expectedValue) {
        this.sex = sex;
        this.feline = feline;
        this.expectedValue = expectedValue;
    }
    @Parameterized.Parameters (name = "Проверка наличия гривы. Тестовые данные: {0} {1} {2}")
    public static Object[][] DoesHaveMane() {
        return new Object[][] {
                {"Самец", feline, true},
                {"Самка", feline, false},
        };
    }
    @Test
    public void isDoesHaveMane() throws Exception {
        Lion lion = new Lion(sex, feline);
        boolean actualValue = lion.doesHaveMane();
        assertEquals(expectedValue, actualValue);
    }
}
