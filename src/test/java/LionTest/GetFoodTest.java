package LionTest;

import Constants.Constants;
import com.example.Feline;
import com.example.Lion;

import org.junit.Assert;
import org.junit.Test;

import org.mockito.Mockito;

import java.util.List;


public class GetFoodTest {

    @Test
    public void getFoodTest() throws Exception {
        Feline felineMock = Mockito.mock(Feline.class);
        Mockito.when(felineMock.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));

        Lion lion = new Lion(Constants.DEFAULT_TEST_SEX, felineMock);

        Assert.assertEquals("Получен некорректный список продуктов питания",
                List.of("Животные", "Птицы", "Рыба"),
                lion.getFood()
        );
    }

}