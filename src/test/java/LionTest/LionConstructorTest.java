package LionTest;

import com.example.Feline;
import com.example.Lion;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import org.mockito.Mockito;


@RunWith(Parameterized.class)
public class LionConstructorTest {

    String sex;
    boolean isValid;

    public LionConstructorTest(String sex, boolean correctParameter) {
        this.sex = sex;
        this.isValid = correctParameter;
    }

    @Parameterized.Parameters(name = "{index}: testSex({0}) isValid={1}")
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
    public void lionConstructorTest(){
        Feline felineMock = Mockito.mock(Feline.class);

        // Если вариант названия поля валиден, то проверяем, что объект создался
        if (isValid) {
            try {
                Lion lion = new Lion(sex, felineMock);
                Assert.assertNotNull("Объект не создался!", lion);
            } catch (Exception e) {
                Assert.fail(e.getMessage());
            }

        // Если не валиден, то проверяем, что вызвалась соотв. ошибка
        } else {
            try {
                Lion lion = new Lion(sex, felineMock);
                Assert.fail("Ошибка не произошла, хотя должна была");
            } catch (Exception e) {
                Assert.assertEquals(
                        "Сообщение исключения не соответствует ожидаемому.",
                        "Используйте допустимые значения пола животного - самец/male или самка/female",
                        e.getMessage()
                );
            }
        }
    }

}