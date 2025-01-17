package CatTest;

import com.example.Cat;
import com.example.Feline;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class GetSoundTest {

    @Test
    public void getSoundTest() {
        Feline feline = new Feline(); // заменить на мок?
        Cat cat = new Cat(feline);
        assertEquals("Мяу", cat.getSound());
    }

}