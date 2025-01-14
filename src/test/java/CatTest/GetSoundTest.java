package CatTest;

import com.example.Cat;
import com.example.Feline;

import java.util.List;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class GetSoundTest {

    @Test
    public void getFoodTest() throws Exception {
        Feline feline = new Feline(); // заменить на мок?
        Cat testCat = new Cat(feline);
        assertEquals(List.of("Животные", "Птицы", "Рыба"), testCat.getFood());
    }

}