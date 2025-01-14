package CatTest;

import com.example.Cat;
import com.example.Feline;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class GetFoodTest {

    @Test
    public void getFoodTest(){
        Feline feline = new Feline(); // заменить на мок?
        Cat testCat = new Cat(feline);
        assertEquals("Мяу", testCat.getSound());
    }

}
