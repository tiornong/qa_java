package LionTest;

import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

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
        Feline feline = new Feline(); // заменить на мок!
        Lion lion = new Lion(sex, feline);
        Assert.assertEquals(mane, lion.doesHaveMane());
    }
}
