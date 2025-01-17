package LionTest;

import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

@RunWith(Parameterized.class)
public class DoesHaveManeTest {

    String sex;
    boolean mane;

    public DoesHaveManeTest(String sex, boolean mane) {
        this.sex = sex;
        this.mane = mane;
    }

    @Parameterized.Parameters(name = "Пол - {0}, Наличие гривы - {1}")
    public static Object[][] testData() {
        return new Object[][] {
                {"Male", true},
                {"Female", false},
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void doesHaveManeTest() throws Exception {
        Feline felineMock = Mockito.mock(Feline.class);
        Lion lion = new Lion(sex, felineMock);
        Assert.assertEquals(mane, lion.doesHaveMane());
    }
}
