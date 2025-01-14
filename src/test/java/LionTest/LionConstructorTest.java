package LionTest;

import com.example.Feline;
import com.example.Lion;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class LionConstructorTest {

    String sex;
    boolean correctParameter;

    public LionConstructorTest(String sex, boolean correctParameter) {
        this.sex = sex;
        this.correctParameter = correctParameter;
    }

    @Parameterized.Parameters
    public static Object[][] testData() {
        return new Object[][]{
                {"самец", true},
                {"самка", true},
                {"male", true},
                {"female", true},
                {"САМЕЦ", true},
                {"САМКА", true},
                {"MALE", true},
                {"FEMALE", true},
                {"сАмЕц", true},
                {"сАмКа", true},
                {"mAlE", true},
                {"fEmAlE", true},
                {"Мужчина",false},
                {"Женщина", false},
                {"M4LE", false},
                {"Fema1e", false},
                {"", false},
                {"?:%;№", false},
        };
    }

    @Test
    public void test() throws Exception {
        Feline feline = new Feline(); // заменить на мок?
        try {
            Lion lion = new Lion(sex, feline);
        } catch (Exception e) {
            Assert.assertEquals("Используйте допустимые значения пола животного - самец/male или самка/female", e.getMessage());
        }
    }
}