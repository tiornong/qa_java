package CatTest;

import com.example.Cat;
import com.example.Feline;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.assertEquals;


public class GetFoodTest {

    @Test
    public void getFoodTest() throws Exception {
        Feline felineMock = Mockito.mock(Feline.class);
        Mockito.when(felineMock.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));

        Cat cat = new Cat(felineMock);
        assertEquals(List.of("Животные", "Птицы", "Рыба"), cat.getFood());
    }

}
